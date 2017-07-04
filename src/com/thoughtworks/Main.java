package com.thoughtworks;

public class Main {

    public static void main(String[] args) {
	// write your code here

        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle();

        System.out.println("Question: Draw isosceles triangle to the console(Ex: n=3)");
        isoscelesTriangle.drawCenterTriangle(3);

        Diamond diamond = new Diamond();

        System.out.println("Question: Draw diamond to the console(Ex: n=3)");
        diamond.drawDiamond(3);

        DiamondWithName diamondWithName = new DiamondWithName();

        System.out.println("Question: Draw a centerd diamond with a name in place of the middle line(Ex: n=3)");
        diamondWithName.drawDiamondWithName(3);

    }
}
