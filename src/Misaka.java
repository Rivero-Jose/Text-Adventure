import javax.swing.JOptionPane;
import java.util.Random;

public class Misaka {
	
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
		msg("You are about to go to sleep but your roomate starts acting crazy again with her nonsense");
		String a = in("She wants to sleep with you tonight she says " +
				"Do you 1)Reject her and tie her to her bed 2)Play along");
		if(a.equals("1")){
			round2();
		}else if(a.equals("2")){
			round3();
		}else if(a.equals("help")){
			help();
			round2();
		}else if(a.equals("dice")){
			int x = dice(2);
			if(x == 1){
				round2();
			}else if(x == 2){
				round3();
			}
		}else{
			round1();
		}
	}
	public void round2(){
		msg("You tie her up to her bed as she struggles to stay put, but she calms down and lies there. You had a great nights sleep ");
		String a = in("Morning comes around and you can't help but feel someone with their arms wrapped around you" +
				"do You 1)Stay Still 2)Kick them out of the bed");
		if(a.equals("1")){
			round4();
		}else if(a.equals("2")){
			round5();
		}else if(a.equals("help")){
			help();
			round2();
		}else if(a.equals("dice")){
			int x = dice(2);
			if(x == 1){
				round4();
			}else if(x == 2){
				round5();
			}
		}else{
			round2();
		}
	}
	public void round3(){
		msg("You decide to play along and now you are in one heck of a night");
		msg("From all the playing you did overnight you didn't get any rest and couldn't do anything");
		msg("Bad ending");
	}
	public void round4(){
		msg("You still stay still while you roommate locks you more into her hands");
		msg("She wakes up and have you be part of her 'plans' today and did nothing on your own");
		msg("Bad ending");
	}
	public void round5(){
		msg("You kick her out of the bed and she complains about that, You get ready for the day ahead");
		String a = in("Your roommate tags along like she always does, you plan to get Slushies, and both of you get strawbeey favored, you spot a friend with lemon slush do you" +
				"1)Share some Slushie with the friend 2)Don't do anything");
		if(a.equals("1")){
			round6();
		}else if(a.equals("2")){
			round7();
		}else if(a.equals("help")){
			help();
			round5();
		}else if(a.equals("dice")){
			int x = dice(2);
			if(x == 1){
				round6();
			}else if(x == 2){
				round7();
			}
		}else{
			round5();
		}
	}
	public void round6(){
		msg("You deicde to share your slushie with that friend.");
		String a = in("Your roommate gets jealous and aks for you to share with her " +
				"do you 1)Give her some 2)Say that you have the same flavor");
		if(a.equals("1")){
			round8();
		}else if(a.equals("2")){
			round9();
		}else if(a.equals("help")){
			help();
			round6();
		}else if(a.equals("dice")){
			int x = dice(2);
			if(x == 1){
				round8();
			}else if(x == 2){
				round9();
			}
		}else{
			round6();
		}
	}
	public void round7(){
		msg("You don't do anything but some kid behind you bumps into you and spills the slushie all over you");
		msg("You had to go change clothes and the rest of your day went horribly wrong");
		msg("Bad ending");
	}
	public void round8(){
		msg("You share some with your roomamte despite having the same flavor");
		msg("Your roommate goes crazy and says somethign about a kiss, and has a heart atack from being crazy");
		msg("You send the rest of the day in the hostipal having a bad day");
		msg("Bad ending");
	}
	public void round9(){
		msg("You say that you have the same flavor, your roommate realizes this and faceplams herself");
		String a = in("You hear an explosion from a bank across the street do you" +
				"1)Go check it out 2)Have your roommate check it out");
		if(a.equals("1")){
			round10();
		}else if(a.equals("2")){
			round11();
		}else if(a.equals("help")){
			help();
			round9();
		}else if(a.equals("dice")){
			int x = dice(2);
			if(x == 1){
				round10();
			}else if(x == 2){
				round11();
			}
		}else{
			round9();
		}
	}
	public void round10(){
		msg("Even though you go try to check it out your roommatre stops you and says leave it for the police like me, you could get in trouble");
		msg("You watch your roommate go into combat with the crooks however one of them runs into you and spills the rest of the slushie on the floor, because of that you now have an option");
		String a = in("Do you 1)You shout that this just got personal to your roommate 2)Wait and see");
		if(a.equals("1")){
			round12();
		}else if(a.equals("2")){
			round13();
		}else if(a.equals("help")){
			help();
			round10();
		}else if(a.equals("dice")){
			int x = dice(2);
			if(x == 1){
				round12();
			}else if(x == 2){
				round13();
			}
		}else{
			round10();
		}
	}
	public void round11(){
		msg("You let your roommate go check and see, as she goes she says good girl, that makes you mad, and the for the rest of the day you punch anyone in your way");
		msg("Bad ending");
	}
	public void round12(){
		msg("You shout that this just got personal to your roommate, your roommates allows and just deals with the other crooks");
		msg("The crook ran into his car frove down to the end of the street and then made a U-Turn, He is coming down at full speed in the car");
		String a = in("Do You 1)SHOOT THE RAILGUN 2)Stand still");
		if(a.equals("2")){
			round14();
		}else if(a.equals("1")){
			round15();
		}else if(a.equals("help")){
			help();
			round13();
		}else if(a.equals("dice")){
			int x = dice(2);
			if(x == 1){
				round15();
			}else if(x == 2){
				round14();
			}
		}else{
			round12();
		}
	}
	public void round13(){
		msg("You just wait and see what happens the guy got away, now regreting not taking action you feel depressed for the rest of the day");
		msg("Bad ending");
	}
	public void round14(){
		msg("You stand still as a car going at 100mph heads towards you, you got ran over and survive in the hositpal but are now crippled");
		msg("Bad ending");
	}
	public void round15(){
		msg("You shoot your famous move the Railgun which oblirates the car coming at you and you save the day stopping the crooks");
		String a = in("At this point you regroup with your roommate and friend a plan to go somewhere do you go to" +
				"1)The mall 2)The spa");
		if(a.equals("1")){
			round16();
		}else if(a.equals("2")){
			round17();
		}else if(a.equals("help")){
			help();
			round15();
		}else if(a.equals("dice")){
			int x = dice(2);
			if(x == 1){
				round16();
			}else if(x == 2){
				round17();
			}
		}else{
			round15();
		}
	}
	public void round16(){
		msg("You all go the mall and you plan to treat yourself for helping catch the crooks");
		String a = in("You see a childish PJs that you like do you" +
				"1)Take them and hide in the dressing room 2)That a look at bikinis and try them on");
		if(a.equals("1")){
			round18();
		}else if(a.equals("2")){
			round19();
		}else if(a.equals("help")){
			help();
			round16();
		}else if(a.equals("dice")){
			int x = dice(2);
			if(x == 1){
				round18();
			}else if(x == 2){
				round19();
			}
		}else{
			round16();
		}
	}
	public void round17(){
		msg("You all plan to go the spa to go chill and relax");
		msg("You enjoy your time there expect that your roommate has been trying to be very close with you");
		msg("You get and your 6th sense goes off, your roommate seriously has a thing for you is taking pictues of you naked");
		msg("That makes you snap and half destroing the place and you got kicked out still half changed making you have a bad day");
		msg("Bad Ending");
	}
	public void round18(){
		msg("You take the pair of PJs and head to the dresssing room you try them on and you blush at your cuteness");
		msg("You come out and your roommate wants you to select a pair of matching clothes");
		String a = in("Do You pick 1) The pair of dresses that match(that you probally may never wear) 2)The matching underwear");
		if(a.equals("1")){
			round20();
		}else if(a.equals("2")){
			round21();
		}else if(a.equals("help")){
			help();
			round1();
		}else if(a.equals("dice")){
			int x = dice(2);
			if(x == 1){
				round20();
			}else if(x == 2){
				round21();
			}
		}else{
			round18();
		}
	}
	public void round19(){
		msg("You go look at the bikinis pick out one with frills appealing to your childish taste");
		msg("However your friends see you and say that you look very cute, they also give you a more revealing pair to try on");
		msg("You buy both pairs because your friends liked you in them... but you still want the PJs.. oh well maybe you can sleep in the bikinis?");
		msg("Ok ending");
	}
	public void round20(){
		msg("You pick the matching dresses it's not like you will wear them anyways... oh shoot next week you need a dress");
		msg("It's going to make you look like a couple or something");
		msg("You have a good day and hope that no talks about the dress but eh what can u do");
		msg("OK ending");
	}
	public void round21(){
		msg("You pick the matching underwear, you think it won't matter as no one will ever see them expect probally your roommate and you needed a new pair anyways");
		msg("Now thinking of the event that happened today before bed you think that you were a bit harsh on you roommate do you and you want to make up a bit...well you have been like this for the past week so...");
		String a = in("1)Give a kiss on the cheek 2)Sleep with her");
		if(a.equals("1")){
			round22();
		}else if(a.equals("2")){
			round23();
		}else if(a.equals("help")){
			help();
			round21();
		}else if(a.equals("dice")){
			int x = dice(2);
			if(x == 1){
				round22();
			}else if(x == 2){
				round23();
			}
		}else{
			round21();
		}
	}
	public void round22(){
		msg("You give her a small kiss and you both blush a bit");
		msg("You go back to your bed, your roommate sits on her bed in awe memorizing what just happened");
		msg("She comes over to your bed says thanks and gives a kiss back before she settles for the night");
		msg("Good Ending");
	}
	public void round23(){
		msg("You jump in her bed and say I'm goin to sleep with you tonight");
		msg("Your roommate turns towards you and you see that she's exicted with happiness ready for the night");
		msg("Your roommate tells you her fanisties about you , even though you are disgusted at that, you tell yourslef just this once never again, as you get on with playing out those fanisties");
		msg("Good ending?");
	}
}

