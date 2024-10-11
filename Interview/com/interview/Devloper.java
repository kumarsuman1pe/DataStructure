package DataStructure.Interview.com.interview;

import java.util.List;

public class Devloper {
	private String name;
	private List<String> skils;

	public Devloper(String name, List<String> skils) {
		super();
		this.name = name;
		this.skils = skils;
	}

	public Devloper() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getSkils() {
		
		return skils;
	}

	public void setSkils(List<String> skils) {
		this.skils = skils;
	}

	@Override
	public String toString() {
		return "Devloper [name=" + name + ", skils=" + skils + "]";
	}

	

}
