package Layout;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Layout extends JFrame {

    public static void main(String[] args){
        new Layout();
    }

    Layout(){

        this.setTitle("Chess");
        this.setSize(800, 800);  // Größe des Fensters
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(8, 8, -3, -2));


        ImageIcon knightIcon = new ImageIcon(getClass().getResource("/Layout/Knight_Chess.png"));


        JPanel[][] Board  = new JPanel[8][8];

        for (int row = 0; row< Board.length;row++){
            for (int col = 0; col<Board[row].length;col++){

                Board[row][col] = new JPanel();
                Board[row][col].setPreferredSize(new Dimension(50, 50));  // Größe der Felder
                Board[row][col].setOpaque(true);
                Board[row][col].setBorder(new LineBorder(Color.GRAY, 4)); // 10 ist die Dicke des Rahmens);



                if ((row +col) % 2 == 0) {
                    Board[row][col].setBackground(Color.white); // Weißes Feld
                } else {
                    Board[row][col].setBackground(Color.black); // Schwarzes Feld
                }
                if (row == 0 && col == 0) { // Beispiel: Icon auf Feld (0, 1) platzieren
                    JLabel iconLabel = new JLabel(knightIcon);
                    Board[row][col].add(iconLabel); // Icon hinzufügen
                }
                this.add(Board[row][col]);

            }
        }
        JButton Wichtig = new JButton("Press me");
        Board[4][6].add(Wichtig);




        this.setVisible(true);

    }
}
