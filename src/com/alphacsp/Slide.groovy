package com.alphacsp

import javafx.animation.Animation
import javafx.animation.FadeTransition
import javafx.scene.Node
import javafx.scene.effect.BlendMode
import javafx.scene.image.Image
import javafx.scene.image.ImageView
import javafx.scene.paint.Color
import javafx.scene.shape.Rectangle

class Slide {

    static def SLIDES = [
            {
                def iv1 = new ImageView(new Image("../../../images/001.jpg"))
                new Slide(iv1, TransitionBuilder.fadeTransition(iv1))
            }.call(),
            {
                def iv2 = new ImageView(new Image("../../../images/002.jpg"))
                new Slide(iv2, TransitionBuilder.fadeTransition(iv2))
            }.call(),
            /*{
                def iv2 = new ImageView(new Image("../../../images/003.jpg"))
                new Slide(iv2, TransitionBuilder.scaleTransition(iv2))
            }.call(),*/
            {
                def iv2 = new ImageView(new Image("../../../images/004.jpg"))
                new Slide(iv2, TransitionBuilder.pathFromLeftTransition(iv2))
            }.call(),
            {
                def iv2 = new ImageView(new Image("../../../images/trans.gif"))
                new Slide(iv2, TransitionBuilder.fadeTransition(iv2))
            }.call(),
            {
                def iv2 = new ImageView(new Image("../../../images/005.jpg"))
                new Slide(iv2, TransitionBuilder.scaleTransition(iv2))
            }.call(),
            {
                def iv2 = new ImageView(new Image("../../../images/006.jpg"))
                new Slide(iv2, TransitionBuilder.scaleTransition(iv2))
            }.call(),
            {
                def iv2 = new ImageView(new Image("../../../images/013.jpg"))
                new Slide(iv2, TransitionBuilder.scaleTransition(iv2))
            }.call(),
            {
                def iv2 = new Rectangle()
                iv2.setFill(Color.BLACK)
                iv2.setHeight(TransitionBuilder.WINDOW_HEIGHT)
                iv2.setWidth(TransitionBuilder.WINDOW_WIDTH)
                new Slide(iv2, new FadeTransition())
            }.call(),
            {
                def iv2 = new ImageView(new Image("../../../images/008.jpg"))
                new Slide(iv2, TransitionBuilder.scaleRotateParallelTransition(iv2))
            }.call(),
            {
                def iv2 = new ImageView(new Image("../../../images/009.jpg"))
                new Slide(iv2, new FadeTransition())
            }.call(),
            {
                def iv2 = new ImageView(new Image("../../../images/010.jpg"))
                new Slide(iv2, TransitionBuilder.scaleFromRightTransition(iv2))
            }.call(),
           /* {
                def iv2 = new ImageView(new Image("../../../images/011.jpg"))
                new Slide(iv2, new FadeTransition())
            }.call(),
            {
                def iv2 = new ImageView(new Image("../../../images/010.jpg"))
                new Slide(iv2, new FadeTransition())
            }.call(),*/
            {
                def iv2 = new ImageView(new Image("../../../images/Arrow_JFX_01.gif"))
                new Slide(iv2, TransitionBuilder.pathFromLeftTransition(iv2))
            }.call(),
            {
                def iv2 = new ImageView(new Image("../../../images/Arrow_JFX_02.gif"))
                new Slide(iv2, TransitionBuilder.pathFromLeftTransition(iv2))
            }.call(),
            {
                def iv2 = new ImageView(new Image("../../../images/Arrow_JFX_03.gif"))
                new Slide(iv2, TransitionBuilder.fadeTransition(iv2))
            }.call(),
            {
                def iv2 = new ImageView(new Image("../../../images/Arrow_JFX_04.gif"))
                new Slide(iv2, TransitionBuilder.pathFromLeftTransition(iv2))
            }.call(),
            {
                def iv2 = new ImageView(new Image("../../../images/Arrow_JFX_05.gif"))
                new Slide(iv2, TransitionBuilder.pathFromLeftTransition(iv2))
            }.call(),
            {
                def iv2 = new ImageView(new Image("../../../images/Arrow_JFX_06.gif"))
                new Slide(iv2, TransitionBuilder.fadeTransition(iv2))
            }.call(),
            {
                def iv2 = new ImageView(new Image("../../../images/Arrow_JFX_07.gif"))
                new Slide(iv2, TransitionBuilder.pathFromLeftTransition(iv2))
            }.call(),
            {
                def iv2 = new ImageView(new Image("../../../images/Arrow_JFX_08.gif"))
                new Slide(iv2, TransitionBuilder.fadeTransition(iv2))
            }.call(),
            {
                def iv2 = new ImageView(new Image("../../../images/Arrow_JFX_09.gif"))
                new Slide(iv2, TransitionBuilder.pathFromLeftTransition(iv2))
            }.call(),
            {
                def iv2 = new ImageView(new Image("../../../images/Arrow_JFX_10.gif"))
                new Slide(iv2,TransitionBuilder.fadeTransition(iv2))
            }.call(),
            {
                def iv2 = new ImageView(new Image("../../../images/Arrow_JFX_11.gif"))
                new Slide(iv2, TransitionBuilder.pathFromLeftTransition(iv2))
            }.call(),
            {
                def iv2 = new ImageView(new Image("../../../images/Arrow_JFX_12.gif"))
                new Slide(iv2, TransitionBuilder.pathFromLeftTransition(iv2))
            }.call(),
            {
                def iv2 = new ImageView(new Image("../../../images/Arrow_JFX_13.gif"))
                new Slide(iv2, TransitionBuilder.fadeTransition(iv2))
            }.call(),
            {
                def iv2 = new ImageView(new Image("../../../images/012.jpg"))
                new Slide(iv2, TransitionBuilder.fadeTransition(iv2))
            }.call(),
            {
                def iv2 = new ImageView(new Image("../../../images/GFX_blue.gif"))
                iv2.setBlendMode(BlendMode.DIFFERENCE)
                new Slide(iv2, TransitionBuilder.fadeTransition(iv2))
            }.call(),
            {
                def iv2 = new ImageView(new Image("../../../images/014.jpg"))
                new Slide(iv2, TransitionBuilder.scaleFromRightTransition(iv2))
            }.call(),
            {
                def iv2 = new ImageView(new Image("../../../images/015.jpg"))
                new Slide(iv2, TransitionBuilder.scaleRotateParallelTransition(iv2))
            }.call(),
            {
                def iv2 = new ImageView(new Image("../../../images/015_1.jpg"))
                new Slide(iv2, TransitionBuilder.scaleRotatePathTransition(iv2))
            }.call(),
            {
                def iv2 = new ImageView(new Image("../../../images/016.jpg"))
                new Slide(iv2, TransitionBuilder.fadeTransition(iv2))
            }.call(),
            {
                def iv2 = new ImageView(new Image("../../../images/017.jpg"))
                new Slide(iv2, new FadeTransition())
            }.call(),
            {
                def iv2 = new ImageView(new Image("../../../images/GFX_arrow_01.gif"))
                new Slide(iv2, TransitionBuilder.fadeTransition(iv2))
            }.call(),
            {
                def iv2 = new ImageView(new Image("../../../images/GFX_arrow_02.gif"))
                new Slide(iv2, TransitionBuilder.pathFromLeftTransition(iv2))
            }.call(),
            {
                def iv2 = new ImageView(new Image("../../../images/GFX_arrow_03.gif"))
                new Slide(iv2, TransitionBuilder.pathFromLeftTransition(iv2))
            }.call(),
            {
                def iv2 = new ImageView(new Image("../../../images/norris.gif"))
                //iv2.setLayoutX(800)
                //iv2.setLayoutY(250)
                new Slide(iv2, TransitionBuilder.scaleRotateParallelTransition(iv2))
            }.call(),
            {
                def iv2 = new ImageView(new Image("../../../images/GFX_arrow_04.gif"))
                new Slide(iv2, TransitionBuilder.pathFromLeftTransition(iv2))
            }.call(),
            {
                def iv2 = new ImageView(new Image("../../../images/GFX_arrow_05.gif"))
                new Slide(iv2, TransitionBuilder.pathFromLeftTransition(iv2))
            }.call(),
            {
                def iv2 = new ImageView(new Image("../../../images/GFX_arrow_06.gif"))
                new Slide(iv2, TransitionBuilder.pathFromLeftTransition(iv2))
            }.call(),
            /*{
                def iv2 = new ImageView(new Image("../../../images/017.jpg"))
                new Slide(iv2, new FadeTransition())
            }.call(),*/
            {
                def iv2 = new ImageView(new Image("../../../images/016.jpg"))
                new Slide(iv2, TransitionBuilder.fadeTransition(iv2))
            }.call(),
            {
                def cb = new ChartBuilder()
                def iv3 = cb.getChart()
                new Slide(iv3, new FadeTransition())
            }.call(),
            {
                def iv2 = new ImageView(new Image("../../../images/018.jpg"))
                new Slide(iv2, new FadeTransition())
            }.call(),
            {
                def iv2 = new ImageView(new Image("../../../images/GFX_arrow_07.gif"))
                new Slide(iv2, TransitionBuilder.pathFromLeftTransition(iv2))
            }.call(),
            {
                def iv2 = new ImageView(new Image("../../../images/GFX_arrow_08.gif"))
                iv2.setBlendMode(BlendMode.DIFFERENCE)
                new Slide(iv2, TransitionBuilder.fadeTransition(iv2))
            }.call(),
            {
                def iv2 = new ImageView(new Image("../../../images/019.jpg"))
                new Slide(iv2, TransitionBuilder.scaleRotatePathTransition(iv2))
            }.call(),
            {
                def iv2 = new ImageView(new Image("../../../images/020.jpg"))
                new Slide(iv2, TransitionBuilder.fadeTransition(iv2))
            }.call(),
            {
                def iv1 = new ImageView(new Image("../../../images/021.jpg"))
                new Slide(iv1, TransitionBuilder.fadeTransition(iv1))
            }.call()]



    Node node
    Animation animation


    Slide(Node node, Animation animation) {
        this.node = node
        this.animation = animation
    }

}
