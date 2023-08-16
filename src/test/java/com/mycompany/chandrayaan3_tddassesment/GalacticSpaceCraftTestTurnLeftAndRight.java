package com.mycompany.chandrayaan3_tddassesment;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
/**
 *
 * @Unit tset for Move Forward
 */
public class GalacticSpaceCraftTestTurnLeftAndRight {
    @Test
   public void testTurnLeftFromInitialDirectionN() {
        int[] initialPosition = {0, 0, 0};
        GalacticSpaceCraft spacecraft = new GalacticSpaceCraft(initialPosition, "N");
        
        spacecraft.turnLeft();
        assertEquals("W", spacecraft.getDirection());
    }

   @Test
    public void testTurnLeftFromInitialDirectionS() {
        int[] initialPosition = {0, 0, 0};
        GalacticSpaceCraft spacecraft = new GalacticSpaceCraft(initialPosition, "S");
        
        spacecraft.turnLeft();
        assertEquals("E", spacecraft.getDirection());
    }

    @Test
    public void testTurnLeftFromInitialDirectionE() {
        int[] initialPosition = {0, 0, 0};
        GalacticSpaceCraft spacecraft = new GalacticSpaceCraft(initialPosition, "E");
        
        spacecraft.turnLeft();
        assertEquals("N", spacecraft.getDirection());
    }

    @Test
    public void testTurnLeftFromInitialDirectionW() {
        int[] initialPosition = {0, 0, 0};
        GalacticSpaceCraft spacecraft = new GalacticSpaceCraft(initialPosition, "W");
        
        spacecraft.turnLeft();
        assertEquals("S", spacecraft.getDirection());
    }

    @Test
    public void testTurnLeftFromInitialDirectionUp() {
        int[] initialPosition = {0, 0, 0};
        GalacticSpaceCraft spacecraft = new GalacticSpaceCraft(initialPosition, "Up");
        
        spacecraft.turnLeft();
        assertEquals("N", spacecraft.getDirection());
    }

    @Test
    public void testTurnLeftFromInitialDirectionDown() {
        int[] initialPosition = {0, 0, 0};
        GalacticSpaceCraft spacecraft = new GalacticSpaceCraft(initialPosition, "Down");
        
        spacecraft.turnLeft();
        assertEquals("S", spacecraft.getDirection());
    }
     @Test
   public void testTurnRightFromInitialDirectionN() {
        int[] initialPosition = {0, 0, 0};
        GalacticSpaceCraft spacecraft = new GalacticSpaceCraft(initialPosition, "N");
        
        spacecraft.turnRight();
        assertEquals("E", spacecraft.getDirection());
    }

   @Test
    public void testTurnRightFromInitialDirectionS() {
        int[] initialPosition = {0, 0, 0};
        GalacticSpaceCraft spacecraft = new GalacticSpaceCraft(initialPosition, "S");
        
        spacecraft.turnRight();
        assertEquals("W", spacecraft.getDirection());
    }

    @Test
    public void testTurnRightFromInitialDirectionE() {
        int[] initialPosition = {0, 0, 0};
        GalacticSpaceCraft spacecraft = new GalacticSpaceCraft(initialPosition, "E");
        
        spacecraft.turnRight();
        assertEquals("S", spacecraft.getDirection());
    }

    @Test
    public void testTurnRightFromInitialDirectionW() {
        int[] initialPosition = {0, 0, 0};
        GalacticSpaceCraft spacecraft = new GalacticSpaceCraft(initialPosition, "W");
        
        spacecraft.turnRight();
        assertEquals("N", spacecraft.getDirection());
    }

    @Test
    public void testTurnRightFromInitialDirectionUp() {
        int[] initialPosition = {0, 0, 0};
        GalacticSpaceCraft spacecraft = new GalacticSpaceCraft(initialPosition, "Up");
        
        spacecraft.turnRight();
        assertEquals("S", spacecraft.getDirection());
    }

    @Test
    public void testTurnRightFromInitialDirectionDown() {
        int[] initialPosition = {0, 0, 0};
        GalacticSpaceCraft spacecraft = new GalacticSpaceCraft(initialPosition, "Down");
        
        spacecraft.turnRight();
        assertEquals("N", spacecraft.getDirection());
    }
}
