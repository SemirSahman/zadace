package ba.bitcamp.homework16;

public class Employee {
	
	private String name;
	private String sex;
	private int monthSalary;
	
	public Employee(String name, String sex, int monthSalary) {
		super();
		this.name = name;
		this.sex = sex;
		this.monthSalary = monthSalary;
	}
	
	/**
	 * this method returns us name of employee
	 * @return name of employee
	 */
	public String getName(){
		return name;
	}

	/**
	 * this method returns us sex of employee
	 * @return sex of employee
	 */
	public String getSex(){
		return sex;
	}
	/**
	 * with this method we can set month salary of employee
	 * @param salary we want to set
	 */
	public void setMonthSalary(int salary){
		monthSalary = salary;
	}
	/**
	 * this method returns us month salary of employee
	 * @return month salary
	 */
	public int getMonthSalary(){
		return monthSalary;
	}

}
