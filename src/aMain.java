import java.util.Random;
public class aMain {
	public static void main(String args[]){
		
		Random dice = new Random();
		Base B = new Base();
		int x = dice.nextInt(4)+ 1;
		B.msg("Hello, let's start this game type [help] whenever u need to if u don't know what to do(Help may be different per path). Another thing to note about this game there are multiple paths to play through, there is not only one story there is multiple. So let's get started");
		if(x == 1){
			Accelerator A = new Accelerator();
			A.msg("You are on the Accelerator path!" +
					"You are an extremely overpowered character with no weaknesses... that you know of" +
					"You are a Level 5 Esper the strongest in the world in fact, meaning one with supernatural abilities ur power is called Acceleration, it can do crazy stuff");
			A.round1();
		}else if(x == 2){
			Sister S = new Sister();
			S.msg("You are on the Sisters path!" +
					"This path is a series of sisters and what they do; tip in help" +
					"All sisters are Espers each equiped with night vision googles and a rifle");
			S.round1();
		}else if(x == 3){
			Misaka M = new Misaka();
			M.msg("You are on the Misaka path!" +
					"You are the 3rd strongest Level 5 Esper in the city and the world for that matter, you love to take on challenges but never use your full power" +
					"Your ability is Electromaster, your nickname is Railgun");
			M.round1();
		}else{
			Kuroko K = new Kuroko();
			K.msg("You are on the Kuroko path!" +
					"You are a level 4 Esper with the power of teleporting anything u touch so have fun with that haha" +
					"You are the roommate of Misaka(which is a character from another path btw) and... no more details about Kuroko");
			K.msg("This route is different than the rest. You go through a series of situations(that may or may not be realted to each other) throughout the day to raise affections and have the proper ending ");
			K.round1();
		}
		
		
		
	}

}

