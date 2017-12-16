package com.thoughtworks.MarsRover.controller;

import com.thoughtworks.MarsRover.domain.Plateau;
import com.thoughtworks.MarsRover.domain.RoverRobot;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class RobotControllerTest {

    private static final int x = 3;
    private static final int y = 1;
    private static final char orientation = 'E';
    private static final int negativeX = -3;
    private static final int negativeY = -1;
    private static final char wrongOrientation = 'A';

    private static final int plateauX = 5;
    private static final int plateauY = 6;
    private static final int otherPlateauX = 3;
    private static final int otherPlateauY = 6;

    private static final char rotation = 'R';
    private static final char wrongRotation = 'Z';

    private RobotController robotController;
    private RoverRobot roverRobot;
    private Plateau plateau;

    @Before
    public void before() {
        this.robotController = new RobotControllerImpl();
    }

    @Test
    public void noEmptyController() throws Exception {
        assertNotNull(this.robotController);
    }

    @Test
    public void createCorrectlyARobot() throws Exception {
        this.roverRobot = this.robotController.create(x, y, orientation);

        assertEquals(roverRobot.getX(), x);
        assertEquals(roverRobot.getY(), y);
        assertEquals(roverRobot.getOrientation(), orientation);
        assertTrue(roverRobot.getX() != y);
        assertTrue(roverRobot.getY() != x);
    }

    @Test
    public void createARobotWithNegativeCoordinates() throws Exception {
        try {
            this.roverRobot = this.robotController.create(negativeX, negativeY, orientation);
            assertEquals(1, 2); // Force false
        } catch (Exception e) {
            assertEquals(1, 1); // Force true
        }
    }

    @Test
    public void createARobotWithWrongOrientation() throws Exception {
        try {
            this.roverRobot = this.robotController.create(x, y, wrongOrientation);
            assertEquals(1, 2); // Force false
        } catch (Exception e) {
            assertEquals(1, 1); // Force true
        }
    }

    @Test
    public void canIMoveToACorrectPosition() throws Exception {
        this.roverRobot = this.robotController.create(x, y, orientation);
        this.plateau = new Plateau(plateauX, plateauY);

        assertTrue(this.robotController.canMove(roverRobot, plateau));
    }

    @Test
    public void canIMoveToIncorrectPosition() throws Exception {
        this.roverRobot = this.robotController.create(x, y, orientation);
        this.plateau = new Plateau(otherPlateauX, otherPlateauY);

        assertFalse(this.robotController.canMove(roverRobot, plateau));
    }

    @Test
    public void move() throws Exception {
        this.roverRobot = this.robotController.create(x, y, orientation);

        this.robotController.move(roverRobot);

        assertEquals(x + 1, roverRobot.getX());
    }

    @Test
    public void rotateWithCorrectRotation() throws Exception {
        this.roverRobot = this.robotController.create(x, y, orientation);

        this.robotController.rotate(roverRobot, rotation);

        assertEquals('S', roverRobot.getOrientation());
    }

    @Test
    public void rotateWithIncorrectRotation() throws Exception {
        this.roverRobot = this.robotController.create(x, y, orientation);
        try {
            this.robotController.rotate(roverRobot, wrongRotation);
            assertEquals(1, 2); // Force false
        } catch (Exception e) {
            assertEquals(1, 1); // Force true
        }
    }

}
