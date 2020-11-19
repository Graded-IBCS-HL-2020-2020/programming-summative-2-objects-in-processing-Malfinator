/* YOU SHOULD COMPLETE AND UNDERSTAND THE Ball.java and Bubble.java parts first! */
/* DON'T FORGET TO RENAME THE FILE TO Snowflake.java WHEN READY TO TEST! */

class Snowflake {

    private Sketch s;
    private float diameter;
    private float x;
    private float y;
    private int col; 
    private float speedY;
    private float speedX;

public Snowflake(Sketch sketch) {
        s = sketch;
        diameter = s.random(5, 50);
        x = s.random(diameter / 2, s.width - diameter / 2);
        y = s.random(diameter / 2, s.height - diameter / 2);
        col = 255;
        speedY = s.random(0,20);
        speedX = s.random(0,20);
}

        public Snowflake(Sketch sketch, float diam, float X, float Y, int cor, float spdY, float spdX) {
          s = sketch;
          diameter = diam;
          x = X;
          y = Y;
          col = cor;
          speedY = spdY;
          speedX = spdX;
}
public float getRadius() {
        return diameter / 2;
    }
    
    /*
     * SUMMATIVE REQUIRED Implement this entire class. ONLY drawSnowflake() and
     * moveSnowflake() have been implemented for you! I recommend using your
     * Bubble.java as a template. Start by creating your instance variables and
     * constructors.
     */

    /** Draws the flake. */
    public void drawSnowflake() {
        s.stroke(col);
        s.line(x - getRadius() / 2, y - getRadius() / 2, x + getRadius() / 2, y + getRadius() / 2);
        s.line(x - getRadius() / 2, y + getRadius() / 2, x + getRadius() / 2, y - getRadius() / 2);
        s.line(x - getRadius(), y, x + getRadius(), y);
        s.line(x, y - getRadius(), x, y + getRadius());
    }

    /** Moves the flake */
    public void moveSnowflake() {
        if (x > (s.width - getRadius()) || x < getRadius()) {
            speedX = -speedX;
        }
        if (y < (-getRadius())) {
            y = s.height + getRadius();
        }
        if (y > (s.height + getRadius())) {
            y = -getRadius();
        }
        x += speedX;
        y += speedY;

    }
}
//Made by Malfinator in collaboration with G r i s w o l d, creating java programs which increase my self-esteem since 2020