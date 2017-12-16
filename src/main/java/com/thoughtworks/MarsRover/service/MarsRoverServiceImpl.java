package com.thoughtworks.MarsRover.service;

import com.thoughtworks.MarsRover.controller.PlateauController;
import com.thoughtworks.MarsRover.controller.RobotController;
import com.thoughtworks.MarsRover.domain.RoverRobot;

public class MarsRoverServiceImpl implements MarsRoverService {

    private RobotController robotController;
    private PlateauController plateauController;

    public MarsRoverServiceImpl(RobotController robotController,
                                PlateauController plateauController) {
        this.robotController = robotController;
        this.plateauController = plateauController;
    }

    @Override
    public RoverRobot solve(int x, int y, int roverX, int roverY, int roverOrientation, String instructions) {
        return null;
    }

}
