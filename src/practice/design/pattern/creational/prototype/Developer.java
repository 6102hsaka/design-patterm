package practice.design.pattern.creational.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Class with complex object initialization
 * 
 * @author Akash Sharma
 *
 */
public class Developer implements Cloneable {

	private List<String> skills;

	public Developer() {
		skills = new ArrayList<>();
	}

	public Developer(List<String> skills) {
		this.skills = skills;
	}

	public List<String> getSkills() {
		return skills;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}

	// some complex method to initialize Developer instance
	public void initializeDeveloper() {
		skills.add("React JS");
		skills.add("Springboot");
		skills.add("JavaScript");
		skills.add("TypeScript");
		skills.add("Java");
		skills.add("Postgres");
		skills.add("Design Pattern");
	}

	// method that will return copy of object
	@Override
	protected Developer clone() throws CloneNotSupportedException {
		List<String> skills = new ArrayList<>();
		for (String skill : this.skills) {
			skills.add(skill);
		}
		return new Developer(skills);
	}

	@Override
	public String toString() {
		return "Developer [skills=" + skills + "]";
	}

}
