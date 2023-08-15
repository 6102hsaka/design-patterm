package practice.design.pattern.structural.adapter;

/**
 * Adaptee class
 * 
 * @author Akash Sharma
 *
 */
public class AdvanceMediaPlayer {

	public void playMusic(String filename) {
		System.out.println("Playing Music " + filename);
	}

	public void playVideo(String filename) {
		System.out.println("Playing Video " + filename);
	}
}
