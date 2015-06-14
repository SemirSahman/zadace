package ba.bitcamp.weekend4.drugidio;

public class Classroom {
	private String classroomName;
	private Integer numberOfStudents;

	// Generating get and set methods
	public String getClassroomName() {
		return classroomName;
	}

	public void setClassroomName(String classroomName) {
		this.classroomName = classroomName;
	}

	public Integer getNumberOfStudents() {
		return numberOfStudents;
	}

	public void setNumberOfStudents(Integer numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	}

	// Generating constructor
	public Classroom(String classroomName, Integer numberOfStudents) {
		super();
		this.classroomName = classroomName;
		this.numberOfStudents = numberOfStudents;
	}

	// Generating toString method for print
	@Override
	public String toString() {
		String s = "";
		s = "Classrom name: " + classroomName + "\n";
		s += "Number of students in classroom: " + numberOfStudents + "\n";
		return s;
	}

}