public class SpiceMix {
	private char[] spice = new char[5];
	
	public SpiceMix(char[] spiceinput) {
		 spice = spiceinput;
	}
	
	public char getSpice(int i) {return spice[i];}
	
	public String toString() {
		String lines = "";
		for (int i = 0; i < 5; i++) {
			if (i < 4) {
			lines += spice[i];
			lines += " ";
			}
			else {
				lines += spice[i];
			}
		}
			
		return lines;
	}

}
