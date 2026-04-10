package com.mycompany.miniproject;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    static String[] subjects = {"Maths", "Physics", "Chemistry", "CS"};
    static boolean[] enrolled = new boolean[subjects.length];

    public static void main(String[] args) {

        System.out.println("=== Course Registration System ===");

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Welcome " + name);

        while (true) {
            System.out.println("\n1. View Subjects");
            System.out.println("2. Enroll Subject");
            System.out.println("3. My Subjects");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    viewSubjects();
                    break;
                case 2:
                    enroll();
                    break;
                case 3:
                    mySubjects();
                    break;
                case 4:
                    System.out.println("Thank You!");
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    static void viewSubjects() {
        System.out.println("\nAvailable Subjects:");
        for (int i = 0; i < subjects.length; i++) {
            System.out.println((i + 1) + ". " + subjects[i]);
        }
    }

    static void enroll() {
        viewSubjects();
        System.out.print("Enter subject number: ");
        int n = sc.nextInt();

        if (n < 1 || n > subjects.length) {
            System.out.println("Invalid!");
            return;
        }

        if (enrolled[n - 1]) {
            System.out.println("Already Enrolled!");
        } else {
            enrolled[n - 1] = true;
            System.out.println("Enrolled Successfully!");
        }
    }

    static void mySubjects() {
        System.out.println("\nMy Subjects:");
        boolean found = false;

        for (int i = 0; i < subjects.length; i++) {
            if (enrolled[i]) {
                System.out.println(subjects[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No subjects enrolled");
        }
    }
}