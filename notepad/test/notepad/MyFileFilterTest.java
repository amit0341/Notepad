/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notepad;

import java.io.File;
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
public class MyFileFilterTest {
    
    public MyFileFilterTest() {
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
     * Test of accept method, of class MyFileFilter.
     */
    @Test
    public void testAccept() {
        System.out.println("accept");
        File f = null;
        MyFileFilter instance = new MyFileFilter();
        boolean expResult = false;
        boolean result = instance.accept(f);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class MyFileFilter.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        MyFileFilter instance = new MyFileFilter();
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescription method, of class MyFileFilter.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String desc = "";
        MyFileFilter instance = new MyFileFilter();
        instance.setDescription(desc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setExtension method, of class MyFileFilter.
     */
    @Test
    public void testSetExtension() {
        System.out.println("setExtension");
        String ext = "";
        MyFileFilter instance = new MyFileFilter();
        instance.setExtension(ext);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
