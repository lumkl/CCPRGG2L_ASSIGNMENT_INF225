import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.*;

public class ColorMenu extends JFrame{
//
private String[] colorNameArray = {"Grey", "Black", "Blue", "Light Grey"};
//
private Color[] colorListArray = {Color.GRAY, Color.BLACK, Color.BLUE, Color.LIGHT_GRAY};

//
JList colorList;

    ColorMenu() {
        //
        JLabel label = new JLabel();
        label.setText("Choose the color u want: ");
        label.setFont(new Font("Times New Roman", Font.BOLD, 20));
        this.add(label);

        //
        colorList = new JList<>(colorNameArray);
        colorList.setFont(new Font("Times New Roman", Font.BOLD, 20));
        //
        colorList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        //
        EventHandler handler = new EventHandler();
        colorList.addListSelectionListener(handler);
        //
        this.add(colorList);

        //
        this.setLayout(new FlowLayout());
        this.setTitle("Snake Game");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize( 500, 500);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(true);
        this.getContentPane().setBackground(Color.CYAN);
    }

    private class EventHandler implements ListSelectionListener{

        public void valueChanged(ListSelectionEvent event){
            GamePanel gp = new GamePanel();
            gp.gameBGColor = colorListArray[colorList.getSelectedIndex()];

            // 
            new GameFrame();
            //
            dispose();

        }
    }

    }

