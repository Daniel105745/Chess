package Figures;

public  abstract class Figures {

    protected String Name;
    protected int PositionX;
    protected int PositionY;

    protected String Color;
    protected boolean Live;



    public Figures(String Name, int PositionX, int PositionY, String Color, boolean Live){

        this.Name = Name;
        this. PositionX = PositionX;
        this.PositionY = PositionY;
        this.Color = Color;
        this.Live  = Live;
    }


    public abstract void move(int TargetX, int TargetY);

}
