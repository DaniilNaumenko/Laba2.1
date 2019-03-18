/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 * @author daniil
 */
public class HumanTest {

    List<Food> list;
    public HumanTest() {
    }


    @Before
    public void prepareList() {
        list = new ArrayList<Food>();
        list.add(new Food("meat"));
        list.add(new Food("fuits"));
        list.add(new Food("fish"));
    }
    @Test
    public void eatRemovLastFoodFromList(){
        Human h = new Human();
        h.eat((ArrayList<Food>) list);
        assertFalse(list.contains(new Food("fish")));
        assertTrue(list.size()==2);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testSetName() {
        System.out.println("setName");
        String n = "";
        Human instance = new Human();
        instance.setName(n);
    }

    @Test
    public void testGetName() {
        System.out.println("getName");
        Human instance = new Human();
        String expResult = "kkkkkk";
        instance.setName(expResult);
        String result = instance.getName();
        assertEquals(expResult, result);

    }
}
