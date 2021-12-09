import javax.swing.JOptionPane;
import java.util.Random;

public class Kuroko {
	private int Love = 0;
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
	}
	public int dice(int x){
		return dice.nextInt(x)+ 1;
	}
	public void round1(){
		msg("You are about to go to sleep for tonight and your roommate is about to take a shower, you havent taken one yet");
		String a = in("Do you 1)Offer to go in with her to save time and water 2) Wait until she is in and walk in and start washing her back");
		if(a.equals("1")){
			Love++;
			round2();
		}else if(a.equals("2")){
			Love--;
			round3();
		}else if(a.equals("help")){
			help();
			round1();
		}else if(a.equals("dice")){
			int x = dice(2);
			if(x == 1){
				Love++;
				round2();
			}else if(x == 2){
				Love--;
				round3();
			}
		}else{
			round1();
		}
	}
	public void round2(){
		msg("Your roommate thinks about and says fine but only if you behave otherwise you will be chained to your bed tonight");
		String a = in("You have a speical soap that can make a person act a bit drunk, lustful and they will forget everything by morning" +
				"Do you 1)swap the soaps with your teleporting powers 2)Behave yourself");
		if(a.equals("1")){
			Love--;
			round4();
		}else if(a.equals("2")){
			Love++;
			round5();
		}else if(a.equals("help")){
			help();
			round2();
		}else if(a.equals("dice")){
			int x = dice(2);
			if(x == 1){
				Love--;
				round4();
			}else if(x == 2){
				Love++;
				round5();
			}
		}else{
			round2();
		}
	}
	public void round3(){
		msg("You walk in while she is already showering");
		msg("She yells at you to get out, and you do");
		String a = in("Now waiting for her to finish her shower do you " +
				"1) Take peeks at her personal stuff 2)Clean the room/Get ready for your shower");
		if(a.equals("1")){
			Love--;
			round6();
		}else if(a.equals("2")){
			Love++;
			round7();
		}else if(a.equals("help")){
			help();
			round3();
		}else if(a.equals("dice")){
			int x = dice(2);
			if(x == 1){
				Love--;
				round6();
			}else if(x == 2){
				Love++;
				round7();
			}
		}else{
			round3();
		}
	}
	public void round4(){
		msg("You switch out the soaps with your teleporting powers");
		msg("Your roommate is now acting like a drunk and won't be able to remember anything the next day");
		String a = in("Do you 1) Take advantage of her 2) Put her to bed");
		if(a.equals("1")){
			Love--;
			msg("You take advantage of your drunk roommate and have fun all night long");
			msg("The soap lied and she did remember everything that happened and the soap's effects only last about half an hour, so you were totured that night");
			round8();
		}else if(a.equals("2")){
			Love++;
			msg("Your roommate starts acting drunk and you help escort them to bed");
			msg("Your roommate asks what happened and you said that you hit your head in the shower and she carried you to your bed as well as took care of you");
			round8();
		}else if(a.equals("help")){
			help();
			round4();
		}else if(a.equals("dice")){
			int x = dice(2);
			if(x == 1){
				Love--;
				msg("You take advantage of your drunk roommate and have fun all night long");
				msg("When the morning comes around she did remember everything that happened so the soap lied and you got totured that morning");
				round8();
			}else if(x == 2){
				Love++;
				msg("Your roommate starts acting drunk and you help escort them to bed");
				msg("Your roommate asks what happened and you said that you hit your head in the shower and she carried you to your bed as well as took care of you");
				round8();
			}
		}else{
			round4();
		}
	}
	public void round5(){
		msg("You behave yourself and both you have fun in the shower and your roommate says she might do this again");
		String a = in("The two of you are about to go to bed do you" +
				"1)Say goodnight very nicely 2)Ask if you can sleep in the same bed nicely");
		if(a.equals("1")){
			Love++;
			msg("You said Good night! The both of your had dreams related to tonight");
			round8();
		}else if(a.equals("2")){
			Love--;
			msg("Your roommate says no and i think thats enough, you both go to sleep");
			round8();
		}else if(a.equals("help")){
			help();
			round5();
		}else if(a.equals("dice")){
			int x = dice(2);
			if(x == 1){
				Love++;
				msg("You said Good night! The both of your had dreams related to tonight");
				round8();
			}else if(x == 2){
				Love--;
				msg("Your roommate says no and i think thats enough, you both go to sleep");
				round8();
			}
		}else{
			round5();
		}
	}
	public void round6(){
		msg("You took peaks at her personal stuff and she saw you as she was getting out of the shower");
		String a = in("Do you say 1) I'm sorry I am just intrested in your stuff 2)It's not what it looks like!");
		if(a.equals("1")){
			Love++;
			msg("Your roommate says make sure to ask next time, you go take a shower and you both go to sleep");
			round8();
		}else if(a.equals("2")){
			Love--;
			msg("Your roommate says yeah right and starts to tie you up to your bed as punishment and you slept tied to your bed");
			round8();
		}else if(a.equals("help")){
			help();
			round6();
		}else if(a.equals("dice")){
			int x = dice(2);
			if(x == 1){
				Love++;
				msg("Your roommate says make sure to ask next time, you go take a shower and you both go to sleep");
				round8();
			}else if(x == 2){
				Love--;
				msg("Your roommate says yeah right and starts to tie you up to your bed as punishment and you slept tied to your bed");
				round8();
			}
		}else{
			round6();
		}
	}
	public void round7(){
		msg("You start to clean up and get ready for your shower, and you don't try anything funny before, and during your shower");
		String a = in("You think about what to do for the night" +
				"Do you 1)Say Good Night and sleep in your bed 2)Sleep with your roommate");
		if(a.equals("1")){
			Love++;
			msg("You jsut say good night and you don't bother your roommate");
			round8();
		}else if(a.equals("2")){
			Love--;
			msg("Your roommate gives you a dirty look and throw you out of her bed, you now sleep on your bed... cold");
			round8();
		}else if(a.equals("help")){
			help();
			round7();
		}else if(a.equals("dice")){
			int x = dice(2);
			if(x == 1){
				Love++;
				msg("You jsut say good night and you don't bother your roommate");
				round8();
			}else if(x == 2){
				Love--;
				msg("Your roommate gives you a dirty look and throw you out of her bed, you now sleep on your bed... cold");
				round8();
			}
		}else{
			round7();
		}
	}
	public void round8(){
		msg("It is now the next morning, whatever happened last night, happened for the better or for the worst");
		msg("Your roommate is still asleep in her bed you have thoughts in your head");
		String a = in("Do you 1)Go lie down next to her 2)Make breakfast for her");
		if(a.equals("1")){
			Love--;
			round9();
		}else if(a.equals("2")){
			Love++;
			round10();
		}else if(a.equals("help")){
			help();
			round8();
		}else if(a.equals("dice")){
			int x = dice(2);
			if(x == 1){
				Love--;
				round9();
			}else if(x == 2){
				Love++;
				round10();
			}
		}else{
			round8();
		}
	}
	public void round9(){
		msg("You go lie down next to her and put your arms around her");
		msg("She starts to stir and when she wakes up she realizes that you are clinging onto her so she elbows you in the ribs");
		String a = in("So know that you are on the floor again do you" +
				"1)say Good morning 2)say Let's get ready for the day, Sorry about that");
		if(a.equals("1")){
			Love--;
			round11();
		}else if(a.equals("2")){
			Love++;
			round11();
		}else if(a.equals("help")){
			help();
			round9();
		}else if(a.equals("dice")){
			int x = dice(2);
			if(x == 1){
				Love--;
				round11();
			}else if(x == 2){
				Love++;
				round11();
			}
		}else{
			round9();
		}
	}
	public void round10(){
		msg("You went and made breakfast for your roommate, she woke up to the smell of your amazin cooking");
		msg("She said thanks! and as you were washing the dishes she went out and picked clothes for you both");
		String a = in("1)Do you say Your welcome for the food, and thanks for setting the clothes 2)Make sure we are wearing matching clothes ");
		if(a.equals("1")){
			Love++;
			round11();
		}else if(a.equals("2")){
			Love--;
			round11();
		}else if(a.equals("help")){
			help();
			round1();
		}else if(a.equals("dice")){
			int x = dice(2);
			if(x == 1){
				Love++;
				round11();
			}else if(x == 2){
				Love--;
				round11();
			}
		}else{
			round10();
		}
	}
	public void round11(){
		msg("You now leave the dorms and head out onto the streets with your roommate, you head to a crepe stand");
		String a = in("Do you 1)Order the same crepe as your roommate 2)Order a different flavored crepe");
		if(a.equals("1")){
			Love--;
			round12();
		}else if(a.equals("2")){
			Love++;
			round13();
		}else if(a.equals("help")){
			help();
			round11();
		}else if(a.equals("dice")){
			int x = dice(2);
			if(x == 1){
				Love--;
				round12();
			}else if(x == 2){
				Love++;
				round13();
			}
		}else{
			round11();
		}
	}
	public void round12(){
		msg("You order the same flavored crepe as your roommate and you keep walking down the street");
		String a = in("Do you 1) Offer some of your crepe 2)Say that she looks great today");
		if(a.equals("1")){
			Love--;
			msg("She declines by saying we have the same flavor");
			round14();
		}else if(a.equals("2")){
			Love++;
			msg("She says thanks and you look great today too");
			round14();
		}else if(a.equals("help")){
			help();
			round12();
		}else if(a.equals("dice")){
			int x = dice(2);
			if(x == 1){
				Love--;
				msg("She declines by saying we have the same flavor");
				round14();
			}else if(x == 2){
				Love++;
				msg("She says thanks and you look great today too");
				round14();
			}
		}else{
			round12();
		}
	}
	public void round13(){
		msg("You ordered different crepes");
		String a = in("Your roommate wants to try your crepe do you " +
				"1)Give her some 2)Don't share");
		if(a.equals("1")){
			Love++;
			msg("You give her some of your crepe and she is happy");
			round14();
		}else if(a.equals("2")){
			Love--;
			msg("You didn't share and she didn't seem to happy about that");
			round14();
		}else if(a.equals("help")){
			help();
			round13();
		}else if(a.equals("dice")){
			int x = dice(2);
			if(x == 1){
				Love++;
				msg("You give her some of your crepe and she is happy");
				round14();
			}else if(x == 2){
				Love--;
				msg("You didn't share and she didn't seem to happy about that");
				round14();
			}
		}else{
			round13();
		}
	}
	public void round14(){
		msg("You final made it to the mall!");
		String a = in("Your roommate finds some childish PJs that she likes Do you" +
				"1)Buy it for her 2)Say that she needs to be more grown up");
		if(a.equals("1")){
			Love++;
			round15();
		}else if(a.equals("2")){
			Love--;
			round16();
		}else if(a.equals("help")){
			help();
			round14();
		}else if(a.equals("dice")){
			int x = dice(2);
			if(x == 1){
				Love++;
				round15();
			}else if(x == 2){
				Love--;
				round16();
			}
		}else{
			round14();
		}
	}
	public void round15(){
		msg("You buy the PJs for her, you feel happy inside");
		msg("Your roommate wants you to pick out matching clothes for the two of you, not something too big but something that only the two of you would know about");
		String a = in("Do you offer to have 1)Matching underwears and a pair of matching PJs 2)Matching dresses and T-Shirts");
		if(a.equals("1")){
			Love++;
			msg("Two of you agree on the underwear and PJs, they aren't much and it's somethign only they would know about");
			round17();
		}else if(a.equals("2")){
			Love--;
			msg("You two looked at the dresses and T-Shirts, but couldn't agree on which one to get so you left with no matching clothes");
			round17();
		}else if(a.equals("help")){
			help();
			round15();
		}else if(a.equals("dice")){
			int x = dice(2);
			if(x == 1){
				Love++;
				msg("Two of you agree on the underwear and PJs, they aren't much and it's somethign only they would know about");
				round17();
			}else if(x == 2){
				Love--;
				msg("You two looked at the dresses and T-Shirts, but couldn't agree on which one to get so you left with no matching clothes");
				round17();
			}
		}else{
			round15();
		}
	}
	public void round16(){
		msg("You tell her that she needs to be more grown up, but then she gets mad and she pays for the PJs");
		msg("Your roommate wants you to pick out matching clothes for the two of you, not something too big but something that only the two of you would know about");
		String a = in("Do you offer to have 1)Matching underwears and a pair of matching PJs 2)Matching dresses and T-Shirts");
		if(a.equals("1")){
			Love++;
			msg("Two of you agree on the underwear and PJs, they aren't much and it's somethign only they would know about");
			round17();
		}else if(a.equals("2")){
			Love--;
			msg("You two looked at the dresses and T-Shirts, but couldn't agree on which one to get so you left with no matching clothes");
			round17();
		}else if(a.equals("help")){
			help();
			round16();
		}else if(a.equals("dice")){
			int x = dice(2);
			if(x == 1){
				Love++;
				msg("Two of you agree on the underwear and PJs, they aren't much and it's somethign only they would know about");
				round17();
			}else if(x == 2){
				Love--;
				msg("You two looked at the dresses and T-Shirts, but couldn't agree on which one to get so you left with no matching clothes");
				round17();
			}
		}else{
			round16();
		}
	}
	public void round17(){
		msg("The two of you leave the mall with a bunch of clothes that you bought");
		msg("You start heading back and want a quick bite to eat on your back");
		String a = in("Do you 1)Eat at McDonalds 2)Eat at good resturant");
		if(a.equals("1")){
			Love--;
			msg("You went to McDonalds, your roommate didn't like it");
			round18();
		}else if(a.equals("2")){
			Love++;
			msg("You went to eat at a good resturant and your roommate loved it");
			round18();
		}else if(a.equals("help")){
			help();
			round17();
		}else if(a.equals("dice")){
			int x = dice(2);
			if(x == 1){
				Love--;
				msg("You went to McDonalds, your roommate didn't like it");
				round18();
			}else if(x == 2){
				Love++;
				msg("You went to eat at a good resturant and your roommate loved it");
				round18();
			}
		}else{
			round10();
		}
	}
	public void round18(){
		msg("At this point there is still a bit to walk back and you roommate is getting tired");
		String a = in("Do you 1)Take their bags 2)Just keep walking");
		if(a.equals("1")){
			Love++;
			msg("You roommate accepts your help and you carry her bags");
			round19();
		}else if(a.equals("2")){
			Love--;
			msg("You just keep walking not noticing");
			round19();
		}else if(a.equals("help")){
			help();
			round18();
		}else if(a.equals("dice")){
			int x = dice(2);
			if(x == 1){
				Love++;
				msg("You roommate accepts your help and you carry her bags");
				round19();
			}else if(x == 2){
				Love--;
				msg("You just keep walking not noticing");
				round19();
			}
		}else{
			round18();
		}
	}
	public void round19(){
		msg("Finally you have arrived back at the dorms just at sunset");
		msg("Now after the long day You want to be with you roommate even more");
		String a = in("Now do You 1)Kiss them on the cheeck 2)Hug them");
		if(a.equals("1")){
			Love++;
			round20();
		}else if(a.equals("2")){
			Love++;
			round20();
		}else if(a.equals("help")){
			help();
			round19();
		}else if(a.equals("dice")){
			int x = dice(2);
			if(x == 1){
				Love++;
				round20();
			}else if(x == 2){
				Love++;
				round20();
			}
		}else{
			round19();
		}
	}
	public void round20(){
		msg("From this moment on there are no more selections, just an ending based off of you selections");
		round21();
	}
	public void round21(){
		if(Love >= 8){
			msg("Your roommate had the best time, and says I've never been on a date like that before");
			msg("You start to blush, even though it wasn't much planned it became a date for the both of you");
			msg("With the sunset in front of you both, at the same time you look at each other in the eyes, and start a passionate kiss");
			msg("Both blushing your realationship has now begun to soar to new heights, where it goes beyond friendship, Lovers, the two of you are now Lovers");
			msg("You plan to always be with one another and do everything together, sleeping in the same bed, showers together, walking together, shooping, talking, everything");
			msg("You both plan to start wearing the new clothes that you just got and try to make some match");
			msg("The matching underwear and PJs that you bought are the first things being worn");
			msg("It is also the first time you see each in a new light, not friends, but your significant other");
			msg("The two of you share the same dorm for the next couple of years, sleeping, washing, talking, and eating together until you both graduate college");
			msg("After you both graduated you still were together, and you planned to get married");
			msg("The two of you had a glorious wedding and moved in the same house together, living your dreams together");
			msg("You live happily together with the person you love, in the city you love");
			msg("Good Ending!");
		}else if(Love <= 3){
			msg("Your roommate had an okay day, said it could have been better if you weren't there");
			msg("Your roommate is now asking to transfered to another room, and she gets what she wanted");
			msg("You are now alone in the dorm you once had with her, she doesn't speak to you anymore; and despair caves in on you");
			msg("Bad ending");
		}else{
			msg("You have a great night your roommate thanks you for the day you have and you friendship grows");
			msg("But you never have a romantic realtion ship with them, you are still their friends forever");
			msg("Normal ending");
		}
	}
}
