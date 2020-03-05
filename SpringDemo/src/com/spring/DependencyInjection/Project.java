package com.spring.DependencyInjection;

public class Project {
	private String projectName;
	private int projectId;
	
	public Project(String projectName, int projectId) {
		super();
		this.projectName = projectName;
		this.projectId = projectId;
	}

	@Override
	public String toString() {
		return "Project [projectName=" + projectName + ", projectId=" + projectId + "]";
	}
	
}
