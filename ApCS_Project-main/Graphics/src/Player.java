import processing.core.PApplet;

public class Player {
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;
    protected int elixerValue;
    protected int health;
    protected boolean isPlaced;


    public Player(int xSpeed, int ySpeed, int elixerValue, int health) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        this.elixerValue = elixerValue;
        this.health = health;
        isPlaced = false;
    }

    public void draw(PApplet window) {
        window.fill(0);
        window.ellipse(x, y, 50, 50);
    }

    public int keyIsPressed(PApplet window) {
        int someX = window.mouseX;
        int someY = window.mouseY;
        if (!isPlaced) {
            if (window.key == '1' || window.key == '2' || window.key == '3') {
                if (window.key == '1') {
                    x = someX;
                    y = someY;
                    window.fill(0);
                    window.ellipse(x, y, 50, 50);
                    isPlaced = true;
                    return -1;

                }
                if (window.key == '2') {
                    x = someX;
                    y = someY;
                    window.fill(255);
                    window.ellipse(x, y, 50, 50);
                    isPlaced = true;
                    return -2;
                }
                if (window.key == '3') {
                    x = someX;
                    y = someY;
                    window.fill(0, 125, 125);
                    window.ellipse(x, y, 50, 50);
                    isPlaced = true;
                    return -3;
                }
            }
        }
        return 0;
    }
}

/*    public static double calcDist(double bridgeEnd){


    }*/


