package model;

import java.util.Scanner;

public class AddressBooks {
    int id;
    String Name;
    String Company;
    String Gmail;
    int Phone;

    public AddressBooks() {
    }

    public AddressBooks(int id, String name, String company, String gmail, int phone) {
        this.id = id;
        this.Name = name;
        this.Company = company;
        this.Gmail = gmail;
        this.Phone =phone;
    }


    public void inputData(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter id: ");
        this.id = input.nextInt();
        System.out.print("Enter Name: ");
        this.Name = input.next();
        System.out.print("Enter Company: ");
        this.Company = input.next();
        System.out.print("Enter Email: ");
        this.Gmail = input.next();
        System.out.print("Enter Phone Number : ");
        this.Phone = input.nextInt();
    }

    public void AddressBooks(int id,String Name,String Gmail,String company,int Phone){
        this.id = id;
        this.Name = Name;
        this.Company = company;
        this.Gmail = Gmail;
        this.Phone =Phone;
    }
    public String toString(){return this.id+ ", " +this.Name+ ", " +this.Company+ ", " +this.Gmail+ ", " +this.Phone;}

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getCompany(){return this.Company;}

    public void setCompany(String company){this.Company= company;}

    public String getEmail() {
        return this.Gmail;
    }

    public void setEmail(String email) {
        this.Gmail = email;
    }

    public int getPhone() {
        return this.Phone;
    }

    public void setPhone(int Phone) {
        this.Phone = Phone;
    }

}
