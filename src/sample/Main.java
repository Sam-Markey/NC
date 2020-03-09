package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;

import javax.swing.*;
import java.text.ParseException;
import java.time.Duration;
import java.util.Timer;
import java.util.TimerTask;

public class Main extends Application {

    Stage window;

    Button b1 = new Button("");
    Button b2 = new Button("");
    Button b3 = new Button("");
    Button b4 = new Button("");
    Button b5 = new Button("");
    Button b6 = new Button("");
    Button b7 = new Button("");
    Button b8 = new Button("");
    Button b9 = new Button("");
    Button reset = new Button("Reset Game");
    Text turn = new Text();
    Text turn2 = new Text();


    @Override
    public void start(Stage primaryStage) throws Exception {

        this.window = primaryStage;
        this.window.setTitle("Naughts and Crosses Game");


        GridPane grid = new GridPane();


        this.turn.setText("P1 Turn You Are X");
        this.turn.setStyle("-fx-font:35 arial;");
        grid.add(turn, 1, 0);
        GridPane.setMargin(turn, new Insets(50, 0, 50, 0));

        this.turn2.setText("");
        this.turn2.setStyle("-fx-font:35 arial;");
        grid.add(turn2, 1, 4);

        b1.setMinSize(300, 200);
        b1.setMaxSize(300, 200);
        grid.add(b1, 0, 1);
        b1.setOnAction(e -> {

            turn2.setText("");
            b1.setStyle("-fx-font:100 arial;");

            if (b1.getText().equals("") && turn.getText().equals("P1 Turn You Are X")) {

                b1.setText("X");

                turn.setText("P2 Turn You Are O");

            } else if (b1.getText().equals("") && turn.getText().equals("P2 Turn You Are O")) {

                b1.setText("O");

                turn.setText("P1 Turn You Are X");
            }
            win();
        });

        b2.setMinSize(300, 200);
        b2.setMaxSize(300, 200);
        grid.add(b2, 1, 1);
        b2.setOnAction(e -> {
            turn2.setText("");
            b2.setStyle("-fx-font:100 arial;");

            if (b2.getText().equals("") && turn.getText().equals("P1 Turn You Are X")) {

                b2.setText("X");

                turn.setText("P2 Turn You Are O");

            } else if (b2.getText().equals("") && turn.getText().equals("P2 Turn You Are O")) {

                b2.setText("O");

                turn.setText("P1 Turn You Are X");
            }
            win();
        });

        b3.setMinSize(300, 200);
        b3.setMaxSize(300, 200);
        grid.add(b3, 2, 1);

        b3.setOnAction(e -> {
            turn2.setText("");
            b3.setStyle("-fx-font:100 arial;");

            if (b3.getText().equals("") && turn.getText().equals("P1 Turn You Are X")) {

                b3.setText("X");

                turn.setText("P2 Turn You Are O");

            } else if (b3.getText().equals("") && turn.getText().equals("P2 Turn You Are O")) {

                b3.setText("O");

                turn.setText("P1 Turn You Are X");
            }
            win();
        });

        b4.setMinSize(300, 200);
        b4.setMaxSize(300, 200);
        grid.add(b4, 0, 2);
        b4.setOnAction(e -> {
            turn2.setText("");
            b4.setStyle("-fx-font:100 arial;");

            if (b4.getText().equals("") && turn.getText().equals("P1 Turn You Are X")) {

                b4.setText("X");

                turn.setText("P2 Turn You Are O");

            } else if (b4.getText().equals("") && turn.getText().equals("P2 Turn You Are O")) {

                b4.setText("O");

                turn.setText("P1 Turn You Are X");
            }
            win();
        });

        b5.setMinSize(300, 200);
        b5.setMaxSize(300, 200);
        grid.add(b5, 1, 2);
        b5.setOnAction(e -> {
            turn2.setText("");
            b5.setStyle("-fx-font:100 arial;");

            if (b5.getText().equals("") && turn.getText().equals("P1 Turn You Are X")) {

                b5.setText("X");

                turn.setText("P2 Turn You Are O");

            } else if (b5.getText().equals("") && turn.getText().equals("P2 Turn You Are O")) {

                b5.setText("O");

                turn.setText("P1 Turn You Are X");
            }
            win();
        });

        b6.setMinSize(300, 200);
        b6.setMaxSize(300, 200);
        grid.add(b6, 2, 2);

        b6.setOnAction(e -> {
            turn2.setText("");
            b6.setStyle("-fx-font:100 arial;");

            if (b6.getText().equals("") && turn.getText().equals("P1 Turn You Are X")) {

                b6.setText("X");

                turn.setText("P2 Turn You Are O");

            } else if (b6.getText().equals("") && turn.getText().equals("P2 Turn You Are O")) {

                b6.setText("O");

                turn.setText("P1 Turn You Are X");
            }
            win();
        });

        b7.setMinSize(300, 200);
        b7.setMaxSize(300, 200);
        grid.add(b7, 0, 3);

        b7.setOnAction(e -> {
            turn2.setText("");
            b7.setStyle("-fx-font:100 arial;");

            if (b7.getText().equals("") && turn.getText().equals("P1 Turn You Are X")) {

                b7.setText("X");

                turn.setText("P2 Turn You Are O");

            } else if (b7.getText().equals("") && turn.getText().equals("P2 Turn You Are O")) {

                b7.setText("O");

                turn.setText("P1 Turn You Are X");
            }
            win();
        });

        b8.setMinSize(300, 200);
        b8.setMaxSize(300, 200);
        grid.add(b8, 1, 3);

        b8.setOnAction(e -> {
            turn2.setText("");
            b8.setStyle("-fx-font:100 arial;");

            if (b8.getText().equals("") && turn.getText().equals("P1 Turn You Are X")) {

                b8.setText("X");

                turn.setText("P2 Turn You Are O");

            } else if (b8.getText().equals("") && turn.getText().equals("P2 Turn You Are O")) {

                b8.setText("O");

                turn.setText("P1 Turn You Are X");
            }
            win();
        });

        b9.setMinSize(300, 200);
        b9.setMaxSize(300, 200);
        grid.add(b9, 2, 3);

        b9.setOnAction(e -> {
            turn2.setText("");
            b9.setStyle("-fx-font:100 arial;");

            if (b9.getText().equals("") && turn.getText().equals("P1 Turn You Are X")) {

                b9.setText("X");

                turn.setText("P2 Turn You Are O");

            } else if (b9.getText().equals("") && turn.getText().equals("P2 Turn You Are O")) {

                b9.setText("O");

                turn.setText("P1 Turn You Are X");
            }
            win();
        });

        reset.setMinSize(100, 100);
        reset.setMaxSize(100, 100);
        GridPane.setMargin(reset, new Insets(50, 0, 0, 100));

        grid.setAlignment(Pos.CENTER);
        grid.add(reset, 0, 4);
     reset.setOnAction(e ->{
         b1.setText("");
         b2.setText("");
         b3.setText("");
         b4.setText("");
         b5.setText("");
         b6.setText("");
         b7.setText("");
         b8.setText("");
         b9.setText("");

         turn.setText("P1 Turn You Are X");

     });


        Scene scene = new Scene(grid, 1000, 1000);

        window.setScene(scene);
        window.show();

    }


