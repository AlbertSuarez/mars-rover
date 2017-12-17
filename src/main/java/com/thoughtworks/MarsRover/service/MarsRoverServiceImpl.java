package com.thoughtworks.MarsRover.service;

import com.thoughtworks.MarsRover.controller.PlateauController;
import com.thoughtworks.MarsRover.controller.RobotController;
import com.thoughtworks.MarsRover.domain.Plateau;
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
    public RoverRobot solve(int x, int y, int roverX, int roverY, char roverOrientation, String instructions) throws Exception {
        Plateau plateau = this.plateauController.create(x, y);
        RoverRobot roverRobot = this.robotController.create(roverX, roverY, roverOrientation);

        roverRobot = followInstructions(plateau, roverRobot, instructions);

        return roverRobot;
    }

    /**
     * Follow given instructions
     * @param plateau given plateau
     * @param roverRobot rover robot before instructions
     * @param instructions character string with all movements (L, R, M)
     * @return rover robot after instructions
     * @throws Exception error when some instructions are incorrect
     */
    private RoverRobot followInstructions(Plateau plateau, RoverRobot roverRobot, String instructions) throws Exception {
        for (int i = 0; i < instructions.length(); i++) {
            if (instructions.charAt(i) == 'M') {
                if (this.robotController.canMove(roverRobot, plateau)) {
                    roverRobot = this.robotController.move(roverRobot);
                }
            } else {
                roverRobot = this.robotController.rotate(roverRobot, instructions.charAt(i));
            }
        }
        return roverRobot;
    }

}
