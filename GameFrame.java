import javax.swing.*;

public class GameFrame extends JFrame {
    GameFrame() {
        this.add(new GamePanel());
        this.setTitle("🐍 Snake Game - by Dika");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack(); // Menyesuaikan ukuran dengan panel
        this.setVisible(true);
        this.setLocationRelativeTo(null); // Tengah layar
    }
}

