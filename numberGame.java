import java.util.*;
public class numberGame{
	
	static int generateRandom(){
		int min = 1;
		int max = 100;
		Random random = new Random();
		int randomNumber = random.nextInt(max - min + 1) + min;
		
		return randomNumber;
	}
	
		
	public static void main(String args[]){
		int randNum = generateRandom();
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Choose the number of attempts for guess a correct Number : ");
		int attempts = sc.nextInt();
		
		System.out.print("Choose the number of rounds for play this game : ");
		int rounds = sc.nextInt();
		for(int i = 0; i<rounds; i++){
			int count = 0;
			System.out.println("Round no is = "+(i+1));
			for(int j=0; j<attempts; j++){
				System.out.print("Guess a Number : ");
				int guessNum = sc.nextInt();
				if(guessNum > randNum){
					count++;
					System.out.println("too high");
				}
				else if(guessNum < randNum){
					count++;
					System.out.println("too less");
				}
				else{
					count++;
					System.out.println("Guess is correct in "+count+" times");
					System.out.println("YOU WON!!");
					System.out.println("YOUR SCORE IS = "+count);
					break;
				}
			}
			
		}
		
	
	}
}