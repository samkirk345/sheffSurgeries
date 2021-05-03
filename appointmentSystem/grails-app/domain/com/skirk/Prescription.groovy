package com.skirk

class Prescription {
	String pharmacyName
	int prescripNumber
	String medicine
	float totalCost
	Date dateIssued
	Boolean patientPaying
	
	String toString(){
	return pharmacyName
	}

    static constraints = {
	pharmacyName blank:false
	prescripNumber blank:false
	medicine blank:false
	totalCost blank:false, scale:2
	dateIssued blank:false
	patientPaying blank:false
    }
	static belongsTo = [Patient, Doctor]
	static hasMany = [doctors:Doctor, patients:Patient]
}
