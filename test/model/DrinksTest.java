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
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.*;
import static org.mockito.Mockito.when;

/**
 *
 * @author Meem
 */
public class DrinksTest {
    
    public DrinksTest() {
    }
    
    @Before
    public void setUp() {
        Drinks instance = new Drinks(8,56.0,"klaus","Hot-Drink");
        
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
//    @BeforeEach
//    public void setUp() {
//        Drinks instance = new Drinks(8,56.0,"klaus","Hot-Drink");
//    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getId method, of class Drinks.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Drinks instance = new Drinks(8,56.0,"klaus","Hot-Drink");
        int expResult = 8;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Drinks.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 8;
        Drinks instance = new Drinks(8,56.0,"klaus","Hot-Drink");
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getCost method, of class Drinks.
     */
    @Test
    public void testGetCost() {
        System.out.println("getCost");
        double expResult = 56.0;
        Drinks instance;
        instance = Mockito.mock(Drinks.class);
        when(instance.getCost()).thenReturn(56.0);
        double result = instance.getCost();
        assertEquals(expResult, result, 56.0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setCost method, of class Drinks.
     */
    @Test
    public void testSetCost() {
        System.out.println("setCost");
        double cost = 56.0;
        Drinks instance = new Drinks(8,cost,"klaus","Hot-Drink");
        instance.setCost(cost);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getType method, of class Drinks.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        Drinks instance = new Drinks(8,56.0,"Hot-Drink","klaus");
        String expResult = "Hot-Drink";
        String result = instance.getType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setType method, of class Drinks.
     */
    @Test
    public void testSetType() {
        System.out.println("setType");
        String type = "Hot-Drink";
        Drinks instance = new Drinks(8,56.0,"klaus",type);
        instance.setType(type);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Drinks.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Drinks instance = new Drinks(8,56.0,"Hot-Drink","klaus");
        String expResult = "klaus";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Drinks.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "abcd";
        Drinks instance = new Drinks(1,2.0,name,"coca-cola");
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
