package com.thoughtworks;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Created by saileshdev on 04/07/2017.
 */
public class PrintDiamondWithNameTest {

    private DiamondWithName diamondWithName;
    private ByteArrayOutputStream outputStream;

    @Before
    public void setUp() throws Exception {
        this.diamondWithName = new DiamondWithName();
        this.outputStream = new ByteArrayOutputStream();
    }

    @Test
    public void shouldPrintDiamondInConsole(){

        System.setOut(new PrintStream(outputStream));
        String expected = "  *\n ***\nSailesh\n ***\n  *\n";

        diamondWithName.drawDiamondWithName(3);
        assertEquals(outputStream.toString(), expected);

    }


}
