import java.util.*;

public class Player{
	
	private static ArrayList<String> P1 = new ArrayList<String>();
	private static ArrayList<String> P2 = new ArrayList<String>();
	private static ArrayList<String> P3 = new ArrayList<String>();
	private static ArrayList<String> P4 = new ArrayList<String>();
	private static int point;
	
	
	Player(){}
	
	public ArrayList<String> addCardtoPlayer(ArrayList<String> deck){
		for (int i=1; i<=12; i++){
			switch(i){
				case 1 : case 5 : case 9 : P1.add(deck.get(deck.size()-1)); break;
				case 2 : case 6 : case 10 : P2.add(deck.get(deck.size()-1)); break;
				case 3 : case 7 : case 11 : P3.add(deck.get(deck.size()-1)); break;
				case 4 : case 8 : case 12 : P4.add(deck.get(deck.size()-1)); break;
			}
		deck.remove(deck.size()-1);
		}
		return (deck);
	}
	
	public int calculatePoint(ArrayList<String> PlayerCard){
		point=0;
		for (String x : PlayerCard){
			switch(x){
				case "HA" : case "SA" : case "DA" : case "CA" : point = point + 1; break;
				case "H2" : case "S2" : case "D2" : case "C2" : point = point + 2; break;
				case "H3" : case "S3" : case "D3" : case "C3" : point = point + 3; break;
				case "H4" : case "S4" : case "D4" : case "C4" : point = point + 4; break;
				case "H5" : case "S5" : case "D5" : case "C5" : point = point + 5; break;
				case "H6" : case "S6" : case "D6" : case "C6" : point = point + 6; break;
				case "H7" : case "S7" : case "D7" : case "C7" : point = point + 7; break;
				case "H8" : case "S8" : case "D8" : case "C8" : point = point + 8; break;
				case "H9" : case "S9" : case "D9" : case "C9" : point = point + 9; break;
				case "H10" : case "S10" : case "D10" : case "C10" : point = point + 0; break;
				case "HJ" : case "SJ" : case "DJ" : case "CJ" : point = point + 0; break;
				case "HQ" : case "SQ" : case "DQ" : case "CQ" : point = point + 0; break;
				case "HK" : case "SK" : case "DK" : case "CK" : point = point + 0; break;
			}
		}	
		return point;
	}
	
	public void clear(){
		P1.clear();P2.clear(); P3.clear(); P4.clear();
	}

	public ArrayList<String> getP1(){
		return (P1);
	}
	public ArrayList<String> getP2(){
		return (P2);
	}
	public ArrayList<String> getP3(){
		return (P3);
	}
	public ArrayList<String> getP4(){
		return (P4);
	}	
	
	/*
	public int calculate(ArrayList<Integer> Newscore){
		int sum=0;
		for (int i=0; i<4; i++){
			sum = score.get(i) + Newscore.get(i);
			score.set(i,sum);
		}
	}
	*/
}