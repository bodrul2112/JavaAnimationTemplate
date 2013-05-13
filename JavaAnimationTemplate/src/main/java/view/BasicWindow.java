package view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;

import model.animation.internal.ExampleDrawableObject;
import model.animation.panel.AnimationPanel;

public class BasicWindow extends JFrame
{
	private static final long serialVersionUID = -6674369946797942994L;

	public BasicWindow() {
		this.setSize(800, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		this.setLayout(new GridLayout(1, 1));
		
		AnimationPanel animationPanel = new AnimationPanel(800, 600, 300);
		animationPanel.setBackgroundColor(Color.BLACK);
		int rightDirectionIncrement = 1;
		ExampleDrawableObject simpleDrawableObj = new ExampleDrawableObject(800, 600, rightDirectionIncrement, Color.BLUE);
		simpleDrawableObj.setDelayMillis(1);
		simpleDrawableObj.startRefreshing();
		
		int leftDirectionIncrement = -3;
		ExampleDrawableObject simpleDrawableObj2 = new ExampleDrawableObject(800, 600, leftDirectionIncrement, Color.ORANGE);
		simpleDrawableObj2.setDelayMillis(1);
		simpleDrawableObj2.startRefreshing();
		
		animationPanel.addToDrawableList(simpleDrawableObj);
		animationPanel.addToDrawableList(simpleDrawableObj2);
		animationPanel.startAnimation();
		this.add(animationPanel);
		
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new BasicWindow();
	}
}
