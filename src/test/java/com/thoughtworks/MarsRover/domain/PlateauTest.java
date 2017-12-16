package com.thoughtworks.MarsRover.domain;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(JUnit4.class)
public class PlateauTest {

    private static final int x = 5;
    private static final int y = 4;

    private Plateau plateau;

    @Before
    public void before() {
        this.plateau = new Plateau(x, y);
    }

    @Test
    public void createCorrectlyAPlateau() throws Exception {
        assertEquals(plateau.getX(), x);
        assertEquals(plateau.getY(), y);
        assertTrue(plateau.getX() != y);
        assertTrue(plateau.getY() != x);
    }

    @Test
    public void updatePlateau() throws Exception {
        final int newX = 10;
        final int newY = 14;

        plateau.setX(newX);
        plateau.setY(newY);

        assertEquals(plateau.getX(), newX);
        assertEquals(plateau.getY(), newY);
    }

}
