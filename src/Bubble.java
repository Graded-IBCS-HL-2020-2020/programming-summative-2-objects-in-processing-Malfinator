/* YOU SHOULD COMPLETE AND UNDERSTAND THE Ball.java PART OF THIS PROJECT FIRST */

class Bubble {
    /**
     * SUMMATIVE REQUIRED Add reasonable default values for all that are missing
     * them. Bubbles should, by default, rise UPWARD over time.
     */
    private Sketch sketch;
    private float diameter;
    private float x;
    private float y;
    private int col;
    private int borderColor; 
    private float speedY;
    private float speedX;

    /**
     * SUMMATIVE REQUIRED Add two constructors for the Bubble class, one that is
     * mostly default and one that allows custom values for whichever you want to be
     * able to change SUMMATIVE OPTIONAL Make it so that some of your constructors
     * (including possibly the default) use a random number to set the position
     * and/or speed of the object.
     * 
     * SUMMATIVE OPTIONAL Add more than two constructors for varying levels of
     * customization
     */

    public Bubble(Sketch s) {
        sketch = s;
        diameter = sketch.random(25, 75);
        x = sketch.random(diameter / 2, sketch.width - diameter / 2);
        y = sketch.random(diameter / 2, sketch.height - diameter / 2);
        col = sketch.color(255, 255, 255, 100);
        speedX = sketch.random(-2, 2);
        speedY = sketch.random(-3, -1);
    }

    /*
     * SUMMATIVE REQUIRED Add a method called `getRadius()` that returns a float
     * representing the radius of the bubble
     */

    public float getRadius() {
        return diameter / 2;
    }

    /** Draws the bubble. */
    public void drawBubble() {
        sketch.stroke(borderColor);
        sketch.fill(col);
        sketch.ellipse(x, y, diameter, diameter);
    }

    /** Moves the balls. */
    public void moveBubble() {

        /*
         * SUMMATIVE OPTIONAL Tweak this method so that the bubbles don't bounce off the
         * left and right sides, but loop around to the other side instead.
         */

        /* SUMMATIVE OPTIONAL Tweak bubble movement so that it moves more randomly */

        /* If the bubble is on the left or right edge, bounce! */
        if (x > (sketch.width - getRadius()) || x < getRadius()) {
            speedX = -speedX;
        }
        /* If the ball goes off the top, move it to the bottom. */
        if (y < (-getRadius())) {
            y = sketch.height + getRadius();
        }
        /* If the bubble goes off the bottom, move it to the top. */
        if (y > (sketch.height + getRadius())) {
            y = -getRadius();
        }
        x += speedX;
        y += speedY;

    }
}
