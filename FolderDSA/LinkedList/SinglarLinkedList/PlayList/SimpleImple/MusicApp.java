package sum;

public class MusicApp {
	public static void main(String[] args) {
		playlist playlist = new playlist();
		playlist.addsong(new song("Perfect", "Ed Sheeran", 5));
		playlist.addsong(new song("Halo", "Beyonce", 4));
		playlist.addsong(new song("One Love", "Ed Sheeran", 6));
		playlist.playAll();
		
	}

}

