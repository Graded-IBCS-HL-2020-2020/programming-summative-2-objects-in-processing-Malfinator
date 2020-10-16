
class Ball {
    private Sketch sketch;
    private float diameter;
    private float x;
    private float y;
    private int col;
    private float speedY;
    private float speedX;

    public Ball(Sketch s) {
        sketch = s;
        diameter = sketch.random(50, 150);
        x = sketch.random(diameter / 2, sketch.width - diameter / 2);
        y = sketch.random(diameter / 2, sketch.height - diameter / 2);

        col = sketch.color(sketch.random(0, 255), sketch.random(0, 255), sketch.random(0, 255));

        speedX = sketch.random(-2, 2);
        speedY = sketch.random(-5, 5);
    }

    /*
     * SUMMATIVE OPTIONAL Add at least one more constructor that lets you customize
     * only SOME of the characteristics, making it easier to build your balls in
     * Sketch.java
     * 
     * SUMMATIVE OPTIONAL Make it so that some of your constructors (including
     * possibly the default) use random values to set the position, color, and/or
     * speed of the object. You can use sketch.random() to generate random values.
     */
    public Ball(Sketch s, float X, float Y, float ballDiam, int ballColor, float sx, float sy) {
        sketch = s;
        x = X;
        y = Y;
        diameter = ballDiam;
        col = ballColor;
        speedX = sx;
        speedY = sy;
    }

    /*
     * SUMMATIVE REQUIRED Add a method called `getRadius()` that returns a float
     * representing the radius of the ball
     */

    public float getRadius() {
        return diameter / 2;
    }

    /*
     * SUMMATIVE OPTIONAL Add a method called `stop()` that sets the ball speed to
     * 0, and another one called `start()` that starts it moving again.
     */

    /** Draws the ball. */
    public void drawBall() {
        /*
         * SUMMATIVE OPTIONAL Make it possible to change the border color of these balls
         * as well as the fill color. Change the `sketch.stroke(col)` line below to use
         * the border color to make it show up. You will need to make other changes too.
         */

        sketch.stroke(col);
        sketch.fill(col);
        sketch.ellipse(x, y, diameter, diameter);
    }

    /** Moves the balls. */
    public void moveBall() {

        /* If the ball is on the edge, flip the direction. Bounce! */
        if (x > (sketch.width - getRadius()) || x < getRadius()) {
            speedX = -speedX;
        }
        if (y > (sketch.height - getRadius()) || y < getRadius()) {
            speedY = -speedY;
        }
        /* Add the speed in both directions to move the ball */
        x += speedX;
        y += speedY;
    }
}