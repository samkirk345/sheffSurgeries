package com.skirk

class Appointment {
	String id
	Date appDate
	String appTime
	int appDuration
	String roomNumber

	String toString(){
	return id
	}

    static constraints = {
	id blank:false, unique:true
	appDate blank:false
	appTime blank:false
	appDuration blank:false
	roomNumber blank:false
    }
	static belongsTO = [Doctor, Patient, Surgery]
	static hasMany = [doctors:Doctor, surgeries:Surgery, patients:Patient]
}
