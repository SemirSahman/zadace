package ba.bitcamp.weekend4.drugidio;

public class SchoolMain {

	public static void main(String[] args) {
		Classroom c1 = new Classroom("Class 1", 22);
		Classroom c2 = new Classroom("Class 2", 23);
		Classroom c3 = new Classroom("Class 3", 24);
		Classroom c4 = new Classroom("Class 1", 25);
		Classroom c5 = new Classroom("Class 2", 35);
		Classroom c6 = new Classroom("Class 3", 15);
		Classroom c7 = new Classroom("Class 1", 16);
		Classroom c8 = new Classroom("Class 2", 17);
		Classroom c9 = new Classroom("Class 3", 19);
		Director d1 = new Director("Saban Saulic", 1970);
		Director d2 = new Director("Meho Puzic", 1965);
		Director d3 = new Director("Sinan Sakic", 1980);
		Classroom[] arr1 = new Classroom[3];
		arr1[0] = c1;
		arr1[1] = c2;
		arr1[2] = c3;
		Classroom[] arr2 = new Classroom[3];
		arr2[0] = c4;
		arr2[1] = c5;
		arr2[2] = c6;
		Classroom[] arr3 = new Classroom[3];
		arr3[0] = c7;
		arr3[1] = c8;
		arr3[2] = c9;
		School s1 = new School("Skola 1", d1, arr1);
		School s2 = new School("Skola 2", d2, arr2);
		School s3 = new School("Skola 3", d3, arr3);
		School[] arr = { s1, s2, s3 };

		System.out.println("Name of class with most students: "
				+ getNameOfClassWithMostStudents(s2));
		System.out.println("Podaci o skoli sa najmladjim direktorom: \n"
				+ getSchoolWithYoungestDirector(arr));
		System.out.println("Ime skole koja ima vise studenata: "
				+ getNameOfSchoolWithMoreStudents(s1, s3));

	}

	/**
	 * This method counts witch class have more students
	 * 
	 * @param s
	 *            School from class school
	 * @return returns name of class with most students
	 */
	public static String getNameOfClassWithMostStudents(School s) {
		String name = s.getClassrooms()[0].getClassroomName();
		int temp = s.getClassrooms()[0].getNumberOfStudents();
		for (int i = 1; i < s.getClassrooms().length; i++) {
			if (temp < s.getClassrooms()[i].getNumberOfStudents()) {
				temp = s.getClassrooms()[i].getNumberOfStudents();
				name = s.getClassrooms()[i].getClassroomName();
			}
		}
		return name;
	}

	/**
	 * This method finds youngest director from array of schools
	 * 
	 * @param schools
	 *            array of schools from class School
	 * @return return school which director is youngest from others
	 */
	public static School getSchoolWithYoungestDirector(School[] schools) {
		School s = new School(schools[0].getNameOfSchool(),
				schools[0].getDirectorOfSchool(), schools[0].getClassrooms());
		int temp = s.getDirectorOfSchool().getYearOfBirth();
		for (int i = 0; i < schools.length; i++) {
			if (schools[i].getDirectorOfSchool().getYearOfBirth() > temp) {
				temp = schools[i].getDirectorOfSchool().getYearOfBirth();
				s = new School(schools[i].getNameOfSchool(),
						schools[i].getDirectorOfSchool(),
						schools[i].getClassrooms());
			}
		}
		return s;
	}

	/**
	 * This method counts how many students have in two schools
	 * 
	 * @param s1
	 *            school number 1 from class School
	 * @param s2
	 *            school number 2 from class School
	 * @return returns name of school with more students
	 */
	public static String getNameOfSchoolWithMoreStudents(School s1, School s2) {
		int sumOfS1 = 0, sumOfS2 = 0;
		for (int i = 0; i < s1.getClassrooms().length; i++) {
			sumOfS1 += s1.getClassrooms()[i].getNumberOfStudents();
		}
		for (int i = 0; i < s2.getClassrooms().length; i++) {
			sumOfS2 += s2.getClassrooms()[i].getNumberOfStudents();
		}
		if (sumOfS1 > sumOfS2) {
			return s1.getNameOfSchool();
		}
		return s2.getNameOfSchool();
	}

}
