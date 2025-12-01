package com.pong;
import java.awt.Color;
import java.awt.Graphics;

public class SlowDown {
	private int x;
	private int y;
	private int height;
	private int width;
	private Color color = Color.RED;
	
	
	
	public SlowDown(int x, int y, int height, int width) {
		this.x = x;
        this.y = y;
        this.height = height;
        this.width=width;

	}
	
//	precondition: g is a non-null value
//		postcondition: draws the SlowDown on the screen
		public void draw(Graphics g) {
			g.setColor(color);
			
			g.fillRect(x, y, width, height);
			
		}
	
		//precondition: none
		//postcondition: returns the SlowDown' y value
			public int getY() {
				  return y;
			  }
			  
			//precondition: none
			//postcondition: returns the SlowDown's x value
			  public int getX() {
				  return x;
			  }
			  
			//precondition: ball is a non-null value
			//postcondition: returns true if the SlowDown is touching one the paddle this is called on
			  public boolean isTouching(Ball ball) {
					 int rightX= x+width;
					 int bottomY = y+height;
					
					 if(x <= ball.getX() && ball.getX()<=rightX) {
						 
						 if(bottomY >= ball.getY() && ball.getY()>=y) {
							 
							 return true;
						 }
				 }
					 return false;
				 }
}
