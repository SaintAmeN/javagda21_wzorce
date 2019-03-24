package com.javagda21.wzorce.behavioral.strategy.zad4;

public class GraphicsCard {
    private IGraphicsSetting graphicsSetting;

    public GraphicsCard() {
        this.graphicsSetting = new LowSetting();
    }

    public void setGraphicsSetting(IGraphicsSetting graphicsSetting) {
        this.graphicsSetting = graphicsSetting;
    }

    public void processFrame(int[][] frame){
        graphicsSetting.processFrame(frame);
    }
}
