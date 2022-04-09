import processing.core.PApplet;

/**
 * Description: Draws a composite object using methods with parameters.
 * @author: B. Chan
 */

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    drawGround(0, 400, 50);
  }
  
  public void drawGround(float groundX, float groundY, float groundHeight) {
    noStroke();
    
    // Draw Grass
    fill(57, 184, 65);
    rect(groundX, groundY, groundHeight * 10, groundHeight);

    // Draw Dirt
    fill(107, 68, 27);
    rect(groundX, groundY + groundHeight, groundHeight * 10, groundHeight);
  }

  
  // define other methods down here.
}