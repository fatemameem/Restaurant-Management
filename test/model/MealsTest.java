/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Meem
 */
public class MealsTest {
    
    public MealsTest() {
    }
    
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
     * Test of getId method, of class Meals.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Meals instance = new Meals(8,56.0,"klaus","Burger");
        int expResult = 8;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Meals.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 8;
        Meals instance = new Meals(8,56.0,"klaus","Burger");
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getCost method, of class Meals.
     */
    @Test
    public void testGetCost() {
        System.out.println("getCost");
        Meals instance = new Meals(8,56.0,"klaus","Burger");
        double expResult = 56.0;
        double result = instance.getCost();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setCost method, of class Meals.
     */
    @Test
    public void testSetCost() {
        System.out.println("setCost");
        double cost = 56.0;
        Meals instance = new Meals(8,56.0,"klaus","Burger");
        instance.setCost(cost);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getType method, of class Meals.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        Meals instance = new Meals(8,56.0,"Burger","klaus");
        String expResult = "Burger";
        String result = instance.getType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setType method, of class Meals.
     */
    @Test
    public void testSetType() {
        System.out.println("setType");
        String type = "Burger";
        Meals instance = new Meals(8,56.0,"klaus","Burger");
        instance.setType(type);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Meals.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Meals instance = new Meals(8,56.0,"Burger","klaus");
        String expResult = "klaus";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Meals.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "klaus";
        Meals instance = new Meals(8,56.0,"klaus","Burger");
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
