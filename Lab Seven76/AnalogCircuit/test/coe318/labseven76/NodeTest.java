/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package coe318.labseven76;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author poopyface
 */
public class NodeTest {
    
    public NodeTest() {
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
    public void testGetNode() {
        System.out.println("getNode");
        Node instance = new Node();
        int expected = 0;
        int result = instance.getNode();
        assertEquals(expected, result);
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Node instance = new Node();
        String expected = "1"; //is 1 because of the previously defined node
        String result = instance.toString();
        assertEquals(expected, result);
    }
    
}
