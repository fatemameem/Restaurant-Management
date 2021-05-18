/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javafx.stage.Stage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Meem
 */
public class RestaurantTest {
    
    public RestaurantTest() {
    }
//    Restaurant r = new Restaurant(); 
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of start method, of class Restaurant.
     */
    @Test
    public void testStart() throws Exception {
        System.out.println("start");
//        Stage stage = null;
//        Restaurant instance = new Restaurant();
//        instance.start(stage);
        
//        System.out.println("The method has started properly");
//        FxAssert.verifyThat(".button", LabeledMatchers.hasText("click me!"));
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Restaurant.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Restaurant.main(args);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("The method has started properly");
//        fail("The test case is a prototype.");
    }
    
}
