/** MAKE SURE TO READ THE README CAREFULLY BEFORE YOU BEGIN EDITING THIS CODE */
class Ball {
    private Sketch s;
    private float diameter;
    private float x;
    private float y;
    private int col;
    private float speedY;
    private float speedX;
    private int borderCor;

    /**
     * The default constructor generates random values for most of the instance
     * variables.
     */
    public Ball(Sketch sketch) {
        s = sketch;
        diameter = s.random(50, 150); // random diameter between 50 and 150
        x = s.random(diameter / 2, s.width - diameter / 2);
        y = s.random(diameter / 2, s.height - diameter / 2);
        col = s.randomColor(false);
        speedY = s.random(5, 10);
        speedX = s.random(5, 10);

        /*
         * SUMMATIVE REQUIRED use the randomColor() method in the sketch to set default
         * balls to a solid random color
         */

        /*
         * SUMMATIVE REQUIRED Set speedX and speedY to reasonable defaults. Random
         * numbers could be nice, but are not required.
         */
    }

    /** This constructor lets you specify all of the ball instance variables */
    public Ball(Sketch sketch, float ballDiam, float X, float Y,  int ballColor, float sx, float sy, int ballBorder) {
        s = sketch;
        x = X;
        y = Y;
        diameter = ballDiam;
        col = ballColor;
        speedX = sx;
        speedY = sy;
        borderCor = ballBorder;

        /* SUMMATIVE REQUIRED Fill out this constructor */
    }
    public float getRadius() {
        return diameter / 2;
    }
    public void stop() {
        speedY = 0;
        speedX = 0;
    }

    public void start() {
        col = s.randomColor(false);
        speedY = s.random(5, 10);
        speedX = s.random(5, 10);
    }
    public float getDistance() {
        return (float) Math.sqrt(((x - s.mouseX) * (x-s.mouseX)) - ((y - s.mouseY) * (y - s.mouseY)));
    }


    /*
     * SUMMATIVE REQUIRED Add a method called `getRadius()` that returns a float
     * representing the radius of the ball
     */

    /*
     * SUMMATIVE OPTIONAL Add a method called `stop()` that sets the ball speed to
     * 0, and another one called `start()` that starts it moving again, either at
     * the same speed as before or a random speed.
     * 
     * If you create the methods, you'll need to think of a way to test them...
     */

    /** Draws the ball. */
    public void drawBall() {
        /*
         * SUMMATIVE OPTIONAL Make it possible to change the border color of these balls
         * as well as the fill color. Change the `sketch.stroke(col)` line below to use
         * the border color to make it show up. You will need to make other changes too.
         */

        s.stroke(borderCor);
        s.fill(col);
        s.ellipse(x, y, diameter, diameter);
    }

    /** Moves the balls. */
    public void moveBall() {

        /* If the ball is on the edge, flip the direction. Bounce! */
        if (x > (s.width - getRadius()) || x < getRadius()) {
            speedX = -speedX;
        }
        if (y > (s.height - getRadius()) || y < getRadius()) {
            speedY = -speedY;
        }
        /* Add the speed in both directions to move the ball */
        x += speedX;
        y += speedY;
    }
}
//Made by Malfinator in collaboration with G r i s w o l d, creating java programs which increase my self-esteem since 2020