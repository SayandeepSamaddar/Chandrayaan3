
package com.mycompany.chandrayaan3_tddassesment;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class SystemTesting {
    @Test
    public void testScenario1() {
        int[] initialPosition = {0, 0, 0};
        GalacticSpaceCraft spacecraft = new GalacticSpaceCraft(initialPosition, "N");

        spacecraft.executeCommands(new String[]{"f"});

        assertArrayEquals(new int[]{0, 1, 0}, spacecraft.getPosition());
        assertEquals("N", spacecraft.getDirection());
    }

    @Test
    public void testScenario2() {
        int[] initialPosition = {0, 0, 0};
        GalacticSpaceCraft spacecraft = new GalacticSpaceCraft(initialPosition, "N");

        spacecraft.executeCommands(new String[]{"f", "r"});

        assertArrayEquals(new int[]{0, 1, 0}, spacecraft.getPosition());
        assertEquals("E", spacecraft.getDirection());
    }

    @Test
    public void testScenario3() {
        int[] initialPosition = {0, 0, 0};
        GalacticSpaceCraft spacecraft = new GalacticSpaceCraft(initialPosition, "N");

        spacecraft.executeCommands(new String[]{"f", "r", "u"});

        assertArrayEquals(new int[]{0, 1, 0}, spacecraft.getPosition());
        assertEquals("Up", spacecraft.getDirection());
    }

    @Test
    public void testScenario4() {
        int[] initialPosition = {0, 0, 0};
        GalacticSpaceCraft spacecraft = new GalacticSpaceCraft(initialPosition, "N");

        spacecraft.executeCommands(new String[]{"f", "r", "u", "b"});

        assertArrayEquals(new int[]{0, 1, -1}, spacecraft.getPosition());
        assertEquals("Up", spacecraft.getDirection());
    }

    @Test
    public void testScenario5() {
        int[] initialPosition = {0, 0, 0};
        GalacticSpaceCraft spacecraft = new GalacticSpaceCraft(initialPosition, "N");

        spacecraft.executeCommands(new String[]{"f", "r", "u", "b", "l"});

        assertArrayEquals(new int[]{0, 1, -1}, spacecraft.getPosition());
        assertEquals("N", spacecraft.getDirection());
    }
}
