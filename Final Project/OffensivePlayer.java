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

public class OffensivePlayer extends NFLPlayer implements Celebrator{
	
	private double passing;
	private double rec;
	private double passingAvg;
	private double rushing;
	private double rushingAvg;
	private double rushingAttempts;
	private double td;
	private String position;
	
	OffensivePlayer(String name, int age, int number, String team, float height, 
            float weight, String category, double passing, double rec, 
            double passingAvg, double rushing, double rushingAvg, 
            double rushingAttempts, double td, String position){
                super(name, age, number, team, height, weight, "off");
		this.setPassing(passing);
		this.setRec(rec);
		this.setPassingAvg(passingAvg);
		this.setRushing(rushing);
		this.setRushingAvg(rushingAvg);
		this.setRushingAttempts(rushingAttempts);
		this.setTd(td);
		this.setPosition(position);
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
            return message;
        }
        
        
	//Get Passing
	public double getPassing(){
            return passing;
	}

	//Set Passing
	public void setPassing(double passing){
            this.passing = passing;
	}

	//Get Rec
	public double getRec(){
            return rec;
	}

	//Set Rec
	public void setRec(double rec){
            this.rec = rec;
	}

	//Get PassingAvg
	public double getPassingAvg(){
            return passingAvg;
	}

	//Set PassingAvg
	public void setPassingAvg(double passingAvg){
            this.passingAvg = passingAvg;
	}

	//Get Rushing
	public double getRushing(){
            return rushing;
	}

	//Set Rushing
	public void setRushing(double rushing){
            this.rushing = rushing;
	}

	//Get RushingAvg
	public double RushingAvg(){
            return rushingAvg;
	}

	//Set RushingAvg
	public void setRushingAvg(double rushingAvg){
            this.rushingAvg = rushingAvg;
	}

	//Get RushingAttempts
	public double getRushingAttempts(){
            return rushingAttempts;
	}

	//Set RushingAttempts
	public void setRushingAttempts(double rushingAttempts){
            this.rushingAttempts = rushingAttempts;
	}

	//Get TD
	public double getTd(){
            return td;
	}

	//Set TD
	public void setTd(double td){
            this.td = td;
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
