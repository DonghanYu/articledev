package net.black.dev.article;

public class ArticleInfoVO {
	  private int cno;
	   private String cname;
	   private int sno;
	   private String sname;

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
	      return "ArticleInfoVO [cno=" + cno + ", cname=" + cname + ", sno=" + sno + ", sname=" + sname + "]";
	   }
	}