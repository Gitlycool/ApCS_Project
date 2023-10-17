import processing.core.PApplet;

public class Player {
    private int x;
    private int y;
   private int xSpeed;
    private int ySpeed;
   private int elixerValue;
    private int health;
    private int counter;

    public Player(int xSpeed, int ySpeed, int elixerValue, int health, PApplet window) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        this.elixerValue = elixerValue;
        this.health = health;
        counter = 0;
    }

    public void draw(PApplet window) {
        window.fill(0);
        window.ellipse(x, y, 50, 50);
    }

    public void handleKeyRelease(char key, PApplet window) {

        if (counter == 0) {
            if (key == '1') {
                x = window.mouseX;
                y = window.mouseY;
                window.fill(0);
                window.ellipse(x, y, 50, 50);
                counter++;
            }
            if (key == '2') {
                x = window.mouseX;
                y = window.mouseY;
                window.fill(255);
                window.ellipse(x, y, 50, 50);
                counter++;
            }
            if (key == '3') {
                window.fill(0, 125, 125);
                x = window.mouseX;
                y = window.mouseY;
                window.ellipse(x, y, 50, 50);
                counter++;
            }
        }

/*    public static double calcDist(double bridgeEnd){


    }*/
    }
}
