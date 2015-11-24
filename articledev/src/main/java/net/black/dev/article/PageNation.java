package net.black.dev.article;

public class PageNation {
	 private int sno;
	   private int cno;
	   private int startnum;
	   private int endnum;
	   private int pg;
	   
	   public PageNation(){}

	   public int getSno() {
	      return sno;
	   }

	   public void setSno(int sno) {
	      this.sno = sno;
	   }

	   public int getCno() {
	      return cno;
	   }

	   public void setCno(int cno) {
	      this.cno = cno;
	   }

	   public int getStartnum() {
	      return startnum;
	   }

	   public void setStartnum(int startnum) {
	      this.startnum = startnum;
	   }

	   public int getEndnum() {
	      return endnum;
	   }

	   public void setEndnum(int endnum) {
	      this.endnum = endnum;
	   }

	   public int getPg() {
	      return pg;
	   }

	   public void setPg(int pg) {
	      this.pg = pg;
	   }

	   @Override
	   public String toString() {
	      return "Pagenation [sno=" + sno + ", cno=" + cno + ", startnum=" + startnum + ", endnum=" + endnum + ", pg="
	            + pg + "]";
	   }
	   
	}