/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;
import java.util.*;
/**
 *
 * @author Jacob Bushdiecker
 */
public class FinalProject {
    public static void main(String[] args) {
        //Test main method to make sure NFLPlayer class is used properly
        /*Scanner input = new Scanner(System.in);
        
        NFLPlayer nfl1 = new NFLPlayer();
        
        int temp = 0;
        int layout = 0;
        String team0, team1, team2, team3;
        team0 = team1 = team2 = team3 = "";
        
        String[] a = new String[4];
        
        System.out.print("Choose the division for the team you would like to look up: "
                + " AFCEast (is the only working one)");
        String choice = input.nextLine();
        
        choice = choice.toLowerCase();
        
        switch (choice){
                case "afceast": a = nfl1.getAFCEast(); break;
                case "afcnorth": a = nfl1.getAFCNorth(); break;
                case "afcsouth": a = nfl1.getAFCSouth(); break;
                case "afcwest": a = nfl1.getAFCWest(); break;
                case "nfceast": a = nfl1.getNFCEast(); break;
                case "nfcnorth": a = nfl1.getNFCNorth(); break;
                case "nfcsouth": a = nfl1.getNFCSouth(); break;
                case "nfcwest": a = nfl1.getNFCWest(); break;
                        
    }
        
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
        
        team0 = a[0];
        team1 = a[1];
        team2 = a[2];
        team3 = a[3];
        
        String[] b = new String[100];
        
        System.out.print("Choose a team within the division: ");
        choice = input.nextLine();
        choice = choice.toLowerCase();
        switch (choice){
            case "baltimore": b = nfl1.getStatsOfBaltimore(); layout = 1;break;
            //case "cincinnati": b = nfl1.getStatsOfCincinnati(); layout = 2; break;
            //case "cleveland": b = nfl1.getStatsOfCleveland(); layout = 3; break;
            //case "pittsburgh": b = nfl1.getStatsOfPittsburgh(); layout = 4; break;
        }
        
        switch(layout){
            case 1: break;
            case 2: break;
            case 3: break;
            case 4: break;
        }
        
        String[] c = new String[nfl1.getBaltimore().length];
        
        c = nfl1.getBaltimore();
        
        List<String> myRoster = new ArrayList<>();
        
        System.out.print("Choose the last name of the player you would like to see the stats for: ");
        choice = input.nextLine();
        choice = choice.toLowerCase();
        
        
        for(int j = 0; j < b.length; j++){
            b[j] = b[j].toLowerCase();
            if(b[j].contains(choice)){
                System.out.println(b[j]);
                temp = j;
                break;
            }
        }
        
        
        System.out.print("Would you like to add this player to your draft? Yes or No: ");
        choice = input.nextLine();
        choice = choice.toLowerCase();
        if(choice.equals("yes")){
            myRoster.add(c[temp]);
        }
        else{
            
        }
        
            System.out.println(myRoster);
        
        */
    }
    
}

/*
Class will only contain one team stats for now, further development is necessary to implement
more players stats.
*/
class NFLPlayer{
    
    //final is used because the values stored in these arrays will never change
	private final String afcNorth[] = {"Baltimore Ravens", "Cincinnati Bengals", "Cleveland Browns",
            "Pittsburgh Steelers"};
	private final String afcEast[] = {"Buffalo Bills", "Miami Dolphins", "New England Patriots", "New York Jets"};
	private final String afcSouth[] = {"Houston Texans", "Indianapolis Colts", "Jacksonville Jaguars",
            "Tennessee Titans"};
	private final String afcWest[] = {"Denver Broncos", "Kansas City Chiefs", "Los Angeles Chargers",
            "Oakland Raiders"};
	private final String nfcNorth[] = {"Chicago Bears", "Detroit Lions", "Green Bay Packers", "Minnesota Vikings"};
	private final String nfcSouth[] = {"Atlanta Falcons", "Carolina Panthers", "New Orleans Saints",
            "Tampa Bay Buccaneers"};
	private final String nfcEast[] = {"Dallas Cowboys", "New York Giants", "Philadelphia Eagles", 
            "Washington Redskins"};
	private final String nfcWest[] = {"Arizona Cardinals", "Los Angeles Rams", "San Francisco 49ers",
            "Seattle Seahawks"};
	