    public static void main(String[] args) {

        launch(args);
    }

    public void win() {

        if (this.b1.getText().equals("X") && this.b2.getText().equals("X") && this.b3.getText().equals("X") || this.b1.getText().equals("X") && this.b4.getText().equals("X") && this.b7.getText().equals("X") || this.b4.getText().equals("X") && this.b5.getText().equals("X") && this.b6.getText().equals("X") || this.b2.getText().equals("X") && this.b5.getText().equals("X") && this.b8.getText().equals("X") || this.b7.getText().equals("X") && this.b8.getText().equals("X") && this.b9.getText().equals("X") || this.b3.getText().equals("X") && this.b6.getText().equals("X") && this.b9.getText().equals("X") || this.b1.getText().equals("X") && this.b5.getText().equals("X") && this.b9.getText().equals("X") || this.b3.getText().equals("X") && this.b5.getText().equals("X") && this.b7.getText().equals("X")) {

            turn2.setText("PLAYER 1 WINS");

            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText("");
            b5.setText("");
            b6.setText("");
            b7.setText("");
            b8.setText("");
            b9.setText("");

        } else if (this.b1.getText().equals("O") && this.b2.getText().equals("O") && this.b3.getText().equals("O") || this.b1.getText().equals("O") && this.b4.getText().equals("O") && this.b7.getText().equals("O") || this.b4.getText().equals("O") && this.b5.getText().equals("O") && this.b6.getText().equals("O") || this.b2.getText().equals("O") && this.b5.getText().equals("O") && this.b8.getText().equals("O") || this.b7.getText().equals("O") && this.b8.getText().equals("O") && this.b9.getText().equals("O") || this.b3.getText().equals("O") && this.b6.getText().equals("O") && this.b9.getText().equals("O") || this.b1.getText().equals("O") && this.b5.getText().equals("O") && this.b9.getText().equals("O") || this.b3.getText().equals("O") && this.b5.getText().equals("O") && this.b7.getText().equals("O")) {

            turn2.setText("PLAYER 2 WINS");

            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText("");
            b5.setText("");
            b6.setText("");
            b7.setText("");
            b8.setText("");
            b9.setText("");

        }


    }

}


