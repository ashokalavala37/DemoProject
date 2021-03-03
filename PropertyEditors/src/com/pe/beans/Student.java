package com.pe.beans;

import java.io.File;
import java.sql.Date;
import java.util.Arrays;

public class Student {
	private int studentId;
	private String name;
	private File resumeFile;
	private Date dob;
	private String[] subjects;

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setResumeFile(File resumeFile) {
		this.resumeFile = resumeFile;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public void setSubjects(String[] subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name
				+ ", resumeFile=" + resumeFile + ", dob=" + dob + ", subjects="
				+ Arrays.toString(subjects) + "]";
	}

}
