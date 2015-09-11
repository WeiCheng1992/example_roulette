package roulette;

import util.ConsoleReader;

public class HighLow extends Bet {
	private final static int HIGHLOW_ODD = 1;
	private final static String HIGHLOW_DIS = "High or Low";
	
	private String myBetChoice;
	
	public HighLow()
	{
		super(HIGHLOW_DIS, HIGHLOW_ODD);
	}

	@Override
	public boolean judgeWin(Wheel wheel){
		return (wheel.getNumber() >= 0 && wheel.getNumber()<=18 && myBetChoice.equals("low")) ||
                (wheel.getNumber() >= 19 && wheel.getNumber() <= 36 && myBetChoice.equals("high"));
	}
	
	@Override
	public String placeBet(){
		myBetChoice = "" + ConsoleReader.promptOneOf("Please bet", "high", "low");
		return myBetChoice;
	}
}
