package sample;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.transform.Transform;
import javafx.stage.Stage;
import javafx.util.Duration;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{



        Button play = new Button("Play");
        Label label = new Label("      ");
        label.setStyle("-fx-background-color: red");
        Timeline timeline = new Timeline();



        label.setLayoutX(10.0);
        label.setLayoutY(100.0);
        KeyValue kv1 = new KeyValue(label.translateXProperty(), 0);
        KeyValue kv2x = new KeyValue(label.translateXProperty(), 200);
        KeyValue kv2y = new KeyValue(label.translateYProperty(), 0);
        KeyValue kv3x = new KeyValue(label.translateXProperty(), 400);
        KeyValue kv3y = new KeyValue(label.translateYProperty(), 0);
        KeyValue kv4x = new KeyValue(label.translateXProperty(), 400);
        KeyValue kv4y = new KeyValue(label.translateYProperty(), 200);





        KeyFrame kf1 = new KeyFrame(Duration.millis(0),"kf1", new EventHandler<ActionEvent>(){

            /**
             * Invoked when a specific event of the type for which this handler is
             * registered happens.
             *
             * @param event the event which occurred
             */
            @Override
            public void handle(ActionEvent event) {
                //System.out.println("kf1");
            }
        },kv1);

        KeyFrame kf2 = new KeyFrame(Duration.millis(2000),"kf2", new EventHandler<ActionEvent>(){

            /**
             * Invoked when a specific event of the type for which this handler is
             * registered happens.
             *
             * @param event the event which occurred
             */
            @Override
            public void handle(ActionEvent event) {
                //System.out.println("kf2");
            }
        },kv2x,kv2y);

        KeyFrame kf3 = new KeyFrame(Duration.millis(3000),"kf3", new EventHandler<ActionEvent>(){

            /**
             * Invoked when a specific event of the type for which this handler is
             * registered happens.
             *
             * @param event the event which occurred
             */
            @Override
            public void handle(ActionEvent event) {
                //System.out.println("kf3");
            }
        },kv3x,kv3y);

        KeyFrame kf4 = new KeyFrame(Duration.millis(3500),"kf4", new EventHandler<ActionEvent>(){

            /**
             * Invoked when a specific event of the type for which this handler is
             * registered happens.
             *
             * @param event the event which occurred
             */
            @Override
            public void handle(ActionEvent event) {
                //System.out.println("kf4");
            }
        },kv4x,kv4y);

        timeline.getKeyFrames().addAll(kf1,kf2,kf3,kf4);
        timeline.setCycleCount(Timeline.INDEFINITE);

        play.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                timeline.play();
            }
        });

        Button stop = new Button("Stop");
        stop.setLayoutX(50.0);

        stop.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                timeline.stop();
            }
        });

        Button pause = new Button("Pause");
        pause.setLayoutX(100.0);

        pause.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                timeline.pause();
            }
        });


        AnchorPane anchorPane = new AnchorPane();
        anchorPane.getChildren().addAll(play,label,pause,stop);
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(anchorPane, 900, 400));
        primaryStage.show();



        label.localToParentTransformProperty().addListener(new ChangeListener<Transform>() {
            @Override
            public void changed(ObservableValue<? extends Transform> observable, Transform oldValue, Transform newValue) {
                System.out.println("The current position of beam:" + label.getTranslateX() + "  " + label.getTranslateY());
            }
        });

    }


    public static void main(String[] args) {
        launch(args);
    }
}
