
public class Doctor extends MedEmployee {

	private static final int DOCTOR_SALARY = 90000;
	private String specialty;

	@Override
	public int getSalary() {
		return DOCTOR_SALARY;
	}

	public String getSpecialty() {
		return specialty;
	}

	public Doctor(String name, int employeeNumber, String specialty) {
		super(name, employeeNumber);
		this.specialty = specialty;
	}

	@Override
	public void drawBlood(Patient patient) {
		patient.haveBloodDrawn(2);
	}
	
	@Override
	public void care(Patient patient) {
		patient.beCaredFor(2);
	}
}
