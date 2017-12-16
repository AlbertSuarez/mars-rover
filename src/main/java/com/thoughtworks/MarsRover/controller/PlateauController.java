package com.thoughtworks.MarsRover.controller;

import com.thoughtworks.MarsRover.domain.Plateau;

public interface PlateauController {

    /**
     * Create a plateau with parameters
     * @param x x coordinates of plateau
     * @param y y coordinates of plateau
     * @return plateau with correct parameters
     * @throws Exception error when x or y are negative
     */
    Plateau create(int x, int y) throws Exception;

}
