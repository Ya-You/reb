package entity;

import java.util.Date;

public class Attence {
	private int id;
	private String empname;
	private String dept;
	private Date chkdate;
	private String chkdates;

	public String getChkdates() {
		return chkdates;
	}
	public void setChkdates(String chkdates) {
		this.chkdates = chkdates;
	}
	private String status;
	public int getId() {
		return id;
	}
	public Attence() {
		super();
	}

	public Attence(int id, String empname, String dept, Date chkdate,
			String chkdates, String status) {
		super();
		this.id = id;
		this.empname = empname;
		this.dept = dept;
		this.chkdate = chkdate;
		this.chkdates = chkdates;
		this.status = status;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Date getChkdate() {
		return chkdate;
	}
	public void setChkdate(Date chkdate) {
		this.chkdate = chkdate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
