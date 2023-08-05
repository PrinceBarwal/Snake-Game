package snake.game;
import javax.swing.*;


public class SnakeGame extends JFrame {
    
    SnakeGame(){
        super("Snake Game");
        add(new Board());
        pack();
//        setTitle("Snake Game");

        
        setLocationRelativeTo(null);
        setResizable(false);
//        setLayout(null);
        
    }
        

    public static void main(String[] args) {
        new SnakeGame().setVisible(true);
    }
    
}
