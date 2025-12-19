package javaOOP.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class process{


    //Process size   
    public int Process() { 
        int ls, ss, ans = 0; 
        try {
            Scanner inp = new Scanner(System.in); 
           

            System.out.println("Large size:"); 
            ls = inp.nextInt(); 

            System.out.println("Small size:"); 
            ss = inp.nextInt(); 

            ans = ls / ss;
            inp.close(); 

            
        } catch (ArithmeticException e) {
            System.out.println("Can not divide by zero (0).");
        }
         catch (InputMismatchException e) {
            System.out.println("Input must be a number (1, 2, 3....).");
        }
     return ans; 
    } 
    public static void main(String[] args) {
       process p = new process();
       p.Process();
    }
}