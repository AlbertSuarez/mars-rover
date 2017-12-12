package com.thoughtworks.MarsRover;

import com.thoughtworks.MarsRover.domain.RoverData;
import com.thoughtworks.MarsRover.utils.Utils;

import java.util.Scanner;

public class MarsRoverApplication {

    /**
     * Main method of Mars Rover problem
     * @param args arguments
     */
    @SuppressWarnings("InfiniteLoopStatement")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        RoverData roverData;
        while (true) {
            int roverX = scanner.nextInt();
            int roverY = scanner.nextInt();
            char roverOrientation = scanner.next().charAt(0);
            String instructions = scanner.next();

            roverData = solve(x, y, roverX, roverY, roverOrientation, instructions);

            System.out.print(roverData.getX());
            System.out.print(' ');
            System.out.print(roverData.getY());
            System.out.print(' ');
            System.out.println( roverData.getOrientation());
        }
    }

    /**
     * Solve Mars Rover problem with a single rover using parameters
     * @param x upper-right x coordinates of the plateau
     * @param y upper-right y coordinates of the plateau
     * @param roverX x start coordinates of the rover
     * @param roverY y start coordinates of the rover
     * @param roverOrientation start orientation of the rover (N, S, W, E)
     * @param instructions character string with all movements (L, R, M)
     * @return rover data (x, y and orientation) at the end of the instructions
     */
    public static RoverData solve(int x, int y, int roverX, int roverY, char roverOrientation, String instructions) {
        RoverData roverData = new RoverData(roverX, roverY, roverOrientation);

        roverData = followInstructions(x, y, roverData, instructions);

        return roverData;
    }

    /**
     * Follow rover instructions
     * @param x upper-right x coordinates of the plateau
     * @param y upper-right y coordinates of the plateau
     * @param roverData rover data (x, y and orientation) at the beginning of the instructions
     * @param instructions character string with all movements (L, R, M)
     * @return rover data (x, y and orientation) at the end of the instructions
     */
    private static RoverData followInstructions(int x, int y, RoverData roverData, String instructions) {
        char currentOrientation;
        for (int i = 0; i < instructions.length(); i++) {
            currentOrientation = roverData.getOrientation();
            switch (instructions.charAt(i)) {
                case 'L':
                    roverData.setOrientation(Utils.moveToLeft(currentOrientation));
                    break;
                case 'R':
                    roverData.setOrientation(Utils.moveToRight(currentOrientation));
                    break;
                case 'M':
                    roverData = move(x, y, roverData);
                    break;
            }
        }

        return roverData;
    }

    /**
     * Move rover
     * @param x upper-right x coordinates of the plateau
     * @param y upper-right y coordinates of the plateau
     * @param roverData rover data (x, y and orientation) before the movement
     * @return rover data (x, y and orientation) after the movement
     */
    private static RoverData move(int x, int y, RoverData roverData) {
        switch (roverData.getOrientation()) {
            case 'N':
                if (!Utils.isOutOfBounds(x, y, roverData.getX(), roverData.getY() + 1)) {
                    roverData.setY(roverData.getY() + 1);
                }
                break;
            case 'E':
                if (!Utils.isOutOfBounds(x, y, roverData.getX() + 1, roverData.getY())) {
                    roverData.setX(roverData.getX() + 1);
                }
                break;
            case 'S':
                if (!Utils.isOutOfBounds(x, y, roverData.getX(), roverData.getY() - 1)) {
                    roverData.setY(roverData.getY() - 1);
                }
                break;
            case 'W':
                if (!Utils.isOutOfBounds(x, y, roverData.getX() - 1, roverData.getY())) {
                    roverData.setX(roverData.getX() - 1);
                }
                break;
        }
        return roverData;
    }

}