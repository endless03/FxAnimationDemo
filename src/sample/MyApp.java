package sample;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * @Author: Arvin Shern
 * @Date: 2022/4/14
 * @Time: 16:18
 * @Description:
 */
public class MyApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {


        HBox hBox = new HBox(20);
        hBox.setLayoutX(50.0);
        hBox.setLayoutY(50.0);
        Button play = new Button("Play");
        Button stop = new Button("Stop");
        Button pause = new Button("Pause");
        hBox.getChildren().addAll(play,stop,pause);

        Rectangle rec = new Rectangle(50,50, Color.BLUE);
        rec.setX(50);
        rec.setY(200);


        KeyValue kv1 = new KeyValue(rec.translateXProperty(), 0);
        KeyValue kv1r = new KeyValue(rec.rotateProperty(), 0);
        KeyValue kv1sx = new KeyValue(rec.scaleXProperty(), 1);
        KeyValue kv1sy = new KeyValue(rec.scaleYProperty(), 1);
        KeyValue kv1op = new KeyValue(rec.opacityProperty(), 1);
        KeyFrame kf1 = new KeyFrame(Duration.seconds(0), kv1,kv1r,kv1sx,kv1sy,kv1op);

        KeyValue kv2 = new KeyValue(rec.translateXProperty(), 700);
        KeyValue kv2r = new KeyValue(rec.rotateProperty(), 720);
        KeyValue kv2sx = new KeyValue(rec.scaleXProperty(), 5);
        KeyValue kv2sy = new KeyValue(rec.scaleYProperty(), 5);
        KeyValue kv2op = new KeyValue(rec.opacityProperty(), 0.3);
        KeyFrame kf2 = new KeyFrame(Duration.seconds(2), kv2,kv2r,kv2sx,kv2sy,kv2op);

        Timeline timeline = new Timeline();
        timeline.getKeyFrames().addAll(kf1,kf2);
        timeline.setAutoReverse(true);
        timeline.setCycleCount(Timeline.INDEFINITE);

        play.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                timeline.play();
            }
        });

        stop.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                timeline.stop();
            }
        });
        pause.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                timeline.pause();
            }
        });
        AnchorPane anchorPane = new AnchorPane();
        anchorPane.getChildren().addAll(hBox,rec);
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(anchorPane, 900, 400));
        primaryStage.show();

        //observal
    }

    public static void main(String[] args) {
        launch();
    }
}
