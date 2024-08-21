package cleancode.minesweeper.tobe;

import cleancode.minesweeper.tobe.game.GameRunnable;

/**
 * 초기화가 필요없는 Game -> GameRunnable 만 구현
 */
public class AnotherGame implements GameRunnable {

    @Override
    public void run() {

    }
}
