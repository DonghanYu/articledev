package net.black.dev.comment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class CommentServiceImpl implements CommentService {

	@Autowired
	@Qualifier("CommentDAO")
	private CommentDAO commentDAO;
	
	
	@Override
	public void insertComment(CommentVO commentVO) throws Exception {
		commentDAO.insertComment(commentVO);
		
	}
	
	@Override
	public String getCommentList(long no) throws Exception {
		return commentDAO.getCommentList(no);
	}
	
	@Override
	public void updateComment(CommentVO commentVO) throws Exception {
		commentDAO.updateComment(commentVO);
		
	}

	@Override
	public void deleteComment(CommentVO commentVO) throws Exception {
		commentDAO.deleteComment(commentVO);
		
	}
}
