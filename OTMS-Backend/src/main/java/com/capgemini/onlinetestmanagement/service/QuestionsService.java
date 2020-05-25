package com.capgemini.onlinetestmanagement.service;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import com.capgemini.onlinetestmanagement.entity.Questions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.onlinetestmanagement.dao.Questionsdao;

@Service
public class QuestionsService {
	@Autowired
	private Questionsdao questionsdao;
	@Transactional
	public boolean addQuestions(Questions questions) {
		return questionsdao.save(questions) !=null;
	
	}
	
	@Transactional
	public void  deleteQuestions(Integer questionsId)
	{
		questionsdao.deleteById(questionsId);
	}
	@Transactional
	public List<Questions> show(){
		return questionsdao.findAll();
	}
	@Transactional
	public Questions updatequestions(Questions questions,Integer questionsId)
	{
		return questionsdao.save(questions);
	}
	

}

