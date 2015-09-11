package roulette;

import util.ConsoleReader;

public abstract class XInRow extends Bet {
	private int myX;
//	private final static int THREEINROW_ODD = 11;
//	private final static String THREEINROW_DIS = "Three in a Row";
	
	private String myBetChoice;
	
	public XInRow(String description, int odds) {
        super(description, odds);
    }
	
	public void setX(int x){
		myX=x;
	}


	@Override
	public boolean judgeWin(Wheel wheel){
		int start = Integer.parseInt(myBetChoice);
        return (start <= wheel.getNumber() && wheel.getNumber() < start + myX);
	}
	
	@Override
	public String placeBet(){
		myBetChoice = "" + ConsoleReader.promptRange("Enter first of three consecutive numbers",
                1, Wheel.NUM_SPOTS - myX);
		return myBetChoice;
	}
}
