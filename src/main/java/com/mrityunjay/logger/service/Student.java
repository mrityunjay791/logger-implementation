package com.mrityunjay.logger.service;

public class Student implements StudentInterface {

	private int rollNo;
	
	
	public Student(int rollNo) {
		super();
		this.rollNo = rollNo;
	}


	@Override
	public int getRoll() {
		return rollNo;
	}
	
}
