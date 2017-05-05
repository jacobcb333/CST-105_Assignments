/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.util.Random;

/**
 *
 * @author jacobbushdiecker
 */
public class DefensivePlayer extends NFLPlayer implements Celebrator{
	private double tackles;
	private double ast;
	private double comb;
	private double sacks;
	private double inter;
	private String position;
	
        //DefensivePlayer constructor
	DefensivePlayer(String name, int age, int number, String team, 
            float height, float weight, String category, double tackles,
            double sacks, double inter, String position){
                super(name, age, number, team, height, weight, "def");
		this.setTackles(tackles);
		this.setAst(ast);
		this.setComb(comb);
		this.setSacks(sacks);
		this.setInter(inter);
		this.setPosition(position);
	}
        
        @Override
        public String celebrate(){
            int r = new Random().nextInt(4);
            String message = "";
            switch(r){
                case 0: message = " dances to celebrate his draft"; break;
                case 1: message = " jumps for joy to celebrate his draft"; break;
                case 2: message = " spins in a circle to celebrate his draft"; break;
                case 3: message = " does a back flip to celebrate his draft"; break;
                case 4: message = " smiles to celebrate his draft"; break;
            }
            return message;
        }
        
	//Get tackles
	public double getTackles(){
            return tackles;
	}

	//Set tackles
	public void setTackles(double tackles){
            this.tackles = tackles;
	}

	//Get Ast
	public double getAst(){
            return ast;
	}

	//Set Ast
	public void setAst(double ast){
            this.ast = ast;
	}

	//Get comb
	public double getComb(){
            return comb;
	}

	//Set comb
	public void setComb(double comb){
            this.comb = comb;
	}

	//Get sacks
	public double getSacks(){
            return sacks;
	}

	//Set sacks
	public void setSacks(double sacks){
            this.sacks = sacks;
	}

	//Get inter
	public double getInter(){
            return inter;
	}

	//Set inter
	public void setInter(double inter){
            this.inter = inter;
	}

	//Get Position
	public String getPosition(){
            return position;
	}

	//Set Position
	public void setPosition(String position){
            this.position = position;
	}

}
