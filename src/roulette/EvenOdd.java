package roulette;

import util.ConsoleReader;

public class EvenOdd extends Bet {
	private final static int EVENODD_ODD = 1;
	private final static String EVENODD_DIS = "Even or Odd";
	
	private String myBetChoice;
	
	public EvenOdd()
	{
		super(EVENODD_DIS, EVENODD_ODD);
	}
	
//	public String getBetChoice() {
//		return myBetChoice;
//	}

//	public void setBetChoice(String betChoice) {
//		this.myBetChoice = betChoice;
//	}

	@Override
	public boolean judgeWin(Wheel wheel){
		return (wheel.getNumber() % 2 == 0 && myBetChoice.equals("even")) ||
                (wheel.getNumber() % 2 == 1 && myBetChoice.equals("odd"));
	}
	
	@Override
	public String placeBet(){
		myBetChoice = ConsoleReader.promptOneOf("Please bet", "even", "odd");
		return myBetChoice;
	}
}
