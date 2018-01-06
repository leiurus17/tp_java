package com.tp.appletbasics;

import java.applet.Applet;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Graphics;

public class ExampleEventHandling extends Applet implements MouseListener {

	StringBuffer strBuffer;
	
	public void init() {
		addMouseListener(this);
		strBuffer = new StringBuffer();
		addItem("Initializing the apple ");
	}
	
	public void start() {
		addItem("Starting the applet ");
	}
	
	public void stop() {
		addItem("Stopping the applet ");
	}
	
	public void destroy() {
		addItem("Unloading the applet ");
	}
	
	void addItem(String word) {
		System.out.println(word);
		strBuffer.append(word);
		repaint();
	}
	
	public void paint(Graphics g) {
		// Draw a Rectangle around the applet's display area.
		g.drawRect(0, 0,
			getWidth() - 1,
			getHeight() - 1);

		// Display the string inside the rectangle.
		g.drawString(strBuffer.toString(), 10, 20);
		
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		addItem("Mouse clicked! ");
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
	}

}
