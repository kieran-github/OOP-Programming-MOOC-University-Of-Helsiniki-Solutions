public class Apartment {
    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter){
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    public int getSqMeters() {
    	return this.squareMeters;
    }
    public boolean larger(Apartment otherApartment) {
    	if (this.squareMeters > otherApartment.getSqMeters()) {
			return true;
		}
    	else {
    		return false;
    	}
    }
}
 