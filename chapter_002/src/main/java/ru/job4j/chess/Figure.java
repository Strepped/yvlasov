package ru.job4j.chess;

import javafx.scene.control.Cell;

/**
 * Created by Strepped on 12.05.2017.
 */
public abstract class Figure {

    final Cell position;

    protected Figure(Cell position) {
        this.position = position;
    }

    int way(Cell dist) throws ImpossibleMoveException {

        return -1;
    }
}
