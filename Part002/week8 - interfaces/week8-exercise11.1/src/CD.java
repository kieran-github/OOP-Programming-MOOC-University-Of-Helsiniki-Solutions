
public class CD implements ToBeStored{
	private String artist;
	private String title;
	private int publishingYear;
	
	public CD(String inputArtist, String inputTitle, int inputPublishingYear) {
		this.artist = inputArtist;
		this.title = inputTitle;
		this.publishingYear = inputPublishingYear;
	}

	@Override
	public double weight() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.artist + ": " + this.title + " (" + this.publishingYear + ")";
	}
}
