package com.skirk

class Receptionist {
	String recepName
	String recepEmail
	String recepUsername
	String recepPassword
	String recepPhone

	String toString(){
	return recepName
	}

    static constraints = {
	recepName blank:false
	recepEmail blank:false, unique:true, email:true
	recepUsername blank:false, unique:true
	recepPassword blank:false
	recepPhone blank:false, unique:true
    }
	static hasMany = [doctors:Doctor, surgeries:Surgery]
	static belongsTo = [Doctor, Surgery]
}
