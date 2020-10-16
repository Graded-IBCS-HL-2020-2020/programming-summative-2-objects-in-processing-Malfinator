
/* YOU SHOULD COMPLETE AND UNDERSTAND THE Ball.java and Bubble.java parts first! */

class Snowflake {
    /*
     * SUMMATIVE REQUIRED Implement this entire class. ONLY drawSnowflake() and
     * moveSnowflake() have been implemented for you! I recommend using your
     * Bubble.java as a template. Start by creating your instance variables and
     * constructors.
     */

    private Sketch sketch;
    private float diameter;
    private float x;
    private float y;
    private int col;
    private float speedY;
    private float speedX;

    public Snowflake(Sketch s) {
        sketch = s;
        diameter = sketch.random(20, 50);
        x = sketch.random(diameter / 2, sketch.width - diameter / 2);
        y = sketch.random(diameter / 2, sketch.height - diameter / 2);
        speedX = sketch.random(-1, 1);
        speedY = sketch.random(1, 3);
        col = 255;
    }

    public float getRadius() {
        return diameter / 2;
    }

    /** Draws the flake. */
    public void drawSnowflake() {
        sketch.stroke(col);
        sketch.line(x - getRadius() / 2, y - getRadius() / 2, x + getRadius() / 2, y + getRadius() / 2);
        sketch.line(x - getRadius() / 2, y + getRadius() / 2, x + getRadius() / 2, y - getRadius() / 2);
        sketch.line(x - getRadius(), y, x + getRadius(), y);
        sketch.line(x, y - getRadius(), x, y + getRadius());
    }

    /** Moves the flake */
    public void moveSnowflake() {
        if (x > (sketch.width - getRadius()) || x < getRadius()) {
            speedX = -speedX;
        }
        if (y < (-getRadius())) {
            y = sketch.height + getRadius();
        }
        if (y > (sketch.height + getRadius())) {
            y = -getRadius();
        }
        x += speedX;
        y += speedY;

    }
}
