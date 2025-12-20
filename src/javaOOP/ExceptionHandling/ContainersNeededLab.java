package javaOOP.ExceptionHandling;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ContainersNeededLab {
    
    /*Demonstrate() calls two functions to enter
    the size of the wholesale and retail containers
    respectively, then calls a 3rd function to calculate
    the number of retail containers needed and displays this result*/
    public void Demonstrate() throws IOException
    {
        int WholesaleSize;  //size of ws container
        int RetailSize; //size of rt container
        int NumberRetailNeeded;//num of containers needed
        char ans; //single char needed to store 'y' or 'n'

        System.out.println("Now in Demonstrate()");

        while ( true ){
            try {
                WholesaleSize = EnterSizeOfWholesaleContainer();
                RetailSize = EnterSizeOfRetailContainer();
                NumberRetailNeeded = CalculateRetailContainersNeeded(WholesaleSize, RetailSize);
                System.out.println("Back in Demonstrate()");
                System.out.println("The number of retail containers" + " needed is " +
                        NumberRetailNeeded);
                System.out.print("Perform another calculation?" + " [y/n] ");
                
                ans = ' ';

                while (ans != 'y' && ans != 'Y' && ans != 'n' && ans != 'N')
                    ans = (char) System.in.read();
                System.out.println(" ");
                if (ans == 'n' || ans == 'N')
                    break;
                
            } catch (Exception e) {
                System.err.println(e);
            }
        }
        
    }

    //enters the size of the wholesale container
    public int EnterSizeOfWholesaleContainer(){
        int size = 0;
        Scanner in = new Scanner(System.in);
        try {
           
            System.out.println("Now in EnterSizeOfWholesaleContainer()");
            System.out.println("Enter the size of the wholesale" + " container - ");
            size = in.nextInt();
            
            System.out.println(" ");
            if(size <= 0){
                throw new IllegalArgumentException("Size Of Wholesale Container Input must be grate tha 0.");
            }
            
        } catch (InputMismatchException e) {
            System.out.println(e + " Input must be a number (1, 2, 3.....).");
        }
        //in.close();
        return size;
    }

    //enters the size of the retail container
    public int EnterSizeOfRetailContainer(){
        int size = 0;
        Scanner in = new Scanner(System.in);
        try {
            
            System.out.println("Enter the size of the retail container:");
            size = in.nextInt();

            if (size <= 0) {
               
                throw new IllegalArgumentException("Size must be greater than 0.");
            }
            
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
        }
        //in.close();
        return size;
    }

    //calculates the number of retail containers needed
    // and returns the result
    public int CalculateRetailContainersNeeded(int wcSize, int rcSize)throws ArithmeticException{
        System.out.println("Now in CalculateRetailContainersNeeded()");

        return wcSize / rcSize;
    }

    //main method – program starts running here
    public static void main(String[] args) throws IOException{
        ContainersNeededLab X = new ContainersNeededLab();

        System.out.println("Calling Demonstrate() from main()");

        X.Demonstrate();

        System.out.println("Returned from Demonstrate()," + "  now back in main()");
        
    }
}
