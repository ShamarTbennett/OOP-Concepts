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

    public void GetStockItemFromUser(){
        try {
            Scanner input = new Scanner(System.in);
            System.out.println();
            partNumber = input.nextInt();
            System.out.println();
            description = input.nextLine();
            System.out.println();
            price = input.nextDouble();

            input.close();
        } catch(InputMismatchException e){
            System.out.println("Inavlid input type");
        }catch (Exception e) {
            e.printStackTrace();
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

            System.out.println("Part Number \t Description \t Price ");
            System.out.println("-------------------------------");


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
        return partNumber + "\t" + description + "\t" + price;
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
}
