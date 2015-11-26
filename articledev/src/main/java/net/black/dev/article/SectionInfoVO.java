package net.black.dev.article;

public class SectionInfoVO {
	  private int sno;
	  private String sname;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "SectionInfoVO [sno=" + sno + ", sname=" + sname + "]";
	}
	  
	  
	
	  
	}