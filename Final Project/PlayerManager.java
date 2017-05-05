/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.util.ArrayList;
import java.util.Iterator;
import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Control;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author jacobbushdiecker
 */
public class PlayerManager extends Application{
    //Create new Stage
    Stage menu = new Stage();
    //Create ArrayList for available players
    public ArrayList < NFLPlayer > availablePlayers = new ArrayList < NFLPlayer > (); 
    //Create ArrayList for Offensive players
    public ArrayList < OffensivePlayer > offensivePlayers = new ArrayList < OffensivePlayer > (); 
    //Create ArrayList for Deffensive Players
    public ArrayList < DefensivePlayer > defensivePlayers = new ArrayList < DefensivePlayer > ();
    //Create ArrayList for my current roster
    public ArrayList < Object > currentRoster = new ArrayList < Object > (); 
    //Create textfield for search 
    public TextField searchField = new TextField(); 
    
    //Start the application
    @Override 
    public void start(Stage primaryStage){
        createPlayers();
        menu.setTitle("NFL Draft Application");
        //Show main menu
        showMenu();
    }
     
    //Show Main Menu
    public void showMenu(){
        BorderPane pane = new BorderPane();
        pane.setTop(getLogo());
        VBox center = new VBox(getSearchBar(), getMenu());
        center.setPadding(new Insets(15, 15, 15, 15));;
        pane.setCenter(center);
        menu.setScene(new Scene(pane, 700, 550));
        menu.show();
    }
     
     //Show Offense Menu
    private void showOffense(){
        BorderPane pane = new BorderPane();
        pane.setTop(getLogo());

        VBox vBox = new VBox(15);
        vBox.setPadding(new Insets(15, 5, 5, 5));

        Button back = new Button();
        //Unicode for back Arrow
        back.setText("\u21E6");
        back.setId("back to menu");
        back.setFont(Font.font("Verdana", 20));
        back.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());

