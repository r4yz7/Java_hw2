package org.example;

import java.util.Scanner;

public class Person {
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public long getNumberOfPhone() {
        return numberOfPhone;
    }

    public void setNumberOfPhone(long numberOfPhone) {
        this.numberOfPhone = numberOfPhone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    String fullName;
    String dateOfBirth;
    long numberOfPhone;
    String city;
    String country;
    String address;

    Person(){
        this.fullName = "fullName";
        this.dateOfBirth = "dateOfBirth";
        this.numberOfPhone = 0000000;
        this.city = "city";
        this.country = "country";
        this.address = "address";
    }
    Person(String fullName,String dateOfBirth,long numberOfPhone,String city,String country,String address){
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.numberOfPhone = numberOfPhone;
        this.city = city;
        this.country = country;
        this.address = address;
    }

    void SetInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter fullName: ");
        this.fullName = scanner.nextLine();
        System.out.print("Enter Date of Birth: ");
        this.dateOfBirth = scanner.nextLine();
        System.out.print("Enter number of phone: ");
        this.numberOfPhone = scanner.nextLong();
        scanner.nextLine();
        System.out.print("Enter city: ");
        this.city = scanner.nextLine();
        System.out.print("Enter country: ");
        this.country = scanner.nextLine();
        System.out.print("Enter address: ");
        this.address = scanner.nextLine();
    }

    void ShowInfo(){
        System.out.println("Full name: "+ this.fullName);
        System.out.println("Date of Birth: "+ this.dateOfBirth);
        System.out.println("Number Of Phone: "+ this.numberOfPhone);
        System.out.println("City: "+ this.city);
        System.out.println("Country: "+ this.country);
        System.out.println("Address: "+ this.address);
    }
}
