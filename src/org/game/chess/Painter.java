package org.game.chess;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Painter extends JPanel {

	private Image background;
	
	public Painter() {
		background = new ImageIcon(getClass().getResource("map.jpg")).getImage();
	}
	
	public void paint(Graphics g) {
		g.drawImage(background, 0, 0, null);
	}
}
