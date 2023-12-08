public class Attempt{
  private SpiceMix suggestion;
  private SpiceMix solution;
  public int NumGood = 0;
  private int NumWrong = 0;
  public Attempt(SpiceMix suggestionArg, SpiceMix solutionArg) {
    this.suggestion = suggestionArg; 
    this.solution = solutionArg;
  }
  public SpiceMix getSpiceMix() {return this.suggestion;}
  
  public int getNumGood() {
    for (int curSpice = 0; curSpice < 5; curSpice++){
      	char spice = this.solution.getSpice(curSpice);
      	int QuantityOfSuggestion = QuantityCalculator(spice, this.suggestion);
      	int QuantityOfSolution = QuantityCalculator(spice, this.solution);
      	if (QuantityOfSuggestion == QuantityOfSolution){
        	NumGood++;
        }
     }
    return NumGood;
  }
  
   public int getNumWrongQuantity(){
    for (int curSpice = 0; curSpice < 5; curSpice++){
      char spice = this.solution.getSpice(curSpice);
      int QuantityOfSuggestion = QuantityCalculator(spice, this.suggestion);
      int QuantityOfSolution = QuantityCalculator(spice, this.solution);
      if ((QuantityOfSuggestion != QuantityOfSolution) && (QuantityOfSolution > 0) && (QuantityOfSuggestion >0)){
        NumWrong++;
      }
    }
    return NumWrong;
  }
  public int QuantityCalculator(char spice, SpiceMix mix) {
	//method should define the position and number equivalent in the spice array
	int quantity = 0;
	for (int position = 0; position < 5; position++) {
		if (mix.getSpice(position) == spice) {
			quantity += (position+1);
			//have to do i+1 because it starts at 0 not 1
		}
	}
	return quantity;
  }
  
  public boolean isCorrect(){
    if (getNumGood()==5){
      return true;
    }
    else{
      return false;
    }
  }
  
  public String toString() {
        return ("" + this.suggestion + " (Good " + getNumGood() + ", Wrong quantity " + getNumWrongQuantity() + ")");
    }
}
