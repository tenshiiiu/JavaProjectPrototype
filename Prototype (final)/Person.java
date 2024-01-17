// This class represents a general person with common attributes
public class Person {
    
    // Private fields representing personal information
    private String name;           // Name of the person
    private String dateOfBirth;    // Date of birth of the person
    private String gender;         // Gender of the person
    private String contactInfo;    // Contact information of the person
    private String email;          // Email address of the person

    // Constructor to initialize the Person object with personal information
    public Person(String n, String dob, String gr, String ci, String em) {
        this.name = n;
        this.dateOfBirth = dob;
        this.gender = gr;
        this.contactInfo = ci;
        this.email = em;
    }

    // Getter method for retrieving the person's name
    public String getName() {
        return name;
    }

    // Setter method for setting or updating the person's name
    public void setName(String name) {
        this.name = name;
    }  

    // Getter method for retrieving the person's date of birth
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    // Getter method for retrieving the person's gender
    public String getGender() {
        return gender;
    }

    // Getter method for retrieving the person's contact information
    public String getContactInfo() {
        return contactInfo;
    }

    // Getter method for retrieving the person's email address
    public String getEmail() {
        return email;
    }

    // Override the toString method to provide a formatted string representation of the Person object
    public String toString() {
        return  "Name           : " + name + "\n" +
                "Date of Birth  : " + dateOfBirth + "\n" +
                "Gender         : " + gender + "\n" +
                "Contact Info   : " + contactInfo + "\n" +
                "Email          : " + email;
    }
}
