
import processing.core.PApplet;

public class Sketch extends PApplet {

    /*
     * SUMMATIVE REQUIRED Generate at least four balls, four snowflakes, and four
     * bubbles. At least one ball must use the default constructor (passing only
     * *this* as a parameter) I have made the first ball for you.
     * 
     * SUMMATIVE OPTIONAL Use *arrays* to store the elements, rather than individual
     * variables.
     */
    Ball b1, b2, b3, b4;
    Bubble b5, b6, b7, b8;
    Snowflake f1, f2, f3, f4;

    public void settings() {
        size(500, 500);
    }

    public void setup() {
        b1 = new Ball(this); // default
        b2 = new Ball(this);
        b3 = new Ball(this);
        b4 = new Ball(this);
        b5 = new Bubble(this);
        b6 = new Bubble(this);
        b7 = new Bubble(this);
        b8 = new Bubble(this);
        f1 = new Snowflake(this);
        f2 = new Snowflake(this);
        f3 = new Snowflake(this);
        f4 = new Snowflake(this);
    }

    public void draw() {
        // paint the background gray
        background(100);

        /*
         * SUMMATIVE REQUIRED Draw and move all balls, snowflakes, and bubbles
         */
        b1.drawBall();
        b1.moveBall();
        b2.drawBall();
        b2.moveBall();
        b3.drawBall();
        b3.moveBall();
        b4.drawBall();
        b4.moveBall();
        b5.drawBubble();
        b5.moveBubble();
        b6.drawBubble();
        b6.moveBubble();
        b7.drawBubble();
        b7.moveBubble();
        b8.drawBubble();
        b8.moveBubble();
        f1.drawSnowflake();
        f1.moveSnowflake();
        f2.drawSnowflake();
        f2.moveSnowflake();
        f3.drawSnowflake();
        f3.moveSnowflake();
        f4.drawSnowflake();
        f4.moveSnowflake();
    }

    /*
     * SUMMATIVE OPTIONAL Add a method called mousePressed() that stops some or all
     * of the balls from moving when you click the mouse.
     * 
     * EXTRA CHALLENGE - can you make it so that only the ball you actually CLICKED
     * stops? (this is a major challenge - you can use the variable mouseX and
     * mouseY to see where the mouse was clicked.)
     */

    public static void main(String[] args) {
        PApplet.main("Sketch");
    }
}
