package com.capgemini.onlinetestmanagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Questions_table")
public class Questions {
@Id
@Column(name = "QuestionsId")
@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "questions_seq")
@SequenceGenerator(sequenceName = "questions_seq", initialValue = 100, allocationSize = 1, name = "questions_seq")
private Integer QuestionsId;


@Column(name="QuestionsTitle")
private String QuestionsTitle;


@Column(name="QuestionsOptionA")
private String QuestionsOptionA;

@Column(name="QuestionsOptionB")
private String QuestionsOptionB;

@Column(name="QuestionsOptionC")
private String QuestionsOptionC;

@Column(name="QuestionsOptionD")
private String QuestionsOptionD;

@Column(name="QuestionsAnswer")
private Integer QuestionsAnswer;

@Column(name="QuestionsMarks")
private Integer QuestionsMarks;

@Column(name="ChosenAnswer")
private Integer ChosenAnswer;

@Column(name="MarksScored")
private Integer MarksScored;



public Questions() {
super();
}

public Questions(Integer QuestionsId, String QuestionsTitle, String  QuestionsOptionA,String  QuestionsOptionB,String  QuestionsOptionC,String  QuestionsOptionD, Integer QuestionsAnswer, Integer QuestionsMarks, Integer ChosenAnswer, Integer MarksScored) {
super();
this.QuestionsId = QuestionsId;
this.QuestionsTitle = QuestionsTitle;
this.QuestionsOptionA = QuestionsOptionA;
this.QuestionsOptionB = QuestionsOptionB;
this.QuestionsOptionC = QuestionsOptionC;
this.QuestionsOptionD = QuestionsOptionD;
this.QuestionsAnswer = QuestionsAnswer;
this.QuestionsMarks = QuestionsMarks;
this.ChosenAnswer = ChosenAnswer;
this.MarksScored = MarksScored;

}

public Integer getQuestionsId() {
return QuestionsId;
}

public void setQuestionsId(Integer QuestionsId) {
this.QuestionsId = QuestionsId;
}

public String getQuestionsTitle() {
return QuestionsTitle;
}

public void setQuestionsTitle(String QuestionsTitle) {
this.QuestionsTitle = QuestionsTitle;
}
public String getQuestionsOptionA() {
return QuestionsOptionA;
}

public void setQuestionsOptionA(String QuestionsOptionA) {
this.QuestionsOptionA = QuestionsOptionA;
}

public String getQuestionsOptionB() {
return QuestionsOptionB;
}

public void setQuestionsOptionB(String QuestionsOptionB) {
this.QuestionsOptionB = QuestionsOptionB;
}

public String getQuestionsOptionC() {
return QuestionsOptionC;
}

public void setQuestionsOptionC(String QuestionsOptionC) {
this.QuestionsOptionC = QuestionsOptionC;
}

public String getQuestionsOptionD() {
return QuestionsOptionD;
}

public void setQuestionsOptionD(String QuestionsOptionD) {
this.QuestionsOptionD = QuestionsOptionD;
}
public Integer getQuestionsAnswer() {
return QuestionsAnswer;
}

public void setQuestionsAnswer(Integer QuestionsAnswer) {
this.QuestionsAnswer = QuestionsAnswer;
}
public Integer getQuestionsMarks() {
return QuestionsMarks;
}

public void setQuestionsMarks(Integer QuestionsMarks) {
this.QuestionsMarks = QuestionsMarks;
}
public Integer getChosenAnswer() {
return ChosenAnswer;
}

public void setChosenAnswer(Integer ChosenAnswer) {
this.ChosenAnswer = ChosenAnswer;
}
public Integer getMarksScored() {
return MarksScored;
}

public void setMarksScored(Integer MarksScored) {
this.MarksScored = MarksScored;
}
}