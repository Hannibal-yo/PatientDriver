/*
 * Class: CMSC203
 * Instructor: Prof. Ahmed Tarek
 * Description: Driver app to gather input, build Patient and Procedures, and display results.
 * Due: 10/1/2025
 * Platform/compiler: Java 17+
 * I pledge that I have completed the programming
 * assignment independently. I have not copied the code
 * from a student or any source. I have not given my code
 * to any student.
 * Print your Name here: Hannibal Altasseb
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class PatientDriverApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter first name: ");
        String first = sc.nextLine();

        System.out.print("Enter middle name: ");
        String middle = sc.nextLine();

        System.out.print("Enter last name: ");
        String last = sc.nextLine();

        System.out.print("Enter street address: ");
        String addr = sc.nextLine();

        System.out.print("Enter city: ");
        String city = sc.nextLine();

        System.out.print("Enter state: ");
        String state = sc.nextLine();

        System.out.print("Enter ZIP: ");
        String zip = sc.nextLine();

        System.out.print("Enter phone (e.g., 301-123-4567): ");
        String phone = sc.nextLine();

        System.out.print("Enter emergency contact name: ");
        String emName = sc.nextLine();

        System.out.print("Enter emergency contact phone: ");
        String emPhone = sc.nextLine();


        Patient patient = new Patient(first, middle, last, addr, city, state, zip, phone, emName, emPhone);


        System.out.println("\n--- Enter Procedure #1 ---");
        Procedure p1 = new Procedure();
        System.out.print("Name: ");
        p1.setName(sc.nextLine());
        System.out.print("Date (MM/DD/YYYY): ");
        p1.setDate(sc.nextLine());
        System.out.print("Practitioner: ");
        p1.setPractitioner(sc.nextLine());
        System.out.print("Charges: ");
        p1.setCharges(sc.nextDouble());
        sc.nextLine();


        System.out.println("\n--- Enter Procedure #2 ---");
        System.out.print("Name: ");
        String p2Name = sc.nextLine();
        System.out.print("Date (MM/DD/YYYY): ");
        String p2Date = sc.nextLine();
        Procedure p2 = new Procedure(p2Name, p2Date);
        System.out.print("Practitioner: ");
        p2.setPractitioner(sc.nextLine());
        System.out.print("Charges: ");
        p2.setCharges(sc.nextDouble());;
        sc.nextLine();



        System.out.println("\n--- Enter Procedure #3 ---");
        System.out.print("Name: ");
        String p3Name = sc.nextLine();
        System.out.print("Date (MM/DD/YYYY): ");
        String p3Date = sc.nextLine();
        System.out.print("Practitioner: ");
        String p3Pract = sc.nextLine();
        System.out.print("Charges: ");
        double p3Charges = sc.nextDouble();
        Procedure p3 = new Procedure(p3Name, p3Date, p3Pract, p3Charges);


        System.out.println("\n==============================");
        displayPatient(patient);
        System.out.println("==============================");

        System.out.println("Procedures");
        System.out.println("Name\tDate\tPractitioner\tCharges");
        displayProcedure(p1);
        displayProcedure(p2);
        displayProcedure(p3);

        double total = calculateTotalCharges(p1, p2, p3);
        DecimalFormat money = new DecimalFormat("#,##0.00");
        System.out.println("\nTotal Charges: $" + money.format(total));



        sc.close();

        System.out.println("Student Name: Hannibal Altasseb");
        System.out.println("MC# MC21213703");
        System.out.println("Due Date: 10/01/2025");
    }





    public static void displayPatient(Patient p) {
        System.out.println(p.toString());
    }


    public static void displayProcedure(Procedure proc) {
        DecimalFormat money = new DecimalFormat("#,##0.00");
        System.out.println(
                proc.getName() + "\t" +
                        proc.getDate() + "\t" +
                        proc.getPractitioner() + "\t" +
                        "$" + money.format(proc.getCharges())
        );
    }


    public static double calculateTotalCharges(Procedure a, Procedure b, Procedure c) {
        return a.getCharges() + b.getCharges() + c.getCharges();
    }


}
