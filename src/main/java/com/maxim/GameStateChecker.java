package com.maxim;

import com.maxim.board.Board;

public abstract class GameStateChecker {
    public abstract GameState check(Board board, Color color);
}
