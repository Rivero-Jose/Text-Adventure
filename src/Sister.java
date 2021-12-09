import javax.swing.JOptionPane;
import java.util.Random;

public class Sister {
	
	Random dice = new Random();
	public String in(String s){
		return JOptionPane.showInputDialog(s);
	}
	public void msg(String s){
		JOptionPane.showMessageDialog(null, s);
	}
	public void help(){
		msg("This the help file!");
		msg("Type the number such as [1] [2] or [3] etc. to choose an option or use the dice method by typing [dice] to choose for you. Have fun playing the game!");
		msg("A tip for specificly this path you can die in this route however some ways of dying are better than others so you can keep playing the story.");
	}
	public int dice(int x){
		return dice.nextInt(x)+ 1;
	}
	public void round1(){
		String a = in("You are a sister that has taken a sniper position upon a building you see your target do you" +
				"1) Take the shot and fire 2)Just keep aiming");
		if(a.equals("1")){
			round2();
		}else if(a.equals("2")){
			msg("You take a long time aiming and just when you realize that ur target was a dummy");
			msg("Your target actually was behind you, attacked you and threw you off the building. GAME OVER");
		}else if(a.equals("help")){
			help();
			round1();
		}else if(a.equals("dice")){
			int x = dice(2);
			if(x == 1){
				round2();
			}else if(x == 2){
				msg("You take a long time aiming and just when you realize that ur target was a dummy");
				msg("Your target actually was behind you, attacked you and threw you off the building. GAME OVER");
			}
		}else{
			round1();
		}
	}
	public void round2(){
		msg("You try your best but you die anyways because the bullet bounced straight back into your head that killed you");
		String a = in("You are in a freight yard up against the same target u try to run away using the surrondings but your target suddenly appears in front you do you" +
				"1)Keep trying to run away 2)Stand and fight");
		if(a.equals("1")){
			round3();
		}else if(a.equals("2")){
			msg("You attempt to stand your ground but you die much faster than expected");
			msg("GAME OVER");
		}else if(a.equals("help")){
			help();
			round2();
		}else if(a.equals("dice")){
			int x = dice(2) + 1;
			if(x == 1){
				round3();
			}else if(x == 2){
				msg("You attempt to stand your ground but you die much faster than expected");
				msg("GAME OVER");
			}
		}else{
			round2();
		}
	}
	public void round3(){
		msg("You keep running away but the target rips off your leg then picks up one of the freight crates and crushes it on top of you, you die");
		String a = in("You are in the lab in a 1 v 1 sitaution with the target both of you standing in the middle of the lab room. You also have a 8mm handheld gun do you" +
				"1)Flank right 2)Hold your ground against the target");
		if(a.equals("1")){
			round4();
		}else if(a.equals("2")){
			msg("You stand your ground but your just a sitting duck practically");
			msg("You made it easy for the target to kill you. GAME OVER");
		}else if(a.equals("help")){
			help();
			round3();
		}else if(a.equals("dice")){
			int x = dice(2) + 1;
			if(x == 1){
				round4();
			}else if(x == 2){
				
			}
		}else{
			round3();
		}
	}
	public void round4(){
		msg("You attempt to flank right against the target you made it slightly harder because your moving but its al the same thing to the target you die");
		String a = in("You are in a Dark alleyway the target is on the other side of the alleyway do you" +
				"1)Create an electric field to prevent him from crossing 2)Fire shots accurately at the target");
		if(a.equals("1")){
			round5();
		}else if(a.equals("2")){
			msg("By now... you should know guns arent affective on the target");
			msg("GAME OVER");
		}else if(a.equals("help")){
			help();
			round4();
		}else if(a.equals("dice")){
			int x = dice(2) + 1;
			if(x == 1){
				round5();
			}else if(x == 2){
				msg("By now... you should know guns arent affective on the target");
				msg("GAME OVER");
			}
		}else{
			round4();
		}
	}
	public void round5(){
		msg("While the electric field should have been affectve, which it was able to stop any shots that he bounced back at you he just walked through the field itself. you die");
		String a = in("You are at the bridge that leaves city, you can swim, not sure if your target can't, or think that the metal of the bridge can be used somehow so do you" +
				"1)Jump into the water and make an electric field 2) bend the metal of the bridge using electrity");
		if(a.equals("1")){
			round6();
		}else if(a.equals("2")){
			msg("The metal of the bridge does not affect the target in anywayas he ripped the metal columns to shreads as you threw them");
			msg("He used those shreded pieces of the metal to finish you off GAME OVER");
		}else if(a.equals("help")){
			help();
			round5();
		}else if(a.equals("dice")){
			int x = dice(2) + 1;
			if(x == 1){
				round6();
			}else if(x == 2){
				msg("The metal of the bridge does not affect the target in anywayas he ripped the metal columns to shreads as you threw them");
				msg("He used those shreded pieces of the metal to finish you off GAME OVER");
			}
		}else{
			round5();
		}
	}
	public void round6(){
		msg("You jump in the water and shock the water as you expected the target to swim after you... But he flys towards you and kill you by drowing");
		String a = in("You are in an underground building where you and your target need to fight each other do you plan to" +
				"1)Set up traps everywhere 2)Fire at anything you see");
		if(a.equals("1")){
			round7();
		}else if(a.equals("2")){
			msg("You just gave your position away and the target make suse of that and kills you by destroying the roof of your area");
			msg("GAME OVER");
		}else if(a.equals("help")){
			help();
			round6();
		}else if(a.equals("dice")){
			int x = dice(2) + 1;
			if(x == 1){
				round7();
			}else if(x == 2){
				msg("You just gave your position away and the target make suse of that and kills you by destroying the roof of your area");
				msg("GAME OVER");
			}
		}else{
			round6();
		}
	}
	public void round7(){
		msg("You set traps everywhere. You do leave the target distracted allowing you to get away until the target decides to destroy the entire building along with you. you die");
		String a = in("This time your target is blinded so he will not use his eyes so do you" +
				"1)Sneakly attack from the left 2)Sneakly attack from the right");
		if(a.equals("1")){
			round8();
		}else if(a.equals("2")){
			msg("You would think attacking from the right is right but u would be wrong i never told u the surroundings so this was an unlucky guess");
			msg("GAME OVER");
		}else if(a.equals("help")){
			help();
			round7();
		}else if(a.equals("dice")){
			int x = dice(2) + 1;
			if(x == 1){
				round8();
			}else if(x == 2){
				msg("You would think attacking from the right is right but u would be wrong i never told u the surroundings so this was an unlucky guess");
				msg("GAME OVER");
			}
		}else{
			round7();
		}
	}
	public void round8(){
		msg("For all you left handed people i just threw that in there your welcome.");
		msg("You flanked on the left side however after your first move he one shot you and you die");
		msg("You are Last Order, a sister that is younger than the rest; You have no weapons but on the plus side the project with the target is over");
		String a = in("You see your target and do you decide to " +
				"1)approch him 2)stay away");
		if(a.equals("1")){
			round9();
		}else if(a.equals("2")){
			msg("You walk away as fast as you can and never see him again");
			msg("The project is over why are you running away GAME OVER");
		}else if(a.equals("help")){
			help();
			round8();
		}else if(a.equals("dice")){
			int x = dice(2) + 1;
			if(x == 1){
				round9();
			}else if(x == 2){
				msg("You walk away as fast as you can and never see him again");
				msg("The project is over why are you running away GAME OVER");
			}
		}else{
			round8();
		}
	}
	public void round9(){
		msg("You approch the target, His name is Accelerator(if you havent figured it out yet) however he doesnt seem to notice you");
		msg("Note that you are wearing just a piece of cloth that covers you competely and it hides your face as well");
		String a = in("After bout 10 minutes of walking next to him, he notices you. He says 'take off that cloth so i can see your face' because he notices that you look familar" +
				"what do you do? 1)Be shocked as he rips the cloth off and stay there 2)Run away before anything can happen");
		if(a.equals("1")){
			round10();
		}else if(a.equals("2")){
			msg("You run away as fast as you can and never see him again");
			msg("You got scared and try to avoid him. GAME OVER");
		}else if(a.equals("help")){
			help();
			round9();
		}else if(a.equals("dice")){
			int x = dice(2) + 1;
			if(x == 1){
				round10();
			}else if(x == 2){
				msg("You run away as fast as you can and never see him again");
				msg("You got scared and try to avoid him. GAME OVER");
			}
		}else{
			round9();
		}
	}
	public void round10(){
		msg("You stand in shock as your clothes are ripped off and you do your best to get back your clothes which he gives back to you anyways");
		String a = in("You think about staying with accelerator what do you do" +
				"1) Say Excuse me and leave ASAP 2)Ask to stay at his house");
		if(a.equals("1")){
			msg("You run away after saying excuse me an try to get better clothes but realize your homeless and never see accelerator again");
			msg("GAME OVER");
		}else if(a.equals("2")){
			msg("You beg him over and over so that youcan stay at his house and he gives in and says sure just don't bother me.");
			msg("The next morning he takes you to a resturant to go eat and then tries to leave you there but you follow him everywhere");
			msg("Soon later on you move into a better aparment with him and have better clothes. Accelerator becomes your guardian and he decides to protect you because it's the least he can do for killing tons of your sisters");
			msg("GOOD ENDING");
		}else if(a.equals("help")){
			help();
			round10();
		}else if(a.equals("dice")){
			int x = dice(2) + 1;
			if(x == 1){
				msg("You run away after saying excuse me an try to get better clothes but realize your homeless and never see accelerator again");
				msg("GAME OVER");
			}else if(x == 2){
				
			}
		}else{
			round10();
		}
	}
}

