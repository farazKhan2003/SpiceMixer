import java.util.Scanner;
public class SpiceMixologistCli {

	public static SpiceMixGame playGame (SpiceMixGame SMG) {
		boolean NotInLoop = false;
		while (NotInLoop == false) {
			ListNode prevAttempts = SMG.getPreviousAttempts();
			System.out.println("Previous attempts:");
			if (prevAttempts == null) {
				System.out.println("No previous attempts");
			}
			else {
				System.out.println(prevAttempts);
			}
			System.out.println("Enter spice mix:");
			Scanner scan = new Scanner(System.in);
			String SpiceInput = scan.nextLine();
			char[] spices = {SpiceInput.charAt(0), SpiceInput.charAt(2), SpiceInput.charAt(4), SpiceInput.charAt(6), SpiceInput.charAt(8)};
			//seperated by 2 each time because it needs to skip over spaces [white space]
			boolean InvalidInput = false;
			
			for(int i = 0; i < spices.length; i++) {
				switch (spices[i]) {
				case 'N' : break;
				case 'O' : break;
				case 'P' : break;
				case 'Q' : break;
				case 'R' : break;
				case 'S' : break;
				case 'T' : break;
				default: InvalidInput = true;
				System.out.println("Invalid spice mix!");
				break;
				}
			}
			
			if (InvalidInput == false) {
				SpiceMix suggestion = new SpiceMix(spices);
				NotInLoop = SMG.attemptSpiceMix(suggestion);
				}
			}
		System.out.println("Congratulations!");
		return SMG;
	}
	
	public static void main(String[] args) {
		SpiceMixGame SMG = new SpiceMixGame();
		playGame(SMG);
	}
}
