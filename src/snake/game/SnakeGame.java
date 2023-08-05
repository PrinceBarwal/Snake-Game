package snake.game;
import javax.swing.*;


public class SnakeGame extends JFrame {
    
    SnakeGame(){
        super("Snake Game");
        add(new Board());
        pack();
//        setTitle("Snake Game");

        
        setSize(400,400);
        setLocationRelativeTo(null);
//        setLayout(null);
        
        setVisible(true);
    }
        

    public static void main(String[] args) {
        new SnakeGame();
    }
    
}
