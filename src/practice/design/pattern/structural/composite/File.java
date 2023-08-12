package practice.design.pattern.structural.composite;

/**
 * Leaf class representing File
 * 
 * @author Akash Sharma
 *
 */
public class File implements FileSystemComponent {
	private String name;

	public File(String name) {
		this.name = name;
	}

	@Override
	public void showInfo() {
		System.out.println("File name : " + name);
	}
}
