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
public abstract class NFLPlayer implements Celebrator{
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
    NFLPlayer(){
        this.name = "";
        this.age = 0;
        this.number = 0;
        this.team = "";
        this.height = 0;
        this.weight = 0;
        this.category = "";
    }
    
    //Sets the values for private variables
    NFLPlayer(String name, int age, int number, String team, float height, 
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
    
    @Override
        public String celebrate(){
            int r = new Random().nextInt(4);
            String message = "";
            switch(r){
                case 0: message = "dances to celebrate his draft"; break;
                case 1: message = "jumps for joy to celebrate his draft"; break;
                case 2: message = "spins in a circle to celebrate his draft"; break;
                case 3: message = "does a back flip to celebrate his draft"; break;
                case 4: message = "smiles to celebrate his draft"; break;
            }
            return getName() + message;
        }
}
