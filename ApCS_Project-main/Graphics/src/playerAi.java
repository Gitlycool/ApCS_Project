public class playerAi extends Player {
    public playerAi(int xSpeed, int ySpeed, int elixerValue, int health) {
        super(xSpeed, ySpeed, elixerValue, health);
    }
    public int randomlyPlaced(Game game) {
        if (!isPlaced) {
            int someX = (int) (Math.random() * 800);
            int someY = (int) (Math.random() * 325);
            int randomPlayer = (int) Math.random() * 3;
            if (randomPlayer == 0) {
                x = someX;
                y = someY;
                game.ellipse(x, y, 50, 50);
                isPlaced = true;
                return -1;
            }
            if (randomPlayer == 1) {
                x = someX;
                y = someY;
                game.ellipse(x, y, 50, 50);
                isPlaced = true;
                return -2;
            }
            if (randomPlayer == 2) {
                x = someX;
                y = someY;
                game.ellipse(x, y, 50, 50);
                isPlaced = true;
                return -3;
            }
            return 0;
        }
        return 0;
    }
    public void draw(Game game){
        game.fill(0);
        game.ellipse(x, y, 50, 50);
    }

    public double pathFinder(){
        return ((Math.sqrt(400 + x)*2 + (225 + y)*2));
    }


}
