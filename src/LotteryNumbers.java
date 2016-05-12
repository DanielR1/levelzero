import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.text.StyledEditorKit.ForegroundAction;

public class LotteryNumbers {
	
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Your lottery numbers are...");
		for (int i = 0; i < 5; i++) {
			int lottery = new Random().nextInt(100);
			JOptionPane.showMessageDialog(null, ""+lottery);
			
		}
	}
}
		