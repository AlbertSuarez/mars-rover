package com.thoughtworks.MarsRover;

import com.thoughtworks.MarsRover.domain.RoverRobot;
import com.thoughtworks.MarsRover.factory.ServiceFactory;
import com.thoughtworks.MarsRover.service.MarsRoverService;

import java.util.Scanner;

public class MarsRoverApplication {

    /**
     * Main method of Mars Rover problem
     * @param args arguments
     */
    @SuppressWarnings("InfiniteLoopStatement")
    public static void main(String[] args) throws Exception {
        MarsRoverService marsRoverService = ServiceFactory.getMarsRoverService();

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        RoverRobot roverRobot;
        while (true) {
            int roverX = scanner.nextInt();
            int roverY = scanner.nextInt();
            char roverOrientation = scanner.next().charAt(0);
            String instructions = scanner.next();

            roverRobot = marsRoverService.solve(x, y, roverX, roverY, roverOrientation, instructions);

            System.out.print(roverRobot.getX());
            System.out.print(' ');
            System.out.print(roverRobot.getY());
            System.out.print(' ');
            System.out.println( roverRobot.getOrientation());
        }
    }

}