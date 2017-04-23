package Problem14;

/*
(Display a bar chart) Write a program that uses a bar chart to display the 
percentages of the overall grade represented by projects, quizzes, midterm exams,
and the final exam, as shown in Figure 14.46b. Suppose that projects
take 20 percent and are displayed in red, quizzes take 10 percent and
are displayed in blue, midterm exams take 30 percent and are displayed
in green, and the final exam takes 40 percent and is displayed in orange.
Use the MyRec2 class to display the bars. Interested readers may explore
the JavaFX BarChart class for further study.
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author jacobbushdiecker
 */

public class Problem14_12 extends Application{
    //Set widght and height
    private static final double WIDTH = 400;
    private static final double HEIGHT = 400;
    private static final double LIMIT_HEIGHT = (HEIGHT / 2);
    //Percentages for program
    private static double[] percent = new double[]{0.20, 0.10, 0.30, 0.40};
    private static String[] titles = new String[] {
        //Titles to show over rectangles
        "Project -- " + String.format("%d%s", (int)(100 * percent[0]), "%"),
        "Quiz -- " + String.format("%d%s", (int)(100 * percent[1]), "%"),
        "Midterm -- " + String.format("%d%s", (int)(100 * percent[2]), "%"),
        "Final -- "+ String.format("%d%s", (int)(100 * percent[3]), "%")};
    //Colors of each rectangle
    private static Color[] colors = new Color[]{Color.RED, Color.BLUE, 
        Color.GREEN, Color.ORANGE};
    
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        pane.setPadding(new Insets(5, 10, 0, 10));
        //Creates ractangles
        Rectangle[] bars = new Rectangle[4];
        //Bases height of rectangles on the respective percentages
        for (int i = 0; i < bars.length; i++) {
            bars[i] = new Rectangle(
                5 + (100 * i),
                LIMIT_HEIGHT - (HEIGHT * percent[i]),
                WIDTH / bars.length - 5,
                HEIGHT * percent[i]);
            bars[i].setFill(colors[i]);
            Text text = new Text(5 + (100 * i),LIMIT_HEIGHT - (HEIGHT * percent[i])
                    - 5,titles[i]);
            pane.getChildren().addAll(text, bars[i]);
        }

        primaryStage.setScene(new Scene(pane, WIDTH + 20, LIMIT_HEIGHT));
        //Creates a title
        primaryStage.setTitle("Exercise14_12");
        primaryStage.show();
    }
    
    public static void main(String[] args){
        Application.launch(args);
    }
}