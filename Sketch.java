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
    size(500, 500);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(176, 227, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    
    // Draw Grass and Dirt
    drawGround(0, 50);

    // Draw House 
    drawHouse(130, 160, 240);

    // Draw Door 
    drawDoor(220,310,60,90);

    //Draw Sun
    drawSun(40, 40, 60);
    
  }
  

  /**
   * Draws the grass and dirt
   * 
   * @param GrassX: Starting x coordinate of the grass layer
   * @param GrassHeight: Height of the grass and dirt layer
   * 
   */
  public void drawGround(float GrassX, float GrassHeight) {
    noStroke();
    
    // Draw Grass
    fill(57, 184, 65);
    rect(GrassX, height - (GrassHeight * 2), width, GrassHeight);

    // Draw Dirt
    fill(107, 68, 27);
    rect(GrassX, height - GrassHeight, width, GrassHeight);
  }


  /**
   * Draws House including the windows and roof
   * 
   * @param HouseX: Starting x coordinate of the House 
   * @param HouseY: Starting y coordinate of the House 
   * @param HouseSize: Size of the inital square base of the house
   * 
   */
  public void drawHouse(float HouseX, float HouseY, float HouseSize) {
    
    stroke(0,0,0);
    strokeWeight(1);

    // Draw House + Roof
    fill(148, 61, 61);
    rect(HouseX,HouseY,HouseSize,HouseSize);
    
    fill(130, 127, 127);
    rect(HouseX + 180, HouseY - 80, HouseSize * 0.17f, HouseSize * 0.25f);
    triangle(HouseX - 30, HouseY, HouseX + 120, HouseY - 80, HouseX + 270, HouseY);

    // Draw Windows  
    fill(203, 212, 211);
    ellipse(HouseX + 50, HouseY + 110, HouseSize * 0.21f, HouseSize * 0.25f);
    ellipse(HouseX + 190, HouseY + 110, HouseSize * 0.21f, HouseSize * 0.25f);
    rect(HouseX + 90, HouseY + 20, HouseSize * 0.25f, HouseSize * 0.21f);
  
    stroke(0,0,0);
    line(HouseX + 120, HouseY + 20, HouseX + 120, HouseY + 70); 
    line(HouseX + 90, HouseY + 45, HouseX + 150, HouseY + 45); 
  }


  /**
   * Draws the door and the doorknob for the house
   * 
   * @param doorX: x coordinate of the door 
   * @param doorY: y coordinate of the door 
   * @param doorWidth: Size of width of the door
   * @param doorHeight: Size of height of the door
   * 
   */
  public void drawDoor(float doorX, float doorY, float doorWidth, float doorHeight){
    
    // Draw Door
    fill(79, 5, 5);
    rect(doorX, doorY, doorWidth, doorHeight);

    // Draw Doorknob
    fill(110, 0, 0);
    ellipse(doorX + 50, doorY + 50, doorWidth * 0.17f, doorHeight * 0.1f);
  }


  /**
   * Draws a Sun in the corner of the image
   * 
   * @param SunX: x coordinate of the Sun 
   * @param SunY: y coordinate of the Sun 
   * @param SunSize: Size of the circle/Sun
   * 
   */
  public void drawSun(float SunX, float SunY, float SunSize){
    
    // Draw Sun
    noStroke();
    fill(255, 251, 33);
    ellipse(SunX, SunY, SunSize, SunSize);

  }

  // define other methods down here.
}