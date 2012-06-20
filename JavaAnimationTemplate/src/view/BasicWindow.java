package view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;

import model.animation.internal.SimpleDrawableObj;
import model.animation.panel.AnimationPanel;

public class BasicWindow extends JFrame
{
	public BasicWindow() {
		this.setSize(800, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		this.setLayout(new GridLayout(1, 1));
		
		AnimationPanel animationPanel = new AnimationPanel(800, 600, 300);
		animationPanel.setBackgroundColor(Color.BLACK);
		SimpleDrawableObj simpleDrawableObj = new SimpleDrawableObj(800, 600, 1, Color.BLUE);
		simpleDrawableObj.setDelayMillis(1);
		simpleDrawableObj.startRefreshing();
		
		
		SimpleDrawableObj simpleDrawableObj2 = new SimpleDrawableObj(800, 600, -3, Color.ORANGE);
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
