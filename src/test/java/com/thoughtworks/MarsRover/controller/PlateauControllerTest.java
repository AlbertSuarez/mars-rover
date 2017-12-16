package com.thoughtworks.MarsRover.controller;

import com.thoughtworks.MarsRover.domain.Plateau;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@RunWith(JUnit4.class)
public class PlateauControllerTest {

    private static final int x = 8;
    private static final int y = 2;
    private static final int negativeX = -8;
    private static final int negativeY = -2;

    private PlateauController plateauController;
    private Plateau plateau;

    @Before
    public void before() {
        this.plateauController = new PlateauControllerImpl();
    }

    @Test
    public void noEmptyController() throws Exception {
        assertNotNull(this.plateauController);
    }

    @Test
    public void createCorrectlyAPlateau() throws Exception {
        this.plateau = this.plateauController.create(x, y);

        assertEquals(plateau.getX(), x);
        assertEquals(plateau.getY(), y);
        assertTrue(plateau.getX() != y);
        assertTrue(plateau.getY() != x);
    }

    @Test
    public void createIncorrectlyAPlateau() throws Exception {
        try {
            this.plateau = this.plateauController.create(negativeX, negativeY);
            assertEquals(1, 2); // Force false
        } catch (Exception e) {
            assertEquals(1, 1); // Force true
        }
    }

}
