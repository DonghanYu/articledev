package net.black.dev.article;

import java.io.Serializable;
import java.util.Date;

/**
 * @author student
 *
 */
/**
 * @author student
 *
 */
public class ArticleVO implements Serializable{

	private int no;
	private int sno;
	private int cno;
	private String title;
	private String content;
	private Date regdate;
	private int count;
	private int like;
	private int dislike;
	private String img_url;
	private String user_id;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getLike() {
		return like;
	}
	public void setLike(int like) {
		this.like = like;
	}
	public int getDislike() {
		return dislike;
	}
	public void setDislike(int dislike) {
		this.dislike = dislike;
	}
	public String getImg_url() {
		return img_url;
	}
	public void setImg_url(String img_url) {
		this.img_url = img_url;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	@Override
	public String toString() {
		return "ArticleVO [no=" + no + ", sno=" + sno + ", cno=" + cno + ", title=" + title + ", content=" + content
				+ ", regdate=" + regdate + ", count=" + count + ", like=" + like + ", dislike=" + dislike + ", img_url="
				+ img_url + ", user_id=" + user_id + "]";
	}
}
