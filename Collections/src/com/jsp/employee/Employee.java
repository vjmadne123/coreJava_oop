package com.jsp.employee;

public class Employee {
	String ename;
	int eid;
	double sal;
	public Employee(String ename,int eid, double sal)
	{
		super();
		this.ename=ename;
		this.eid=eid;
		this.sal=sal;
		
	}
	/**
	 * @return the ename
	 */
	public String getEname() {
		return ename;
	}
	/**
	 * @param ename the ename to set
	 */
	public void setEname(String ename) {
		this.ename = ename;
	}
	/**
	 * @return the eid
	 */
	public int getEid() {
		return eid;
	}
	/**
	 * @param eid the eid to set
	 */
	public void setEid(int eid) {
		this.eid = eid;
	}
	/**
	 * @return the sal
	 */
	public double getSal() {
		return sal;
	}
	/**
	 * @param sal the sal to set
	 */
	public void setSal(double sal) {
		this.sal = sal;
	}
	
	

}
