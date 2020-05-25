package com.capgemini.onlinetestmanagement.controller;

import java.util.List;

import javax.validation.Valid;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.onlinetestmanagement.entity.Questions;
import com.capgemini.onlinetestmanagement.exception.QuestionsException;
import com.capgemini.onlinetestmanagement.service.QuestionsService;
@CrossOrigin(origins="http://localhost:4200")
@RestController
public class Questionscontroller {
	@Autowired
	private QuestionsService questionsservice;

	@CrossOrigin
	@PostMapping("/addquestions")
	public ResponseEntity<String> addQuestions(@Valid @RequestBody Questions questions, BindingResult br)
			throws QuestionsException {
		String err = "";
		if (br.hasErrors()) {
			List<FieldError> errors = br.getFieldErrors();
			for (FieldError error : errors)
				err += error.getDefaultMessage() + "<br/>";
			throw new QuestionsException(err);
		}
		try {
			questionsservice.addQuestions(questions);
			return new ResponseEntity<String>("Question added successfully", HttpStatus.OK);

		} catch (DataIntegrityViolationException ex) {
			throw new QuestionsException("ID already exists");
		}
	}

	@CrossOrigin
	@GetMapping("/viewquestions")
	public ResponseEntity<List<Questions>> getQuestionslist() {
		List<Questions> questionsList = questionsservice.show();
		return new ResponseEntity<List<Questions>>(questionsList, HttpStatus.OK);
	}
	
	@CrossOrigin
	@DeleteMapping("/deletequestions/{questionsId}")
	public ResponseEntity<String> deletequestions( @PathVariable Integer questionsId) throws QuestionsException
	{
		try
		{
			questionsservice.deleteQuestions( questionsId);
			return new ResponseEntity<String>("Question is deleted", HttpStatus.OK);
		}
		catch (DataIntegrityViolationException ex) {
			throw new QuestionsException("Question ID  doesnot exists");
		}
	}
	
	@CrossOrigin
	@PutMapping("/updatequestions/{questionsId}")
	public ResponseEntity<String> updatequestions(@Valid @RequestBody Questions questions,@PathVariable Integer questionsId,BindingResult br ) throws QuestionsException
	{
		String err = "";
		if (br.hasErrors()) {
			List<FieldError> errors = br.getFieldErrors();
			for (FieldError error : errors)
				err += error.getDefaultMessage() + "<br/>";
			throw new QuestionsException(err);
		}
		try {
			questionsservice.updatequestions(questions,questionsId);
			return new ResponseEntity<String>("Questions updated successfully", HttpStatus.OK);

		} catch (DataIntegrityViolationException ex) {
			throw new QuestionsException("Question ID already exists");
		}
	}
	
		
	}