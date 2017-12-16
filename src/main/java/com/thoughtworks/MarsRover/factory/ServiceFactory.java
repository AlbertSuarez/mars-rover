package com.thoughtworks.MarsRover.factory;

import com.thoughtworks.MarsRover.controller.PlateauControllerImpl;
import com.thoughtworks.MarsRover.controller.RobotControllerImpl;
import com.thoughtworks.MarsRover.service.MarsRoverService;
import com.thoughtworks.MarsRover.service.MarsRoverServiceImpl;

public class ServiceFactory {

    private static MarsRoverService marsRoverService;

    public static MarsRoverService getMarsRoverService() {
        if (marsRoverService == null) {
            marsRoverService =
                    new MarsRoverServiceImpl(
                            new RobotControllerImpl(),
                            new PlateauControllerImpl());
        }
        return marsRoverService;
    }

}
