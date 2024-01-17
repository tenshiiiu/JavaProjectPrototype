// This class represents the main Hospital Registration System application

import java.util.*;

public class HospitalRegistrationSystem {
   
    private static final Scanner scanner = new Scanner(System.in);
    private static Admin admin = new Admin();

    public static void main(String[] args) {
        int choice, choiceP, choiceD, choiceA, choiceM;

        // Clear the screen and display the welcome banner
        clearScreen();
        displayWelcomeBanner();

        // Main application loop
        do {
            // Display the main menu and get the user's choice
            displayMainMenu();
            choice = scanner.nextInt();
            clearScreenWithPrompt();

            switch (choice) {
                case 1:
                    // Patients Information menu
                    do {
                        admin.displayPatientMenu();
                        choiceP = scanner.nextInt();
                        switch (choiceP) {
                            case 1:
                                // Add a new patient
                                clearScreenWithPrompt();
                                admin.addPatient();
                                Pause();
                                clearScreen();
                                break;
                            case 2:
                                // Display patients information
                                clearScreenWithPrompt();
                                admin.displayPatients();
                                Pause();
                                clearScreen();
                                break;
                            case 3:
                                // Display patients information, then delete a patient
                                clearScreenWithPrompt();
                                admin.displayPatients();
                                admin.deletePatient();
                                Pause();
                                clearScreen();
                                break;
                            default:
                                break;
                        }
                    } while (choiceP != 4);
                    clearScreenWithPrompt();
                    break;
                
                case 2:
                    // Doctors Information menu
                    do {
                        admin.displayDoctorMenu();
                        choiceD = scanner.nextInt();
                        switch (choiceD) {
                            case 1:
                                // Add a new doctor
                                clearScreenWithPrompt();
                                admin.addDoctor();
                                Pause();
                                clearScreen();
                                break;
                            case 2:
                                // Display doctors information
                                clearScreenWithPrompt();
                                admin.displayDoctors();
                                Pause();
                                clearScreen();
                                break;
                            case 3:
                                // Display doctors information, then delete a doctor
                                clearScreenWithPrompt();
                                admin.displayDoctors();
                                admin.deleteDoctor();
                                Pause();
                                clearScreen();
                                break;
                            default:
                                break;
                        }
                    } while (choiceD != 4);
                    clearScreenWithPrompt();
                    break;
                
                case 3:
                    // Appointment Information menu
                    do {
                        admin.displayAppointmentMenu();
                        choiceA = scanner.nextInt();
                        switch (choiceA) {
                            case 1:
                                // Display patients and doctors information, then set a new appointment
                                clearScreenWithPrompt();
                                admin.displayPatients();
                                admin.displayDoctors();
                                admin.setAppointment();
                                Pause();
                                clearScreen();
                                break;
                            case 2:
                                // Display list of appointments
                                clearScreenWithPrompt();
                                admin.displayAppointmentList();
                                Pause();
                                clearScreen();
                                break;
                            case 3:
                                // Display list of appointments, then delete an appointment
                                clearScreenWithPrompt();
                                admin.displayAppointmentList();
                                admin.deleteAppointment();
                                Pause();
                                clearScreen();
                                break;
                            default:
                                break;
                        }
                    } while (choiceA != 4);
                    clearScreenWithPrompt();
                    break;

                case 4:
                    // Medications Information menu
                    do {
                        admin.displayMedicationsMenu();
                        choiceM = scanner.nextInt();
                        switch (choiceM) {
                            case 1:
                                // Display list of medications
                                clearScreenWithPrompt();
                                Medications.displayMedicationList();
                                Pause();
                                clearScreen();
                                break;
                            default:
                                break;
                        }
                    } while (choiceM != 2);
                    clearScreenWithPrompt();
                    break;

                case 5:
                    // Exit the application
                    clearScreen();
                    System.out.println("Thank you for using our System :3");
                    try {
                        // Sleep for 3 seconds (3000 milliseconds)
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        // Handle interrupted exception if needed
                        e.printStackTrace();
                    }
                    System.exit(0);
                    break;

                default:
                    // Invalid choice
                    clearScreen();
                    System.out.println("Invalid choice. Please enter a valid option.");
                    Pause();
                    break;
                
            }

            clearScreen();

        } while (choice != 5);
    }

    // Method to display a welcome banner
    public static void displayWelcomeBanner() {
        System.out.println("*********************************************");
        System.out.println("*  Welcome to Hospital Registration System  *");
        System.out.println("*********************************************");
    }

    // Method to clear the console screen
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    // Method to clear the screen with a prompt to press Enter to continue
    public static void clearScreenWithPrompt() {
        System.out.print("Press Enter to continue...");
        scanner.nextLine(); 
        clearScreen();
    }

    // Method to display the main menu options
    public static void displayMainMenu() {
        System.out.println("---------------------------------------------");
        System.out.println("Hospital Registration System Menu:");
        System.out.println("1. Patients Information ");
        System.out.println("2. Doctors Information ");
        System.out.println("3. Appointment Information ");
        System.out.println("4. Medications Information ");
        System.out.println("5. Exit");
        System.out.println("---------------------------------------------");
        System.out.print("Enter your choice: ");
    }

    // Method to pause execution until the user presses Enter
    public static void Pause() {
        System.out.println("Press Enter to continue...");
        scanner.nextLine(); // This line will wait for the user to press Enter
        System.out.println("Continuing...");
    }
}
