package com.skirk

class Appointment {
	String appID
	Date appDate
	String appTime
	int appDuration
	String roomNumber

	String toString(){
	return appID
	}

    static constraints = {
	appID blank:false, unique:true
	appDate blank:false
	appTime blank:false
	appDuration blank:false
	roomNumber blank:false
    }
	static belongsTo = [Doctor, Patient, Surgery]
	static hasMany = [doctors:Doctor, surgeries:Surgery, patients:Patient]
}
