

public class Patient {

    private String firstName;
    private String middleName;
    private String lastName;

    private String streetAddress;
    private String city;
    private String state;
    private String zip;

    private String phoneNumber;

    private String emergencyContactName;
    private String emergencyContactPhone;


    public Patient() {
        firstName = "";
        middleName = "";
        lastName = "";
        streetAddress = "";
        city = "";
        state = "";
        zip = "";
        phoneNumber = "";
        emergencyContactName = "";
        emergencyContactPhone = "";
    }


    public Patient(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;

        streetAddress = "";
        city = "";
        state = "";
        zip = "";
        phoneNumber = "";
        emergencyContactName = "";
        emergencyContactPhone = "";
    }


    public Patient(
            String firstName, String middleName, String lastName,
            String streetAddress, String city, String state, String zip,
            String phoneNumber,
            String emergencyContactName, String emergencyContactPhone) {

        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.emergencyContactName = emergencyContactName;
        this.emergencyContactPhone = emergencyContactPhone;
    }


    public String getFirstName() { return firstName; }
    public String getMiddleName() { return middleName; }
    public String getLastName() { return lastName; }
    public String getStreetAddress() { return streetAddress; }
    public String getCity() { return city; }
    public String getState() { return state; }
    public String getZip() { return zip; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getEmergencyContactName() { return emergencyContactName; }
    public String getEmergencyContactPhone() { return emergencyContactPhone; }


    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setMiddleName(String middleName) { this.middleName = middleName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setStreetAddress(String streetAddress) { this.streetAddress = streetAddress; }
    public void setCity(String city) { this.city = city; }
    public void setState(String state) { this.state = state; }
    public void setZip(String zip) { this.zip = zip; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    public void setEmergencyContactName(String emergencyContactName) { this.emergencyContactName = emergencyContactName; }
    public void setEmergencyContactPhone(String emergencyContactPhone) { this.emergencyContactPhone = emergencyContactPhone; }


    public String buildFullName() {
        String f = firstName == null ? "" : firstName.trim();
        String m = middleName == null ? "" : middleName.trim();
        String l = lastName == null ? "" : lastName.trim();
        return (m.isEmpty() ? f + " " + l : f + " " + m + " " + l).trim();
    }


    public String buildAddress() {
        String a = streetAddress == null ? "" : streetAddress.trim();
        String c = city == null ? "" : city.trim();
        String s = state == null ? "" : state.trim();
        String z = zip == null ? "" : zip.trim();
        return (a + " " + c + " " + s + " " + z).trim();
    }


    public String buildEmergencyContact() {
        String n = emergencyContactName == null ? "" : emergencyContactName.trim();
        String p = emergencyContactPhone == null ? "" : emergencyContactPhone.trim();
        return (n + " " + p).trim();
    }


    @Override
    public String toString() {
        return "Patient Information:\n" +
                "Name: " + buildFullName() + "\n" +
                "Address: " + buildAddress() + "\n" +
                "Phone: " + (phoneNumber == null ? "" : phoneNumber) + "\n" +
                "Emergency Contact: " + buildEmergencyContact();
    }
}
