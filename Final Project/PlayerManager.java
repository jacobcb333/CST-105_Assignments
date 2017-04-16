/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.util.*;
import java.lang.*;

/**
 *
 * @author jacobbushdiecker
 */
public class PlayerManager {
    //No arg constructor
    PlayerManager(){
        
    }
    
    //
    Player player1 = new Player("01.Drew Brees", 38, 9, "New Orleans Saints", 6.0f, 209f, "off");
    Player player2 = new Player("02.Exekiel Elliott", 21, 21, "Dallas Cowboys", 6.0f, 225f, "off");
    Player player3 = new Player("03.Kirk Cousins", 28, 8, "Washington Redskins", 6.3f, 210f, "off");
    Player player4 = new Player("04.Aaron Rodgers", 33, 12, "Green Bay Packers", 6.2f, 225f, "off");
    Player player5 = new Player("05.Philip Rivers", 35, 17, "Los Angeles Chargers", 6.5f, 228f, "off");
    Player player6 = new Player("06.Jordan Howard", 22, 24, "Chicago Bears", 6.0f, 222f, "off");
    Player player7 = new Player("07.DeMarco Murray", 29, 29, "Tennessee Titans", 6.1f, 220f, "off");
    Player player8 = new Player("08.T.Y. Hilton", 27, 13, "Indianapolis Colts", 5.9f, 180f, "off");
    Player player9 = new Player("09.Matt Ryan", 31, 2, "Atlanta Falcons", 6.4f, 217f, "off");
    Player player10 = new Player("10.Julio Jones", 28, 11, "Atlanta Falcons", 6.3f, 220f, "off");

    // Create Defensive Players
    Player player11 = new Player("11.Bobby Wagner", 26, 54, "Seattle Seahawks", 6.0f, 245f, "def");
    Player player12 = new Player("12.Zach Brown", 27, 53, "Washington Redskins", 6.1f, 248f, "def");
    Player player13 = new Player("13.Christian Kirksey", 24, 58, "Cleveland Browns", 6.2f, 235f, "def");
    Player player14 = new Player("14.Sean Lee", 30, 50, "Dallas Cowboys", 6.2f, 238f, "def");
    Player player15 = new Player("15.Kwon Alexander", 22, 58, "Tampa Bay Buccaneers", 6.1f, 227f, "def");
    Player player16 = new Player("16.Vic Beasley Jr.", 24, 44, "Atlanta Falcons", 6.3f, 246f, "def");
    Player player17 = new Player("17.Von Miller", 28, 58, "Denver Broncos", 6.3f, 250f, "def");
    Player player18 = new Player("18.Lorenzo Alexander", 33, 57, "Buffalo Bills", 6.1f, 245f, "def");
    Player player19 = new Player("19.Casey Hayward", 27, 26, "Los Angeles Chargers", 5.11f, 192f, "def");
    Player player20 = new Player("20.Marcus Peters", 24, 22, "Kansas City Chiefs", 6.0f, 197f, "def");
    
    //Array holding the players
    Player[] players = {player1, player2, player3, player4, 
            player5, player6, player7, player8, player9, player10, 
            player11, player12, player13, player14, player15, player16, 
            player17, player18, player19, player20};
    
    //Array List to dynamically change the size
    List<Player> draftPick = new ArrayList<Player>();
    
    //getter class for the ArrayList draftPick
    public List<Player> getDraftPick(){
        return draftPick;
    }
    
    
    //Setter class for the ArrayList draftPick
    public void setDraftPick(int choice){
        draftPick.add(players[choice-1]);
        
    }
    
}

class Test1{
    public static void main(String[] args){
        
    }
}
