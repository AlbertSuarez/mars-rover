package com.thoughtworks.MarsRover.controller;

import com.thoughtworks.MarsRover.domain.Plateau;

public class PlateauControllerImpl implements PlateauController {

    @Override
    public Plateau create(int x, int y) throws Exception {
        if (x < 0 || y < 0) {
            throw new Exception("Plateau's coordinates can't be negative.");
        }
        return new Plateau(x, y);
    }

}
