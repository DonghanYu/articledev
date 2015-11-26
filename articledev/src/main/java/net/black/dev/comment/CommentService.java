package net.black.dev.comment;

public interface CommentService {
	
	void insertComment(CommentVO commentVO) throws Exception;
	
	void updateComment(CommentVO commentVO) throws Exception;
	
	String getCommentList(int no)  throws Exception;
	
	void deleteComment(CommentVO commentVO)  throws Exception;
	
}
