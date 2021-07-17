/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notepad;

import java.awt.event.ActionEvent;
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
public class LookAndFeelMenuListenerTest {
    
    public LookAndFeelMenuListenerTest() {
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
     * Test of actionPerformed method, of class LookAndFeelMenuListener.
     */
    @Test
    public void testActionPerformed() {
        System.out.println("actionPerformed");
        ActionEvent ev = null;
        LookAndFeelMenuListener instance = null;
        instance.actionPerformed(ev);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
