import java.util.*;

public class HospitalRegistrationSystem {
   
    private static final Scanner scanner = new Scanner(System.in);
    private static Admin admin = new Admin();

    public static void main(String[] args) {
        int choice, choiceP, choiceD, choiceA, choiceM;
        clearScreen();

        displayWelcomeBanner();

        do {
            displayMainMenu();
            choice = scanner.nextInt();
            clearScreenWithPrompt();

            switch (choice) {
                case 1:
                        do {
                            admin.displayPatientMenu();
                            choiceP = scanner.nextInt();
                            switch (choiceP) {
                                
                                case 1:
                                        clearScreenWithPrompt();
                                        admin.addPatient();
                                        Pause();
                                        clearScreen();
                                    break;
                                case 2:
                                        clearScreenWithPrompt();
                                        admin.displayPatients();
                                        Pause();
                                        clearScreen();
                                    break;
                                case 3: clearScreenWithPrompt();
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
                        do {
                            admin.displayDoctorMenu();
                            choiceD = scanner.nextInt();

                            switch (choiceD) {
                                
                                case 1:
                                        clearScreenWithPrompt();
                                        admin.addDoctor();
                                        Pause();
                                        clearScreen();
                                    break;
                                case 2:
                                        clearScreenWithPrompt();
                                        admin.displayDoctors();
                                        Pause();
                                        clearScreen();
                                    break;
                                case 3: clearScreenWithPrompt();
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
                        do {
                            admin.displayAppointmentMenu();
                            choiceA = scanner.nextInt();
                            switch (choiceA) {
                                case 1:
                                        clearScreenWithPrompt();
                                        admin.displayPatients();
                                        admin.displayDoctors();
                                        admin.setAppointment();
                                        Pause();
                                        clearScreen();
                                    break;
                                case 2:
                                        clearScreenWithPrompt();
                                        admin.displayAppointmentList();
                                        Pause();
                                        clearScreen();
                                    break;
                                case 3:
                                        clearScreenWithPrompt();
                                        admin.displayAppointmentList();
                                        admin.deleteAppointment();
                                        Pause();
                                        clearScreen();
                                    
                                default:
                                    break;
                            }
                        } while (choiceA != 4);
                        clearScreenWithPrompt();

                    break;
                case 4:
                        do {
                            admin.displayMedicationsMenu();
                            choiceM = scanner.nextInt();
                            switch (choiceM) {
                                case 1:
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
                        clearScreen();
                        System.out.println("Thank you for using our System :3");
                        try {
                            // Sleep for 3 seconds (3000 milliseconds)
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            // Handle interrupted exception if needed
                            e.printStackTrace();
                        }
                        System.exit(0);//
                    break;
                default:
                    clearScreen();
                        System.out.println("Invalid choice. Please enter a valid option.");
                    Pause();
                    break;
                
            }

            clearScreen();

        } while (choice != 5);
    }

    public static void displayWelcomeBanner() {
        System.out.println("*********************************************");
        System.out.println("*  Welcome to Hospital Registration System  *");
        System.out.println("*********************************************");
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void clearScreenWithPrompt() {
        System.out.print("Press Enter to continue...");
        scanner.nextLine(); 
        clearScreen();
    }

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

    public static void Pause() {
    
        System.out.println("Press Enter to continue...");
        
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine(); // This line will wait for the user to press Enter
        System.out.println("Continuing...");
   
    }
}

