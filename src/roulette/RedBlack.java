package roulette;

import util.ConsoleReader;

public class RedBlack extends Bet {
	private final static int REDBLACK_ODD = 1;
	private final static String REDBLACK_DIS = "Red or Black";
	
	private String myBetChoice;
	
	public RedBlack()
	{
		super(REDBLACK_DIS, REDBLACK_ODD);
	}
	
//	public String getBetChoice() {
//		return myBetChoice;
//	}

	@Override
	public boolean judgeWin(Wheel wheel){
		return wheel.getColor().equals(myBetChoice);
//		return result;
	}
	
	@Override
	public String placeBet(){
		myBetChoice = ConsoleReader.promptOneOf("Please bet", Wheel.BLACK, Wheel.RED);
		
		return myBetChoice;
	}
}
