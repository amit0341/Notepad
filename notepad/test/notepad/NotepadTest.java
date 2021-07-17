/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notepad;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
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
public class NotepadTest {
    
    public NotepadTest() {
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
     * Test of goTo method, of class Notepad.
     */
    @Test
    public void testGoTo() {
        System.out.println("goTo");
        Notepad instance = new Notepad();
        instance.goTo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actionPerformed method, of class Notepad.
     */
    @Test
    public void testActionPerformed() {
        System.out.println("actionPerformed");
        ActionEvent ev = null;
        Notepad instance = new Notepad();
        instance.actionPerformed(ev);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showBackgroundColorDialog method, of class Notepad.
     */
    @Test
    public void testShowBackgroundColorDialog() {
        System.out.println("showBackgroundColorDialog");
        Notepad instance = new Notepad();
        instance.showBackgroundColorDialog();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showForegroundColorDialog method, of class Notepad.
     */
    @Test
    public void testShowForegroundColorDialog() {
        System.out.println("showForegroundColorDialog");
        Notepad instance = new Notepad();
        instance.showForegroundColorDialog();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createMenuItem method, of class Notepad.
     */
    @Test
    public void testCreateMenuItem_4args() {
        System.out.println("createMenuItem");
        String s = "";
        int key = 0;
        JMenu toMenu = null;
        ActionListener al = null;
        Notepad instance = new Notepad();
        JMenuItem expResult = null;
        JMenuItem result = instance.createMenuItem(s, key, toMenu, al);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createMenuItem method, of class Notepad.
     */
    @Test
    public void testCreateMenuItem_5args() {
        System.out.println("createMenuItem");
        String s = "";
        int key = 0;
        JMenu toMenu = null;
        int aclKey = 0;
        ActionListener al = null;
        Notepad instance = new Notepad();
        JMenuItem expResult = null;
        JMenuItem result = instance.createMenuItem(s, key, toMenu, aclKey, al);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createCheckBoxMenuItem method, of class Notepad.
     */
    @Test
    public void testCreateCheckBoxMenuItem() {
        System.out.println("createCheckBoxMenuItem");
        String s = "";
        int key = 0;
        JMenu toMenu = null;
        ActionListener al = null;
        Notepad instance = new Notepad();
        JCheckBoxMenuItem expResult = null;
        JCheckBoxMenuItem result = instance.createCheckBoxMenuItem(s, key, toMenu, al);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createMenu method, of class Notepad.
     */
    @Test
    public void testCreateMenu() {
        System.out.println("createMenu");
        String s = "";
        int key = 0;
        JMenuBar toMenuBar = null;
        Notepad instance = new Notepad();
        JMenu expResult = null;
        JMenu result = instance.createMenu(s, key, toMenuBar);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createMenuBar method, of class Notepad.
     */
    @Test
    public void testCreateMenuBar() {
        System.out.println("createMenuBar");
        JFrame f = null;
        Notepad instance = new Notepad();
        instance.createMenuBar(f);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Notepad.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] s = null;
        Notepad.main(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
