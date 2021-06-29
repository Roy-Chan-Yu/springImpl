package com.pouchen.dto;

import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.stream.Collectors;

import javax.security.auth.x500.X500Principal;

public class Question {

	private int id;
	private String name;
	private List<String> answers;
	private List<Answer> ansList;
	private Map<String, String> ansMap;
	private Map<Answer, User> ansMap2;
	
	public Question() {
		
	}
	
	public Question(int id, String name, List<String> ans, List<Answer> aList, Map<String, String> map, Map<Answer, User> map2) {
		super();
		this.id = id;
		this.name = name;
		this.answers = ans;
		this.ansList = aList;
		this.ansMap = map;
		this.ansMap2 = map2;
	}
	
	public Question(int id, String name, List<String> answers) {
		this.id = id;
		this.name = name;
		this.answers = answers;
	}
	
	public Map<String, String> getAnsMap() {
		return ansMap;
	}

	public void setAnsMap(Map<String, String> ansMap) {
		this.ansMap = ansMap;
	}

	public Map<Answer, User> getAnsMap2() {
		return ansMap2;
	}

	public void setAnsMap2(Map<Answer, User> ansMap2) {
		this.ansMap2 = ansMap2;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getAnswers() {
		return answers;
	}

	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}

	public List<Answer> getAnsList() {
		return ansList;
	}

	public void setAnsList(List<Answer> ansList) {
		this.ansList = ansList;
	}
	
	public void displayInfo() {
		System.out.println(id+" "+name);
		System.out.println("answers are: ");
		List<Object> aList = answers.stream().map(x-> x.toString()).collect(Collectors.toList());
		aList.forEach(x -> System.out.print(x+" "));
		
		System.out.println("------------List<Class>--------------");
		/**
		 * SI Tesing
		 */
		ansList.forEach(x -> System.out.println(x.getName()+x.getBy()));
		System.out.println("-------------Map<String,String>--------------");
		ansMap.entrySet().forEach(x -> System.out.println(x.getKey()+ " : "+x.getValue()));
		
		System.out.println("---------Map<Class,Class>--------------");
		
		ansMap2.entrySet().forEach(x -> System.out.println(x.getKey().getName()+" ：" + x.getValue().getEmail()));
	}
	
}
