/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationgeo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HELLO
 */
public class SquareTest {
    
    public SquareTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
    @Test
    public void testAdd() {
        System.out.println("add");
        String s1 = "2";
        String s2 = "5";
        Square instance = new Square();
        int expResult = 8;
        int result = instance.add(s1, s2);
        assertEquals(expResult, result);
       
    }
    
    
        @Test(expected=NumberFormatException.class) 
    public void testAdd1() {
        System.out.println("add");
        String s1 = "foo";
        String s2 = "5";
        Square instance = new Square();
     //   int expResult = 0;
        int result = instance.add(s1, s2);
        //assertEquals(expResult, result);
       
    }
    
    
}
