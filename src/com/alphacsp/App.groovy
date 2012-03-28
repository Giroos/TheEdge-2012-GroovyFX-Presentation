package com.alphacsp


import groovyx.javafx.SceneGraphBuilder
import groovyx.javafx.GroovyFX
import javafx.scene.input.MouseButton



GroovyFX.start{
    def sg = new SceneGraphBuilder();
    sg.stage(title: "GroovyFx Presentation",visible: true, fullScreen:true) {
        def index = 0
        sc = scene(fill:white,
                onMouseClicked: {event ->
                    def parentNode = sc.getSceneRoot().getChildren()
                    def slide
                    if (event.getButton().equals(MouseButton.PRIMARY)){
                        slide = Slide.SLIDES[index]
                        if (!parentNode.contains(slide.getNode())){
                            parentNode.add(slide.getNode())
                            slide.getAnimation().play()
                            index++
                        }
                    }
                    else if (event.getButton().equals(MouseButton.SECONDARY)){
                        index--
                        slide = Slide.SLIDES[index]
                        parentNode.remove(slide.getNode())
                    }
                })
    }
}
