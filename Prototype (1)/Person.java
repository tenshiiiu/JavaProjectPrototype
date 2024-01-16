public class Person {
    private String name;
    private String dateOfBirth;
    private String gender;
    private String contactInfo;
    private String email;

    public Person(String n, String dob, String gr, String ci, String em) {
        this.name = n;
        this.dateOfBirth = dob;
        this.gender = gr;
        this.contactInfo = ci;
        this.email = em;
    }

    public String getName(){
        return  name;
    }

    public void setName(String name) {
        this.name = name;
    }  

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public String getEmail() {
        return email;
    }

    public String toString() {
        return  "Name           : " + name + "\n" +
                "Date of Birth  : " + dateOfBirth + "\n" +
                "Gender         : " + gender + "\n" +
                "Contact Info   : " + contactInfo + "\n" +
                "Email          : " + email;
    }
}
