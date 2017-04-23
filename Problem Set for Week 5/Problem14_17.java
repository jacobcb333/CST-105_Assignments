/*
(Game: hangman) Write a program that displays a drawing for the popular hangman
game, as shown in Figure 14.48a.
 */

package Problem14;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 *
 * @author jacobbushdiecker
 */

public class Problem14_17 extends Application{
    //Fixed size for application
    private static double HEIGHT = 400;
    private static double WIDTH = 400;

    @Override
    public void start(Stage primaryStage){
        //Creates new pane
        Pane pane = new Pane();
        //Creates an ObserableList of Nodes named list
        ObservableList<Node> list = pane.getChildren();
        
        //Sets the stage, title, and scene
        primaryStage.setTitle("Exercise14_17");
        primaryStage.setScene(new Scene(pane, WIDTH, WIDTH));
        //Creates a new arc
        Arc arc = new Arc(WIDTH / 4, HEIGHT - HEIGHT / 12, WIDTH / 5, HEIGHT / 12, 0, 180);
        //Sets are properties then adds to list
        arc.setFill(Color.TRANSPARENT);
        arc.setStroke(Color.BLACK);
        list.add(arc);
        
        //Gets the properties for pole
        Line pole = new Line(arc.getCenterX(), arc.getCenterY() - arc.getRadiusY(), arc.getCenterX(), pane.getHeight() / 12);
        list.add(pole);
        
        //Gets the properties for the line holder
        Line holder = new Line(pole.getEndX(), pole.getEndY(), pane.getWidth() / 1.5, pole.getEndY());
        list.add(holder);
        Line hang = new Line(holder.getEndX(), holder.getEndY(), holder.getEndX(), pane.getHeight() / 6);
        list.add(hang);

        //Sets the radius for circle and creates the circle object
        double radius = WIDTH / 10;
        Circle c = new Circle(holder.getEndX(), pane.getHeight()/ 6 + radius, radius);
        c.setFill(Color.TRANSPARENT);
        c.setStroke(Color.BLACK);
        list.add(c);
        
        //Properties for left and right arm
        double[] p = getPointAtAngle(c, 220);
        Line leftArm = new Line(pane.getWidth() / 3, pane.getHeight() / 1.8, p[0], p[1]);
        list.add(leftArm);
        p = getPointAtAngle(c, 315);
        Line rightArm = new Line(pane.getWidth() / 1, pane.getHeight() / 1.8, p[0], p[1]);
        list.add(rightArm);
        
        //Properties for body, left left, and right leg
        p = getPointAtAngle(c, 270);
        Line body = new Line(p[0], p[1], p[0], pane.getHeight() / 1.6);
        list.add(body);

        Line leftLeg = new Line(body.getEndX(), body.getEndY(),
                pane.getWidth() / 2, pane.getHeight() / 1.3);
        list.add(leftLeg);

        Line rightLeg = new Line(body.getEndX(), body.getEndY(),
                pane.getWidth() / 1.2, pane.getHeight() / 1.3);
        list.add(rightLeg);
        
        //Shows the stage
        primaryStage.show();
    }
    
    //Aids in placing graphics at correct loction
    private double[] getPointAtAngle(Circle c, double angle){
        double x = c.getCenterX() + c.getRadius() * Math.cos(Math.toRadians(angle));
        double y = c.getCenterY() - c.getRadius() * Math.sin(Math.toRadians(angle));

        return new double[]{x, y};
    }
    
    public static void main(String[] args){
        Application.launch(args);
    }
}