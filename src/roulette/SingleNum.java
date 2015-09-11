package roulette;

import util.ConsoleReader;

public class SingleNum extends XInRow {
	private final static int SINGLENUM_ODD = 35;
	private final static String SINGLENUM_DIS = "Single Number";
	
	private String myBetChoice;
	
	public SingleNum()
	{
		super(SINGLENUM_DIS, SINGLENUM_ODD);
		super.setX(1);
	}
	
}
