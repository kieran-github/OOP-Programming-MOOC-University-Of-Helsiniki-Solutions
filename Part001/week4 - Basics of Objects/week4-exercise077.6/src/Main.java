
public class Main {
	private static LyyraCard cardPekka = new LyyraCard(20);
	private static LyyraCard cardBrian = new LyyraCard(30);
	
	public static void main(String[] args) {
		cardPekka.payGourmet();
		cardBrian.payEconomical();
		System.out.println(cardPekka);
		System.out.println(cardBrian);
		cardPekka.loadMoney(20.00);
		cardBrian.payGourmet();
		System.out.println(cardPekka);
		System.out.println(cardBrian);
		cardPekka.payEconomical();
		cardPekka.payEconomical();
		cardBrian.loadMoney(50.00);
		System.out.println(cardPekka);
		System.out.println(cardBrian);
		
	}

}
