package experiments.model;

import java.io.Serializable;

public class Person implements Serializable {
		
	private Integer id;
	private String name;
	private Integer age;
	private String gender;
	private Integer yearAtCompany;
	private Integer deptId;

	
	
	public Person() {
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Integer getAge() {
		return age;
	}



	public void setAge(Integer age) {
		this.age = age;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public Integer getYearAtCompany() {
		return yearAtCompany;
	}



	public void setYearAtCompany(Integer yearAtCompany) {
		this.yearAtCompany = yearAtCompany;
	}



	public Integer getDeptId() {
		return deptId;
	}



	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	

}
