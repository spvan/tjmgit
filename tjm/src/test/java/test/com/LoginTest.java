/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com;

import com.mycompany.tjm.Login;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author spvan_92fxbhk
 */
public class LoginTest {
    Login log;
    
    public LoginTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
        log = new Login();
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }
    @Test
    public void testName(){
        log.setUsername("spvanitha80");
        assertEquals("spvanitha80" , log.getUsername());
        
        
    }
}
