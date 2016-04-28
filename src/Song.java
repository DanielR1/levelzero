

import java.applet.AudioClip;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class Song {

	String name = "lol";
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Guess what song this is");
		int song = new Random().nextInt(2);
		if(song==0){
			playSound("everyonehasnotasteinmusicexceptforme.wav");
		}
		if(song==1){
			playSound("7 seas.wav");
		}
		if(song==2){
		
		}

		


		

		// 6. Make a pop-up for the player to type their answer.
		String answer = JOptionPane.showInputDialog("");

		// 7. If they answered correctly, tell them that they were right.
		if(answer.equalsIgnoreCase("Dry out")){
			JOptionPane.showMessageDialog(null, "You are right!");
		}

		// 8. Otherwise, tell them they are wrong, and give them the answer.
		else{
			JOptionPane.showMessageDialog(null, "Wrong, the answer is"+ name);
		}

		// 9. Record another sound and repeat steps 5-8.

		// 10. [optional] Add a points variable that will calculate their final score.
	}

	public static void playSound(String fileName) {
		AudioClip audioClip = JApplet.newAudioClip(new Song().getClass().getResource(fileName));
		audioClip.play();
	}
}





























