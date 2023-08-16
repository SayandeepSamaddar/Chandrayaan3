package com.mycompany.chandrayaan3_tddassesment;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for constructor.
 */
public class GalacticSpaceCraftTestConstructor {

    @Test
    public void testConstructorWithInitialDirectionN() {
        int[] initialPosition = {0, 0, 0};
        GalacticSpaceCraft spacecraft = new GalacticSpaceCraft(initialPosition, "N");
        
        assertEquals("N", spacecraft.getDirection());
        assertEquals(initialPosition, spacecraft.getPosition());
    }

    @Test
    public void testConstructorWithInitialDirectionS() {
        int[] initialPosition = {0, 0, 0};
        GalacticSpaceCraft spacecraft = new GalacticSpaceCraft(initialPosition, "S");
        
        assertEquals("S", spacecraft.getDirection());
        assertEquals(initialPosition, spacecraft.getPosition());
    }

    @Test
    public void testConstructorWithInitialDirectionE() {
        int[] initialPosition = {0, 0, 0};
        GalacticSpaceCraft spacecraft = new GalacticSpaceCraft(initialPosition, "E");
        
        assertEquals("E", spacecraft.getDirection());
        assertEquals(initialPosition, spacecraft.getPosition());
    }

    @Test
    public void testConstructorWithInitialDirectionW() {
        int[] initialPosition = {0, 0, 0};
        GalacticSpaceCraft spacecraft = new GalacticSpaceCraft(initialPosition, "W");
        
        assertEquals("W", spacecraft.getDirection());
        assertEquals(initialPosition, spacecraft.getPosition());
    }

    @Test
    public void testConstructorWithInitialDirectionUp() {
        int[] initialPosition = {0, 0, 0};
        GalacticSpaceCraft spacecraft = new GalacticSpaceCraft(initialPosition, "Up");
        
        assertEquals("Up", spacecraft.getDirection());
        assertEquals(initialPosition, spacecraft.getPosition());
    }

    @Test
    public void testConstructorWithInitialDirectionDown() {
        int[] initialPosition = {0, 0, 0};
        GalacticSpaceCraft spacecraft = new GalacticSpaceCraft(initialPosition, "Down");
        
        assertEquals("Down", spacecraft.getDirection());
        assertEquals(initialPosition, spacecraft.getPosition());
    }
}

