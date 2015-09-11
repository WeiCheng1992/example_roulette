package roulette;

import util.ConsoleReader;

public class TwoInRow extends XInRow {
	private final static int TWOINROW_ODD = 17;
	private final static String TWOINROW_DIS = "Two in a Row";
	
	private String myBetChoice;
	
	public TwoInRow()
	{
		super(TWOINROW_DIS, TWOINROW_ODD);
		super.setX(2);
	}
	
}
