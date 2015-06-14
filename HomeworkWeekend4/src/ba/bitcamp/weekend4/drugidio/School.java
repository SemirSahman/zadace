package ba.bitcamp.weekend4.drugidio;

import java.util.Arrays;

public class School {
	private String nameOfSchool;
	private Director directorOfSchool;
	private Classroom[] classrooms;

	// Generating get and set methods
	public String getNameOfSchool() {
		return nameOfSchool;
	}

	public void setNameOfSchool(String nameOfSchool) {
		this.nameOfSchool = nameOfSchool;
	}

	public Director getDirectorOfSchool() {
		return directorOfSchool;
	}

	public void setDirectorOfSchool(Director directorOfSchool) {
		this.directorOfSchool = directorOfSchool;
	}

	public Classroom[] getClassrooms() {
		return classrooms;
	}

	public void setClassrooms(Classroom[] classrooms) {
		this.classrooms = classrooms;
	}

	// Generating constructor
	public School(String nameOfSchool, Director directorOfSchool,
			Classroom[] classrooms) {
		super();
		this.nameOfSchool = nameOfSchool;
		this.directorOfSchool = directorOfSchool;
		this.classrooms = classrooms;
	}

	// Generating toString method for print
	@Override
	public String toString() {
		String s = "";
		s = "Name of school: " + nameOfSchool + "\n";
		s += "Name of director: " + directorOfSchool + "\n";
		s += "Classrooms: \n";
		for (int i = 0; i < classrooms.length; i++) {
			s += classrooms[i].toString();
		}
		return s;
	}

}