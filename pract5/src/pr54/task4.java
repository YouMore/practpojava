package pr54;

import javax.swing.*;
import java.awt.*;
import java.io.File;

class Animation extends JFrame {
    int WINDOW_WIDTH = 600;
    int WINDOW_HEIGHT = 600;
    String animation_images_path = "C:/Users/Айдар/practpojava/pract5/src/pr54/photo/";

    Animation() {
        super("Some shapes");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g2) {
        Graphics2D g = (Graphics2D) g2;
        animate(this.animation_images_path, g);
    }

    void animate(String frames_path, Graphics2D g) {
        File dir = new File(frames_path);
        int i=0;
            for (File file : dir.listFiles()) {
                Image frame = Toolkit.getDefaultToolkit().getImage(file.getPath());
                g.drawImage(frame, i, i, WINDOW_WIDTH, WINDOW_HEIGHT, this);
                i++;
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                }
            }

    }

    public static void main(String[] args) {
        Animation app = new Animation();
    }
}
