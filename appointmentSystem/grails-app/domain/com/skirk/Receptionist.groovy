package com.skirk

class Receptionist {
	String recepName
	String recepEmail
	String recepUsername
	String recepPassword
	long recepPhone

    static constraints = {
	recepName blank:false
	recepEmail blank:false, unique:true, email:true
	recepUsername blank:false, unique:true
	recepPassword blank:false
	recepPhone blank:false, unique:true
    }
}
