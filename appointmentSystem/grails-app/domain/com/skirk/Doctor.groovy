package com.skirk

class Doctor {
	String fullName
	String qualification
	String position
	String doctorEmail
	String password
	String doctorOffice
	long doctorPhone
	String bio

    static constraints = {
	fullName blank:false
	qualification blank:false
	position blank:false
	doctorEmail blank:false, unique:true, email:true
	password blank:false
	doctorOffice blank:false
	doctorPhone blank:false, unique:true
	bio maxSize:3500
    }
}
