package com.mrityunjay.logger.service;

public interface StudentInterface {
	public int getRoll();
	
	default String generalMessage() {
		return "Student should focus on their study..";
	}
}
