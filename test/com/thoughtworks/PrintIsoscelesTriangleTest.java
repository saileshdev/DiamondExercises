package com.thoughtworks;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Created by saileshdev on 04/07/2017.
 */
public class PrintIsoscelesTriangleTest {

    private IsoscelesTriangle isoscelesTriangle;
    private ByteArrayOutputStream outputStream;

    @Before
    public void setUp() throws Exception {
        this.isoscelesTriangle = new IsoscelesTriangle();
        this.outputStream = new ByteArrayOutputStream();
    }

    @Test
    public void shouldPrintIsoscelesTriangleInConsole(){

        System.setOut(new PrintStream(outputStream));
        String expected = "  *\n ***\n*****\n";

        isoscelesTriangle.drawCenterTriangle(3);
        assertEquals(outputStream.toString(), expected);

    }


}
