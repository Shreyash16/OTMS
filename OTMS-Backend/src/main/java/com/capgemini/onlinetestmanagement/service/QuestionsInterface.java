package com.capgemini.onlinetestmanagement.service;

import java.util.List;
import java.util.Optional;

import com.capgemini.onlinetestmanagement.entity.Questions;

public interface QuestionsInterface {
	boolean addquestions(Questions questions);
	void  deleteQuestions(Integer questionsId);
	List<Questions> show();
	 Questions viewquestions(Questions questions,Integer questionsId);
	

}
