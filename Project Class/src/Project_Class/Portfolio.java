package Project_Class;

import java.util.ArrayList;

public class Portfolio {
	
	private ArrayList<Project> projects;

	public Portfolio(ArrayList<Project> projects) {
		super();
		this.projects = projects;
	}

	public ArrayList<Project> getProjects() {
		return projects;
	}

	public void setProjects(ArrayList<Project> projects) {
		this.projects = projects;
	}
	
	
}
