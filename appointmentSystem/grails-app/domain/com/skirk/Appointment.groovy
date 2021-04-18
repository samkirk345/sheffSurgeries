package com.skirk

class Appointment {
	Date appDate
	String appTime
	int appDuration
	String roomNumber

    static constraints = {
	appDate blank:false
	appTime blank:false
	appDuration blank:false
	roomNumber blank:false
    }
}
