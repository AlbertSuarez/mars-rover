package com.thoughtworks.MarsRover.controller;

import com.thoughtworks.MarsRover.domain.Plateau;
import com.thoughtworks.MarsRover.domain.RoverRobot;

public interface RobotController {

    /**
     * Create a robot with parameters
     * @param x x start coordinates of the robot
     * @param y y start coordinates of the robot
     * @param orientation start orientation of the robot
     * @return robot with correct parameters
     * @throws Exception error when x or y are negative or orientation is not 'N', 'E', 'S' or 'W'
     */
    RoverRobot create(int x, int y, char orientation) throws Exception;

    /**
     * Check if the new movement fits in plateau dimensions
     * @param roverRobot rover robot instance before movement
     * @param plateau current plateau
     * @return true if it can move, false otherwise
     */
    boolean canMove(RoverRobot roverRobot, Plateau plateau);

    /**
     * Move rover robot to the next position
     * @param roverRobot rover robot instance before movement
     * @return rover robot instance after movement
     */
    RoverRobot move(RoverRobot roverRobot);

    /**
     * Rotate rover robot to indicated rotation
     * @param roverRobot rover robot instance before rotation
     * @param rotation indicated rotation
     * @return rover robot instance after rotation
     * @throws Exception error when indicated rotation is not 'L' or 'R'
     */
    RoverRobot rotate(RoverRobot roverRobot, char rotation) throws Exception;

}
