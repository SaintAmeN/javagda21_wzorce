package com.javagda21.wzorce.behavioral.strategy.zad4;

public class MediumSetting implements IGraphicsSetting {
    @Override
    public int getNeededProcessingPower() {
        return 0;
    }

    @Override
    public void processFrame(int[][] frame) {
        for (int i = 0; i < frame.length; i++) {
            for (int j = 0; j < frame[i].length; j++) {
                frame[i][j] = 2;
            }
        }
    }
}