        //Array of String containing players with stats greater than 0 for baltimore
	private final String playersofBaltimore[] = {"Correa, Kamalel", "Cox, Morgan", "Davis, Carl",
            "Dixon, Kenneth", "Flacco, Joe", "Gillmore, Crockett", "Jefferson, Tony", 
            "Jernigan, Timmy", "Judon, Matthew", "Koch, Sam", "Levine, Anthony", "Lewis, Alex", 
            "Mallet, Ryan", "McClellan, Albert", "Moore, Chris", "Mosley, C.J.", "Perriman, Breshad", 
            "Pierce, Michael", "Pitta, Dennis", "Pughsley, Jarrod", "Smith, Jimmy", "Smith, Za'Darius",
            "Stanley, Ronnie", "Suggs, Terrell", "Taliaferro, Lorenzo", "Tucker, Justin", "Urban, Brent", 
            "Urschel, John", "Wallace, Mike", "Waller, Darren", "Weddle, Eric", "Terrence, West",
            "Williams, Brandon", "Woodhead, Danny", "Yanda, Marshall", "Young, Taxon", 
            "Allen, Javorius", "Canady, Maurice", "Carr, Brandon"};
       
        
        //String containing the stats of all Baltimore plays that are located in the array 
        //playersofBaltimore in the same order
        private final String statsOfBaltimore[] = {
/*0*/       "Correa, Kamalel is a Linebacker his stats are: 4 Comb, 3 Tot, 1 Ast1",
/*1*/       "Cox, Morgan is a Long Snapper his stats are: 16 G, 0 GS, 2 Tot",
/*2*/       "Davis, Carl is a Defensive Tackle his stats are: 4 Solo, 7 Ast, 0 SCK",
/*3*/       "Dixon, Kenneth  is a Runningback his stats are: 88 Att, 7.3 Att/G, 382 Yds",
/*4*/       "Flacco, Joe  is a Quarterback his stats are: 436 Comp, 672 Att, 64.9 Pct",
/*5*/       "Gillmore, Crockett is a Tight End his stats are: 8 Rec, 71 Yds ,7.9 Avg", 
/*6*/       "Jefferson, Tony is a Defensive Back his stats are: 96 TCKL, 2 SCK, 2 FF",
/*7*/       "Jernigan, Timmy is a Defensive Lineman his stats are: 31 Comb, 16 Tot, 15 Ast",
/*8*/       "Judon, Matthew  is a Linebacker his stats are 27 Comb, 12 Tot, 15 Ast",
/*9*/       "Koch, Sam is a Punter his stats are: 80 Punts, 3665 Yds, 3190 Net Yds",
/*10*/      "Levine, Anthony is a Defensive Back his stats are: 11 Comb, 7 Tot, 4 Ast", 
/*11*/      "Lewis, Alex is a Guard / Tackle his stats are: G 10, GS 8",
/*12*/      "Mallet, Ryan is a Quarterback his stats are: 3 Comp, 6 Att, 50 Pct",
/*13*/      "McClellan, Albert is a Linebacker his stats are: 55 Comb, 34 Tot, 21 Ast", 
/*14*/      "Moore, Chris is a Wide Receiver his stats are: 7 Rec, 46 Yds, 6.6 Avg",
/*15*/      "Mosley, C.J. is a Linebacker his stats are: 92 Comb, 56 Tot, 36 Ast",
/*16*/      "Perriman, Breshad  is a Wide Receiver his stats are: 33 Rec, 499 Yds, 15.1 Avg",
/*17*/      "Pierce, Michael  is a Defensive Lineman his stats are: 35 Comb, 19 Tot, 16 Ast",
/*18*/      "Pitta, Dennis  is a Tight End his stats are: 86 Rec, 729 Yds, 8.5 Avg",
/*19*/      "Pughsley, Jarrod is a Guard his stats are: 2 G, 0 GS",
/*20*/      "Smith, Jimmy is a Defensive Back his stats are: 32 Comb, 29 Tot, 3 Ast",
/*21*/      "Smith, Za'Darius is a Offensive Linebacker his stats are: 13 G, 4 GS, 20 Tot",
/*22*/      "Stanley, Ronnie is a Tackle his stats are: 12 G, 12 GS",
/*23*/      "Suggs, Terrell is a Linebacker his stats are 35 Comb, 28 Tot, 7 Ast",
/*24*/      "Taliaferro, Lorenzo  is a Runningback his stats are: 1 Att, 0.3 Att/G, 0 Yds",
/*25*/      "Tucker, Justin is a Kickoff Kicker his stats are 80 KO, 5072 Yds, 1 OOB",
/*26*/      "Urban, Brent  is a Defensive Lineman his stats are: 10 Comb, 7 Tot, 3 Ast",
/*27*/      "Urschel, John is a Guard / Center his stats are: 13 G, 3 GS",
/*28*/      "Wallace, Mike  is a Wide Receiver his stats are: 72 Rec, 1017 Yds, 14.1 Avg",
/*29*/      "Waller, Darren is a Tight End his stats are: 10 Rec, 85 Yds, 8.5 Avg",
/*30*/      "Weddle, Eric is a Defensive Back his stats are: 89 Comb, 48 Tot, 41 Ast",
/*31*/      "Terrence, West is a Runningback his stats are: 193 Att, 12.1 Att/G, 774 Yds",
/*32*/      "Williams, Brandon is a Defensive Lineman his stats are: 51 Comb, 34 Tot , 17 Ast",
/*33*/      "Woodhead, Danny is a Runningback his stats are: 19 CAR, 116 YDS, 6.1 AVG",
/*34*/      "Yanda, Marshall is a Guard / Tackle his stats are: 13 G, 13 GS",
/*35*/      "Young, Taxon is a Defensive Back his stats are: 53 Comb, 44 Tot, 9 Ast ",
/*36*/      "Allen, Javorius is a Runningback his stats are: 9 Att, 1.1 Att/G, and 34 YDS",
/*37*/      "Canady, Maurice  is a Defensive Back his stats are: 2 Comb, 2 Tot, 0 Ast",
/*38*/      "Carr, Brandon is a Cornerback his stats are: 61 TCKL, 0 SCK, 0FF"};
	
        
        //public get returns private properties
        public String[] getStatsOfBaltimore(){
            return statsOfBaltimore;
        }
        
	public String[] getNFCWest(){
            return nfcWest;
	}
	
	public String[] getNFCEast(){
            return afcEast;
	}
	
	public String[] getNFCSouth(){
            return afcSouth;
	}
	
	public String[] getNFCNorth(){
            return afcNorth;
	}
	
	public String[] getAFCWest(){
            return afcWest;
	}
	
	public String[] getAFCEast(){
            return afcEast;
	}
	
	public String[] getAFCSouth(){
            return afcSouth;
	}
	
	public String[] getAFCNorth(){
            return afcNorth;
	}
	
	public String[] getBaltimore(){
            return playersofBaltimore;
	}
}