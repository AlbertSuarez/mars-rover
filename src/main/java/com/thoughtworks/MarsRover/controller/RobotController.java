package com.thoughtworks.MarsRover.controller;

import com.thoughtworks.MarsRover.domain.Plateau;
import com.thoughtworks.MarsRover.domain.RoverRobot;

public interface RobotController {

    RoverRobot create(int x, int y, char orientation);

    boolean canMove(RoverRobot roverRobot, Plateau plateau);

    RoverRobot move(RoverRobot roverRobot);

    RoverRobot rotate(RoverRobot roverRobot);

}
