package roulette;

import util.ConsoleReader;

public class ThreeInRow extends XInRow {
	private final static int THREEINROW_ODD = 11;
	private final static String THREEINROW_DIS = "Three in a Row";
	
	private String myBetChoice;
	
	public ThreeInRow()
	{
		super(THREEINROW_DIS, THREEINROW_ODD);
		super.setX(3);
	}
	
}
