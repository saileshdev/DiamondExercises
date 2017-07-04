package com.thoughtworks;

/**
 * Created by saileshdev on 04/07/2017.
 */
public class Diamond {

    public void drawDiamond(int numberOfLines){
        for(int i = 0; i < numberOfLines ; i++) {
            drawCenterLine(i, numberOfLines);
        }

        reverseDraw(numberOfLines);
    }

    public void drawCenterLine(int i, int numberOfLines){
        int numberOfSpaces = numberOfSpaces(i, numberOfLines);
        int numAsterisk = findNumberOfAsterisk(i);

        printSpaces(numberOfSpaces);
        printAsterisks(numAsterisk);
        System.out.println();
    }

    private void reverseDraw(int numberOfLines){

        for(int i = numberOfLines - 2; i >= 0 ; i--) {
            drawCenterLine(i, numberOfLines);
        }

    }

    private int numberOfSpaces(int i, int numberOfLines){
        return numberOfLines - i - 1;
    }

    private int findNumberOfAsterisk(int i){
        return 2 * i + 1;
    }

    public void printSpaces(int numSpaces){
        for(int i = 1; i <= numSpaces; i++){
            System.out.print(" ");
        }
    }

    public  void printAsterisks(int numAsterisk){
        for(int i = 1; i <= numAsterisk; i++){
            System.out.print("*");
        }
    }
}
