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
public class FileOperationTest {
    
    public FileOperationTest() {
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
     * Test of isSave method, of class FileOperation.
     */
    @Test
    public void testIsSave() {
        System.out.println("isSave");
        FileOperation instance = null;
        boolean expResult = false;
        boolean result = instance.isSave();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSave method, of class FileOperation.
     */
    @Test
    public void testSetSave() {
        System.out.println("setSave");
        boolean saved = false;
        FileOperation instance = null;
        instance.setSave(saved);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFileName method, of class FileOperation.
     */
    @Test
    public void testGetFileName() {
        System.out.println("getFileName");
        FileOperation instance = null;
        String expResult = "";
        String result = instance.getFileName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFileName method, of class FileOperation.
     */
    @Test
    public void testSetFileName() {
        System.out.println("setFileName");
        String fileName = "";
        FileOperation instance = null;
        instance.setFileName(fileName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveFile method, of class FileOperation.
     */
    @Test
    public void testSaveFile() {
        System.out.println("saveFile");
        File temp = null;
        FileOperation instance = null;
        boolean expResult = false;
        boolean result = instance.saveFile(temp);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveThisFile method, of class FileOperation.
     */
    @Test
    public void testSaveThisFile() {
        System.out.println("saveThisFile");
        FileOperation instance = null;
        boolean expResult = false;
        boolean result = instance.saveThisFile();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveAsFile method, of class FileOperation.
     */
    @Test
    public void testSaveAsFile() {
        System.out.println("saveAsFile");
        FileOperation instance = null;
        boolean expResult = false;
        boolean result = instance.saveAsFile();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of openFile method, of class FileOperation.
     */
    @Test
    public void testOpenFile_File() {
        System.out.println("openFile");
        File temp = null;
        FileOperation instance = null;
        boolean expResult = false;
        boolean result = instance.openFile(temp);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of openFile method, of class FileOperation.
     */
    @Test
    public void testOpenFile_0args() {
        System.out.println("openFile");
        FileOperation instance = null;
        instance.openFile();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateStatus method, of class FileOperation.
     */
    @Test
    public void testUpdateStatus() {
        System.out.println("updateStatus");
        File temp = null;
        boolean saved = false;
        FileOperation instance = null;
        instance.updateStatus(temp, saved);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of confirmSave method, of class FileOperation.
     */
    @Test
    public void testConfirmSave() {
        System.out.println("confirmSave");
        FileOperation instance = null;
        boolean expResult = false;
        boolean result = instance.confirmSave();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of newFile method, of class FileOperation.
     */
    @Test
    public void testNewFile() {
        System.out.println("newFile");
        FileOperation instance = null;
        instance.newFile();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
