/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dicegame;

import java.util.Scanner;

/**
 *
 * @author adari
 */
public class DiceGame {

    /**
     * @param args the command line arguments
     */
    
    public static int rollDice(){
        int diceOne, diceTwo, point;
        diceOne = (int)(Math.random()*((5)+1))+1;
        diceTwo = (int)(Math.random()*((5)+1))+1;
        point = diceOne + diceTwo;
        System.out.println("Your roll: d1: last roll: " + diceOne + "; d2: last roll: " + diceTwo + "; roll value = " + point);
        return point;
    }
    
    public static boolean rollWithPoint(int point){
        // A come out roll of 7 or 11 automatically wins, with double winnings.
        // A come out roll of 2, 3, or 12 automatically loses.
        // If 4, 5, 6, 8, 9, or 10 is rolled on the come out roll, that number becomes “the point.”
        switch (point) {
            case 2: 
                return false;
            case 3:
                return false;
            case 4:{
                System.out.println("Your point value is " + point);
                while (rollDice() == point || rollDice() == 7) {
                    if(rollDice() == point){
                        System.out.println("A winner!");
                    }
                    else if(rollDice() == 7) {
                        System.out.println("Oh, I'm sorry, you lost.");
                    }
                }
                return true;
            }
            case 5:{
                System.out.println("Your point value is " + point);
                while (rollDice() == point || rollDice() == 7) {
                    if(rollDice() == point){
                        System.out.println("A winner!");
                    }
                    else if(rollDice() == 7) {
                        System.out.println("Oh, I'm sorry, you lost.");
                    }
                }
                return true;
            }
            case 6:{
                System.out.println("Your point value is " + point);
                while (rollDice() == point || rollDice() == 7) {
                    if(rollDice() == point){
                        System.out.println("A winner!");
                    }
                    else if(rollDice() == 7) {
                        System.out.println("Oh, I'm sorry, you lost.");
                    }
                }
                return true;
            }
            case 7:
                return true;
            case 8:{
                System.out.println("Your point value is " + point);
                while (rollDice() == point || rollDice() == 7) {
                    if(rollDice() == point){
                        System.out.println("A winner!");
                    }
                    else if(rollDice() == 7) {
                        System.out.println("Oh, I'm sorry, you lost.");
                    }
                }
                return true;
            }
            case 9:{
                System.out.println("Your point value is " + point);
                while (rollDice() == point || rollDice() == 7) {
                    if(rollDice() == point){
                        System.out.println("A winner!");
                    }
                    else if(rollDice() == 7) {
                        System.out.println("Oh, I'm sorry, you lost.");
                    }
                }
                return true;
            }
            case 10:{
                System.out.println("Your point value is " + point);
                while (rollDice() == point || rollDice() == 7) {
                    if(rollDice() == point){
                        System.out.println("A winner!");
                    }
                    else if(rollDice() == 7) {
                        System.out.println("Oh, I'm sorry, you lost.");
                    }
                }
                return true;
            }
            case 11:
                return true;
            case 12:
                return false;
            default:
                return false;
        }  
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        int initialBalance = 500, currentBalance = 0, probability = 0;
        boolean value;
        
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        
        System.out.println("Welcome to the game:\n\n");
        System.out.println("The house has given you a starting balance of $" + initialBalance + "\n");
        System.out.println("On each round, you make a (whole number) wager.\n");
        System.out.println("The minimum wager is $10, and the maximum wager is your remaining balance.\n\n");
        System.out.println("You make keep playing until you decide to cash in, or\n");
        System.out.println("you can't cover the minimum wager.\n");
        System.out.println("Good Luck!\n\n");
        System.out.println("Your balance is $" + initialBalance + "\n");
        System.out.println("Place your bet: $");
        int betTemp = sc.nextInt();
        System.out.println("\n");
        
        value = rollWithPoint(rollDice());
        if (value == true){
            currentBalance = initialBalance + betTemp;
            System.out.println("Your current balance: $" + currentBalance);
            System.out.println("Keep playing (y/Y or n/N)");
            char c = sc1.next().charAt(0);
            if(c == 'y' || c == 'Y'){
                value = rollWithPoint(rollDice());
            }
            else if(c == 'n' || c == 'N'){
                System.out.println("Your current balance: $" + currentBalance);
                System.out.println("Based on your play, the probability of winning is " + probability + "%\n");
                System.out.println("Seems you lost your shirt; better luck next time.");
                System.out.println("Have a nice day! Hope to see you soon!");
            }
            else {
                System.out.println("Invalid input please re-enter");
                c = sc1.next().charAt(0);
                System.out.println("\n");
            }
        }
        else {
            
        }
    }
    
}
