import java.util.*;


public class Card{
	protected static String[] deck = { "HA", "H2", "H3", "H4", "H5", "H6", "H7", "H8", "H9", "H10", "HJ", "HQ", "HK", "SA", "S2", "S3", "S4", "S5", "S6", "S7", "S8", "S9", "S10", "SJ", "SQ", "SK", "DA", "D2", "D3", "D4", "D5", "D6", "D7", "D8", "D9", "D10", "DJ", "DQ", "DK", "CA", "C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9", "C10", "CJ", "CQ", "CK" };
	protected static ArrayList<String> DECK = new ArrayList<String>();
	protected static ArrayList<String> UsedCard = new ArrayList<String>();
	

	
	protected static int point;
	protected static ArrayList<Integer> score = new ArrayList<Integer>();
	
	Card(){
		for (String a : deck)
			DECK.add(a);
		Collections.shuffle(DECK);
	}
	
	public ArrayList<String> getDeck(){
		return DECK;
	}
	

}
	
	
	
	
	
	
	



