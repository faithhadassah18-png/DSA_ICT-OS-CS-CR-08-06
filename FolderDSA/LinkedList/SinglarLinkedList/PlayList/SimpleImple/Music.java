package sum;

public class Music {
	// MusicApp.java
	public class MusicApp {
	    public static void main(String[] args) {
	        playlist playlist = new playlist();
	        
	        // New songs
	        playlist.addsong(new song("Blinding Lights", "The Weeknd", 4));
	        playlist.addsong(new song("Levitating", "Dua Lipa", 3));
	        playlist.addsong(new song("Uptown Funk", "Mark Ronson ft. Bruno Mars", 5));
	        playlist.addsong(new song("Bad Guy", "Billie Eilish", 3));
	        playlist.addsong(new song("Shape of You", "Ed Sheeran", 4));

	        // Play in normal order
	        playlist.playAll();

	        // Play shuffled
	        playlist.shuffleAndPlay();
	    }
	}

}
