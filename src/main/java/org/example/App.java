/*
 *  UCF COP3330 Fall 2021 Assignment 8 Solution
 *  Copyright 2021 Yohan Hmaiti
 */

// This program evenly divides pizzas.
// The program prompts for the number of people,
// the number of pizzas, and the number of slices per pizza.
// Ensures that the number of pieces comes out even.
// Displays the number of pieces of pizza each person should get.
// If there are leftovers, the program shows the number of leftover pieces.

package org.example;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        // Initialize a scanner called scanner
        Scanner scanner = new Scanner(System.in);

        // create a variable that will store the number of people
        // and avariable to store the number of pizzas
        int peopleNum = 0;
        int numPizzas = 0;

        // prompt the user for the number of people
        System.out.print("How many people? ");

        // check that the input is a numerical value
        // if it is not re-prompt the user until a correct value is entered
        if (scanner.hasNextInt()) {

            peopleNum = Integer.valueOf(scanner.nextLine());

        }else while (!scanner.hasNextInt()){

            System.out.print("Please enter a numerical value!!");
            peopleNum = Integer.valueOf(scanner.nextLine());

        }

        // prompt the user for the number of pizzas available
        System.out.print("How many pizzas do you have? ");

        // check if the input is a numerical value
        // if it is not re-prompt the user until a correct value is entered
        if (scanner.hasNextInt()) {

            numPizzas = Integer.valueOf(scanner.nextLine());

        }else while (!scanner.hasNextInt()){

            System.out.print("Please enter a numerical value!!");
            numPizzas = Integer.valueOf(scanner.nextLine());

        }

        // prompt the user for the number of slices per pizza
        // and create variable that will store its value later
        System.out.print("How many slices per pizza? ");
        int numSlicesPerPizza = 0;

        // check if the input is a numerical value
        // if it is not re-prompt the user until a correct value is entered
        if (scanner.hasNextInt()) {

            numSlicesPerPizza = Integer.valueOf(scanner.nextLine());

        }else while (!scanner.hasNextInt()){

            System.out.print("Please enter a numerical value!!");
            numSlicesPerPizza= Integer.valueOf(scanner.nextLine());

        }

        // create a variable to store the total of slices
        int sliceTotal = numPizzas * numSlicesPerPizza;

        System.out.println( peopleNum + " people with " + numPizzas + " pizzas (" + sliceTotal + " slices)");

        // create a variable to store the number of slices per person
        int slicePerPerson = sliceTotal / peopleNum;

        // Alter the output as described by the assignment to handle pluralization properly
        if (slicePerPerson != 1 && slicePerPerson >= 0) {

            System.out.println("Each person gets " + slicePerPerson + " pieces of pizza.");

        }else{

            System.out.println("Each person gets " + slicePerPerson + " piece of pizza.");

        }

        // create a variable to store the number of leftovers
        int leftover = sliceTotal % peopleNum;

        // output the number of leftovers
        System.out.print("There are " + leftover + " leftover pieces.");

    }

}
