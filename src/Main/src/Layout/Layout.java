package Layout;

import javax.swing.*;
import java.awt.*;

public class Layout extends  JFrame {

    public static void main(String[] args){
        new Layout();
    }

    Layout(){


        JPanel[][] Board  = new JPanel[8][8];

        for (int row = 0; row< Board.length;row++){
            for (int col = 0; col<Board[row].length;col++){

                Board[row][col] = new JPanel();
                this.add(Board[row][col]);
                Board[row][col].setPreferredSize(new Dimension(50, 50));  // Größe der Felder
                Board[row][col].setOpaque(true);

                if ((row +col) % 2 == 0) {
                    Board[row][col].setBackground(Color.white); // Weißes Feld
                } else {
                    Board[row][col].setBackground(Color.black); // Schwarzes Feld
                }
            }
        }



        this.setTitle("Chess");
        this.setSize(800, 800);  // Größe des Fensters
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(8, 8, -3, -2));

        this.setVisible(true);

    }
}
