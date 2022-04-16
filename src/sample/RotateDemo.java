package sample;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * @Author: Arvin Shern
 * @Date: 2022/4/14
 * @Time: 20:09
 * @Description:
 */
public class RotateDemo extends Application {

    public void start(Stage primaryStage) throws Exception {
        HBox hBox = new HBox(20);
        hBox.setLayoutX(50.0);
        hBox.setLayoutY(50.0);
        Button play = new Button("Play");
        Button stop = new Button("Stop");
        Button pause = new Button("Pause");
        hBox.getChildren().addAll(play,stop,pause);



        Rotate rotate1 = new Rotate(0,500,350);
        Rotate rotate2 = new Rotate(0,450,300);

        Circle circle = new Circle(450,300,50);
        circle.setStyle("-fx-fill: red");
        circle.getTransforms().addAll(rotate1,rotate2);

        KeyValue kv1 = new KeyValue(rotate1.angleProperty(), 0);
        KeyValue kv2 = new KeyValue(rotate2.angleProperty(), 0);
        KeyValue kv1op = new KeyValue(circle.opacityProperty(), 1);
        KeyFrame kf1 = new KeyFrame(Duration.seconds(0), kv1,kv2,kv1op);

        KeyValue kv3 = new KeyValue(rotate1.angleProperty(), 360);
        KeyValue kv4 = new KeyValue(rotate2.angleProperty(), 360);
        KeyValue kv2op = new KeyValue(circle.opacityProperty(), 0.2);
        KeyFrame kf2 = new KeyFrame(Duration.seconds(3), kv3,kv4,kv2op);





//        KeyValue kv1 = new KeyValue(rec.translateXProperty(), 0);
//        KeyValue kv1r = new KeyValue(rec.rotateProperty(), 0);
//        KeyValue kv1sx = new KeyValue(rec.scaleXProperty(), 1);
//        KeyValue kv1sy = new KeyValue(rec.scaleYProperty(), 1);
//        KeyValue kv1op = new KeyValue(rec.opacityProperty(), 1);
//        KeyFrame kf1 = new KeyFrame(Duration.seconds(0), kv1,kv1r,kv1sx,kv1sy,kv1op);
//
//        KeyValue kv2 = new KeyValue(rec.translateXProperty(), 700);
//        KeyValue kv2r = new KeyValue(rec.rotateProperty(), 720);
//        KeyValue kv2sx = new KeyValue(rec.scaleXProperty(), 5);
//        KeyValue kv2sy = new KeyValue(rec.scaleYProperty(), 5);
//        KeyValue kv2op = new KeyValue(rec.opacityProperty(), 0.3);
//        KeyFrame kf2 = new KeyFrame(Duration.seconds(2), kv2,kv2r,kv2sx,kv2sy,kv2op);

        Timeline timeline = new Timeline();
        timeline.getKeyFrames().addAll(kf1,kf2);
        //timeline.setAutoReverse(true);
        timeline.setCycleCount(Timeline.INDEFINITE);

        play.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("开始");
                timeline.play();
            }
        });

        stop.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("停止");
                timeline.stop();
            }
        });
        pause.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("暂停");
                timeline.pause();
            }
        });
        AnchorPane anchorPane = new AnchorPane();
        anchorPane.getChildren().addAll(hBox,circle);
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(anchorPane, 900, 400));
        primaryStage.show();

        //observal

    }

    public static void main(String[] args) {
        launch();
    }
}
