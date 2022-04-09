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
    drawHouse(130, 160, 240, 148, 61, 61, 130, 127, 127, 203, 212, 211);

    // Draw Door 
    drawDoor(220, 310, 60, 90, 79, 5, 5, 110, 0, 0);

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
   * @param HouseR: "Red" colour value for the RGB colour of the house
   * @param HouseG: "Green" colour value for the RGB colour of the house
   * @param HouseB: "Blue" colour value for the RGB colour of the house
   * @param RoofR: "Red" colour value for the RGB colour of the roof
   * @param RoofG: "Green" colour value for the RGB colour of the roof
   * @param RoofB: "Blue" colour value for the RGB colour of the roof
   * @param WindowR: "Red" colour value for the RGB colour of the window
   * @param WindowG: "Green" colour value for the RGB colour of the window
   * @param WindowB: "Blue" colour value for the RGB colour of the window
   * 
   */
  public void drawHouse(float HouseX, float HouseY, float HouseSize, float HouseR, float HouseG, float HouseB, float RoofR, float RoofB, float RoofG, float WindowR, float WindowG, float WindowB) {
    
    stroke(0,0,0);
    strokeWeight(1);

    // Draw House + Roof
    fill(HouseR, HouseG, HouseB);
    rect(HouseX,HouseY,HouseSize,HouseSize);
    
    fill(RoofR, RoofG, RoofB);
    rect(HouseX + 180, HouseY - 80, HouseSize * 0.17f, HouseSize * 0.25f);
    triangle(HouseX - 30, HouseY, HouseX + 120, HouseY - 80, HouseX + 270, HouseY);

    // Draw Windows  
    fill(WindowR, WindowG, WindowG);
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
   * @param doorR: "Red" colour value for the RGB colour of the door
   * @param doorG: "Green" colour value for the RGB colour of the door
   * @param doorB: "Blue" colour value for the RGB colour of the door
   * @param knobR: "Red" colour value for the RGB colour of the doorknob
   * @param knobG: "Green" colour value for the RGB colour of the doorknob
   * @param knobB: "Blue" colour value for the RGB colour of the doorknob
   * 
   */
  public void drawDoor(float doorX, float doorY, float doorWidth, float doorHeight, float doorR, float doorG, float doorB, float knobR, float knobG, float knobB){
    
    // Draw Door
    fill(doorR, doorG, doorB);
    rect(doorX, doorY, doorWidth, doorHeight);

    // Draw Doorknob
    fill(knobR, knobG, knobB);
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