        //Create My Roster button
        Button AvailableOff = new Button("All Available"); 
        //Set button id
        AvailableOff.setId("allOff");
        //Set button width
        AvailableOff.setMaxWidth(Double.MAX_VALUE);
        AvailableOff.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());

        //Create offense button
        Button QB = new Button("QB");
        //Set button id
        QB.setId("QB");
        //Set button width
        QB.setMaxWidth(Double.MAX_VALUE);
        QB.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());

        //Create Defense button
        Button RB = new Button("RB");
        //Set button id
        RB.setId("RB");
        //Set button width
        RB.setMaxWidth(Double.MAX_VALUE);
        RB.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());

        //Create My Roster button
        Button WR = new Button("WR");
        //Set button id
        WR.setId("WR"); 
        //Set button width
        WR.setMaxWidth(Double.MAX_VALUE);
        WR.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());

        //Create HBox
        HBox offenseType = new HBox();
        offenseType.setSpacing(125);
        offenseType.setPadding(new Insets(0, 30, 0, 30));
        //Add all nodes to scene
        offenseType.getChildren().addAll(AvailableOff, QB, RB, WR);

        vBox.getChildren().addAll(back, getSearchBar(), new Label("Select Position"), offenseType);
        pane.setCenter(vBox);
        menu.setScene(new Scene(pane, 700, 550));
        menu.show();
    }
     
    //List offensive players
    private void listOffensivePlayers(String selection){
        BorderPane pane = new BorderPane();

        pane.setTop(getLogo());

        VBox vBox = new VBox(15);
        vBox.setPadding(new Insets(15, 5, 5, 5));

        Button back = new Button();
        //Unicode for back Arrow
        back.setText("\u21E6");
        back.setId("back to offense");
        back.setFont(Font.font("Verdana", 20));
        back.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());

        GridPane list = new GridPane();
        list.setAlignment(Pos.CENTER);
        list.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        list.setHgap(5.5);
        list.setVgap(5.5);
        int i = 1;

        list.add(new Label("Name"), 0, 0);
        list.add(new Label("Age"), 1, 0);
        list.add(new Label("Number"), 2, 0);
        list.add(new Label("Team"), 3, 0);
        list.add(new Label("Height"), 4, 0);
        list.add(new Label("Weight"), 5, 0);
        list.add(new Label("Passing/Rec"), 6, 0);
        list.add(new Label("Rushing"), 7, 0);
        list.add(new Label("TD"), 8, 0);
        list.add(new Label("Draft"), 9, 0);

        if (selection == "allOff") {
            for(OffensivePlayer object: offensivePlayers){
                if(object.getStatus() == "available"){
                    Label name = new Label(object.getName());
                    Label age = new Label(Integer.toString(object.getAge()));
                    Label number = new Label(Integer.toString(object.getNumber()));
                    Label team = new Label(object.getTeam());
                    Label height = new Label(Float.toString(object.getHeight()));
                    Label weight = new Label(Float.toString(object.getWeight()));
                    Label passRec = new Label(Double.toString(object.getPassing()));
                    Label rushing = new Label(Double.toString(object.getRushing()));
                    Label td = new Label(Double.toString(object.getTd()));
                    Button draft = new Button();
                    //Unicode for back Arrow
                    draft.setText("Draft"); 
                    draft.setId("draftOff " + object.getName());
                    draft.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
                    list.add(name, 0, i);
                    list.add(age, 1, i);
                    list.add(number, 2, i);
                    list.add(team, 3, i);
                    list.add(height, 4, i);
                    list.add(weight, 5, i);
                    list.add(passRec, 6, i);
                    list.add(rushing, 7, i);
                    list.add(td, 8, i);
                    list.add(draft, 9, i);
                    i++;
                }
            }
        } 
        else {
            for(OffensivePlayer object: offensivePlayers){
                if(object.getStatus() == "available" && object.getPosition() == selection){
                    Label name = new Label(object.getName());
                    Label age = new Label(Integer.toString(object.getAge()));
                    Label number = new Label(Integer.toString(object.getNumber()));
                    Label team = new Label(object.getTeam());
                    Label height = new Label(Float.toString(object.getHeight()));
                    Label weight = new Label(Float.toString(object.getWeight()));
                    Label passRec = new Label(Double.toString(object.getPassing()));
                    Label rushing = new Label(Double.toString(object.getRushing()));
                    Label td = new Label(Double.toString(object.getTd()));
                    Button draft = new Button();
                    //Unicode for back Arrow
                    draft.setText("Draft");
                    draft.setId("draftOff " + object.getPosition() + " " + object.getName());
                    draft.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
                    list.add(name, 0, i);
                    list.add(age, 1, i);
                    list.add(number, 2, i);
                    list.add(team, 3, i);
                    list.add(height, 4, i);
                    list.add(weight, 5, i);
                    list.add(passRec, 6, i);
                    list.add(rushing, 7, i);
                    list.add(td, 8, i);
                    list.add(draft, 9, i);
                    i++;
                }
            }
        }
  
        //Columns will resize with window
        ColumnConstraints columnConstraints = new ColumnConstraints();
        columnConstraints.setFillWidth(true);
        columnConstraints.setHgrow(Priority.ALWAYS);
        list.getColumnConstraints().add(columnConstraints);

        //Add All Node to vBox
        vBox.getChildren().addAll(back, getSearchBar(), list);
        pane.setCenter(vBox);

        //Create ScrollPane
        ScrollPane scroller = new ScrollPane(pane);
        scroller.setFitToWidth(true);

        menu.setScene(new Scene(scroller, 700, 550));
        menu.show();
    }
 
    //Show Defense Menu
    public void showDefense(){
        BorderPane pane = new BorderPane();
        pane.setTop(getLogo());

        VBox vBox = new VBox(15);
        vBox.setPadding(new Insets(15, 5, 5, 5));

        Button back = new Button();
        //Unicode for back Arrow
        back.setText("\u21E6");
        back.setId("back to menu");
        back.setFont(Font.font("Verdana", 20));
        back.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());

        //Create My Roster button
        Button AvailableOff = new Button("All Available"); 
        //Set button id
        AvailableOff.setId("alldef"); 
        //Set button width
        AvailableOff.setMaxWidth(Double.MAX_VALUE); 
        AvailableOff.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());

        //Create Defense button
        Button ILB = new Button("ILB"); 
        //Set button id
        ILB.setId("ILB"); 
        //Set button width
        ILB.setMaxWidth(Double.MAX_VALUE); 
        ILB.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());

        //Create My Roster button
        Button DB = new Button("DB");
        //Set button id
        DB.setId("DB");
        //Set button width
        DB.setMaxWidth(Double.MAX_VALUE);
        DB.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());

        //Create My Roster button
        Button OLB = new Button("OLB");
        //Set button id
        OLB.setId("OLB"); 
        //Set button width
        OLB.setMaxWidth(Double.MAX_VALUE);
        OLB.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());

        //Create My Roster button
        Button DT = new Button("DT"); 
        //Set button id
        DT.setId("DT");
        //Set button width
        DT.setMaxWidth(Double.MAX_VALUE); 
        DT.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());

        //Create HBox
        FlowPane defenseType = new FlowPane();
        defenseType.setHgap(40);
        defenseType.setPadding(new Insets(0, 10, 0, 10));
        //Add all nodes to scene
        defenseType.getChildren().addAll(AvailableOff, ILB, DB, OLB, DT);

        vBox.getChildren().addAll(back, getSearchBar(), new Label("Select Position"), defenseType);
        pane.setCenter(vBox);
        menu.setScene(new Scene(pane, 700, 550));
        menu.show();
    }
 
    //List defensive players
    private void listDeffensivePlayers(String selection){
        BorderPane pane = new BorderPane();
        pane.setTop(getLogo());

        VBox vBox = new VBox(15);
        vBox.setPadding(new Insets(15, 5, 5, 5));

        Button back = new Button();
        //Unicode for back Arrow
        back.setText("\u21E6"); 
        back.setId("back to defense");
        back.setFont(Font.font("Verdana", 20));
        back.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());

        //Create gridPane for list of players
        GridPane list = new GridPane();
        list.setAlignment(Pos.CENTER);
        list.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        list.setHgap(5.5);
        list.setVgap(5.5);
        int i = 1;

        //Set grid headers
        list.add(new Label("Name"), 0, 0);
        list.add(new Label("Age"), 1, 0);
        list.add(new Label("Number"), 2, 0);
        list.add(new Label("Team"), 3, 0);
        list.add(new Label("Height"), 4, 0);
        list.add(new Label("Weight"), 5, 0);
        list.add(new Label("Tackles"), 6, 0);
        list.add(new Label("Sacks"), 7, 0);
        list.add(new Label("Int"), 8, 0);
        list.add(new Label("Draft"), 9, 0);

        if(selection == "alldef"){
            //List all defensive players
            for(DefensivePlayer object: defensivePlayers){
                if(object.getStatus() == "available"){
                    Label name = new Label(object.getName());
                    Label age = new Label(Integer.toString(object.getAge()));
                    Label number = new Label(Integer.toString(object.getNumber()));
                    Label team = new Label(object.getTeam());
                    Label height = new Label(Float.toString(object.getHeight()));
                    Label weight = new Label(Float.toString(object.getWeight()));
                    Label Tackles = new Label(Double.toString(object.getTackles()));
                    Label Sacks = new Label(Double.toString(object.getSacks()));
                    Label Int = new Label(Double.toString(object.getInter()));
                    Button draft = new Button();
                    //Unicode for back Arrow
                    draft.setText("Draft");
                    draft.setId("draftdef " + object.getName());
                    draft.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
                    list.add(name, 0, i);
                    list.add(age, 1, i);
                    list.add(number, 2, i);
                    list.add(team, 3, i);
                    list.add(height, 4, i);
                    list.add(weight, 5, i);
                    list.add(Tackles, 6, i);
                    list.add(Sacks, 7, i);
                    list.add(Int, 8, i);
                    list.add(draft, 9, i);
                    i++;
                }
            }
        } 
        else {
            for(DefensivePlayer object: defensivePlayers){
                //All players by position
                if(object.getStatus() == "available" && object.getPosition() == selection){
                    Label name = new Label(object.getName());
                    Label age = new Label(Integer.toString(object.getAge()));
                    Label number = new Label(Integer.toString(object.getNumber()));
                    Label team = new Label(object.getTeam());
                    Label height = new Label(Float.toString(object.getHeight()));
                    Label weight = new Label(Float.toString(object.getWeight()));
                    Label Tackles = new Label(Double.toString(object.getTackles()));
                    Label Sacks = new Label(Double.toString(object.getSacks()));
                    Label Int = new Label(Double.toString(object.getInter()));
                    Button draft = new Button();
                    //Unicode for back Arrow
                    draft.setText("Draft"); 
                    draft.setId("draftdef " + object.getPosition() + " " + object.getName());
                    draft.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
                    list.add(name, 0, i);
                    list.add(age, 1, i);
                    list.add(number, 2, i);
                    list.add(team, 3, i);
                    list.add(height, 4, i);
                    list.add(weight, 5, i);
                    list.add(Tackles, 6, i);
                    list.add(Sacks, 7, i);
                    list.add(Int, 8, i);
                    list.add(draft, 9, i);
                    i++;
                }
            }
        }

        //Columns will resize with window
        ColumnConstraints columnConstraints = new ColumnConstraints();
        columnConstraints.setFillWidth(true);
        columnConstraints.setHgrow(Priority.ALWAYS);
        list.getColumnConstraints().add(columnConstraints);

        //Add All Node to vBox
        vBox.getChildren().addAll(back, getSearchBar(), list);
        pane.setCenter(vBox);

        //Create ScrollPane
        ScrollPane scroller = new ScrollPane(pane);
        scroller.setFitToWidth(true);

        menu.setScene(new Scene(scroller, 700, 550));
        menu.show();
    }

    //Show My Roster
    private void showRoster(){
        BorderPane pane = new BorderPane();
        pane.setTop(getLogo());

        VBox vBox = new VBox(15);
        vBox.setPadding(new Insets(15, 5, 5, 5));

        Button back = new Button();
        //Unicode for back Arrow
        back.setText("\u21E6");
        back.setId("back to menu");
        back.setFont(Font.font("Verdana", 20));
        back.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());

        //Create gridPane for list of players
        GridPane list = new GridPane();
        list.setAlignment(Pos.CENTER);
        list.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        list.setHgap(5.5);
        list.setVgap(5.5);
        int i = 0;
        int offResults = 0;
        int defResults = 0;

        // List all defensive players
        for(Object object: currentRoster){
            if(((NFLPlayer) object).getCategory().equals("off")){
                offResults++;
            }
        }

        if(offResults > 0){
            list.add(new Label("Offense"), 0, 0);
            list.add(new Label("Age"), 1, 0);
            list.add(new Label("Number"), 2, 0);
            list.add(new Label("Team"), 3, 0);
            list.add(new Label("Height"), 4, 0);
            list.add(new Label("Weight"), 5, 0);
            list.add(new Label("Passing/Rec"), 6, 0);
            list.add(new Label("Rushing"), 7, 0);
            list.add(new Label("TD"), 8, 0);
            list.add(new Label("Cut"), 9, 0);
            i++;
        }

        //List all defensive players
        for(Object object: currentRoster){
            if(((NFLPlayer) object).getCategory() == "off"){
                Label name = new Label(((NFLPlayer) object).getName());
                Label age = new Label(Integer.toString(((NFLPlayer) object).getAge()));
                Label number = new Label(Integer.toString(((NFLPlayer) object).getNumber()));
                Label team = new Label(((NFLPlayer) object).getTeam());
                Label height = new Label(Float.toString(((NFLPlayer) object).getHeight()));
                Label weight = new Label(Float.toString(((NFLPlayer) object).getWeight()));
                Label passRec = new Label(Double.toString(((OffensivePlayer) object).getPassing()));
                Label rushing = new Label(Double.toString(((OffensivePlayer) object).getRushing()));
                Label td = new Label(Double.toString(((OffensivePlayer) object).getTd()));
                Button draft = new Button();
                //Unicode for back Arrow
                draft.setText("Cut");
                draft.setId("cut_ " + ((NFLPlayer) object).getName());
                draft.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
                list.add(name, 0, i);
                list.add(age, 1, i);
                list.add(number, 2, i);
                list.add(team, 3, i);
                list.add(height, 4, i);
                list.add(weight, 5, i);
                list.add(passRec, 6, i);
                list.add(rushing, 7, i);
                list.add(td, 8, i);
                list.add(draft, 9, i);
                i++;
            }
        }

        //Set grid headers
        //List all defensive players
        for(Object object: currentRoster){
            if(((NFLPlayer) object).getCategory().equals("def")){
                defResults++;
            }
        }

        if (defResults > 0){
            list.add(new Label("Defense"), 0, i);
            list.add(new Label("Age"), 1, i);
            list.add(new Label("Number"), 2, i);
            list.add(new Label("Team"), 3, i);
            list.add(new Label("Height"), 4, i);
            list.add(new Label("Weight"), 5, i);
            list.add(new Label("Tackles"), 6, i);
            list.add(new Label("Sacks"), 7, i);
            list.add(new Label("Int"), 8, i);
            list.add(new Label("Cut"), 9, i);
            i++;
        }

        //List all defensive players
        for(Object object: currentRoster){
            if(((NFLPlayer) object).getCategory() == "def"){
                Label name = new Label(((NFLPlayer) object).getName());
                Label age = new Label(Integer.toString(((NFLPlayer) object).getAge()));
                Label number = new Label(Integer.toString(((NFLPlayer) object).getNumber()));
                Label team = new Label(((NFLPlayer) object).getTeam());
                Label height = new Label(Float.toString(((NFLPlayer) object).getHeight()));
                Label weight = new Label(Float.toString(((NFLPlayer) object).getWeight()));
                Label Tackles = new Label(Double.toString(((DefensivePlayer) object).getTackles()));
                Label Sacks = new Label(Double.toString(((DefensivePlayer) object).getSacks()));
                Label Int = new Label(Double.toString(((DefensivePlayer) object).getInter()));
                Button draft = new Button();
                //Unicode for back Arrow
                draft.setText("Cut");
                draft.setId("cut_ " + ((NFLPlayer) object).getName());
                draft.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
                list.add(name, 0, i);
                list.add(age, 1, i);
                list.add(number, 2, i);
                list.add(team, 3, i);
                list.add(height, 4, i);
                list.add(weight, 5, i);
                list.add(Tackles, 6, i);
                list.add(Sacks, 7, i);
                list.add(Int, 8, i);
                list.add(draft, 9, i);
                i++;
            }
        }


        //Columns will resize with window
        ColumnConstraints columnConstraints = new ColumnConstraints();
        columnConstraints.setFillWidth(true);
        columnConstraints.setHgrow(Priority.ALWAYS);
        list.getColumnConstraints().add(columnConstraints);

        //Add All Node to vBox
        vBox.getChildren().addAll(back, getSearchBar(), list);
        pane.setCenter(vBox);

        //Create ScrollPane
        ScrollPane scroller = new ScrollPane(pane);
        scroller.setFitToWidth(true);

        menu.setScene(new Scene(scroller, 700, 550));
        menu.show();
    }

    //Show Search Results
    private void showSearchResults(String searchName){
        BorderPane pane = new BorderPane();
        pane.setTop(getLogo());

        VBox vBox = new VBox(15);
        vBox.setPadding(new Insets(15, 5, 5, 5));

        Button back = new Button();
        //Unicode for back Arrow
        back.setText("\u21E6");
        back.setId("back to menu");
        back.setFont(Font.font("Verdana", 20));
        back.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());

        //Create gridPane for list of players
        GridPane list = new GridPane();
        list.setAlignment(Pos.CENTER);
        list.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        list.setHgap(5.5);
        list.setVgap(5.5);
        int i = 0;
        int offResults = 0;
        int defResults = 0;

        //List all defensive players
        for(Object object: offensivePlayers){ 
            if(((NFLPlayer) object).getName().toLowerCase().contains(searchName.toLowerCase())) {
                offResults++;
            }
        }

        if(offResults > 0){
            list.add(new Label("Offense"), 0, 0);
            list.add(new Label("Age"), 1, 0);
            list.add(new Label("Number"), 2, 0);
            list.add(new Label("Team"), 3, 0);
            list.add(new Label("Height"), 4, 0);
            list.add(new Label("Weight"), 5, 0);
            list.add(new Label("Passing/Rec"), 6, 0);
            list.add(new Label("Rushing"), 7, 0);
            list.add(new Label("TD"), 8, 0);
            list.add(new Label("Cut"), 9, 0);
            i++;
        }

        //List all defensive players
        for(Object object: offensivePlayers){
            if(((NFLPlayer) object).getName().toLowerCase().contains(searchName.toLowerCase())){
                Label name = new Label(((NFLPlayer) object).getName());
                Label age = new Label(Integer.toString(((NFLPlayer) object).getAge()));
                Label number = new Label(Integer.toString(((NFLPlayer) object).getNumber()));
                Label team = new Label(((NFLPlayer) object).getTeam());
                Label height = new Label(Float.toString(((NFLPlayer) object).getHeight()));
                Label weight = new Label(Float.toString(((NFLPlayer) object).getWeight()));
                Label passRec = new Label(Double.toString(((OffensivePlayer) object).getPassing()));
                Label rushing = new Label(Double.toString(((OffensivePlayer) object).getRushing()));
                Label td = new Label(Double.toString(((OffensivePlayer) object).getTd()));
                Button draft = new Button();
                //Unicode for back Arrow
                draft.setText("Draft");
                draft.setId("draftOff " + ((NFLPlayer) object).getName());
                draft.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
                list.add(name, 0, i);
                list.add(age, 1, i);
                list.add(number, 2, i);
                list.add(team, 3, i);
                list.add(height, 4, i);
                list.add(weight, 5, i);
                list.add(passRec, 6, i);
                list.add(rushing, 7, i);
                list.add(td, 8, i);
                list.add(draft, 9, i);
                i++;
            }
        }

        //List all defensive players
        for(Object object: defensivePlayers){
            if(((NFLPlayer) object).getName().toLowerCase().contains(searchName.toLowerCase())){
                defResults++;
            }
        }

        if (defResults > 0){
            //Set grid headers
            list.add(new Label("Defense"), 0, i);
            list.add(new Label("Age"), 1, i);
            list.add(new Label("Number"), 2, i);
            list.add(new Label("Team"), 3, i);
            list.add(new Label("Height"), 4, i);
            list.add(new Label("Weight"), 5, i);
            list.add(new Label("Tackles"), 6, i);
            list.add(new Label("Sacks"), 7, i);
            list.add(new Label("Int"), 8, i);
            list.add(new Label("Cut"), 9, i);
            i++;
        }

        //List all defensive players
        for(Object object: defensivePlayers){
            if(((NFLPlayer) object).getName().toLowerCase().contains(searchName.toLowerCase())){
                Label name = new Label(((NFLPlayer) object).getName());
                Label age = new Label(Integer.toString(((NFLPlayer) object).getAge()));
                Label number = new Label(Integer.toString(((NFLPlayer) object).getNumber()));
                Label team = new Label(((NFLPlayer) object).getTeam());
                Label height = new Label(Float.toString(((NFLPlayer) object).getHeight()));
                Label weight = new Label(Float.toString(((NFLPlayer) object).getWeight()));
                Label Tackles = new Label(Double.toString(((DefensivePlayer) object).getTackles()));
                Label Sacks = new Label(Double.toString(((DefensivePlayer) object).getSacks()));
                Label Int = new Label(Double.toString(((DefensivePlayer) object).getInter()));
                Button draft = new Button();
                //Unicode for back Arrow
                draft.setText("Draft");
                draft.setId("draftdef " + ((NFLPlayer) object).getName());
                draft.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
                list.add(name, 0, i);
                list.add(age, 1, i);
                list.add(number, 2, i);
                list.add(team, 3, i);
                list.add(height, 4, i);
                list.add(weight, 5, i);
                list.add(Tackles, 6, i);
                list.add(Sacks, 7, i);
                list.add(Int, 8, i);
                list.add(draft, 9, i);
                i++;
            }
        }


        //Columns will resize with window
        ColumnConstraints columnConstraints = new ColumnConstraints();
        columnConstraints.setFillWidth(true);
        columnConstraints.setHgrow(Priority.ALWAYS);
        list.getColumnConstraints().add(columnConstraints);

        //Add All Node to vBox
        vBox.getChildren().addAll(back, getSearchBar(), list);
        pane.setCenter(vBox);

        //Create ScrollPane
        ScrollPane scroller = new ScrollPane(pane);
        scroller.setFitToWidth(true);

        menu.setScene(new Scene(scroller, 700, 550));
        menu.show();
    }

    //Return Main Menu	 
    private Node getMenu(){
        //Create offense button
        Button offense = new Button("View Offense");
        //Set button id
        offense.setId("View Offense");
        //Set button width
        offense.setMaxWidth(Double.MAX_VALUE);
        offense.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());

        //Create Defense button
        Button defense = new Button("View Defense");
        //Set button id
        defense.setId("View Defense");
        //Set button width
        defense.setMaxWidth(Double.MAX_VALUE);
        defense.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());

        //Create My Roster button
        Button myRoster = new Button("My Roster");
        //Set button id
        myRoster.setId("My Roster");
        //Set button width
        myRoster.setMaxWidth(Double.MAX_VALUE);
        myRoster.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());

        VBox vbButtons = new VBox();
        vbButtons.setSpacing(30);
        vbButtons.setPadding(new Insets(30, 200, 30, 200));

        vbButtons.getChildren().addAll(offense, defense);

        //If currentRoster has any players add button to scene
        if(!currentRoster.isEmpty()){
            vbButtons.getChildren().addAll(myRoster);
        }
        return vbButtons;
    }

    //Return Logo in StackPane
    private StackPane getLogo(){
        //15 pixels space between child nodes
        StackPane stackPane = new StackPane();
        stackPane.setPrefHeight(100);
        //15 pixel padding all around
        stackPane.setPadding(new Insets(15, 15, 15, 15));
        //Background color is gray
        stackPane.setStyle("-fx-background-color: gray");
        //Create & add image to imageView
        ImageView imageView = new ImageView(new Image("images/NFL_Draft.png"));
        //Set imageView height
        imageView.setFitHeight(200);
        //Preserve image aspect ratio
        imageView.setPreserveRatio(true);
        //Add imageView to hbox
        stackPane.getChildren().add(imageView);
        return stackPane;
    }

    //Create and return Searchbar
    private HBox getSearchBar(){
        //Create label
        Label searchlabel = new Label("Search by Player");
        searchField.setId("searchFor");
        searchField.setMinWidth(50);
        searchField.setPrefWidth(460);
        searchField.setMaxWidth(460);
        //Create search button
        Button searchBtn = new Button("Search");
        //Set button id
        searchBtn.setId("search");
        //Set button width
        searchBtn.setMaxWidth(Double.MAX_VALUE);
        searchBtn.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
        //Create HBox
        HBox searchBar = new HBox();
        //Add all nodes to scene
        searchBar.getChildren().addAll(searchlabel, searchField, searchBtn);
        searchBar.setSpacing(10);
        return searchBar;
    }
 
    public void createPlayers(){    
        //Create Offensive Players
        OffensivePlayer player1 = new OffensivePlayer("01.Drew Brees", 38, 9, "New Orleans Saints", 6.0f, 209f, "off", 471, 5208, 37, "QB");
        OffensivePlayer player2 = new OffensivePlayer("02.Ezekiel Elliott", 21, 21, "Dallas Cowboys", 6.0f, 225f, "off", 322, 1631, 15, "RB");
        OffensivePlayer player3 = new OffensivePlayer("03.Kirk Cousins", 28, 8, "Washington Redskins", 6.3f, 210f, "off", 406, 4917, 25, "QB");
        OffensivePlayer player4 = new OffensivePlayer("04.Aaron Rodgers", 33, 12, "Green Bay Packers", 6.2f, 225f, "off", 401, 4428, 40, "QB");
        OffensivePlayer player5 = new OffensivePlayer("05.Philip Rivers", 35, 17, "Los Angeles Chargers", 6.5f, 228f, "off", 349, 4386, 33, "QB");
        OffensivePlayer player6 = new OffensivePlayer("06.Jordan Howard", 22, 24, "Chicago Bears", 6.0f, 222f, "off", 252, 1313, 6, "RB");
        OffensivePlayer player7 = new OffensivePlayer("07.DeMarco Murray", 29, 29, "Tennessee Titans", 6.1f, 220f, "off", 293, 1287, 9, "RB");
        OffensivePlayer player8 = new OffensivePlayer("08.T.Y. Hilton", 27, 13, "Indianapolis Colts", 5.9f, 180f, "off", 91, 1448, 6, "WR");
        OffensivePlayer player9 = new OffensivePlayer("09.Matt Ryan", 31, 2, "Atlanta Falcons", 6.4f, 217f, "off", 373, 4944, 38, "QB");
        OffensivePlayer player10 = new OffensivePlayer("10.Julio Jones", 28, 11, "Atlanta Falcons", 6.3f, 220f, "off", 129, 1409, 6, "WR");

        //Create Defensive Players
        DefensivePlayer player11 = new DefensivePlayer("11.Bobby Wagner", 26, 54, "Seattle Seahawks", 6.0f, 245f, "def", 86, 4.5, 1, "ILB");
        DefensivePlayer player12 = new DefensivePlayer("12.Zach Brown", 27, 53, "Washington Redskins", 6.1f, 248f, "def", 97, 4.0, 1, "OLB");
        DefensivePlayer player13 = new DefensivePlayer("13.Christian Kirksey", 24, 58, "Cleveland Browns", 6.2f, 235f, "def", 93, 2.5, 0, "OLB");
        DefensivePlayer player14 = new DefensivePlayer("14.Sean Lee", 30, 50, "Dallas Cowboys", 6.2f, 238f, "def", 93, 0.0, 0, "LB");
        DefensivePlayer player15 = new DefensivePlayer("15.Kwon Alexander", 22, 58, "Tampa Bay Buccaneers", 6.1f, 227f, "def", 108, 3.0, 1, "OLB");
        DefensivePlayer player16 = new DefensivePlayer("16.Vic Beasley Jr.", 24, 44, "Atlanta Falcons", 6.3f, 246f, "def", 32, 15.5, 0, "OLB");
        DefensivePlayer player17 = new DefensivePlayer("17.Von Miller", 28, 58, "Denver Broncos", 6.3f, 250f, "def", 62, 13.5, 0, "LB");
        DefensivePlayer player18 = new DefensivePlayer("18.Lorenzo Alexander", 33, 57, "Buffalo Bills", 6.1f, 245f, "def", 50, 12.5, 1, "DT");
        DefensivePlayer player19 = new DefensivePlayer("19.Casey Hayward", 27, 26, "Los Angeles Chargers", 5.11f, 192f, "def", 50, 0.0, 7, "DB");
        DefensivePlayer player20 = new DefensivePlayer("20.Marcus Peters", 24, 22, "Kansas City Chiefs", 6.0f, 197f, "def", 35, 0.0, 6, "CB");
    
        //Add Offensive Players to draft
        offensivePlayers.add(player1);
        offensivePlayers.add(player2);
        offensivePlayers.add(player3);
        offensivePlayers.add(player4);
        offensivePlayers.add(player5);
        offensivePlayers.add(player6);
        offensivePlayers.add(player7);
        offensivePlayers.add(player8);
        offensivePlayers.add(player9);
        offensivePlayers.add(player10);

        //Add Defensive Players to draft
        defensivePlayers.add(player11);
        defensivePlayers.add(player12);
        defensivePlayers.add(player13);
        defensivePlayers.add(player14);
        defensivePlayers.add(player15);
        defensivePlayers.add(player16);
        defensivePlayers.add(player17);
        defensivePlayers.add(player18);
        defensivePlayers.add(player19);
        defensivePlayers.add(player20);
    }


    public static void main(String[] args) {
        launch(args);
    }

    //This handles all events for when buttons are clicked 
    private class MyEventHandler implements EventHandler < Event >{
        @Override
        public void handle(Event evt){
            //Switch that runs methods based upon button id 
            switch(((Control) evt.getSource()).getId()){
                case "View Offense":
                    showOffense(); break;
                case "View Defense":
                    showDefense(); break;
                case "My Roster":
                    showRoster(); break;
                case "back to menu":
                    showMenu(); break;
                case "back to offense":
                    showOffense(); break;
                case "back to defense":
                    showDefense(); break;
                case "search":
                    showSearchResults(searchField.getText()); break;
                case "allOff":
                    listOffensivePlayers(((Control) evt.getSource()).getId());break;
                case "QB":
                    listOffensivePlayers(((Control) evt.getSource()).getId()); break;
                case "RB":
                    listOffensivePlayers(((Control) evt.getSource()).getId()); break;
                case "WR":
                    listOffensivePlayers(((Control) evt.getSource()).getId()); break;
                case "alldef":
                    listDeffensivePlayers(((Control) evt.getSource()).getId());break;
                case "ILB":
                    listDeffensivePlayers(((Control) evt.getSource()).getId()); break;
                case "DB":
                    listDeffensivePlayers(((Control) evt.getSource()).getId()); break;
                case "OLB":
                    listDeffensivePlayers(((Control) evt.getSource()).getId()); break;
                case "DT":
                    listDeffensivePlayers(((Control) evt.getSource()).getId()); break;
                case "LB":
                    listDeffensivePlayers(((Control) evt.getSource()).getId()); break;
                case "CB":
                    listDeffensivePlayers(((Control) evt.getSource()).getId()); break;
            }

            //Drafting offense
            if(((Control) evt.getSource()).getId().contains("draftOff")){
                String name;
                String players;

                //If QB is clicked
                if(((Control) evt.getSource()).getId().contains("QB")){
                    name = ((Control) evt.getSource()).getId().substring(12);
                    players = "QB";
                } 
                //If RB is clicked
                else if(((Control) evt.getSource()).getId().contains("RB")){
                    name = ((Control) evt.getSource()).getId().substring(12);
                    players = "RB";
                } 
                //If WR is clicked
                else if(((Control) evt.getSource()).getId().contains("WR")){
                    name = ((Control) evt.getSource()).getId().substring(12);
                    players = "WR";
                } 
                else{
                    //All offense QB is clicked
                    name = ((Control) evt.getSource()).getId().substring(9);
                    players = "allOff";
                }

                //Iterate through all objects in arraylist
                for(Iterator < OffensivePlayer > it = offensivePlayers.iterator(); it.hasNext();){
                    OffensivePlayer offensivePlayers = it.next();

                    //If object name equals name of person drafted
                    if(offensivePlayers.getName().equals(name)){
                        //Create alert with celebration message
                        Alert a = new Alert(AlertType.INFORMATION);
                        a.setTitle("Celebrator");
                        a.setHeaderText("Awesome!, ");
                        a.setResizable(true);
                        String version = System.getProperty("java.version");
                        String content = String.format(offensivePlayers.getName() + " " 
                                + offensivePlayers.celebrate(), version);
                        a.setContentText(content);
                        a.showAndWait();

                        //Add object to current roster
                        currentRoster.add(offensivePlayers);
                        //Remove object for offensive players 
                        it.remove();

                        if(searchField.getText().isEmpty()){
                            //List players passing selection
                            listOffensivePlayers(players);
                        }
                        else{
                            showSearchResults(searchField.getText());
                            searchField = new TextField();
                        }
                    }
                }
            }

            //Drafting defense
            if(((Control) evt.getSource()).getId().contains("draftdef")){
                String name;
                String players;

                //If RB is clicked
                if(((Control) evt.getSource()).getId().contains("ILB")){
                    name = ((Control) evt.getSource()).getId().substring(13);
                    players = "ILB";
                } 
                //If DB is clicked
                else if(((Control) evt.getSource()).getId().contains("DB")){
                    name = ((Control) evt.getSource()).getId().substring(12);
                    players = "DB";
                }
                //If OLB is clicked
                else if(((Control) evt.getSource()).getId().contains("OLB")){
                    name = ((Control) evt.getSource()).getId().substring(13);
                    players = "OLB";
                } 
                //If DT is clicked
                else if(((Control) evt.getSource()).getId().contains("DT")){
                    name = ((Control) evt.getSource()).getId().substring(12);
                    players = "DT";
                }
                //If LB is clicked
                else if(((Control) evt.getSource()).getId().contains("LB")){ 
                    name = ((Control) evt.getSource()).getId().substring(12);
                    players = "LB";
                } 
                //If CB is clicked
                else if(((Control) evt.getSource()).getId().contains("CB")){ 
                    name = ((Control) evt.getSource()).getId().substring(12);
                    players = "CB";
                } 
                else{
                    //All offense QB is clicked
                    name = ((Control) evt.getSource()).getId().substring(9);
                    players = "alldef";
                }

                //Iterate through all objects in arraylist
                for(Iterator < DefensivePlayer > it = defensivePlayers.iterator(); it.hasNext();){
                    DefensivePlayer defensivePlayers = it.next();

                    //If object name equals name of person drafted
                    if(defensivePlayers.getName().equals(name)){
                        //Create alert with celebration message
                        Alert a = new Alert(AlertType.INFORMATION);
                        a.setTitle("Celebrator");
                        a.setHeaderText("Awesome, ");
                        a.setResizable(true);
                        String version = System.getProperty("java.version");
                        String content = String.format(defensivePlayers.getName() + " " + defensivePlayers.celebrate(), version);
                        a.setContentText(content);
                        a.showAndWait();

                        //Add object to current roster	
                        currentRoster.add(defensivePlayers); 
                        //Remove object for offensive players 
                        it.remove(); 

                        if(searchField.getText().isEmpty()){
                            //List players passing selection
                            listDeffensivePlayers(players);
                        } 
                        else{
                            showSearchResults(searchField.getText());
                            searchField = new TextField();
                        }
                    }
                }
            }

            //Drafting defense
            if(((Control) evt.getSource()).getId().contains("cut_")){
                String name;
                name = ((Control) evt.getSource()).getId().substring(5);

                //Iterate through all objects in arraylist
                for(Iterator < Object > it = currentRoster.iterator(); it.hasNext();){
                    Object currentRoster = it.next();

                    if(((NFLPlayer) currentRoster).getName().equals(name)){

                        //Create alert with celebration message
                        Alert a = new Alert(AlertType.INFORMATION);
                        a.setTitle("Celebrator");
                        a.setHeaderText("Oh No!");
                        a.setResizable(true);
                        String version = System.getProperty("java.version");
                        String content = String.format("You have cut " + name, version);
                        a.setContentText(content);
                        a.showAndWait();

                        if(((NFLPlayer) currentRoster).getCategory().equals("off")){
                            //Add object to current roster
                            offensivePlayers.add((OffensivePlayer) currentRoster); 
                            //Remove object from roster
                            it.remove();
                            //List players on my roster
                            showRoster();
                        }

                        if(((NFLPlayer) currentRoster).getCategory().equals("def")){
                            //Add object to current roster
                            defensivePlayers.add((DefensivePlayer) currentRoster);
                            //Remove object from roster
                            it.remove();
                            //List players on my roster
                            showRoster();
                        }
                    }
                }
            }
        }
    }
}