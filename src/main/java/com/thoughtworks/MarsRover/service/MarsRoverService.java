package com.thoughtworks.MarsRover.service;

import com.thoughtworks.MarsRover.domain.RoverRobot;

public interface MarsRoverService {

    /**
     * Solve Mars Rover problem with a single rover using parameters
     * @param x upper-right x coordinates of the plateau
     * @param y upper-right y coordinates of the plateau
     * @param roverX x start coordinates of the rover
     * @param roverY y start coordinates of the rover
     * @param roverOrientation start orientation of the rover (N, S, W, E)
     * @param instructions character string with all movements (L, R, M)
     * @return rover data (x, y and orientation) at the end of the instructions
     * @throws Exception error when some input is incorrect
     */
    RoverRobot solve(int x, int y, int roverX, int roverY, char roverOrientation, String instructions) throws Exception;

}
