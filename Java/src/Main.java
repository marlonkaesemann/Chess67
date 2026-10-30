import java.awt.*;
import javax.swing.*;

class Main extends JFrame {

    public Main() {
        setSize(Config.MAIN_WIDTH, Config.MAIN_HEIGHT);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chess67 - because its funny.");
        //TODO: set application logo

        Board b = new Board();
        b.setBounds(0 ,0, 800, 800);
        add(b);

        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main();
            }
        });
    }
}