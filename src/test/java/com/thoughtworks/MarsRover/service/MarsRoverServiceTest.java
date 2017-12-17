package com.thoughtworks.MarsRover.service;

import com.thoughtworks.MarsRover.domain.RoverRobot;
import com.thoughtworks.MarsRover.factory.ServiceFactory;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(JUnit4.class)
public class MarsRoverServiceTest {

    private static final int x = 5;
    private static final int y = 5;

    private MarsRoverService marsRoverService;

    @Before
    public void before() {
        this.marsRoverService = ServiceFactory.getMarsRoverService();
    }

    @Test
    public void noEmptyService() throws Exception {
        assertNotNull(this.marsRoverService);
    }

    @Test
    public void solveWithoutInstructions() throws Exception {
        final int roverX = 0;
        final int roverY = 0;
        final char roverOrientation = 'N';
        final String instructions = "";

        RoverRobot solution = this.marsRoverService.solve(x, y, roverX, roverY, roverOrientation, instructions);

        assertEquals(solution.getX(), roverX);
        assertEquals(solution.getY(), roverY);
        assertEquals(solution.getOrientation(), roverOrientation);
    }

    @Test
    public void solveWithInstructionsAndWithNorthOrientation() throws Exception {
        final int roverX = 1;
        final int roverY = 2;
        final char roverOrientation = 'N';
        final String instructions = "LMLMLMLMM";

        final int expectedX = 1;
        final int expectedY = 3;
        final char expectedOrientation = 'N';

        RoverRobot solution = this.marsRoverService.solve(x, y, roverX, roverY, roverOrientation, instructions);

        assertEquals(solution.getX(), expectedX);
        assertEquals(solution.getY(), expectedY);
        assertEquals(solution.getOrientation(), expectedOrientation);
    }

    @Test
    public void solveWithInstructionsAndWithEastOrientation() throws Exception {
        final int roverX = 3;
        final int roverY = 3;
        final char roverOrientation = 'E';
        final String instructions = "MMRMMRMRRM";

        final int expectedX = 5;
        final int expectedY = 1;
        final char expectedOrientation = 'E';

        RoverRobot solution = this.marsRoverService.solve(x, y, roverX, roverY, roverOrientation, instructions);

        assertEquals(solution.getX(), expectedX);
        assertEquals(solution.getY(), expectedY);
        assertEquals(solution.getOrientation(), expectedOrientation);
    }

    @Test
    public void solveWithWrongRobotParameters() throws Exception {
        final int roverX = -1;
        final int roverY = -9;
        final char roverOrientation = 'A';
        final String instructions = "LLRMMMLRMMR";

        try {
            this.marsRoverService.solve(x, y, roverX, roverY, roverOrientation, instructions);
            assertEquals(1, 2); // Force false
        } catch (Exception e) {
            assertEquals(1, 1); // Force true
        }
    }

    @Test
    public void solveWithWrongInstructions() throws Exception {
        final int roverX = 3;
        final int roverY = 3;
        final char roverOrientation = 'E';
        final String instructions = "ASDFGHJKLP";

        try {
            this.marsRoverService.solve(x, y, roverX, roverY, roverOrientation, instructions);
            assertEquals(1, 2); // Force false
        } catch (Exception e) {
            assertEquals(1, 1); // Force true
        }
    }

}
