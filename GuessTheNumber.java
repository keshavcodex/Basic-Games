package schoolPrograms;
import java.util.*;

class Game{
	Scanner sc=new Scanner(System.in) ;
		
	public int number;
	public int inputNumber;
	public int noOfGuesses;
	
	public int getNoOfguesses() {
		return noOfGuesses;
	}
	public void setNoOfGuesses(int noOfGuesses) {
		this.noOfGuesses = noOfGuesses;
	}
	
	Game() {
//	int number = new Random().nextInt(100);
		Random rand=new Random();
		this.number=rand.nextInt(20);
		System.out.println("The input number is "+number); //This is for trail purpose
	}
	int takeUserInput() {
		System.out.println("Guess the number");
		inputNumber=sc.nextInt();
		return inputNumber;
	}
	boolean isCorrectNumber() {
		noOfGuesses++;
		if(inputNumber==number) {
			System.out.format("yes you guessed it right in %d attempts it was %d\n",noOfGuesses,number);
			return true;
		}else if (inputNumber<number) {
			System.out.println("Try a Higher a number");
		}else if(inputNumber>number) {
			System.out.println("Try a Lower a number");
		}
		return false;
	}
		
	
}
public class GuessTheNumber {
public static void main(String [] args) {

	Game g=new Game();
	boolean b=false;
	while(!b) {
	g.takeUserInput();
	 b =g.isCorrectNumber();
	}
}}
