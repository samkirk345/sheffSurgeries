package com.skirk

class Surgery {
	String name
	String address
	String postcode
	String telephone
	int numberOfPatients
	String description
	String openingTime
	
	String toString(){
	return name
	}

    static constraints = {
	name blank:false
	address blank:false
	postcode blank:false
	telephone blank:false
	numberOfPatients blank:false
	description blank:false
	openingTime blank:false
    }
	static hasMany = [doctors:Doctor, receptionists:Receptionist, nurses:Nurse, appointments:Appointment]
	static belongsTo = [Doctor, Appointment, Nurse, Receptionist]
}
