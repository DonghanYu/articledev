package net.black.dev.article;

public class CategoryInfoVO {
	  private int cno;
	   private String cname;
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	@Override
	public String toString() {
		return "CategoryInfoVO [cno=" + cno + ", cname=" + cname + "]";
	}
	   
	
	}