

package week2;

import java.awt.Image;

import processing.core.*;

public class HelloGUI extends PApplet {
	private String URL = "http://funflightscom.c.presscdn.com/wp-content/uploads/2014/04/LaJolla.jpg";
	private PImage bkgrndImage;	
	public void setup() {
		
		bkgrndImage = loadImage(URL,"jpg");
		size(400,400);
		
	}
	
	public void draw(){
		bkgrndImage.resize(0, height);
		image(bkgrndImage,0,0);
		
		ellipse(50,50,100,100);
		
	}
}


