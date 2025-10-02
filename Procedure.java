
public class Procedure {

    private String name;
    private String date;           // e.g., 06/12/2023
    private String practitioner;
    private double charges;


    public Procedure() {
        name = "";
        date = "";
        practitioner = "";
        charges = 0.0;
    }


    public Procedure(String name, String date) {
        this.name = name;   // "this" needed
        this.date = date;   // "this" needed
        practitioner = "";
        charges = 0.0;
    }


    public Procedure(String name, String date, String practitioner, double charges) {
        this.name = name;                 // "this" needed
        this.date = date;                 // "this" needed
        this.practitioner = practitioner; // "this" needed
        this.charges = charges;           // "this" needed
    }


    public String getName() { return name; }
    public String getDate() { return date; }
    public String getPractitioner() { return practitioner; }
    public double getCharges() { return charges; }


    public void setName(String name) { this.name = name; }
    public void setDate(String date) { this.date = date; }
    public void setPractitioner(String practitioner) { this.practitioner = practitioner; }
    public void setCharges(double charges) { this.charges = charges; }


    @Override
    public String toString() {
        return "Procedure: " + name + "\n" +
                "Date: " + date + "\n" +
                "Practitioner: " + practitioner + "\n" +
                "Charges: " + charges;
    }
}
