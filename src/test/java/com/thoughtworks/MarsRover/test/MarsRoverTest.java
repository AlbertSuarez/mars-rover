package com.thoughtworks.MarsRover.test;

import com.thoughtworks.MarsRover.MarsRoverApplication;
import com.thoughtworks.MarsRover.domain.RoverData;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class MarsRoverTest {

    private static MarsRoverApplication marsRoverApplication;

    public MarsRoverTest() {
        marsRoverApplication = new MarsRoverApplication();
    }

    @Test
    public void noInstructionsTest() throws Exception {
        int x = 5;
        int y = 5;
        int roverX = 0;
        int roverY = 0;
        char roverOrientation = 'N';
        String instructions = "";

        RoverData solution = marsRoverApplication.solve(x, y, roverX, roverY, roverOrientation, instructions);

        assertEquals(solution.getX(), roverX);
        assertEquals(solution.getY(), roverY);
        assertEquals(solution.getOrientation(), roverOrientation);
    }

    @Test
    public void firstPublicCase() throws Exception {
        int x = 5;
        int y = 5;
        int roverX = 1;
        int roverY = 2;
        char roverOrientation = 'N';
        String instructions = "LMLMLMLMM";

        RoverData solution = marsRoverApplication.solve(x, y, roverX, roverY, roverOrientation, instructions);

        assertEquals(solution.getX(), 1);
        assertEquals(solution.getY(), 3);
        assertEquals(solution.getOrientation(), 'N');
    }

    @Test
    public void secondPublicCase() throws Exception {
        int x = 5;
        int y = 5;
        int roverX = 3;
        int roverY = 3;
        char roverOrientation = 'E';
        String instructions = "MMRMMRMRRM";

        RoverData solution = marsRoverApplication.solve(x, y, roverX, roverY, roverOrientation, instructions);

        assertEquals(solution.getX(), 5);
        assertEquals(solution.getY(), 1);
        assertEquals(solution.getOrientation(), 'E');
    }

}