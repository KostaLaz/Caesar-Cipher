import java.util.Scanner;

public class RockPaperScissors2 {

	public static void main(String[] args) {

		intro();
	}
	public static void intro() {
		Scanner input = new Scanner(System.in);
		System.out.println("Let`s play rock, paper, scissors.");
		System.out.println("Player one, what do you choose?");
		String p1selection = input.nextLine();
		System.out.println("Player two, what do you choose?");
		String p2selection = input.nextLine();

		if(p1selection.equals("rock")) {
			if(p2selection.equals("scissors")) {
				System.out.println("Player one wins!");
			}else if(p2selection.equals("paper")) {
				System.out.println("Player two wins!");
			}else {
				System.out.println("TIE!");
			}
		}else if(p1selection.equals("paper")) {
			if(p2selection.equals("scissors")) {
				System.out.println("Player two wins!");
			}else if(p2selection.equals("rock")) {
				System.out.println("Player one wins!");
			}else {
				System.out.println("TIE!");
			}
		}else if(p1selection.equals("scissors")) {
			if(p2selection.equals("rock")) {
				System.out.println("Player two wins!");
			}else if(p2selection.equals("paper")) {
				System.out.println("Player one wins!");
			}else {
				System.out.println("TIE!");
			}
		}else {
			System.out.println("Please choose only rock, paper or scissors");
		}
	}
	 
	

}
