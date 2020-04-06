/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;

import java.util.Scanner;

/**
 *
 * @author harsha
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a three digit number : ");
        
        int a = sc.nextInt();
        int b = palin(a);
        if (a > 99 && a < 1000){
            if (b == a){
                System.out.println(a + " is a palindrome");
            }
            else{
                System.out.println(a + " is not a palindrome");
            }
        }
        else{
            System.out.println("Entered number is three digit number");
        }
    }

    public static int palin(int b) {
        int c = 0;

        for(int i = 0; i < 3; i++)
        {
            System.out.p    rintln(b);
            int j = b % 10;
            c = (c * 10) + j;
            b = b / 10;
            System.out.println(c);
        }
        return c;
    }
 
}
