/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.progpart1_5121;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author M Lepota
 */
public class PROGPART1_5121 {



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Login> users = new ArrayList<>();

        System.out.println("\nWelcome to our chat app!");

        while (true) {

            System.out.println("\nMain Menu:");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = input.nextInt();
            input.nextLine();

            // REGISTER
            if (choice == 1) {

                System.out.println("Enter username:");
                String username = input.nextLine();

                if (!Validator.checkUsername(username)) {
                    System.out.println("Invalid username.");
                    continue;
                }

                System.out.println("Enter password:");
                String password = input.nextLine();

                if (!Validator.checkPassword(password)) {
                    System.out.println("Invalid password.");
                    continue;
                }

                System.out.println("Enter cellphone (+27XXXXXXXXX):");
                String cellphone = input.nextLine();

                if (!Validator.checkCellphone(cellphone)) {
                    System.out.println("Invalid cellphone.");
                    continue;
                }

                users.add(new Login(username, password, cellphone));
                System.out.println("Registration successful!");

            }

            // LOGIN
            else if (choice == 2) {

                System.out.println("Enter username:");
                String username = input.nextLine();

                System.out.println("Enter password:");
                String password = input.nextLine();

                boolean found = false;

                for (Login user : users) {
                    if (user.getUsername().equals(username) &&
                        user.getPassword().equals(password)) {

                        System.out.println("Login successful! Welcome " + username);
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Username or password incorrect.");
                }
            }

            // EXIT
            else if (choice == 3) {
                System.out.println("Goodbye!");
                break;
            }

            else {
                System.out.println("Invalid option.");
            }
        }

        input.close();
    }
}
    

