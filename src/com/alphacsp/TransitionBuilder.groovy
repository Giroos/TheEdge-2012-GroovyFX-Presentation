package com.alphacsp

import javafx.scene.shape.LineTo
import javafx.scene.shape.MoveTo
import javafx.scene.shape.Path
import javafx.util.Duration
import javafx.animation.*

class TransitionBuilder {

    static def DURATION = Duration.millis(700)
    static def WINDOW_WIDTH = 1280
    static def WINDOW_HEIGHT = 800

    static def fadeTransition(node){
        def trans = new FadeTransition(DURATION, node)
        trans.setFromValue(0)
        trans.setToValue(1)
        return trans
    }

    static def scaleTransition(node){
        def trans = new ScaleTransition(DURATION, node)
        trans.setFromX(0)
        trans.setFromY(0)
        trans.setToX(1)
        trans.setToY(1)
        return trans
    }

    static def rotateTransition(node){
        def rt = new RotateTransition(DURATION, node)
        rt.setByAngle(360)
        return rt
    }

    static def scaleRotateParallelTransition(node){
        return new ParallelTransition((javafx.scene.Node)node , scaleTransition(node), rotateTransition(node))
    }

    static def scaleFromRightTransition(node){
        return new ParallelTransition((javafx.scene.Node)node , scaleTransition(node), pathFromRightTransition(node))
    }

    static def scaleRotatePathTransition(node){
        return new ParallelTransition((javafx.scene.Node)node , scaleTransition(node), rotateTransition(node), pathFromLeftTransition(node))
    }

    static def pathFromLeftTransition(node){
        def path = new Path()
        MoveTo moveTo = new MoveTo();
        moveTo.setX(WINDOW_WIDTH / -2);
        moveTo.setY(WINDOW_HEIGHT / 2);
        LineTo lineTo = new LineTo();
        lineTo.setX(WINDOW_WIDTH /2);
        lineTo.setY(WINDOW_HEIGHT / 2);
        path.getElements().addAll(moveTo, lineTo)
        def trans = new PathTransition()
        trans.setNode(node)
        trans.setDuration(DURATION)
        trans.setPath(path)
        return trans
    }

    static def pathFromRightTransition(node){
        def path = new Path()
        MoveTo moveTo = new MoveTo();
        moveTo.setX(WINDOW_WIDTH);
        moveTo.setY(WINDOW_HEIGHT);
        LineTo lineTo = new LineTo();
        lineTo.setX(WINDOW_WIDTH /2);
        lineTo.setY(WINDOW_HEIGHT / 2);
        path.getElements().addAll(moveTo, lineTo)
        def trans = new PathTransition()
        trans.setNode(node)
        trans.setDuration(DURATION)
        trans.setPath(path)
        return trans
    }
}
