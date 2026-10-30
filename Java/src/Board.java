import javax.swing.*;
import java.awt.*;

public class Board extends JPanel {
    public boolean isMate;
    private Piece[][] Board;
    private int fiftyMoveRuleCounter;
    private ImageIcon ChessBoardImage = new ImageIcon("src/assets/boards/" + Config.BoardStyle + ".png");

    public Board() {
        this.Board = new Piece[8][8];
        this.isMate = false;
        this.fiftyMoveRuleCounter = 0;
        this.setLayout(new BorderLayout());
        this.setSize(800, 800);
    }

    public Piece get(int x, int y) {
        return Board[y][x];
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(ChessBoardImage.getImage(), 0, 0, getWidth(), getHeight(), this);
    }
}
