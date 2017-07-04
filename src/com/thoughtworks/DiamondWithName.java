package com.thoughtworks;

/**
 * Created by saileshdev on 04/07/2017.
 */
public class DiamondWithName {

    public void drawDiamondWithName(int numberOfLines){
        Diamond diamond = new Diamond();

        diamond.drawCenterTriangle(numberOfLines);
        drawNameCenterOfDiamond();
        diamond.reverseDraw(numberOfLines);
    }

    private void drawNameCenterOfDiamond(){
        System.out.println("Sailesh");
    }
}
