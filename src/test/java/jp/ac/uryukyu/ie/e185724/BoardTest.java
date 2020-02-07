package jp.ac.uryukyu.ie.e185724;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {
    @Test
    void putStone() {
        Board board = new Board();

        board.playingPlayer = 'W';
        board.PutStone("a1");
        assertEquals('B', board.playingPlayer);
    }
}