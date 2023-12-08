import java.util.Random;
public class SpiceMixGame {
	private SpiceMix solution2;
	private ListNode head;
	public SpiceMixGame(SpiceMix GameSolution) {
		this.solution2 = GameSolution;
		this.head = null;
	}
	
	public SpiceMixGame() {
		char[] mix = new char[5];
		Random random = new Random();
		
		for (int i = 0; i < 5; i++) {
			int add = random.nextInt(('T' - 'N') + 1);
			//Since all Spices are NOPQRST which is in between T and N we calculate a random spice in between the 2 (inclusively)
			mix[i] = (char) ('N' + add); // add the spice between N inclusively
		}
		this.solution2 = new SpiceMix(mix);
		this.head = null;
	}
	
	public boolean attemptSpiceMix(SpiceMix spiceMix) {
		Attempt newAttempt = new Attempt(spiceMix, this.solution2);
		if (this.head == null) {
			this.head = new ListNode(newAttempt);
		} else {
			this.head = new ListNode(newAttempt, this.head); 
		}
		return newAttempt.isCorrect();
	
	}

	public ListNode getPreviousAttempts() {return this.head;}
	public SpiceMix getSolution() {return this.solution2;}

	
}
