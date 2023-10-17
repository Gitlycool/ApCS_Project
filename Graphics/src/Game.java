import processing.core.PApplet;

import javax.swing.*;

public class Game extends PApplet {
    int Elixer;
    int time = 0;
    Player player1 = new Player(3, 3, 1, 5,this);
    Player player2 = new Player(5, 5, 2, 8,this);


    public void settings() {
        size(800, 800);   // set the window size

    }

    public void setup() {
        Elixer = 0;

        // TODO: initialize game variables
    }

    /***
     * Draws each frame to the screen.  Runs automatically in a loop at frameRate frames a second.
     * tick each object (have it update itself), and draw each object
     */
    public void draw() {
        time++;
        background(0, 255, 0);    // paint screen white
        fill(0, 0, 255);
        rect(0, 325, 800, 150);

        fill(102, 51, 0);
        rect(325, 225, 150, 350);

        fill(255);
        rect(325, 700, 150, 100);

        fill(255);
        rect(325, 0, 150, 100);

        if (time == 180) {
            if (Elixer < 10) {
                Elixer++;
            }
            System.out.println(Elixer);
            time = 0;
        }
            player1.draw(this);

            player2.draw(this);


    }

    public void keyReleased(){
        player1.handleKeyRelease(key,this);
        player2.handleKeyRelease(key,this);
    }

    public static void main(String[] args) {
        PApplet.main("Game");
    }
}

