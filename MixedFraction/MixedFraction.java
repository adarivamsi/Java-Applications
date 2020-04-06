/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mixedfraction;

import java.util.Scanner;

/**
 *
 * @author adari
 */
public class MixedFraction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
		int a[]= new int[3];
		System.out.println("Input Mixed Fraction 1:");
		for(int i=0;i<3;i++){
		a[i]= input.nextInt();
		}
		int b[]= new int[3];
		System.out.println("Input Mixed Fraction 2:");
		for(int i=0;i<3;i++){
			b[i]= input.nextInt();
			}
		input.close();
		mix(a,b);
	}
	
	public static void mix(int[] a,int[] b){
		int x= a[0]*a[2] + a[1];
		int y=a[2];
		int i= b[0]*b[2] + b[1];
		int j=b[2];
		int num1= x*j;
		int num2= i*y;
		int den= y*j;
		sum(a,b);
		diff(num1,num2,den);
		mul(x,i,y,den);
		div(num1,num2);
	}
	
	public static void sum(int[] a,int[] b){
		int z= a[0] + b[0];
		int x= (a[1]*b[2] + b[1]*a[2]);
		int y= (a[2]*b[2]);
		if(x%y>=1){
			z= z+ (x/y);
			x= x%y;
		}
		System.out.println("The addition is  =  "+z+" "+x+" "+y);
	}
	
	public static void diff(int x,int y,int i){
		int z=java.lang.Math.abs(x-y);
                int w = 0;
		if(z>i){
		w=z/i;
		z= z%i;
	        }
              	System.out.println("The subtraction  is  =  "+w+" "+z+" "+i);
	}
        
	public static void mul(int x,int i,int y,int den){
		int z = 0;
                z = (x * i)/den;
                x = y / z;
                den = den/z;
                System.out.println("The multiplication is  =  "+z+" "+x+" "+den);
	}
	
	public static void div(int x,int y){
		int z=0;
		if(x>y){
		z=x/y;
		x= x%y;
		System.out.println("The division is  =  "+z+" "+x+" "+y);
                }
	}
    }  
