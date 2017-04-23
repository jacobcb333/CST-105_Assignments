package Problem14;

/*
(Display a rectanguloid) Write a program that displays a rectanguloid, as shown 
in Figure 14.47a. The cube should grow and shrink as the window grows or shrinks.
 */


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;
import java.util.ArrayList;

/**
 *
 * @author jacobbushdiecker
 */


public class Problem14_14 extends Application{
    @Override
    public void start(Stage primaryStage){
        //Creates a pane
        Pane pane = new Pane();
        
        //Creates an arrayList of type Shape called shapes
        ArrayList<Shape> shapes = new ArrayList<>();
        
        //Creates the first rectangle then adds to shapes
        Rectangle rec1 = new Rectangle(0,0, Color.TRANSPARENT);
        rec1.setStroke(Color.BLACK);
        rec1.xProperty().bind(pane.widthProperty().divide(4).subtract(25));
        rec1.yProperty().bind(pane.heightProperty().divide(4).add(25));
        rec1.widthProperty().bind(pane.widthProperty().divide(2));
        rec1.heightProperty().bind(pane.widthProperty().divide(2));
        shapes.add(rec1);
        
        //Creates the second rectangle then adds to shapes
        Rectangle rec2 = new Rectangle(0,0, Color.TRANSPARENT);
        rec2.setStroke(Color.BLACK);
        rec2.xProperty().bind(pane.widthProperty().divide(4).add(25));
        rec2.yProperty().bind(pane.heightProperty().divide(4).subtract(25));
        rec2.widthProperty().bind(pane.widthProperty().divide(2));
        rec2.heightProperty().bind(pane.widthProperty().divide(2));
        shapes.add(rec2);
        
        //Created the first line to connect the two rectangles
        Line line1 = new Line();
        line1.startXProperty().bind(rec1.xProperty());
        line1.startYProperty().bind(rec1.yProperty());
        line1.endXProperty().bind(rec2.xProperty());
        line1.endYProperty().bind(rec2.yProperty());
        shapes.add(line1);
        
        //Creates the second line to connect the two rectangles
        Line line2 = new Line();
        line2.startXProperty().bind(rec1.xProperty());
        line2.startYProperty().bind(rec1.yProperty().add(rec1.heightProperty()));
        line2.endXProperty().bind(rec2.xProperty());
        line2.endYProperty().bind(rec2.yProperty().add(rec1.heightProperty()));
        shapes.add(line2);
        
        //Creates the third line to connect the two rectangles
        Line line3 = new Line();
        line3.startXProperty().bind(rec1.xProperty().add(rec1.widthProperty()));
        line3.startYProperty().bind(rec1.yProperty().add(rec1.heightProperty()));
        line3.endXProperty().bind(rec2.xProperty().add(rec1.widthProperty()));
        line3.endYProperty().bind(rec2.yProperty().add(rec1.heightProperty()));
        shapes.add(line3);
        
        //Creates the fourth line to connect the two rectangles
        Line line4 = new Line();
        line4.startXProperty().bind(rec1.xProperty().add(rec1.widthProperty()));
        line4.startYProperty().bind(rec1.yProperty());
        line4.endXProperty().bind(rec2.xProperty().add(rec1.widthProperty()));
        line4.endYProperty().bind(rec2.yProperty());
        shapes.add(line4);

        //Creates the scene, and show
        pane.getChildren().addAll(shapes);
        Scene scene = new Scene(pane, 400, 400);
        scene.xProperty().add(scene.yProperty());
        primaryStage.setTitle("Exercise14_14");
        primaryStage.setScene(scene);
        primaryStage.show();

    }


    public static void main(String[] args){
        Application.launch(args);
    }
}
