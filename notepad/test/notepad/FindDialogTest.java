/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notepad;

import java.awt.Component;
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
public class FindDialogTest {
    
    public FindDialogTest() {
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
     * Test of enableDisableButtons method, of class FindDialog.
     */
    @Test
    public void testEnableDisableButtons() {
        System.out.println("enableDisableButtons");
        FindDialog instance = null;
        instance.enableDisableButtons();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actionPerformed method, of class FindDialog.
     */
    @Test
    public void testActionPerformed() {
        System.out.println("actionPerformed");
        ActionEvent ev = null;
        FindDialog instance = null;
        instance.actionPerformed(ev);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findNext method, of class FindDialog.
     */
    @Test
    public void testFindNext() {
        System.out.println("findNext");
        FindDialog instance = null;
        int expResult = 0;
        int result = instance.findNext();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findNextWithSelection method, of class FindDialog.
     */
    @Test
    public void testFindNextWithSelection() {
        System.out.println("findNextWithSelection");
        FindDialog instance = null;
        instance.findNextWithSelection();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of replaceNext method, of class FindDialog.
     */
    @Test
    public void testReplaceNext() {
        System.out.println("replaceNext");
        FindDialog instance = null;
        instance.replaceNext();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of replaceAllNext method, of class FindDialog.
     */
    @Test
    public void testReplaceAllNext() {
        System.out.println("replaceAllNext");
        FindDialog instance = null;
        int expResult = 0;
        int result = instance.replaceAllNext();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showDialog method, of class FindDialog.
     */
    @Test
    public void testShowDialog() {
        System.out.println("showDialog");
        Component parent = null;
        boolean isFind = false;
        FindDialog instance = null;
        boolean expResult = false;
        boolean result = instance.showDialog(parent, isFind);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
