package com.mycompany.chandrayaan3_tddassesment;
import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;
/**
 *
 * @Unit test for Move Forward
 */
public class GalacticSpaceCraftTestMoveBackwardAndForward {
     @Test
    public void testMoveBackwardFromInitialPositionN() {
        int[] initialPosition = {0, 0, 0};
        GalacticSpaceCraft spacecraft = new GalacticSpaceCraft(initialPosition, "N");
        
        spacecraft.moveBackward();
        assertArrayEquals(new int[]{0, -1, 0}, spacecraft.getPosition());
    }

    @Test
    public void testMoveBackwardFromInitialPositionS() {
        int[] initialPosition = {0, 0, 0};
        GalacticSpaceCraft spacecraft = new GalacticSpaceCraft(initialPosition, "S");
        
        spacecraft.moveBackward();
        assertArrayEquals(new int[]{0, 1, 0}, spacecraft.getPosition());
    }

    @Test
    public void testMoveBackwardFromInitialPositionE() {
        int[] initialPosition = {0, 0, 0};
        GalacticSpaceCraft spacecraft = new GalacticSpaceCraft(initialPosition, "E");
        
        spacecraft.moveBackward();
        assertArrayEquals(new int[]{-1, 0, 0}, spacecraft.getPosition());
    }

    @Test
    public void testMoveBackwardFromInitialPositionW() {
        int[] initialPosition = {0, 0, 0};
        GalacticSpaceCraft spacecraft = new GalacticSpaceCraft(initialPosition, "W");
        
        spacecraft.moveBackward();
        assertArrayEquals(new int[]{1, 0, 0}, spacecraft.getPosition());
    }

    @Test
    public void testMoveBackwardFromInitialPositionUp() {
        int[] initialPosition = {0, 0, 0};
        GalacticSpaceCraft spacecraft = new GalacticSpaceCraft(initialPosition, "Up");
        
        spacecraft.moveBackward();
        assertArrayEquals(new int[]{0, 0, -1}, spacecraft.getPosition());
    }

    @Test
    public void testMoveBackwardFromInitialPositionDown() {
        int[] initialPosition = {0, 0, 0};
        GalacticSpaceCraft spacecraft = new GalacticSpaceCraft(initialPosition, "Down");
        
        spacecraft.moveBackward();
        assertArrayEquals(new int[]{0, 0, 1}, spacecraft.getPosition());
    }
     @Test
    public void testMoveForwardFromInitialPositionN() {
        int[] initialPosition = {0, 0, 0};
        GalacticSpaceCraft spacecraft = new GalacticSpaceCraft(initialPosition, "N");
        
        spacecraft.moveForward();
        assertArrayEquals(new int[]{0, 1, 0}, spacecraft.getPosition());
    }

    @Test
    public void testMoveForwardFromInitialPositionS() {
        int[] initialPosition = {0, 0, 0};
        GalacticSpaceCraft spacecraft = new GalacticSpaceCraft(initialPosition, "S");
        
        spacecraft.moveForward();
        assertArrayEquals(new int[]{0, -1, 0}, spacecraft.getPosition());
    }

    @Test
    public void testMoveForwardFromInitialPositionE() {
        int[] initialPosition = {0, 0, 0};
        GalacticSpaceCraft spacecraft = new GalacticSpaceCraft(initialPosition, "E");
        
        spacecraft.moveForward();
        assertArrayEquals(new int[]{1, 0, 0}, spacecraft.getPosition());
    }

    @Test
    public void testMoveForwardFromInitialPositionW() {
        int[] initialPosition = {0, 0, 0};
        GalacticSpaceCraft spacecraft = new GalacticSpaceCraft(initialPosition, "W");
        
        spacecraft.moveForward();
        assertArrayEquals(new int[]{-1, 0, 0}, spacecraft.getPosition());
    }

    @Test
    public void testMoveForwardFromInitialPositionUp() {
        int[] initialPosition = {0, 0, 0};
        GalacticSpaceCraft spacecraft = new GalacticSpaceCraft(initialPosition, "Up");
        
        spacecraft.moveForward();
        assertArrayEquals(new int[]{0, 0, 1}, spacecraft.getPosition());
    }

    @Test
    public void testMoveForwardFromInitialPositionDown() {
        int[] initialPosition = {0, 0, 0};
        GalacticSpaceCraft spacecraft = new GalacticSpaceCraft(initialPosition, "Down");
        
        spacecraft.moveForward();
        assertArrayEquals(new int[]{0, 0, -1}, spacecraft.getPosition());
    }
}
