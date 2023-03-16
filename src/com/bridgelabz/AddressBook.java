package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    ArrayList<Contact> contactDetails = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void AddMultipleContact(){

        Contact MultipleContact = new Contact();

        System.out.println("Enter the Name : ");
        MultipleContact.setName(scanner.nextLine());

        System.out.println("Enter the Age : ");
        MultipleContact.setAge(scanner.nextLine());

        System.out.println("Enter the Phone Number : ");
        MultipleContact.setPhoneNumber(scanner.nextLine());

        System.out.println("Enter the City : ");
        MultipleContact.setCity(scanner.nextLine());

        System.out.println("Enter the State : ");
        MultipleContact.setState(scanner.nextLine());

        contactDetails.add(MultipleContact);

    }
    public void displayDetails(){
        System.out.println(contactDetails);
    }

}
