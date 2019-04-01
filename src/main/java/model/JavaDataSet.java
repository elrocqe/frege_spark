package model;

public class JavaDataSet {
	
	String stn;
	String time;
	Integer dkl010z0;
	Double fu3010z0;
	Double fu3010z1;
	Double pp0qffs0;
	Double pp0qnhs0;
	Double prestas0;
	Integer sre000z0;
	Double rre150z0;
	Double tre200s0;
	Integer ure200s0;
	
	public JavaDataSet(String line) {
		String[] data = line.split(",", -1);
		this.stn = data[0];
		this.time = data[1];
		this.dkl010z0 = getInteger(data[2]);
		this.fu3010z0 = getDouble(data[3]);
		this.fu3010z1 = getDouble(data[4]);
		this.pp0qffs0 = getDouble(data[5]);
		this.pp0qnhs0 = getDouble(data[6]);
		this.prestas0 = getDouble(data[7]);
		this.sre000z0 = getInteger(data[8]);
		this.rre150z0 = getDouble(data[9]);
		this.tre200s0 = getDouble(data[10]);
		this.ure200s0 = getInteger(data[11]);	
	}
	
	private Integer getInteger(String value) {
		try {
			return Integer.parseInt(value);
		} catch (Exception e) {
			return 0;
		}
	}
	private Double getDouble(String value) {
		try {
			return Double.parseDouble(value);
		} catch (Exception e) {
			return 0.0;
		}
	}
	public String getStn() {
		return stn;
	}
	public void setStn(String stn) {
		this.stn = stn;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public Integer getDkl010z0() {
		return dkl010z0;
	}
	public void setDkl010z0(Integer dkl010z0) {
		this.dkl010z0 = dkl010z0;
	}
	public Double getFu3010z0() {
		return fu3010z0;
	}
	public void setFu3010z0(Double fu3010z0) {
		this.fu3010z0 = fu3010z0;
	}
	public Double getFu3010z1() {
		return fu3010z1;
	}
	public void setFu3010z1(Double fu3010z1) {
		this.fu3010z1 = fu3010z1;
	}
	public Double getPp0qffs0() {
		return pp0qffs0;
	}
	public void setPp0qffs0(Double pp0qffs0) {
		this.pp0qffs0 = pp0qffs0;
	}
	public Double getPp0qnhs0() {
		return pp0qnhs0;
	}
	public void setPp0qnhs0(Double pp0qnhs0) {
		this.pp0qnhs0 = pp0qnhs0;
	}
	public Double getPrestas0() {
		return prestas0;
	}
	public void setPrestas0(Double prestas0) {
		this.prestas0 = prestas0;
	}
	public Integer getSre000z0() {
		return sre000z0;
	}
	public void setSre000z0(Integer sre000z0) {
		this.sre000z0 = sre000z0;
	}
	public Double getRre150z0() {
		return rre150z0;
	}
	public void setRre150z0(Double rre150z0) {
		this.rre150z0 = rre150z0;
	}
	public Double getTre200s0() {
		return tre200s0;
	}
	public void setTre200s0(Double tre200s0) {
		this.tre200s0 = tre200s0;
	}
	public Integer getUre200s0() {
		return ure200s0;
	}
	public void setUre200s0(Integer ure200s0) {
		this.ure200s0 = ure200s0;
	}

}
