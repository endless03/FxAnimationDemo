package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.shape.*;
import javafx.stage.Stage;

/**
 * @Author: Arvin Shern
 * @Date: 2022/4/14
 * @Time: 21:48
 * @Description:
 */
public class PathDemo extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        HBox hBox = new HBox(20);
        hBox.setLayoutX(50.0);
        hBox.setLayoutY(50.0);
        Button play = new Button("Play");
        Button stop = new Button("Stop");
        Button pause = new Button("Pause");
        hBox.getChildren().addAll(play,stop,pause);

        Path path = new Path();
        path.setLayoutX(200);
        path.setLayoutY(200);
        MoveTo move = new MoveTo(0,0);
        HLineTo hLine = new HLineTo(200);
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

        QuadCurveTo quadCurve3 = new QuadCurveTo(51, -126,197, -147);
        quadCurve3.setAbsolute(false);



        path.getElements().addAll(move,hLine,quadCurve,lineTo,lineTo1,quadCurve1,lineTo2,quadCurve2,lineTo3,quadCurve3);
        AnchorPane an = new AnchorPane();
        an.getChildren().addAll(hBox,path);
        Scene scene = new Scene(an);
        primaryStage.setHeight(900);
        primaryStage.setWidth(900);
        primaryStage.setScene(scene);
        primaryStage.setTitle("PathDemo");
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
