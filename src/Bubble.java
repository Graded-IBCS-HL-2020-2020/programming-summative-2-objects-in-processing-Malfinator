/* YOU SHOULD COMPLETE AND UNDERSTAND THE Ball.java PART OF THIS PROJECT FIRST */
/* DON'T FORGET TO RENAME THIS FILE TO Bubble.java WHEN YOU ARE READY TO TEST IT */

class Bubble {

    private Sketch s;
    private float diameter;
    private float x;
    private float y;
    private int col; 
    private int borderColor; 
    private float speedY;
    private float speedX;
     public Bubble(Sketch sketch) {
        s = sketch;
        diameter = s.random(10, 20);
        x = s.random(diameter / 2, s.width - diameter / 2);
        y = s.random(diameter / 2, s.height - diameter / 2);
        col = s.color(255, 150);
        speedY = s.random(-10, -20);
        speedX = 0;

     }

      public Bubble(Sketch sketch, float diam, float X, float Y, int cor, int borderCor, float spdY, float spdX) {
          s = sketch;
          diameter = diam;
          x = X;
          y = Y;
          col = cor;
          borderColor = borderCor;
          speedY = spdY;
          speedX = spdX;


     }
      public Bubble(Sketch sketch, float diam, float X, float Y, int borderCor, float spdX) {
        s = sketch;
        diameter = diam;
        x = X;
        y = Y;
        col = s.color(255, 150);
        speedY = s.random(-10, -20);
        speedX = 0;
      }

        


    
    /**
     * SUMMATIVE REQUIRED Add two constructors for the Bubble class, one that is
     * mostly default and one that allows custom values for whichever you want to be
     * able to change. Remember that bubbles should RISE - when setting default values,
     * take that into account!
     * 
     * You can use `s.color(255, 150)` to create a transluscent 
     * white color if you wish
     * 
     * SUMMATIVE OPTIONAL Make it so that some of your constructors (including
     * possibly the default) use a random number to set the position and/or speed of
     * the object.
     * 
     * SUMMATIVE OPTIONAL Add more than two constructors for varying levels of
     * customization
     */
    
     public float getRadius() {
        return diameter / 2;
    }
    /*
     * SUMMATIVE REQUIRED Add a method called `getRadius()` that returns a float
     * representing the radius of the bubble
     */

    /** Draws the bubble. */
    public void drawBubble() {
        s.stroke(borderColor);
        s.fill(col);
        s.ellipse(x, y, diameter, diameter);
    }

    /** Moves the balls. */
    public void moveBubble() {
    

        /*
         * SUMMATIVE OPTIONAL Tweak this method so that the bubbles don't bounce off the
         * left and right sides, but loop around to the other side instead.
         */
         if (x < (-getRadius())) {
             x = s.width + getRadius();
         }
         
         if (x > (s.width + getRadius())) {
             x = -getRadius();
         }
        /* SUMMATIVE OPTIONAL Tweak bubble movement so that it moves more randomly */

        /* If the bubble is on the left or right edge, bounce! */
        
        /* If the ball goes off the top, move it to the bottom. */
        if (y < (-getRadius())) {
            y = s.height + getRadius();
        }
        /* If the bubble goes off the bottom, move it to the top. */
        if (y > (s.height + getRadius())) {
            y = -getRadius();
        }
        x += speedX;
        y += speedY;

    }
}
//Made by Malfinator in collaboration with G r i s w o l d, creating java programs which increase my self-esteem since 2020