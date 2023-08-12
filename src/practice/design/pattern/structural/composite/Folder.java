package practice.design.pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite class representing Folder
 * 
 * @author Akash Sharma
 *
 */
public class Folder implements FileSystemComponent {
	private String name;
	private List<FileSystemComponent> components;

	public Folder(String name) {
		this.name = name;
		components = new ArrayList<>();
	}

	@Override
	public void showInfo() {
		System.out.println("Folder name : " + name);
		components.forEach(FileSystemComponent::showInfo);
	}

	/**
	 * Function to add FileSystemComponent to Folder
	 * 
	 * @param component
	 */
	public void addComponent(FileSystemComponent component) {
		components.add(component);
	}
}
