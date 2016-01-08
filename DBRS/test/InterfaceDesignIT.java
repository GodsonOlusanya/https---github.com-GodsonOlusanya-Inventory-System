/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author it
 */
public class InterfaceDesignIT {
    
    /**
     *
     */
    public InterfaceDesignIT() {
    }
    
    /**
     *
     */
    @BeforeClass
    public static void setUpClass() {
    }
    
    /**
     *
     */
    @AfterClass
    public static void tearDownClass() {
    }
    
    /**
     *
     */
    @Before
    public void setUp() {
    }
    
    /**
     *
     */
    @After
    public void tearDown() {
    }

    /**
     * Test of updateTable method, of class InterfaceDesign.
     */
    @Test
    public void testUpdateTable() {
        System.out.println("updateTable");
        InterfaceDesign instance = new InterfaceDesign();
        instance.updateTable();
        
    }

    /**
     * Test of frame method, of class InterfaceDesign.
     */
    @Test
    public void testFrame() {
        System.out.println("frame");
        InterfaceDesign instance = new InterfaceDesign();
        instance.frame();
        }
    
}
