import java.util.*;


public class run{
	public static void main(String[] args){
		
		int again = 1;
		Scanner scanner = new Scanner(System.in);
		String response = "N";			
		int[] Point={0, 0, 0, 0};
		int[] WinCount = {0, 0, 0, 0};
		int TopPoint=0;
		int TopWinCount = 0;
		ArrayList<Integer> WinnerCount = new ArrayList<Integer>();
		ArrayList<String> Deck = new ArrayList<String>();
		ArrayList<String> UsedH = new ArrayList<String>();
		ArrayList<String> UsedS = new ArrayList<String>();
		ArrayList<String> UsedD = new ArrayList<String>();
		ArrayList<String> UsedC = new ArrayList<String>();
		ArrayList<String> P1 = new ArrayList<String>();
		ArrayList<String> P2 = new ArrayList<String>();
		ArrayList<String> P3 = new ArrayList<String>();
		ArrayList<String> P4 = new ArrayList<String>();
		while (response.toUpperCase().equals("N")){
			UsedCard c = new UsedCard();
			Player p = new Player();
			
			Deck = c.getDeck();
			/*
			UsedH = c.getUsedH();
			UsedS = c.getUsedS();
			UsedD = c.getUsedD();
			UsedC = c.getUsedC();
			*/
			System.out.println("\nWin count: P1 = "+WinCount[0]+" P2 = "+WinCount[1]+" P3 = "+WinCount[2]+" P4 = "+WinCount[3]);
			System.out.print("Available cards: ");
			for(String x : Deck){
				System.out.print(x + " ");
			}
			System.out.print("\nUsed cards: \nC:\nD:\nH:\nS:\nPress Enter to deal cards...\n");
			scanner.nextLine();
			
			for(int i=1; Deck.size()>12;i++){
				System.out.print("ROUND " + i + ": ");
				c.drawCard();
				p.addCardtoPlayer(Deck);
				P1 =  p.getP1();
				P2 =  p.getP2();
				P3 =  p.getP3();
				P4 =  p.getP4();
				Point[0]=p.calculatePoint(P1);
				Point[1]=p.calculatePoint(P2);
				Point[2]=p.calculatePoint(P3);
				Point[3]=p.calculatePoint(P4);
				
				TopPoint = Point[0];
				for (int count = 1; count < Point.length; count++) {
					if (Point[count] >= TopPoint) {
						TopPoint = Point[count];
					}
				}
				System.out.print("\nP1 cards: ");
				for (String x : P1)
					System.out.print(x + " ");
				if (TopPoint==Point[0]){
					WinCount[0]+=1;
					System.out.print("| Winner");
				}
				System.out.print("\nP2 cards: ");
				for (String x : P2)
					System.out.print(x + " ");
				if (TopPoint==Point[1]){
					WinCount[1]+=1;
					System.out.print("| Winner");
				}
				System.out.print("\nP3 cards: ");
				for (String x : P3)
					System.out.print(x + " ");
				if (TopPoint==Point[2]){
					WinCount[2]+=1;
					System.out.print("| Winner");
				}
				System.out.print("\nP4 cards: ");
				for (String x : P4)
					System.out.print(x + " ");
				if (TopPoint==Point[3]){
					WinCount[3]+=1;
					System.out.print("| Winner");
				}
				System.out.println("\nWin count: P1 = "+WinCount[0]+" P2 = "+WinCount[1]+" P3 = "+WinCount[2]+" P4 = "+WinCount[3]);
				Deck=c.getDeck();
				System.out.print("Available cards: ");
				for(String x : Deck){
					System.out.print(x + " ");
				}
				
				UsedH=c.getUsedH();
				UsedS=c.getUsedS();
				UsedD=c.getUsedD();
				UsedC=c.getUsedC();
				System.out.print("\nUsed cards: \nC:");
				for (String d : UsedC)
					System.out.print(d + " ");
				System.out.print("\nD:");
				for (String d : UsedD)
					System.out.print(d + " ");
				System.out.print("\nH:");
				for (String d : UsedH)
					System.out.print(d + " ");
				System.out.print("\nS:");
				for (String d : UsedS)
					System.out.print(d + " ");
				
				if (Deck.size()>11)
					System.out.println("\nPress ENTER to deal cards...");
				else{
					for (int count = 0; count < 4; count++){
						if (WinCount[count]>TopWinCount){
							TopWinCount=WinCount[count];
						}
					}
					for (int count = 0; count < 4; count++){
						if (WinCount[count]==TopWinCount){
							WinnerCount.add(count+1);
						}
					}
					if(WinnerCount.size()==1)
						System.out.print("\nP" + WinnerCount.get(0) + " wins this game! Congrats! Press Enter to continue.");
					else if (WinnerCount.size()==2)
						System.out.print("\nP" + WinnerCount.get(0) + " and P" + WinnerCount.get(1) + " win this game! Congrats! Press Enter to continue.");
					else if (WinnerCount.size()==3)
						System.out.print("\nP" + WinnerCount.get(0) + ", P"+ WinnerCount.get(1) + " and P" + WinnerCount.get(2) + " win this game! Congrats! Press Enter to continue.");
					else
						System.out.println("\nEveryone have the same win count. No one wins the game! Press Enter to continue.");
				}
				p.clear();
				TopPoint=0; 
				scanner.nextLine();
			}
			Point[0]=0; Point[1]=0; Point[2]=0; Point[3]=0; WinCount[0]=0; WinCount[1]=0; WinCount[2]=0; WinCount[3]=0;  TopWinCount=0; WinnerCount.clear(); Deck.clear();
			c.clear();
			
			while (true){
					System.out.println("Press Q to quit the game. Press N to start a new game...");
					response = scanner.nextLine();
					if (response.length()>1)
						System.out.println("Wrong Input");
					else if (response.toUpperCase().equals("N")){
						System.out.println("\n<<New Game>>");
						break;
					}
					else if (response.toUpperCase().equals("Q")){
						System.out.println("Bye bye! See You Again!");
						break;
					}
					else
						System.out.println("Wrong Input");
			}

		}	
	}

}

