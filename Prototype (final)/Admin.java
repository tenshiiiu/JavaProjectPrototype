// This class represents the administrative functionalities of the healthcare system

import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Admin {
    private ArrayList<Patient> patients;
    private ArrayList<Doctor> doctors;
    private ArrayList<Appointment> appointments;
    private static final Scanner scanner = new Scanner(System.in);

    public Admin() {
        this.patients = new ArrayList<>();
        this.doctors = new ArrayList<>();
        this.appointments = new ArrayList<>();
    }

    // Method to add a new patient to the system
    public void addPatient() {

        System.out.println("=====================================================");
        System.out.println("Enter patient details:");
        System.out.println("=====================================================");

        System.out.print("Patient ID     : ");
        String patientID = scanner.nextLine();

        System.out.print("Disease        : ");
        String disease = scanner.nextLine();

        System.out.print("Patient Name   : ");
        String name = scanner.nextLine();

        System.out.print("Date of Birth  : ");
        String dob = scanner.nextLine();

        System.out.print("Patient Gender : ");
        String gender = scanner.nextLine();
        
        System.out.print("Contact Info   : ");
        String contactInfo = scanner.nextLine();

        System.out.print("Patient Email  : ");
        String email = scanner.nextLine();

        Patient patient = new Patient(patientID, disease, name, dob, gender, contactInfo, email);
        
        patients.add(patient);

        System.out.println("-----------------------------------------------------");
        System.out.println("Patient registered to the system.");
        System.out.println("-----------------------------------------------------");
        System.out.println("=====================================================");

    }

    // Method to delete a patient from the system
    public void deletePatient() {
        System.out.println("-----------------------------------------------------");
        System.out.print("Enter the Patient ID to delete :");
        String patientIDToDelete = scanner.nextLine();

        Iterator<Patient> iterator = patients.iterator();
        boolean patientFound = false;

        while (iterator.hasNext()) {
            Patient patient = iterator.next();
            if (patient.getPatientID().equals(patientIDToDelete)) {
                iterator.remove();
                patientFound = true;
                System.out.println("Patient with ID " + patientIDToDelete + " deleted successfully.");
                break; // No need to continue searching once the patient is found and deleted
            }
        }

        if (!patientFound) {
            System.out.println("Patient with ID " + patientIDToDelete + " not found.");
        }

        System.out.println("-----------------------------------------------------");
    }

    // Method to find a patient by ID in the list of patients
    public static Patient findPatientById(ArrayList<Patient> patients, String patientIDToFind) {
        for (Patient patient : patients) {
            if (patient.getPatientID().equals(patientIDToFind)) {
                return patient;
            }
        }
        return null;
    }

    // Method to display a list of patients
    public void displayPatients(){
        System.out.println("-----------------------------------------------------");
        System.out.println("List of Patiens are like below : ");
        System.out.println("-----------------------------------------------------");
        for(Patient patient : patients){
            System.out.println(patient);;
        }
        System.out.println("-----------------------------------------------------");
    }

    // Method to add a new doctor to the system
    public void addDoctor() {

        System.out.println("=====================================================");
        System.out.println("Enter doctor details:");
        System.out.println("=====================================================");

        System.out.print("Doctor ID        : ");
        String doctorId = scanner.nextLine();

        System.out.print("Specialization   : ");
        String specialization = scanner.nextLine();

        System.out.print("Doctor Name      : ");
        String name = scanner.nextLine();

        System.out.print("Date of Birth    : ");
        String dob = scanner.nextLine();

        System.out.print("Doctor Gender    : ");
        String gender = scanner.nextLine();
        
        System.out.print("Contact Info     : ");
        String contactInfo = scanner.nextLine();

        System.out.print("Doctor Email     : ");
        String email = scanner.nextLine();

        Doctor doctor = new Doctor(doctorId, specialization, name, dob, gender, contactInfo, email);

        doctors.add(doctor);

        System.out.println("-----------------------------------------------------");
        System.out.println("Doctor is registered to the system.");
        System.out.println("-----------------------------------------------------");
        System.out.println("=====================================================");

    }

    // Method to delete a doctor from the system
    public void deleteDoctor() {
        System.out.println("-----------------------------------------------------");
        System.out.print("Enter the Doctor ID to delete :");
        String doctorIDToDelete = scanner.nextLine();

        Iterator<Doctor> iterator = doctors.iterator();
        boolean doctorFound = false;

        while (iterator.hasNext()) {
            Doctor doctor = iterator.next();
            if (doctor.getDoctorID().equals(doctorIDToDelete)) {
                iterator.remove();
                doctorFound = true;
                System.out.println("Doctor with ID " + doctorIDToDelete + " deleted successfully.");
                break; // No need to continue searching once the patient is found and deleted
            }
        }

        if (!doctorFound) {
            System.out.println("Patient with ID " + doctorIDToDelete + " not found.");
        }
    }
    
    // Method to find a doctor by ID in the list of doctors
    public static Doctor findDoctorById(ArrayList<Doctor> doctors, String doctorIDToFind) {
        for (Doctor doctor : doctors) {
            if (doctor.getDoctorID().equals(doctorIDToFind)) {
                return doctor;
            }
        }
        return null;
    }

    // Method to display a list of doctors
    public void displayDoctors(){
        System.out.println("-----------------------------------------------------");
        System.out.println("List of Doctors are like below : ");
        System.out.println("-----------------------------------------------------");
        for(Doctor doctor : doctors){
            System.out.println(doctor);;
        }
        System.out.println("-----------------------------------------------------");
    }

    // Method to set a new appointment
    public void setAppointment() {
        System.out.println("=====================================================");
        System.out.println("Enter appointment details:");
        System.out.println("=====================================================");
    
        System.out.print("Appointment ID         : ");
        String appointmentID = scanner.nextLine();
    
        System.out.print("Date and time \n");
        System.out.print("(dd/MM/yyyy HH:mm:ss)  : ");
        String dateTimeString = scanner.nextLine();
    
        System.out.print("Patient ID             : ");
        String patientID = scanner.nextLine();
    
        System.out.print("Doctor ID              : ");
        String doctorID = scanner.nextLine();
    
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date dateTime = dateFormat.parse(dateTimeString);
    
            Patient patient = findPatientById(patients, patientID);
            Doctor doctor = findDoctorById(doctors, doctorID);
    
            if (patient != null && doctor != null) {
                Appointment appointment = new Appointment(appointmentID, dateTime, patient, doctor);
                appointments.add(appointment);
    
                System.out.println("-----------------------------------------------------");
                System.out.println("Appointment registered to the system.");
                System.out.println("-----------------------------------------------------");
            } else {
                System.out.println("Patient or Doctor not found. Please check the IDs.");
            }
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please use the format dd/MM/yyyy HH:mm:ss");
        }
    
        System.out.println("=====================================================");
    }
    
    // Method to delete an appointment from the system
    public void deleteAppointment() {
        System.out.println("-----------------------------------------------------");
        System.out.print("Enter the Appointment ID to delete: ");
        String appointmentIDToDelete = scanner.nextLine();
    
        Iterator<Appointment> iterator = appointments.iterator();
        boolean appointmentFound = false;
    
        while (iterator.hasNext()) {
            Appointment appointment = iterator.next();
            if (appointment.getAppointmentID().equals(appointmentIDToDelete)) {
                iterator.remove();
                appointmentFound = true;
                System.out.println("Appointment with ID " + appointmentIDToDelete + " deleted successfully.");
                break;
            }
        }
    
        if (!appointmentFound) {
            System.out.println("Appointment with ID " + appointmentIDToDelete + " not found.");
        }
    
        System.out.println("-----------------------------------------------------");
    }

    // Method to find an appointment by ID in the list of appointments
    public static Appointment findAppointmentById(ArrayList<Appointment> appointments,String appointmentIDToFind) {
        for (Appointment appointment : appointments) {
            if (appointment.getAppointmentID().equals(appointmentIDToFind)) {
                return appointment;
            }
        }
        return null; // Appointment with given ID not found
    }

    // Method to display a list of appointments
    public void displayAppointmentList(){
        System.out.println("-----------------------------------------------------");
        System.out.println("List of Appointments are like below : ");
        System.out.println("-----------------------------------------------------");
        for(Appointment appointment : appointments){
            System.out.println("Appointment ID: " + appointment.getAppointmentID());
        }
        System.out.println("-----------------------------------------------------");
        System.out.print("Please enter the appointment ID you want to view : ");

        String appointmentIDToFind = scanner.nextLine();

        clearScreen();

        findAppointmentById(appointments, appointmentIDToFind);

        displayAppointmentByID(appointmentIDToFind);    
    }

    // Method to display detailed information of a specific appointment by ID
    public void displayAppointmentByID(String appointmentID) {
        Appointment appointment = findAppointmentById(appointments, appointmentID);
    
        if (appointment != null) {
            System.out.println("-----------------------------------------------------");
            System.out.println("Appointment Details for Appointment ID " + appointmentID + ":");
            System.out.println("-----------------------------------------------------");
            System.out.println(appointment);
            System.out.println("-----------------------------------------------------");
        } 
        
        else {
            System.out.println("-----------------------------------------------------");
            System.out.println("Appointment with ID " + appointmentID + " not found.");
            System.out.println("-----------------------------------------------------");
        }
    }

    // Method to clear the console screen
    public void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    // Below this is all of the methods to display the menu options
    public void displayPatientMenu() {
        System.out.println("---------------------------------------------");
        System.out.println("Patient Information Menu:");
        System.out.println("1. Register New Patient ");
        System.out.println("2. Display Patients Information ");
        System.out.println("3. Delete Patient Information ");
        System.out.println("4. Return to main menu");
        System.out.println("---------------------------------------------");
        System.out.print("Enter your choice: ");
    }

    public void displayDoctorMenu() {
        System.out.println("---------------------------------------------");
        System.out.println("Doctor Information Menu:");
        System.out.println("1. Register New Doctor ");
        System.out.println("2. Display Doctor Information ");
        System.out.println("3. Delete Doctor Information ");
        System.out.println("4. Return to main menu");
        System.out.println("---------------------------------------------");
        System.out.print("Enter your choice: ");
    }

    public void displayAppointmentMenu() {
        System.out.println("---------------------------------------------");
        System.out.println("Appointment Information Menu:");
        System.out.println("1. Make new appointment ");
        System.out.println("2. Display appointment Information ");
        System.out.println("3. Delete appointment Information ");
        System.out.println("4. Return to main menu");
        System.out.println("---------------------------------------------");
        System.out.print("Enter your choice: ");
    }

    public void displayMedicationsMenu() {
        System.out.println("---------------------------------------------");
        System.out.println("Medications Information Menu:");
        System.out.println("1. Display medications Information ");
        System.out.println("2. Return to main menu");
        System.out.println("---------------------------------------------");
        System.out.print("Enter your choice: ");
    }


    
}
