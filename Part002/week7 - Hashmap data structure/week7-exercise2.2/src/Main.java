
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Changer scandiesAway = new Changer();
		  scandiesAway.addChange(new Change('ä', 'a'));
		  scandiesAway.addChange(new Change('ö', 'o'));
		  System.out.println(scandiesAway.changeMultiple("ääliö älä lyö, ööliä läikkyy"));
		        
	}

}
