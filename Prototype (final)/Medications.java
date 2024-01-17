// Enum representing different types of medications

public enum Medications {
    RESPIRATORY(1, "Inhaler"),
    NASAL(2, "Nasal Spray"),
    FEVER(3, "Padadol"),
    BRUISES(4, "Plaster");

    private final Integer medicationsID;
    private final String medicineName;

    Medications(Integer medID, String mName) {
        this.medicationsID = medID;
        this.medicineName = mName;
    }

    public int getMedicationID() {
        return medicationsID;
    }

    public String getMedicationName() {
        return medicineName;
    }

    // Static method to display a list of medications
    public static void displayMedicationList() {
        System.out.println("Medication List:");
        System.out.println("================");
        System.out.printf("%-15s | %-20s | %-15s%n", "Medication ID", "Type of Medication", "Medicine Name");
        System.out.println("-".repeat(60));

        // Iterate through enum values and display each medication's information
        for (Medications medication : Medications.values()) {
            System.out.printf("%-15d | %-20s | %-15s%n",
                    medication.getMedicationID(), medication.name(),
                    medication.getMedicationName());
        }
    }
}
