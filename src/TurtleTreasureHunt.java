import java.awt.JobAttributes;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.ImageBackground;
import org.teachingextensions.logo.Paintable;
import org.teachingextensions.logo.Tortoise;

/** Note: You will need the latest version of the TKP jar: http://school.wintrisstech.org/jars/TeachingKidsProgramming.jar **/

public class TurtleTreasureHunt implements KeyEventDispatcher {

	int tortoiseSpeed = 5;

	private void goUp() {
		Tortoise.setAngle(0);
		Tortoise.move(tortoiseSpeed);

	}

	private void goDown() {
		
		Tortoise.setAngle(180);
		Tortoise.move(tortoiseSpeed);

	}

	private void goLeft() {
		
		Tortoise.setAngle(-90);
		Tortoise.move(tortoiseSpeed);
		

	
	
	}

	private void goRight() {
		
		Tortoise.setAngle(90);
		Tortoise.move(tortoiseSpeed);
	}
	int x = 0;
	private void spaceBarWasPressed() {
		int tortoiseLocationX = Tortoise.getX();
		int tortoiseLocationY = Tortoise.getY();

		// 5. Print out the variables for tortoiseLocationX and tortoiseLocationY
		System.out.println(tortoiseLocationX);
		System.out.println(tortoiseLocationY);
		
		// 6. If tortoise is at same location as the little girl,
		// 			make a pop-up tell the Tortoise where to go next
		if(480<tortoiseLocationX && tortoiseLocationX<520 && 302<tortoiseLocationY && tortoiseLocationY<342){
			JOptionPane.showMessageDialog(null, "Oh please kind turtle, take my word of advise!");
			JOptionPane.showMessageDialog(null, "I do not know about the treasure, but Jimmy's really wise");
			x=1;
		}

		// 7. Give the user subsequent clues at different locations on the image
		// (pirate robot, swamp, parrots, etc.)
		if(x==1 && 125<tortoiseLocationX && tortoiseLocationX<165 && 285<tortoiseLocationY && tortoiseLocationY<325){
			JOptionPane.showMessageDialog(null, "Well I do not know much about the treasure,");
			JOptionPane.showMessageDialog(null, "but my liquid friend does! He's such a pleasure");
			x=2;
		}
		if(x==2 && 365<tortoiseLocationY && tortoiseLocationY<425){
			JOptionPane.showMessageDialog(null, "I may not be solid, but I do know a thing!");
			JOptionPane.showMessageDialog(null, "The pirate will make a bell in your head ring!");
			x=3;
		
		}
		if(x==3 && 170<tortoiseLocationY && 390>tortoiseLocationY && 365<tortoiseLocationX && 463>tortoiseLocationY){
			JOptionPane.showMessageDialog(null, "Congratulations! You made it all the way here!");
			JOptionPane.showMessageDialog(null, "The treasure's behind the gigantic skull's ear.");
			x=4;
		}
		if(x==4 && 50<tortoiseLocationX && 80>tortoiseLocationX && 35<tortoiseLocationY && 65>tortoiseLocationY){
			JOptionPane.showMessageDialog(null, "Congrats, man! You found all the dough");
			JOptionPane.showMessageDialog(null, "It's not there? Maybe check right below?");
			x=5;
		}
		if(x==5 && 50<tortoiseLocationX && 80>tortoiseLocationX && 190<tortoiseLocationY && 230>tortoiseLocationY){
			JOptionPane.showMessageDialog(null, "What? You're looking for the hidden treasure?");
			JOptionPane.showMessageDialog(null, "Well I got hungry and ate it, it was such a pleasure");
			JOptionPane.showMessageDialog(null, "Sorry man, I wasted your time!");
			JOptionPane.showMessageDialog(null, "Well I'll have you know, that you are prime!");
			JOptionPane.showMessageDialog(null, "just kidding you are not prime");
		
			
	
		}
		
		
		

		
	}

	private void go() {
		KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(this);
		/*
		 * If you want to use your own background, download the image you want, and change the following line to point to it like: new
		 * ImageBackground("file:/Users/joonspoon/Desktop/dinosaurLand.jpg");
		 */
		Paintable backgroundImage = new ImageBackground("file:/Users/League/Google Drive/league-images/treasure_hunt.jpg");
		Tortoise.getBackgroundWindow().addPaintable(backgroundImage);
		Tortoise.penUp();
		JOptionPane.showMessageDialog(null, "Ask the little girl for help with your quest. Press the space bar to ask.");
	}

	public boolean dispatchKeyEvent(KeyEvent e) {
		if (e.getID() == KeyEvent.KEY_PRESSED) {
			if (e.getKeyCode() == KeyEvent.VK_RIGHT)
				goRight();
			else if (e.getKeyCode() == KeyEvent.VK_LEFT)
				goLeft();
			else if (e.getKeyCode() == KeyEvent.VK_UP)
				goUp();
			else if (e.getKeyCode() == KeyEvent.VK_DOWN)
				goDown();
			else if (e.getKeyCode() == KeyEvent.VK_SPACE)
				spaceBarWasPressed();
		}
		return false;
	}

	public static void main(String[] args) throws MalformedURLException {
		new TurtleTreasureHunt().go();
	}
}

