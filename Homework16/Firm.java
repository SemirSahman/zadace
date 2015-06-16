package ba.bitcamp.homework16;

import java.util.Arrays;

public class Firm {

	private String name;
	private Employee director;
	private Employee[] workers;

	public Firm(String name, Employee director, Employee[] workers) {
		super();
		this.name = name;
		this.director = director;
		this.workers = workers;
	}
/**
 * this method gets us number of all employees in firm
 * @return number of employees
 */
	public int getNumberOfEmployees() {
		return workers.length + 1;
	}
/**
 * this method gets us sum of all month salaries
 * @return sum of month salaries
 */
	public int getAllMonthSalaries() {
		int salaries = director.getMonthSalary();
		for (int i = 0; i < workers.length; i++) {
			salaries += workers[i].getMonthSalary();
		}
		return salaries;
	}
/**
 * this method gets us number of all female workers in firm
 * @return number of female workers
 */
	public int getNumOfFemaleWorkers() {
		int counter = 0;
		for (int i = 0; i < workers.length; i++) {
			if (workers[i].getSex().equals("female")) {
				counter++;
			} else if (director.getSex().equals("female")) {
				counter++;
			}
		}
		return counter;
	}
/**
 * this method increases month salaries of all employees in firm
 * @param increase month salary by amount we choose
 */
	public void increaseSalaries(int increase) {
		director.setMonthSalary(director.getMonthSalary() + increase);
		for (int i = 0; i < workers.length; i++) {
			workers[i].setMonthSalary(workers[i].getMonthSalary() + increase);
		}
	}

	@Override
	public String toString(){
		String s = "Company: " + name + "\n";
		s += "Director: " + director.getName() + "\n";
		s += "Number of employees: " + workers.length;
		return s;
	}

}
