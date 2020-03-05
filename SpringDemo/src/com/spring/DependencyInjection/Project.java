package com.spring.DependencyInjection;

import java.util.List;

public class Project {
	private String projectName;
	private int projectId;
	private List<String> skills;
	
	public Project(String projectName, int projectId) {
		this.projectName = projectName;
		this.projectId = projectId;
	}
	public Project(List<String> skills) {
		this.skills = skills;
	}
	@Override
	public String toString() {
		return "Project [projectName=" + projectName + ", projectId=" + projectId + ", skills=" + skills + "]";
	}
	
}
