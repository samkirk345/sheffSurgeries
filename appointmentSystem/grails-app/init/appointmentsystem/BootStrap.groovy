package com.skirk

class BootStrap {

    def init = { servletContext ->

	def surgery1 = new Surgery(
		name: 'West Street Surgery',
		address: '1 West Street',
		postcode: 'S1 1Y1',
		telephone: '07491 918233',
		numberOfPatients: 600,
		description: 'desc',
		openingTime: '9:00am'
		).save()

	def surgery2 = new Surgery(
		name: 'South Street Surgery',
		address: '1 South Street',
		postcode: 'S2 1Y1',
		telephone: '08421 988273',
		numberOfPatients: 500,
		description: 'desc',
		openingTime: '8:00am'
		).save()

	def appointment1 = new Appointment(
		id: '1',
		appDate: new Date ('01/01/2021'),
		appTime: '9:00am',
		appDuration: 15,
		roomNumber: 'A10'
		).save()
	
	def appointment2 = new Appointment(
		id: '2',
		appDate: new Date ('02/01/2021'),
		appTime: '9:15am',
		appDuration: 15,
		roomNumber: 'A11'
		).save()

	def doctor1 = new Doctor(
		fullName: 'Dr John Johnson',
		qualification: 'Medicine Degree',
		position: 'Doctor',
		doctorEmail: 'jjohnson@wssurgery.com',
		password: 'password123',
		doctorOffice: 'A10',
		doctorPhone: '07550 779594',
		bio: 'bio'
		).save()

	def doctor2 = new Doctor(
		fullName: 'Dr Sam Samson',
		qualification: 'Medicine Degree',
		position: 'Doctor',
		doctorEmail: 'ssamson@wssurgery.com',
		password: 'password456',
		doctorOffice: 'A11',
		doctorPhone: '07880 239594',
		bio: 'bio'
		).save()

	def nurse1 = new Nurse(
		nurseName: 'Mike Jones',
		qualifications: 'Nurse Degree',
		nurseEmail: 'mjones@wssurgery.com',
		nurseOffice: 'A12',
		nursePhone: '07556 235264'
		).save()

	def nurse2 = new Nurse(
		nurseName: 'Steve Jones',
		qualifications: 'Nurse Degree',
		nurseEmail: 'sjones@wssurgery.com',
		nurseOffice: 'A13',
		nursePhone: '07556 233464'
		).save()

	def patient1 = new Patient(
		patientName: 'Tim Burton',
		patientAddress: '1 North East Street',
		patientResidence: 'Sheffield, South Yorkshire',
		patientDob: new Date ('01/01/1985'),
		patientID: 'A5555',
		dateRegistered: new Date ('01/01/1995'),
		patientPhone: '09865 239647'
		).save()

	def patient2 = new Patient(
		patientName: 'Tom Burton',
		patientAddress: '1 North West Street',
		patientResidence: 'Sheffield, South Yorkshire',
		patientDob: new Date ('31/01/1985'),
		patientID: 'A5445',
		dateRegistered: new Date ('31/01/1995'),
		patientPhone: '09865 200047'
		).save()

	def prescription1 = new Prescription(
		pharmacyName: 'West Street Pharmacy',
		prescripNumber: 12345,
		medicine: 'Ibuprofen',
		totalCost: 9.99,
		dateIssued: new Date ('18/04/2021'),
		patientPaying: true
		).save()

	def prescription2 = new Prescription(
		pharmacyName: 'East Street Pharmacy',
		prescripNumber: 67890,
		medicine: 'Paracetamol',
		totalCost: 9.99,
		dateIssued: new Date ('18/04/2021'),
		patientPaying: true
		).save()

	def receptionist1 = new Receptionist(
		recepName: 'Kate Brown',
		recepEmail: 'kbrown@wssurgery.com',
		recepUsername: 'kbrown1',
		recepPassword: 'password',
		recepPhone: '97283 92736'
		).save()

	def receptionist2 = new Receptionist(
		recepName: 'Jade Brown',
		recepEmail: 'jbrown@wssurgery.com',
		recepUsername: 'jbrown2',
		recepPassword: 'password',
		recepPhone: '97283 95436'
		).save()
	}

    def destroy = {
    }
}
