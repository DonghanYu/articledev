package net.black.dev.comment;

import java.io.IOException;
import java.io.Serializable;
import java.io.Writer;
import java.util.LinkedHashMap;

import org.json.simple.JSONStreamAware;
import org.json.simple.JSONValue;

public class CommentVO implements Serializable, JSONStreamAware {
	private long comment_no;
	private String comment_content;
	private String comment_regdate;
	private int comment_like;
	private int comment_dislike;
	private String img_url;
	private long no;
	private String user_id;
	
	
	public long getComment_no() {
		return comment_no;
	}


	public void setComment_no(long comment_no) {
		this.comment_no = comment_no;
	}


	public String getComment_content() {
		return comment_content;
	}


	public void setComment_content(String comment_content) {
		this.comment_content = comment_content;
	}


	public String getComment_regdate() {
		return comment_regdate;
	}


	public void setComment_regdate(String comment_regdate) {
		this.comment_regdate = comment_regdate;
	}


	public int getComment_like() {
		return comment_like;
	}


	public void setComment_like(int comment_like) {
		this.comment_like = comment_like;
	}


	public int getComment_dislike() {
		return comment_dislike;
	}


	public void setComment_dislike(int comment_dislike) {
		this.comment_dislike = comment_dislike;
	}


	public String getImg_url() {
		return img_url;
	}


	public void setImg_url(String img_url) {
		this.img_url = img_url;
	}


	public long getNo() {
		return no;
	}


	public void setNo(long no) {
		this.no = no;
	}


	public String getUser_id() {
		return user_id;
	}


	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}


	@Override
	public String toString() {
		return "CommentVO [comment_no=" + comment_no + ", comment_content=" + comment_content + ", comment_regdate="
				+ comment_regdate + ", comment_like=" + comment_like + ", comment_dislike=" + comment_dislike
				+ ", img_url=" + img_url + ", no=" + no + ", user_id=" + user_id + "]";
	}


	@Override
	public void writeJSONString(Writer out) throws IOException {
		 LinkedHashMap obj = new LinkedHashMap();                 
		 obj.put("user_id", user_id);                 
		 obj.put("comment_no", comment_no);                 
		 obj.put("comment_content", comment_content);
		 obj.put("comment_regdate", comment_regdate);
		 JSONValue.writeJSONString(obj, out); 
	}
}
