package com.skirk

class Surgery {
	String name
	String address
	String postcode
	long telephone
	int numberOfPatients
	String description
	String openingTime

    static constraints = {
	name blank:false
	address blank:false
	postcode blank:false
	telephone blank:false
	numberOfPatients blank:false
	description blank:false
	openingTime blank:false
    }
}
