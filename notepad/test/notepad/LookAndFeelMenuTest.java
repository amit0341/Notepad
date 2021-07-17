/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notepad;

import java.awt.Component;
import javax.swing.JMenu;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Amit
 */
public class LookAndFeelMenuTest {
    
    public LookAndFeelMenuTest() {
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

    /**
     * Test of createLookAndFeelMenuItem method, of class LookAndFeelMenu.
     */
    @Test
    public void testCreateLookAndFeelMenuItem() {
        System.out.println("createLookAndFeelMenuItem");
        JMenu jmenu = null;
        Component cmp = null;
        LookAndFeelMenu.createLookAndFeelMenuItem(jmenu, cmp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
