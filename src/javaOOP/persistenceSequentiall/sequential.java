package javaOOP.persistenceSequentiall;

import java.io.FileWriter;
import java.io.IOException;

public class sequential {
    
    private String userName;
    private int userId;
    private String password;

    //default constructor
    public sequential(){
        this.userName = "ppppp";
        this.userId = 0000;
        this.password = "password";
    }

    //primary constructor
    public sequential(String name, int id, String password){
        this.userName = name;
        this.userId = id;
        this.password = password;
    }

    //copy constructor
    public sequential(sequential s){
        this.userName = s.userName;
        this.userId = s.userId;
        this.userName = s.password;
    }


    public void Store(){
        try {
            //creates "user.txt" file using FileWriter
            FileWriter userFile =  new FileWriter("User.txt",true); //creates file and appends:True means new data will append to existing data
            String fileItem = userName + "\t" + userId + "\t  " + password + " \n"; // creates a string of the data together
            userFile.write(fileItem); //write data stored in the string to the file
            userFile.close(); //close the file
    
         System.out.println("User saved successfully");
        
        } catch (IOException e) {
            System.out.println("User could not be saved to file");
            e.printStackTrace();
        }
    }


    public void Retrieve(){
        
    }

    public void Dislay(){

    }

    //mutators
    public void setUserName(String name){
        this.userName = name;
    }
    public void setUerId(int id){
        this.userId = id;
    }
    public void setPassword(String password){
        this.password = password;
    }

    //Accessors
    public String getUserName(){
        return userName;
    }
    public int getUserId(){
        return userId;
    }
    public String getPassword(){
        return password;
    }

    public static void main(String[] args) {
        /*sequential seq = new sequential("Jane", 109, "Janey100");
        sequential seq1 = new sequential("Dave", 110, "DvTheMan");
        sequential seq2 = new sequential("Sue", 111, "Suzy");
        sequential seq3 = new sequential("Mark", 112, "Marcus123");
        seq.Store();
        seq1.Store();
        seq2.Store();
        seq3.Store();*/
    }


}
