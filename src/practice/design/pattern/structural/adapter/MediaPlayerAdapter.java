package practice.design.pattern.structural.adapter;

/**
 * Adapter class
 * 
 * @author Akash Sharma
 *
 */
public class MediaPlayerAdapter implements MediaPlayer {
	private AdvanceMediaPlayer advanceMediaPlayer = new AdvanceMediaPlayer();

	@Override
	public void play(MediaType mediaType, String filename) {
		if (mediaType == MediaType.MUSIC) {
			advanceMediaPlayer.playMusic(filename);
		} else {
			advanceMediaPlayer.playVideo(filename);
		}
	}

}
