package model;

public class Employee {
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", product="
				+ product + ", cproject=" + cproject + ", experience="
				+ experience + ", primaryskills=" + primaryskills
				+ ", secondaryskills=" + secondaryskills
				+ ", additionalskills=" + additionalskills + "]";
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getCproject() {
		return cproject;
	}
	public void setCproject(String cproject) {
		this.cproject = cproject;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public String getPrimaryskills() {
		return primaryskills;
	}
	public void setPrimaryskills(String primaryskills) {
		this.primaryskills = primaryskills;
	}
	public String getSecondaryskills() {
		return secondaryskills;
	}
	public void setSecondaryskills(String secondaryskills) {
		this.secondaryskills = secondaryskills;
	}
	public String getAdditionalskills() {
		return additionalskills;
	}
	public void setAdditionalskills(String additionalskills) {
		this.additionalskills = additionalskills;
	}
	public Employee(int eid, String ename, String product, String cproject,
			int experience, String primaryskills, String secondaryskills,
			String additionalskills) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.product = product;
		this.cproject = cproject;
		this.experience = experience;
		this.primaryskills = primaryskills;
		this.secondaryskills = secondaryskills;
		this.additionalskills = additionalskills;
	}
	int eid;
	String ename;
	String product;
	String cproject;
	int experience;
	String primaryskills;
	String secondaryskills;
	String additionalskills;
	
}
