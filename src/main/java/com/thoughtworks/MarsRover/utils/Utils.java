package com.thoughtworks.MarsRover.utils;

public class Utils {

    /**
     * Move rover to left
     * @param orientation current orientation
     * @return new orientation
     */
    public static char moveToLeft(char orientation) {
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
    public static char moveToRight(char orientation) {
        if (orientation == 'N') return 'E';
        if (orientation == 'E') return 'S';
        if (orientation == 'S') return 'W';
        return 'N';
    }

    /**
     * Check rover's position
     * @param x upper-right x coordinates of the plateau
     * @param y upper-right y coordinates of the plateau
     * @param roverX current x coordinates of the rover
     * @param roverY current y coordinates of the rover
     * @return true if rover is out of bounds, false otherwise
     */
    public static boolean isOutOfBounds(int x, int y, int roverX, int roverY) {
        return roverX < 0 || roverY < 0 || roverX > x || roverY > y;
    }

}
