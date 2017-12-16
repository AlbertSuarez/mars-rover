package com.thoughtworks.MarsRover.domain;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(JUnit4.class)
public class RoverRobotTest {

    private static final int x = 1;
    private static final int y = 2;
    private static final char orientation = 'N';

    private RoverRobot roverRobot;

    @Before
    public void before() {
        this.roverRobot = new RoverRobot(x, y, orientation);
    }

    @Test
    public void createCorrectlyAPlateau() throws Exception {
        assertEquals(roverRobot.getX(), x);
        assertEquals(roverRobot.getY(), y);
        assertEquals(roverRobot.getOrientation(), orientation);
        assertTrue(roverRobot.getX() != y);
        assertTrue(roverRobot.getY() != x);
    }

    @Test
    public void updatePlateau() throws Exception {
        final int newX = 5;
        final int newY = 8;
        final char newOrientation = 'W';

        roverRobot.setX(newX);
        roverRobot.setY(newY);
        roverRobot.setOrientation(newOrientation);

        assertEquals(roverRobot.getX(), newX);
        assertEquals(roverRobot.getY(), newY);
        assertEquals(roverRobot.getOrientation(), newOrientation);
    }

}
