package com.javagda21.wzorce.behavioral.strategy.zad4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        GraphicsCard graphicsCard = new GraphicsCard();
        boolean isWorking = true;

        int[][] frame = new int[5][5];
        for (int i = 0; i < frame.length; i++) {
            for (int j = 0; j < frame[i].length; j++) {
                frame[i][j] = 0;
            }
        }

        while (isWorking){
            String line = scanner.nextLine();

            String[] words = line.split(" ", 2);
            if (line.startsWith("change")){
                if(words[1].equalsIgnoreCase("low")){
                    graphicsCard.setGraphicsSetting(new LowSetting());
                }else if(words[1].equalsIgnoreCase("medium")){
                    graphicsCard.setGraphicsSetting(new MediumSetting());
                }if(words[1].equalsIgnoreCase("high")){
                    graphicsCard.setGraphicsSetting(new HdSetting());
                }
            }else if(line.startsWith("process")){
                graphicsCard.processFrame(frame);
                for (int i = 0; i < frame.length; i++) {
                    for (int j = 0; j < frame[i].length; j++) {
                        System.out.print(frame[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
