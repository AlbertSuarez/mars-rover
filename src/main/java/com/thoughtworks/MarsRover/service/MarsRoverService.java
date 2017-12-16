package com.thoughtworks.MarsRover.service;

import com.thoughtworks.MarsRover.domain.RoverRobot;

public interface MarsRoverService {

    RoverRobot solve(int x, int y, int roverX, int roverY, int roverOrientation, String instructions);

}
