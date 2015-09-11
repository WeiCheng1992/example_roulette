package roulette;

import util.ConsoleReader;

/**
 * Represents player's attempt to bet on outcome of the roulette wheel's spin.
 * 
 * @author Robert C. Duvall
 */
public abstract class Bet {
    private String myDescription;
    private int myOdds;
    private int myAmount;
    private String myBetChoice;
    
//    public static final int RED_BLACK = 0;
//    public static final int ODD_EVEN = 1;
//    public static final int THREE_IN_ROW = 2;
    /**
     * Constructs a bet with the given name and odds.
     * 
     * @param description name of this kind of bet
     * @param odds odds given by the house for this kind of bet
     */
    public Bet (String description, int odds) {
        myDescription = description;
        myOdds = odds;
    }
    
    public abstract String placeBet();
    	

    /**
     * @return odds given by the house for this kind of bet
     */
    public int getOdds () {
        return myOdds;
    }

    /**
     * @return name of this kind of bet
     */
    public String getDescription () {
        return myDescription;
    }
    
    public void setAmount(int amount){
    	myAmount = amount;
    }
    
    public String getBetChoice() {
		return myBetChoice;
	}
    
    public int getLoseAmount() {
    	return -myAmount;
    }
    
    public int getWinAmount() {
    	return myAmount*myOdds;
    }
    
    public void setBetChoice(String betChoice){
    	myBetChoice = betChoice;
    }
    
    public abstract boolean judgeWin(Wheel wheel);
    
}
