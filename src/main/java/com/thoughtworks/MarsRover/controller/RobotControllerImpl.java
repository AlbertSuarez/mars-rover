package com.thoughtworks.MarsRover.controller;

import com.thoughtworks.MarsRover.domain.Plateau;
import com.thoughtworks.MarsRover.domain.RoverRobot;

public class RobotControllerImpl implements RobotController {

    @Override
    public RoverRobot create(int x, int y, char orientation) {
        return null;
    }

    @Override
    public boolean canMove(RoverRobot roverRobot, Plateau plateau) {
        return false;
    }

    @Override
    public RoverRobot move(RoverRobot roverRobot) {
        return null;
    }

    @Override
    public RoverRobot rotate(RoverRobot roverRobot) {
        return null;
    }

}
