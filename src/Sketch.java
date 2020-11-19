
/** MAKE SURE TO READ THE README CAREFULLY BEFORE YOU BEGIN EDITING THIS CODE */
import processing.core.PApplet;

public class Sketch extends PApplet {

    /*
     * SUMMATIVE REQUIRED Declare at least four balls, four bubbles, and four
     * snowflakes as instance variables. I have made the first ball for you.
     * 
     * SUMMATIVE OPTIONAL Use *arrays* to store the elements, rather than individual
     * variables.
     */
    
    Ball[] balls;
    Bubble[] bubbles;
    Snowflake[] flakes;
 


    public void settings() {
        size(500, 500);
    }

    /*
     * SUMMATIVE REQUIRED Initialize the balls, bubbles, and snowflakes using your
     * constructors inside of setup(). You must use a non-default-constructor at
     * least once and a default constructor at least once for each type.
     * 
     * I have done the first ball for you.
     */
    public void setup() {
        frameRate(15);
       balls = new Ball[]{
         new Ball(this, 20, 20, 5, 0, 10, 10, 255), 
         new Ball(this), 
         new Ball(this), 
         new Ball(this)};
       bubbles = new Bubble[]{
         new Bubble(this, 5, 10, 10, 255, 5, 5, 200), 
         new Bubble(this), 
         new Bubble(this), 
         new Bubble(this)};
       flakes = new Snowflake[]{
         new Snowflake(this, 1, 7, 5, 0, 15, 15), 
         new Snowflake(this), 
         new Snowflake(this), 
         new Snowflake(this)};
    }
    

    public void draw() {
        background(100);

        /* SUMMATIVE REQUIRED Draw and move all balls, snowflakes, and bubbles */
        balls[0].drawBall();
        balls[0].moveBall();
        balls[1].drawBall();
        balls[1].moveBall();
        balls[2].drawBall();
        balls[2].moveBall();
        balls[3].drawBall();
        balls[3].moveBall();
        bubbles[0].drawBubble();
        bubbles[0].moveBubble();
        bubbles[1].drawBubble();
        bubbles[1].moveBubble();
        bubbles[2].drawBubble();
        bubbles[2].moveBubble();
        bubbles[3].drawBubble();
        bubbles[3].moveBubble();
        flakes[0].drawSnowflake();
        flakes[0].moveSnowflake();
        flakes[1].drawSnowflake();
        flakes[1].moveSnowflake();
        flakes[2].drawSnowflake();
        flakes[2].moveSnowflake();
        flakes[3].drawSnowflake();
        flakes[3].moveSnowflake();
        
    }

    /**
     * Convenience method to return a random color
     * 
     * @param transluscent if true, make the color transluscent, otherwise solid
     */
    public int randomColor(boolean transluscent) {
        int alpha;
        if (transluscent) {
            alpha = 125;
        } else {
            alpha = 255;
        }
        return color(random(0, 255), random(0, 255), random(0, 255), alpha);
    }

     public void mousePressed() {
      if (balls[0].getDistance() < balls[0].getRadius())
      balls[0].stop();
      if (balls[1].getDistance() < balls[1].getRadius())
      balls[1].stop();
      if (balls[2].getDistance() < balls[2].getRadius())
      balls[2].stop();
      if (balls[3].getDistance() < balls[3].getRadius())
      balls[3].stop();


         
     }
     public void mouseReleased() {
        if (balls[0].getDistance() < balls[0].getRadius())
      balls[0].start();
      if (balls[1].getDistance() < balls[1].getRadius())
      balls[1].start();
      if (balls[2].getDistance() < balls[2].getRadius())
      balls[2].start();
      if (balls[3].getDistance() < balls[3].getRadius())
      balls[3].start();

         
     }

    /*
     * SUMMATIVE OPTIONAL Add a void method called mousePressed() that stops some or
     * all of the balls from moving when you click the mouse. (it will run
     * automatically when you click if the name is correct)
     * 
     * EXTRA CHALLENGE - can you make it so that only the ball you actually CLICKED
     * stops? (this is a major challenge - you can use the variables mouseX and
     * mouseY to see where the mouse was clicked.)
     */

    public static void main(String[] args) {
        PApplet.main("Sketch");
    }
}
//Made by Malfinator in collaboration with G r i s w o l d, creating java programs which increase my self-esteem since 2020