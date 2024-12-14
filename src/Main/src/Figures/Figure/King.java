package Figures.Figure;

import Figures.Figures;

import javax.swing.*;

public class King extends Figures {

    public King(String Name, int PositionX, int PositionY, String Color, boolean Live){

        super(Name,PositionX,PositionY,Color,Live);
    }

    @Override
    public void move(int TargetX, int TargetY, JPanel[][] Board) {

    }
}
