package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = 0;
		// 2.  Ask the user a question 
		String answer = JOptionPane.showInputDialog("Who was the first president of the US?");
		// 3.  Use an if statement to check if their answer is correct
		if(answer.equalsIgnoreCase("George Washington")) {
			JOptionPane.showMessageDialog(null, "Correct!");
		
		// 4.  if the user's answer is correct
		
		// -- add one to their score 
		score++;
	}
		else {
			JOptionPane.showMessageDialog(null, "Incorrect. Maybe next time!");
		}
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		String addition = JOptionPane.showInputDialog("What is 23+22?");
				if(addition.equals("45")) {
				JOptionPane.showMessageDialog(null, "Correct!");
				score++;
				}
				else {
					JOptionPane.showMessageDialog(null, "Incorrect. Try harder next time!");
				}
				String angle = JOptionPane.showInputDialog("How many degrees is a right angle?");
					if(angle.equals("90")) {
				JOptionPane.showMessageDialog(null, "Correct!");
				score++;
					}
					else {
						JOptionPane.showMessageDialog(null, "Incorrect. Try again next time!");
					}
		// 6.  After all the questions have been asked, print the user's score 
		JOptionPane.showMessageDialog(null, "Your score is "+score+"/3");
	}
}
