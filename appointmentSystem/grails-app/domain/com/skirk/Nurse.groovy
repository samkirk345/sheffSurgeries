package com.skirk

class Nurse {
	String nurseName
	String qualifications
	String nurseEmail
	String nurseOffice
	String nursePhone

	String toString(){
	return nurseName
	}

    static constraints = {
	nurseName blank:false
	qualifications blank:false
	nurseEmail blank:false, email:true, unique:true
	nurseOffice blank:false
	nursePhone blank:false, unique:true
    }
	static belongsTo = [Surgery, Doctor]
	static hasMany = [doctors:Doctor, surgeries:Surgery]
}
