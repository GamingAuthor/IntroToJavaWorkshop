package day3;

import javax.swing.JOptionPane;

/**
 * Teacher's Note: 
 * Have the kids play with the Speak & Spell. 
 * The first Speak & Spell was introduced at the summer Consumer Electronics Show in June 1978, making it 
 * one of the earliest handheld electronic devices with a visual display to use interchangeable game cartridges. 
 * Discuss with students how you would make this program. 
 * Allow them to code it themselves, or use this recipe.
 **/

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
		String word = "Supercalifragilisticexpialidocious";
		speak("Spell "+word);
		String answer = JOptionPane.showInputDialog("");
		if(answer.equals(word)){
			speak("Correct. Yay!");
			String sent = "Dehydrogenase";
			speak("Spell "+sent);
			String ans = JOptionPane.showInputDialog("");
			if(ans.equals(sent)){
				speak("Correct again. Yahoo!");
				String jon = "Deoxyribose";
				speak("Spell"+jon);
				String aws = JOptionPane.showInputDialog("");
				if(aws.equals(jon)){
					speak("Correct again. You are on fire!");
				}else{
					speak("Wrong. Your poor answer streak.");
				}
			}else{
				speak("Wrong. Oh no.");
			}
		}else{
			speak("Wrong. Oh no.");

		}
	}
		// 2. Catch the user's answer in a String

		// 3. If the user spelled the word correctly, speak "correct"

		// 4. Otherwise say "wrong"

		// 5. repeat the process for other words
		
	

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}


