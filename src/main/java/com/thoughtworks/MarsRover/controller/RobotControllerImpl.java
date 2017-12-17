package com.thoughtworks.MarsRover.controller;

import com.thoughtworks.MarsRover.domain.Plateau;
import com.thoughtworks.MarsRover.domain.RoverRobot;

public class RobotControllerImpl implements RobotController {

    @Override
    public RoverRobot create(int x, int y, char orientation) throws Exception {
        if (x < 0 || y < 0) {
            throw new Exception("Robot's coordinates can't be negative.");
        } else if (orientation != 'N' && orientation != 'E' && orientation != 'S' && orientation != 'W') {
            throw new Exception("Robot's orientation must be 'N', 'E', 'S' or 'W'");
        }
        return new RoverRobot(x, y, orientation);
    }

    @Override
    public boolean canMove(RoverRobot roverRobot, Plateau plateau) {
        if (roverRobot.getOrientation() == 'N' && roverRobot.getY() + 1 > plateau.getY()) return false;
        else if (roverRobot.getOrientation() == 'E' && roverRobot.getX() + 1 > plateau.getX()) return false;
        else if (roverRobot.getOrientation() == 'S' && roverRobot.getY() - 1 < 0) return false;
        else if (roverRobot.getOrientation() == 'W' && roverRobot.getX() + 1 < 0) return false;
        return true;
    }

    @Override
    public RoverRobot move(RoverRobot roverRobot) {
        switch (roverRobot.getOrientation()) {
            case 'N':
                roverRobot.setY(roverRobot.getY() + 1);
                break;
            case 'E':
                roverRobot.setX(roverRobot.getX() + 1);
                break;
            case 'S':
                roverRobot.setY(roverRobot.getY() - 1);
                break;
            case 'W':
                roverRobot.setX(roverRobot.getX() - 1);
                break;
        }
        return roverRobot;
    }

    @Override
    public RoverRobot rotate(RoverRobot roverRobot, char rotation) throws Exception {
        if (rotation == 'L') {
            roverRobot.setOrientation(moveToLeft(roverRobot.getOrientation()));
        } else if (rotation == 'R') {
            roverRobot.setOrientation(moveToRight(roverRobot.getOrientation()));
        } else {
            throw new Exception("Rotation must be 'R' or 'L'");
        }
        return roverRobot;
    }

    /**
     * Move rover to left
     * @param orientation current orientation
     * @return new orientation
     */
    private static char moveToLeft(char orientation) {
        if (orientation == 'N') return 'W';
        if (orientation == 'W') return 'S';
        if (orientation == 'S') return 'E';
        return 'N';
    }

    /**
     * Move rover to right
     * @param orientation current orientation
     * @return new orientation
     */
    private static char moveToRight(char orientation) {
        if (orientation == 'N') return 'E';
        if (orientation == 'E') return 'S';
        if (orientation == 'S') return 'W';
        return 'N';
    }

}
