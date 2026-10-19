package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstName = firstName(input).trim();

        String middleName = middleName(input).trim();

        String lastName = lastName(input).trim();

        String suffix = getSuffix(input).trim();

        String fullName = firstName;
        if(middleName.isEmpty()) {
            fullName += " " + middleName;}

        fullName = fullName + " " + lastName;

        if(!suffix.isEmpty()) {
            fullName += ", " + suffix;
        }
        System.out.println(fullName);

    }

    public static String firstName(Scanner input){
        System.out.print("Enter your first name: ");
        String fName = input.nextLine();
        return fName;

    }public static String middleName(Scanner input){
        System.out.print("Enter your Middle name: ");
        String mName = input.nextLine();
        return mName;


    }public static String lastName(Scanner input){
        System.out.print("Enter your last name: ");
        String lName = input.nextLine();
        return lName;

    }public static String getSuffix(Scanner input){
        System.out.print("Enter your Suffix: ");
        String suff = input.nextLine();
        return suff;
    }




}
