package com.bridgelabz;


public class AddressBookMain {

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book");
        AddressBook person = new AddressBook();
        person.AddMultipleContact();
        person.displayDetails();

    }
}
