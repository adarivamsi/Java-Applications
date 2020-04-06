/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pascaltriangle;

import java.util.Scanner;

/**
 *
 * @author adari
 */
public class PascalTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner (System.in);
        int rowCount = sc.nextInt();
        int a,b=1,i,j;
        for(i=0;i<rowCount;i++)
        {
           for(a=1;a<=rowCount-i;a++)
            System.out.print(" ");
                for(j=0;j<=i;j++)
                {   
                    if (j==0||i==0)
                        b=1;
                        else
                           b = b*(i-j+1)/j;
                    System.out.print(" "+b);
                }
            System.out.print("\n");
        }
    }

}
