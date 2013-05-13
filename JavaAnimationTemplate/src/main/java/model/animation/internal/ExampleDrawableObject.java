package model.animation.internal;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

import model.animation.drawable.Drawable;
import model.animation.drawable.Refreshable;

public class ExampleDrawableObject extends Refreshable implements Drawable 
{
	public final static int LEFT = -1 ;
	public final static int RIGHT = 1 ;
	
	private int sliderX;
	private BasicStroke stroke = new BasicStroke(3);
	
	private int height;
	private int width;
	private int direction;
	private Color color;
	
	public ExampleDrawableObject(int width, int height, int direction, Color color) {
		this.width = width;
		this.height = height;
		this.direction = direction;
		this.color = color;
	}

	@Override
	public void draw(Graphics2D g2d) {
		g2d.setColor(color);
		g2d.setStroke(stroke);
		g2d.drawLine(sliderX, 0, sliderX, height);
	}

	@Override
	public void step() {

		sliderX+=direction; 
		if(sliderX > width){
			sliderX=0;
		}
		
		if(sliderX < 0){
			sliderX=width;
		}
	}

}
