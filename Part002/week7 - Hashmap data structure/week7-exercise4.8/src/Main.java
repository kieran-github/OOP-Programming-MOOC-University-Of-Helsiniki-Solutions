public class Main {
	private static Thing brick;
    public static void main(String[] Container) {
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }


    public static void addSuitcasesFullOfBricks(Container container) {
        // adding 100 suitcases with one brick in each
        for(int i=0; i<100; i++){
            Suitcase suitcase = new Suitcase(101);
            suitcase.addThing(brick = new Thing("brick", i+1));
            container.addSuitcase(suitcase);
    }
    }
}
      