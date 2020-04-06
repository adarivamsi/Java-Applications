/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bindec;

import java.util.Scanner;

/**
 *
 * @author adari
 */
public class BinDec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner( System.in );
        System.out.print("Enter a binary number: ");
        int binary_num =input.nextInt();
        int number=0,p=0;
        if(isBinary(binary_num))
        {
          while(binary_num!=0)
            {
                number+=((binary_num%10)*Math.pow(2,p));
                binary_num=binary_num/10;
                p++;
            }
          System.out.println("The corresponding decimal number is: "+number);
        }
        
    }
    
    static boolean isBinary(int number)
    {
        boolean isBinary = true;
        int copyOfNumber = number;
        while (copyOfNumber != 0)
        {
            int temp = copyOfNumber%10;   //Gives last digit of the number
            if(temp > 1)
            {
                isBinary = false;
                break;
            }
            else
            {
                copyOfNumber = copyOfNumber/10;    //Removes last digit from the number
            }
        }
 
        if (isBinary)
        {
            return true;
        }
        else
        {
            System.out.println("Invalid input by the user. Please enter the correct number pattern");
            return false;
        }
    }
}
