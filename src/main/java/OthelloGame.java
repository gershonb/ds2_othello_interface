import java.util.HashMap;
import java.util.List;

public interface OthelloGame {
    HashMap<String, int[]> directions = new HashMap<String, int[]>();
    int[][] board = new int[8][8];

    void playerTurn(int[] playSpace);
    List<Integer> directionCheck(String direction);
    void flipPieces(List<Integer> spacesToFlip);
    void endTurn();
    void getPlay();
    void restart();

}
