package TableBallGame;

import java.awt.*;
import javax.swing.*;

public class Demo01 extends JFrame {
	
	
	void launchFrame() {
		setSize(300,300);
		setLocation(400,400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		System.out.println("Hello World");
		Demo01 game = new Demo01();
		game.launchFrame();
	}
}
