public class Doctor extends Person {
    
    private String doctorID;
    private String specialization;

    public Doctor(String doctorID, String specialization,  String name, 
                  String dateOfBirth, String gender, String contactInfo, String email) {
        super(name, dateOfBirth, gender, contactInfo, email);
        this.doctorID = doctorID;
        this.specialization = specialization;
    }

    public String getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(String doctorID) {
        this.doctorID = doctorID;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return  "Doctor ID      : " + doctorID + "\n" +
                "Specialization : " + specialization + "\n" +
                super.toString() + "\n";
    }
}
