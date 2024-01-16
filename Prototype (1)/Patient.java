public class Patient extends Person {
   
    private String patientID;
    private String disease;

    public Patient(String patientID, String disease, String name, String dateOfBirth, 
                   String gender, String contactInfo, String email) {
        super(name, dateOfBirth, gender, contactInfo, email);
        this.patientID = patientID;
        this.disease = disease;
    }
    
    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    @Override
    public String toString() {
        return "Patient ID     : " + patientID + "\n" +
               "Disease        : " + disease + "\n" +
            super.toString() + "\n";
    }
}

