package javaOOP.persistenceSequentiall;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StockItemLab {
    private int partNumber;
    private String description;
    private double price;

    public StockItemLab(){
        this.partNumber = 0;
        this.description = "white";
        this.price = 0.1;
    }

    public StockItemLab (int num, String des, double price){
        this.partNumber = num;
        this.description = des;
        this.price = price;
    }

    public void DisplayStockItem(){
        System.out.println("");
        System.out.println("Part Numbe: " + partNumber +
                            "\nDescription: " + description + 
                            "\nPrice: " + price
        );
    }
/* 
    public void GetStockItemFromUser(){
        try {
            Scanner input = new Scanner(System.in);

            try {
                System.out.println("Enter part number : ");
                partNumber = input.nextInt();
                
            } catch(InputMismatchException e){
                System.out.println("Inavlid input type \nInput must be a interger (1, 2, 3...)");
                System.out.println();
                System.out.println("Enter part number : ");
                partNumber = 0;
                input= null;
                if(input == null){
                    input = new Scanner(System.in);
                    partNumber = input.nextInt();
                }
                
            }

            Scanner input1 = new Scanner(System.in);
            System.out.println("Enter description" );
            description = input1.nextLine();

            Scanner input2 = new Scanner(System.in);
            System.out.println("Enter price: ");
            price = input2.nextDouble();

            //input.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }*/

    public void GetStockItemFromUser(){

        Scanner input = new Scanner(System.in);
        
        try {
            // Get part number with retry logic
            while(true) {
                try {
                    System.out.println("Enter part number: ");
                    partNumber = input.nextInt();
                    break; // Exit loop if successful
                } catch(InputMismatchException e) {
                    System.out.println("Invalid input type");
                    System.out.println("Input must be an integer (1, 2, 3...)");
                    System.out.println();
                    input.nextLine(); // Clear the invalid input from buffer
                }
            }
            
            // Clear the newline left by nextInt()
            input.nextLine();
            
            // Get description
            System.out.println("Enter description: ");
            description = input.nextLine();
            
            // Get price with retry logic
            while(true) {
                try {
                    System.out.println("Enter price: ");
                    price = input.nextDouble();
                    break; // Exit loop if successful
                } catch(InputMismatchException e) {
                    System.out.println("Invalid input type");
                    System.out.println("Input must be a double (50.01, 60.01)");
                    System.out.println();
                    input.nextLine(); // Clear the invalid input from buffer
                }
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            input.close();
        }
    }

    public void SaveStockItem(){
        try {
            FileWriter instream = new FileWriter("StockItem.txt", true);
            String items = partNumber + "\t" + description + "\t" + price + "\n";
            instream.write(items);
            instream.close();

            System.out.println("item saved to file");
        } catch (IOException e) {
            System.out.println("could not save item to file");
        }
    }

    public void  RetrieveStockItem(){
        int searchNum;
        try {
            Scanner inFileStream = new Scanner(new File("StockItem.txt"));
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the Stock item part number:--> ");
            searchNum = input.nextInt();

            while(inFileStream.hasNext()){
                this.partNumber = inFileStream.nextInt();
                this.description = inFileStream.next();
                this.price = inFileStream.nextDouble();

                if(partNumber == searchNum){
                    DisplayStockItem();
                    return;
                }
            }
            System.out.println("Stock item " + partNumber + "was not found");
            this.partNumber = 0;
            this.description = ".....";
            this.price = 0.1;

            //inFileStream.close();
            //input.close();
        } catch (InputMismatchException e) {
            e.getMessage();
        }catch (FileNotFoundException e) {
            e.getMessage();
        }catch (Exception e) {
            e.getMessage();
        }
    }

    public void DisplayAll(){
        
        try {
            Scanner inFileStream = new Scanner(new File("StockItem.txt"));
            Scanner input = new Scanner(System.in);

            System.out.println("PartNumber\tDescription \t    Price ");
            System.out.println("----------      ---------------     ------");


            while(inFileStream.hasNext()){
                this.partNumber = inFileStream.nextInt();
                this.description = inFileStream.next();
                this.price = inFileStream.nextDouble();

                System.out.println(toString());
               
            }
        }catch (FileNotFoundException e) {
            e.getMessage();
        }catch (Exception e) {
            e.getMessage();
        }
    }

    public double RetrievePrice(){
        int searchNum;
        try {
            Scanner inFileStream = new Scanner(new File("StockItem.txt"));
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the Stock item part number:--> ");
            searchNum = input.nextInt();

            while(inFileStream.hasNext()){
                this.partNumber = inFileStream.nextInt();
                this.description = inFileStream.next();
                this.price = inFileStream.nextDouble();

                if(partNumber == searchNum){
                    return price;
                }
            }
            System.out.println("Stock item " + partNumber + "was not found");
            //inFileStream.close();
            //input.close();
        } catch (InputMismatchException e) {
            e.getMessage();
        }catch (FileNotFoundException e) {
            e.getMessage();
        }catch (Exception e) {
            e.getMessage();
        }
        return -1.0;
    }

    public String RetrieveDescription(){
        int searchNum;
        try {
            Scanner inFileStream = new Scanner(new File("StockItem.txt"));
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the Stock item part number:--> ");
            searchNum = input.nextInt();

            while(inFileStream.hasNext()){
                this.partNumber = inFileStream.nextInt();
                this.description = inFileStream.next();
                this.price = inFileStream.nextDouble();

                if(partNumber == searchNum){
                    return description;
                }
            }
            System.out.println("Stock item " + partNumber + "was not found");
            //inFileStream.close();
            //input.close();
        } catch (InputMismatchException e) {
            e.getMessage();
        }catch (FileNotFoundException e) {
            e.getMessage();
        }catch (Exception e) {
            e.getMessage();
        }
        return "-1.0";
    }



    public String toString(){
        return partNumber + "\t        " + description + "\t    " + price;
    }
    //Mutators
    public void setPartNumber(int partNumber){
        this.partNumber = partNumber;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setPrice(double price){
        this.price = price;
    }

    //Accessors
    public int getPartNumber(){
        return partNumber;
    }
    public String getDescription(){
        return description;
    }
    public double getPrice(){
        return price;
    }
  

    public static void main(String[] args) {
        StockItemLab e = new StockItemLab();
        e.GetStockItemFromUser();
        e.SaveStockItem();
        //e.RetrieveStockItem();
        //e.DisplayAll();

        /*Double price = e.RetrievePrice();
        if (!price.equals(-1.0)) {
            System.out.println("The price for the stock item is: " + price);
        }
        
        String description =e.RetrieveDescription();
        if (!description.equals("-1.0")) {
            System.out.println("The decription for the stock item is: " + description);
        }*/
    }
}