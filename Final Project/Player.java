/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.util.*;

/**
 *
 * @author jacobbushdiecker
 */
public class Player {
    //Declare private variables
    private String name;
    private int age;
    private int number;
    private String team;
    private float height;
    private float weight;
    private String category;
    private int count = 0;
    
    //No arg constructor for intial values of private variables
    Player(){
        this.name = "";
        this.age = 0;
        this.number = 0;
        this.team = "";
        this.height = 0;
        this.weight = 0;
        this.category = "";
    }
    
    //Sets the values for private variables
    Player(String name, int age, int number, String team, float height, 
            float weight, String category){
        this.name = name;
        this.age = age;
        this.number = number;
        this.team = team;
        this.height = height;
        this.weight = weight;
        this.category = category;
    }
    
    //getter for name
    public String getName(){
        return name;
    }
    
    //setter for name
    public void setName(String name){
        this.name = name;
    }
    
    //getter for age
    public int getAge(){
        return age;
    }
    
    //setter for age
    public void setAge(int age){
        this.age = age;
    }
    
    //getter for number
    public int getNumber(){
        return number;
    }
    
    //seter for number
    public void setNumber(int number){
        this.number = number;
    }
    
    //getter for team
    public String getTeam(){
        return team;
    }
    
    //setter for team
    public void setTeam(String team){
        this.team = team;
    }
    
    //getter for height
    public float getHeight(){
        return height;
    }
    
    //setter for weight
    public void setHeight(float height){
        this.height = height;
    }
    
    //getter for weight
    public float getWeight(){
        return weight;
    }
    
    //setter for weight
    public void setWeight(float weight){
        this.weight = weight;
    }  
    
    //getter for category
    public String getCategory(){
        return category;
    }
    
    //setter for category
    public void setCategory(String category){
        this.category = category;
    }
}

class Test{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        //Makes reference to player manager class
        PlayerManager pm = new PlayerManager();
       
        //Array of objects of players
        Player[] players = {pm.player1, pm.player2, pm.player3, pm.player4, 
            pm.player5, pm.player6, pm.player7, pm.player8, pm.player9, pm.player10, 
            pm.player11, pm.player12, pm.player13, pm.player14, pm.player15, pm.player16, 
            pm.player17, pm.player18, pm.player19, pm.player20};
        
        //Uses the getters to get the players name, age, number, team, height,
        //weight, and category
        for(int i = 0; i < players.length; i++){
            System.out.println(players[i].getName()+ " Age: " + players[i].getAge() + " Number: " +
                    players[i].getNumber() + " Team: " + players[i].getTeam() + " Height: " +
                    players[i].getHeight() + " Weight: " + players[i].getWeight() + " Category: " +
                    players[i].getCategory());
        }
        
        boolean x = true;
        
        while(x){
            System.out.println("Which player would you like to add to your draft?");
            int choice = input.nextInt();

            pm.setDraftPick(choice);
            List <Player> test = new ArrayList<Player>();
            test = pm.getDraftPick();

            for(int i = 0; i < test.size(); i++){
                System.out.println(test.get(i).getName());
            }
            
            System.out.println("Enter x to exit, or any other key to continue");
            char exitApp = input.next().charAt(0);
            if(exitApp == 'x' || exitApp == 'X'){
                x = false;
            }
        }
    }
}