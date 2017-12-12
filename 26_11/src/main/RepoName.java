package main;

public class RepoName {
	private String name;
	private String secondName;
	
	public RepoName() { }
	
	public RepoName(String name, String secondName) {
		this.name = name;
		this.secondName = secondName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	
	
}
