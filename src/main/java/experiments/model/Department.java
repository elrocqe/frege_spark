package experiments.model;

import java.io.Serializable;

public class Department implements Serializable {
		
	private Integer deptId;
	private String name;

	public Department() {
	}

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
