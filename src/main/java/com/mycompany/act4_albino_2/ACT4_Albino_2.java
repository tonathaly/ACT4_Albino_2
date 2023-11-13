package com.mycompany.act4_albino_2;

import java.util.Scanner;

public class ACT4_Albino_2 {

    public static void main(String[] args) {
            Scanner myInput = new Scanner(System.in);
        
        System.out.print("Enter your fullname: ");
        String myFullname = myInput.nextLine();
        System.out.print("Enter your program: ");
        String myProgram = myInput.nextLine();
        System.out.print("Enter your address: ");
        String myAddress = myInput.nextLine();
        System.out.print("Enter your age: ");
        int myAge = myInput.nextInt();
        
        System.out.print("Hello " + myFullname + " your age is " + myAge + "," + " You live in " + myAddress + " and your program is " + myProgram + ".");

    }
}
