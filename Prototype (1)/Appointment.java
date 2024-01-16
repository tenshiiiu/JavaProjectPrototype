import java.util.*;

public class Appointment {
    private Date dateTime;
    private Patient patient;
    private Doctor doctor;
    private String appointmentID;
    
    public Appointment(String appointmentID, Date dateTime, Patient patient, Doctor doctor) {
        this.appointmentID = appointmentID;
        this.dateTime = dateTime;
        this.patient = patient;
        this.doctor = doctor;
    }

    public String getAppointmentID() {
        return appointmentID;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public Patient getPatient() {
        return patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    @Override
    public String toString() {
        
        return  "=====================================================\n" +
                "Appointment ID      : " + appointmentID + "\n" +
                "Date and Time       : " + dateTime + "\n" +
                "-----------------------------------------------------\n" +
                "Patient details     :\n" +
                "-----------------------------------------------------\n"
                 + patient +"\n" + 
                "-----------------------------------------------------\n" +
                "Doctor Assigned     :\n" + 
                "-----------------------------------------------------\n" +
                doctor +
                "=====================================================";
    }

}


