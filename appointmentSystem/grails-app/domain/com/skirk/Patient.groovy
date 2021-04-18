package com.skirk

class Patient {
	String patientName
	String patientAddress
	String patientResidence
	Date patientDob
	String patientID
	Date dateRegistered
	long patientPhone

    static constraints = {
	patientName blank:false
	patientAddress blank:false
	patientResidence blank:false
	patientDob blank:false
	patientID blank:false, unique:true
	dateRegistered blank:false
	patientPhone blank:false, unique:true
    }
}
