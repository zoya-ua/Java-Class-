package com.class23;

public class ScrumTeam extends Employee{
	public String artifacts;
	public String ceremonies;
	public void workOnArtifacts() {
		System.out.println("Scrum team works on artifacts "+artifacts);
	}
	public void attenfScrumMeetings() {
		System.out.println("Scrum Team attends "+ ceremonies);
	}

}
