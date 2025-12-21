package javaOOP.persistenceSequentiall;

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



}
