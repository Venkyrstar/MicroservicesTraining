package com.ofss;

public class Project {
	
	int projectId;
	String projectName;
	double projectBudget;
	
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Project(int projectId, String projectName, double projectBudget) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.projectBudget = projectBudget;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public double getProjectBudget() {
		return projectBudget;
	}

	public void setProjectBudget(double projectBudget) {
		this.projectBudget = projectBudget;
	}

	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectName=" + projectName + ", projectBudget=" + projectBudget
				+ "]";
	}
	
	


}
