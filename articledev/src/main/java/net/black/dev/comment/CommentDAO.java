package net.black.dev.comment;

public interface CommentDAO {

	void insertComment(CommentVO commentVO) throws Exception;
	
	void updateComment(CommentVO commentVO) throws Exception;
	
	String getCommentList(long no)  throws Exception;
	
	void deleteComment(CommentVO commentVO)  throws Exception;
	
}
