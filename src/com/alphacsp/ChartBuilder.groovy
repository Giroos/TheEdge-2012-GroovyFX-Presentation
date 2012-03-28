package com.alphacsp

import groovyx.javafx.SceneGraphBuilder
import javafx.collections.FXCollections
import javafx.event.EventHandler
import javafx.scene.chart.CategoryAxis
import javafx.scene.chart.NumberAxis
import javafx.scene.chart.XYChart
import javafx.scene.input.MouseButton
import javafx.scene.media.AudioSpectrumListener

class ChartBuilder {

    def getChart(){

        def createList = FXCollections.&observableArrayList
        def chartData = createList.call()
        for (def i in 1..10){
            chartData.add(new XYChart.Series("category",
                    createList(new XYChart.Data("group" ,i * 8))))
        }


        def sceneGraphBuilder = new SceneGraphBuilder()


        sceneGraphBuilder.region(){
            barChart(prefHeight:800, prefWidth:1280, xAxis: new CategoryAxis(), yAxis: new NumberAxis(0,100,1),
                    data: chartData, legendVisible:false, animated:false,
                    onMouseClicked: {event ->
                        if (event.getButton().equals(MouseButton.MIDDLE)){
                            pl.play()
                        }
                        else{
                            pl.stop()
                        }
                    } as EventHandler)


            mediaView{
                pl = player(source: "file:///test/audio/graphAudio.mp3",
                        audioSpectrumListener: {timestamp, duration, magnitudes, phases ->
                            for (def i in 0..9){
                                chartData.get(i).getData().get(0).setYValue(magnitudes[(i+1)*5]+60)
                            }
                        }as AudioSpectrumListener)
            }
        }
    }
}





















