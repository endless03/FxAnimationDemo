package sample;

import javafx.animation.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.*;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.awt.*;

/**
 * @Author: Arvin Shern
 * @Date: 2022/4/14
 * @Time: 21:48
 * @Description:
 */
public class HiAFDemo extends Application {
    /*
    the color of beam track
     */
    private static final String beam = "#7bbfea";

    @Override
    public void start(Stage primaryStage) throws Exception {
        HBox hBox = new HBox(20);
        hBox.setLayoutX(50.0);
        hBox.setLayoutY(50.0);
        Button play = new Button("Play");
        Button stop = new Button("Stop");
        Button pause = new Button("Pause");
        hBox.getChildren().addAll(play,stop,pause);

        Path path0 = new Path();
        MoveTo move = new MoveTo(0,0);
        HLineTo hLine = new HLineTo(348);
        //VLineTo vLine = new VLineTo(150);
        QuadCurveTo quadCurve = new QuadCurveTo(30, 0, 50, 20);
        quadCurve.setAbsolute(false);

        LineTo lineTo = new LineTo(30, 20);
        lineTo.setAbsolute(false);

        LineTo lineTo1 = new LineTo(80, 20);
        lineTo1.setAbsolute(false);

        QuadCurveTo quadCurve1 = new QuadCurveTo(110, 73,100, 239);
        quadCurve1.setAbsolute(false);

        LineTo lineTo2 = new LineTo(-141, 134);
        lineTo2.setAbsolute(false);

        QuadCurveTo quadCurve2 = new QuadCurveTo(-135, 31,-215, -73);
        quadCurve2.setAbsolute(false);

        LineTo lineTo3 = new LineTo(-54, -183);
        lineTo3.setAbsolute(false);

        QuadCurveTo quadCurve3 = new QuadCurveTo(51, -126,203, -151);
        quadCurve3.setAbsolute(false);

        //path.setStroke(Paint.valueOf("#CAE1FF"));
        path0.setStroke(Paint.valueOf(beam));
        path0.setStrokeWidth(20.0);
        path0.setStrokeLineJoin(StrokeLineJoin.BEVEL);
        path0.setStrokeLineCap(StrokeLineCap.SQUARE);
        //ClosePath closePath = new ClosePath();
        path0.getElements().addAll(move,hLine,quadCurve,lineTo,lineTo1,quadCurve1,lineTo2,quadCurve2,lineTo3,quadCurve3);

        Path path1 = new Path();
        MoveTo move1 = new MoveTo(0,0);
        HLineTo hLine1 = new HLineTo(138);
        hLine1.setAbsolute(false);

        LineTo lineTo4 = new LineTo(60, -90);
        lineTo4.setAbsolute(false);

        path1.setStroke(Paint.valueOf(beam));
        path1.setStrokeWidth(20.0);
        path1.setStrokeLineJoin(StrokeLineJoin.BEVEL);
        path1.setStrokeLineCap(StrokeLineCap.SQUARE);
        path1.getElements().addAll(move1,hLine1,lineTo4);


        Path path2 = new Path();
        MoveTo move2 = new MoveTo(0,0);
        HLineTo hLine2 = new HLineTo(338);
        hLine2.setAbsolute(false);

        LineTo lineTo5 = new LineTo(60, -90);
        lineTo5.setAbsolute(false);

        path2.setStroke(Paint.valueOf(beam));
        path2.setStrokeWidth(20.0);
        path2.setStrokeLineJoin(StrokeLineJoin.BEVEL);
        path2.setStrokeLineCap(StrokeLineCap.SQUARE);
        path2.getElements().addAll(move2,hLine2,lineTo5);

        Rectangle rectangle0 = new Rectangle(10, 10, Color.RED);
        rectangle0.setTranslateX(-10);
        rectangle0.setTranslateY(-5);

        Rectangle rectangle1 = new Rectangle(10, 10, Color.RED);
        rectangle1.setTranslateX(-10);
        rectangle1.setTranslateY(-5);

        Rectangle rectangle2 = new Rectangle(10, 10, Color.RED);
        rectangle2.setTranslateX(-10);
        rectangle2.setTranslateY(-5);

        Rectangle rectangle3 = new Rectangle(45, 50, Paint.valueOf("#f2eada"));
        rectangle3.setStroke(Color.BLACK);
        rectangle3.setStrokeWidth(3.0);
        rectangle3.setRotate(34.8);
        rectangle3.setTranslateX(-16);
        rectangle3.setTranslateY(-432);

        Rectangle rectangle4 = new Rectangle(45, 50, Paint.valueOf("#f2eada"));
        rectangle4.setStroke(Color.BLACK);
        rectangle4.setStrokeWidth(3.0);
        rectangle4.setRotate(34.8);
        rectangle4.setTranslateX(184);
        rectangle4.setTranslateY(-432);

        Rectangle rectangle5 = new Rectangle(60, 60, Paint.valueOf("#d3d7d4"));
        rectangle5.setStroke(Color.BLACK);
        rectangle5.setStrokeWidth(3.0);
        rectangle5.setTranslateX(-36);
        rectangle5.setTranslateY(-32);

        Label label0 = new Label("SECR");
        label0.setFont(Font.font("Times New Roman",20.0));
        label0.setTranslateX(-30);
        label0.setTranslateY(30);

        Label label1 = new Label("iLinac");
        label1.setFont(Font.font("Times New Roman",20.0));
        label1.setTranslateX(150);
        label1.setTranslateY(30);

        Label label2 = new Label("BRing");
        label2.setFont(Font.font("Times New Roman",20.0));
        label2.setTranslateX(375);
        label2.setTranslateY(236);

        Label label3 = new Label("低能核结构谱仪");
        label3.setFont(Font.font("SimHei",20.0));
        label3.setTranslateX(160);
        label3.setTranslateY(-170);

        Label label4 = new Label("强流离子束谱仪");
        label4.setFont(Font.font("SimHei",20.0));
        label4.setTranslateX(360);
        label4.setTranslateY(-170);


        AnchorPane stackPane = new AnchorPane(path0,path1,path2,rectangle3,rectangle4,rectangle5,label0,label1,label2,label3,label4);
        AnchorPane an = new AnchorPane();
        an.getChildren().addAll(hBox,stackPane,rectangle0,rectangle1,rectangle2);

        AnchorPane.setTopAnchor(rectangle0, 300.0);
        AnchorPane.setLeftAnchor(rectangle0, 200.0);

        AnchorPane.setTopAnchor(rectangle1, 300.0);
        AnchorPane.setLeftAnchor(rectangle1, 200.0);

        AnchorPane.setTopAnchor(rectangle2, 300.0);
        AnchorPane.setLeftAnchor(rectangle2, 200.0);

        AnchorPane.setTopAnchor(rectangle3, 300.0);
        AnchorPane.setLeftAnchor(rectangle3, 200.0);

        AnchorPane.setTopAnchor(rectangle4, 300.0);
        AnchorPane.setLeftAnchor(rectangle4, 200.0);

        AnchorPane.setTopAnchor(stackPane, 300.0);
        AnchorPane.setLeftAnchor(stackPane, 200.0);

        rectangle3.setLayoutX(190);
        rectangle3.setLayoutY(-140);
        rectangle4.setLayoutX(400);
        rectangle4.setLayoutY(-140);

        PathTransition pt0 = new PathTransition();
        pt0.setNode(rectangle0);
        pt0.setPath(path0);
        pt0.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pt0.setDuration(Duration.millis(1500));
        pt0.setCycleCount(Animation.INDEFINITE);

        PathTransition pt1 = new PathTransition();
        pt1.setNode(rectangle1);
        pt1.setPath(path1);
        pt1.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pt1.setDuration(Duration.millis(800));
        pt1.setCycleCount(Animation.INDEFINITE);

        PathTransition pt2 = new PathTransition();
        pt2.setNode(rectangle2);
        pt2.setPath(path2);
        pt2.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pt2.setDuration(Duration.millis(1000));
        pt2.setCycleCount(Animation.INDEFINITE);



        Scene scene = new Scene(an);
        primaryStage.setHeight(900);
        primaryStage.setWidth(1300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("HiAF");
        primaryStage.show();




        play.setOnAction(event -> {
            pt0.play();
            pt1.play();
            pt2.play();
        });
        stop.setOnAction(event -> {
            pt0.stop();
            pt1.stop();
            pt2.stop();
        });
        pause.setOnAction(event -> {
            pt0.pause();
            pt1.pause();
            pt2.pause();
        });
    }

    public static void main(String[] args) {
        launch(args);
    }
}
