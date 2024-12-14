package Figures.Figure;

import Figures.Figures;

import javax.swing.*;

public class Pawn extends Figures {

    public Pawn(String Name, int PositionX, int PositionY, String Color, boolean Live){

        super(Name,PositionX,PositionY,Color,Live);

    }
    @Override
    public void move(int TargetX, int TargetY, JPanel[][] Board) {

        Board[PositionX][PositionY] = Board[PositionX +1][PositionY];

    }
}
