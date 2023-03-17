import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
public class TryAgain extends JFrame{
    TryAgain(){

        JButton tryAgainButton = new JButton();
        JButton exitButton = new JButton();

        tryAgainButton.setText("Play Again");
        tryAgainButton.setFont(new Font("Times New Roman", Font.BOLD, 25));

        exitButton.setText("Exit");
        exitButton.setFont(new Font("Times New Roman", Font.BOLD, 25));


        this.add(tryAgainButton);
        this.add(exitButton);

        this.setLayout(new FlowLayout());
        this.setTitle("Snake Game");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize( 500, 500);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(true);
        this.getContentPane().setBackground(Color.CYAN);
    }
}
