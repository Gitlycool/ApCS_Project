import processing.core.PApplet;

import javax.swing.*;
import java.util.ArrayList;

public class Game extends PApplet {

    ArrayList<Player> playerList = new ArrayList<Player>();
    int Elixer;

    int aiPlayerTimer;

    playerAi aiPlayer1 = new playerAi(1,3,4,5);

    int time = 0;
    Player player1 = new Player(1,3,4,5);


    public void settings() {
        size(800, 800);   // set the window size

    }

    public void setup() {
        aiPlayerTimer =0;
        Elixer = 0;

        // TODO: initialize game variables
    }

    /***
     * Draws each frame to the screen.  Runs automatically in a loop at frameRate frames a second.
     * tick each object (have it update itself), and draw each object
     */
    public void draw() {
        time++;
        aiPlayerTimer++;




        background(0, 255, 0);    // paint screen white
        //Water
        fill(0, 0, 255);
        rect(0, 325, 800, 150);

        //BrownThingy
        fill(102, 51, 0);
        rect(325, 225, 150, 350);


        //Towers
        fill(255);
        rect(325, 700, 150, 100);

        fill(255);
        rect(325, 0, 150, 100);





        //TIMER
        if (time == 180) {
            if (Elixer < 10) {
                Elixer++;
            }
            System.out.println(Elixer);
            time = 0;
        }
        aiPlayer1.randomlyPlaced(this);
        if (aiPlayerTimer == 100){
            aiPlayer1.pathFinder();

        }


        aiPlayer1.draw(this);
        /*System.out.println(aiPlayer1.isPlaced);*/



        player1.keyIsPressed(this);
        player1.draw(this);







    }
    public static void main(String[] args) {
        PApplet.main("Game");
    }
}

