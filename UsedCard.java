import java.util.*;


public class UsedCard extends Card{
	
	protected static ArrayList<String> UsedH = new ArrayList<String>();
	protected static ArrayList<String> UsedS = new ArrayList<String>();
	protected static ArrayList<String> UsedD = new ArrayList<String>();
	protected static ArrayList<String> UsedC = new ArrayList<String>();	

	
	public void drawCard(){
		for (int i=1; i<=12; i++){
			switch(DECK.get(DECK.size()-i)){
				case "HA" : case "H2" : case "H3" : case "H4" : case "H5" : case "H6" : case "H7" : case "H8" : case "H9" : case "H10" :case "HJ" : case "HQ" : case "HK" : UsedH.add(DECK.get(DECK.size()-i).substring(1)) ; break;
				case "SA" : case "S2" : case "S3" : case "S4" : case "S5" : case "S6" : case "S7" : case "S8" : case "S9" : case "S10" :case "SJ" : case "SQ" : case "SK" : UsedS.add(DECK.get(DECK.size()-i).substring(1)) ; break;
				case "DA" : case "D2" : case "D3" : case "D4" : case "D5" : case "D6" : case "D7" : case "D8" : case "D9" : case "D10" :case "DJ" : case "DQ" : case "DK" : UsedD.add(DECK.get(DECK.size()-i).substring(1)) ; break;
				case "CA" : case "C2" : case "C3" : case "C4" : case "C5" : case "C6" : case "C7" : case "C8" : case "C9" : case "C10" :case "CJ" : case "CQ" : case "CK" : UsedC.add(DECK.get(DECK.size()-i).substring(1)) ; break;	
			}

		}
	}
	
	public ArrayList<String> getUsedH(){
		return (UsedH);
	}
	public ArrayList<String> getUsedS(){
		return (UsedS);
	}
	public ArrayList<String> getUsedD(){
		return (UsedD);
	}
	public ArrayList<String> getUsedC(){
		return (UsedC);
	}
	
	public void clear(){
		UsedH.clear(); UsedS.clear(); UsedD.clear(); UsedC.clear();
	}

	/*
	public void addtoArary(){
		for (String x : UsedCard){
			
			switch(x){
				case "HA" : case "H2" : case "H3" : case "H4" : case "H5" : case "H6" : case "H7" : case "H8" : case "H9" : case "H10" :case "HJ" : case "HQ" : case "HK" : UsedH.add(x.substring(1)) ; break;
				case "SA" : case "S2" : case "S3" : case "S4" : case "S5" : case "S6" : case "S7" : case "S8" : case "S9" : case "S10" :case "SJ" : case "SQ" : case "SK" : UsedS.add(x.substring(1)) ; break;
				case "DA" : case "D2" : case "D3" : case "D4" : case "D5" : case "D6" : case "D7" : case "D8" : case "D9" : case "D10" :case "DJ" : case "DQ" : case "DK" : UsedD.add(x.substring(1)) ; break;
				case "CA" : case "C2" : case "C3" : case "C4" : case "C5" : case "C6" : case "C7" : case "C8" : case "C9" : case "C10" :case "CJ" : case "CQ" : case "CK" : UsedC.add(x.substring(1)) ; break;	
			}
		}
		UsedCard.clear();
	}
*/
}

