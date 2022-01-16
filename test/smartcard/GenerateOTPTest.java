/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartcard;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author V Hariharan
 */
public class GenerateOTPTest {
    
    public GenerateOTPTest() {
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
     * Test of sendOTP method, of class GenerateOTP.
     */
    @Test
    public void testSendOTP() {
        System.out.println("sendOTP");
        int length = 0;
        char[] expResult = null;
        char[] result = GenerateOTP.sendOTP(length);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class GenerateOTP.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] ar = null;
        GenerateOTP.main(ar);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
