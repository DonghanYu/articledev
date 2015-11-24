package net.black.dev.user;

import java.io.Serializable;

public class UserVO implements Serializable{

	private String user_id;
	private String user_nick;
	private String user_pw;
	private String user_level;
	private int like_dislike;
	private int article_count;
	private String prep;
	
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_nick() {
		return user_nick;
	}
	public void setUser_nick(String user_nick) {
		this.user_nick = user_nick;
	}
	public String getUser_pw() {
		return user_pw;
	}
	public void setUser_pw(String user_pw) {
		this.user_pw = user_pw;
	}
	public String getUser_level() {
		return user_level;
	}
	public void setUser_level(String user_level) {
		this.user_level = user_level;
	}
	public int getLike_dislike() {
		return like_dislike;
	}
	public void setLike_dislike(int like_dislike) {
		this.like_dislike = like_dislike;
	}
	public int getArticle_count() {
		return article_count;
	}
	public void setArticle_count(int article_count) {
		this.article_count = article_count;
	}
	public String getPrep() {
		return prep;
	}
	public void setPrep(String prep) {
		this.prep = prep;
	}
	@Override
	public String toString() {
		return "UserVO [user_id=" + user_id + ", user_nick=" + user_nick + ", user_pw=" + user_pw + ", user_level="
				+ user_level + ", like_dislike=" + like_dislike + ", article_count=" + article_count + ", prep=" + prep
				+ "]";
	}	
}
