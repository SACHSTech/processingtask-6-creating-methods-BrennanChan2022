import processing.core.PApplet;

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
    drawHouse(0, 0, 0);
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

  public void drawHouse(float houseX, float houseY, float houseSize) {
      
    // Draw House
    stroke(0,0,0);
    strokeWeight(1);
    fill(148, 61, 61);
    rect(130,160,240,240);

    // Draw Rood
    fill(130, 127, 127);
    rect(310,80,40,60);
    triangle(100, 160, 250, 80, 400, 160);

    // Draw Door
    fill(79, 5, 5);
    rect(220,300,60,100);
    fill(110, 0, 0);
    ellipse(270, 350, 10, 10);

    // Draw Windows
    fill(203, 212, 211);
    ellipse(180, 270, 50, 60);
    ellipse(320, 270, 50, 60);
    rect(220,180,60,50);

    stroke(0,0,0);
    line(250, 180, 250, 230); 
    line(220, 205, 280, 205); 
  }
  
  // define other methods down here.
}