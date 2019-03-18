/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author daniil
 */
public class ProgrammerTest {
    
    public ProgrammerTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void shouldReturnNonNullValue() {
        Programmer programmer = new Programmer();

        assertNotNull(programmer.coding());
    }

    @Test
    public void shouldReturnStringWithLengthMoreThanOne() {
        Programmer programmer = new Programmer();

        assertTrue(programmer.coding().length() > 1);
    }
    
}
