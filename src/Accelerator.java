import javax.swing.JOptionPane;
import java.util.Random;

public class Accelerator {
	
	Random dice = new Random();
	public String in(String s){
		return JOptionPane.showInputDialog(s);
	}
	public void msg(String s){
		JOptionPane.showMessageDialog(null, s);
	}
	public void help(){
		msg("This the help file!");
		msg("Type the number such as [1] [2] or [3] etc. to choose an option or use the dice method by typing [dice] to choose for you.Have fun playing the game!");
	}
	public int dice(int x){
		return dice.nextInt(x)+ 1;
	}
	public void round1(){
		String a = in("You are in a dark alleyway with your grocies from the supermarket then you spot someone sniping at you 500 meters away do you 1)bounce back the bullet with your powers 2)start heading towards the sniper");
				
		if(a.equals("1")){
			round2();
		}else if(a.equals("2")){
			round3();
		}else if(a.equals("help")){
			help();
			round1();
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
		String a = in("You decided to use your powers to bounce the bullet back and ended up destroying the gun they were using. You also see the person to jump buildings and starts heading your way do you" +
				"1) Start heading towards them 2)Keep walking home");
		
		if(a.equals("1")){
			round4();
		}else if(a.equals("2")){
			round5();
		}else if(a.equals("help")){
			help();
			round2();
		}else if(a.equals("dice")){
			int x = dice(2) + 1;
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
		String a = in("So you decide to head to the sniper as your walking there you get hit by bullets but using ur powers you take no damage what so ever. The sniper starts paking up and head down the building but before the person does do you " +
				"1)Wait outside the building 2) fly up to the roof");
		
		if(a.equals("1")){
			round6();
		}else if(a.equals("2")){
			round7();
		}else if(a.equals("help")){
			help();
			round3();
		}else if(a.equals("dice")){
			int x = dice(2) + 1;
			if(x == 1){
				round6();
			}else if(x == 2){
				round7();
			}
		}else{
			round3();
		}
	}
	public void round4(){
		String a = in("You start heading towards the sniper you are now within close range of the sniper about 50 meters you see that it is a girl you do you say" +
				"1)Oh it's you right its time 2)What do you think you were going to achieve by sniping? 3) IM GOING TO KILL YOU	");
		
		if(a.equals("1")){
			round8();
		}else if(a.equals("2")){
			round9();
		}else if(a.equals("3")){
			round10();
		}else if(a.equals("help")){
			help();
			round4();
		}else if(a.equals("dice")){
			int x = dice(3) + 1;
			if(x == 1){
				round8();
			}else if(x == 2){
				round9();
			}else if(x == 3){
				round10();
			}
		}else{
			round4();
		}
	}
	public void round5(){
		msg("Well... your boring to just keep walking back home so... try again");
		round2();
		
	}
	public void round6(){
		String a = in("So you wait outside the building to see the sniper running down the wall of the building" +
				"1)Do you stand still and bounce all attacks 2)ATTACK");
		
		if(a.equals("1")){
			round11();
		}else if(a.equals("2")){
			round12();
		}else if(a.equals("help")){
			help();
			round6();
		}else if(a.equals("dice")){
			int x = dice(2) + 1;
			if(x == 1){
				round11();
			}else if(x == 2){
				round12();
			}
		}else{
			round6();
		}
	}
	public void round7(){
		String a = in("You fly up to the top of the building to see the sniper they start using their powers as well but they are no match for yours do you " +
				"1)KILL 2)Leave");
		
		if(a.equals("1")){
			round12();
		}else if(a.equals("2")){
			round13();
		}else if(a.equals("help")){
			help();
			round7();
		}else if(a.equals("dice")){
			int x = dice(2) + 1;
			if(x == 1){
				round13();
			}else if(x == 2){
				round14();
			}
		}else{
			round7();
		}
	}
	public void round8(){
		String a = in("You see that it is one of the Sisters the goal of the project is to kill them so do you" +
				"1)KILL 2)ATTACK");
		
		if(a.equals("1")){
			round12();
		}else if(a.equals("2")){
			round12();
		}else if(a.equals("help")){
			help();
			round8();
		}else if(a.equals("dice")){
			int x = dice(2) + 1;
			if(x == 1){
				round12();
			}else if(x == 2){
				round12();
			}
		}else{
			round8();
		}
	}
	public void round9(){
		String a = in("So you say 'What do you think you were going to achieve by sniping?' you see that it is a sister which you need to kill as part of the project you are in" +
				"So do you 1) KILL 2)ATTACK");
		
		if(a.equals("1")){
			round12();
		}else if(a.equals("2")){
			round12();
		}else if(a.equals("help")){
			help();
			round9();
		}else if(a.equals("dice")){
			int x = dice(2) + 1;
			if(x == 1){
				round12();
			}else if(x == 2){
				round12();
			}
		}else{
			round9();
		}
	}
	public void round10(){
		msg("You shout im going to kill you and the sniper hesiates as you get closer");
		round12();
	}
	public void round11(){
		msg("Even though you do nothing the sniper takes dmg because of the recoil caused by your powers");
		
		String a = in("You see that it is a sister, you need to kill sisters because that is part of the project so do you" +
				"1)KILL 2)ATTACK");
		if(a.equals("1")){
			round12();
		}else if(a.equals("2")){
			round12();
		}else if(a.equals("help")){
			help();
			round11();
		}else if(a.equals("dice")){
			int x = dice(2) + 1;
			if(x == 1){
				round12();
			}else if(x == 2){
				round12();
			}
		}else{
			round11();
		}
	}
	public void round12(){
		msg("You attack and kill the sniper with your powers so now yo decide to head home");
		String a = in("It is now a few days have passed you head to the lab for the project that you are working on" +
				"It is a 1 v 1 battle you aganist a Sister do you" +
				"1) Charge in 2) Walk in like a normal person");
		
		if(a.equals("1")){
			round14();
		}else if(a.equals("2")){
			round15();
		}else if(a.equals("help")){
			help();
			round12();
		}else if(a.equals("dice")){
			int x = dice(2) + 1;
			if(x == 1){
				round14();
			}else if(x == 2){
				round15();
			}
		}else{
			round12();
		}
	}
	public void round13(){
		msg("Why would you leave Im disapointed... try again");
		round7();
	}
	public void round14(){
		String a = in("You charge in looking for the sister just to realize that the moment you walked in you killed her when she attempted to jump out behind you do you" +
				"1] leave because you are done 2)Stay");
		
		if(a.equals("1")){
			round16();
		}else if(a.equals("2")){
			round17();
		}else if(a.equals("help")){
			help();
			round14();
		}else if(a.equals("dice")){
			int x = dice(2) + 1;
			if(x == 1){
				round16();
			}else if(x == 2){
				round17();
			}
		}else{
			round14();
		}
	}
	public void round15(){
		String a = in("Even though you walk in like a normal person the sister shoots her gum at you and she dies by a headshot that you bounced off do you" +
				"1)Leave because you are done 2)Stay");
		
		if(a.equals("1")){
			round16();
		}else if(a.equals("2")){
			round17();
		}else if(a.equals("help")){
			help();
			round15();
		}else if(a.equals("dice")){
			int x = dice(2) + 1;
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
		msg("NOOO Why'd you choose this you won't get the happy ending ;-; game over" +
				"I'm Disapointed in you");
	}
	public void round17(){
		String a = in("Since you stayed the scientists have a present to give you they give you a child sized sister that appears at the age of 10 called Last Order for you to take care of it do you" +
				"1)Take the sister 2)KILL THE SISTER");
		
		if(a.equals("1")){
			round18();
		}else if(a.equals("2")){
			round16();
		}else if(a.equals("help")){
			help();
			round17();
		}else if(a.equals("dice")){
			int x = dice(2) + 1;
			if(x == 1){
				round18();
			}else if(x == 2){
				round16();
			}
		}else{
			round17();
		}
	}
	public void round18(){
		msg("You now live with a cute sister called Last Order that takes a liking to you and you start to take a liing for her too even if you have killed thousands of sisters before");
		msg("Thanks for playing!!! Go play another route!");
	}
}
