package net.black.dev.comment;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/board/{bno}/{pg}/{no}")
public class CommentController {
	private static final Logger logger = LoggerFactory.getLogger(CommentController.class);

	@Autowired
	private CommentService commentService;
	@RequestMapping(value="/", method=RequestMethod.GET)
	public void view(@PathVariable long no) {
		logger.info(no + "번 댓글 상세보기");
		
	}
	@RequestMapping(value="/update", method=RequestMethod.GET)
	public void update(@PathVariable long no) {
		logger.info(no + "번 댓글 수정 폼 출력");
	}
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public void view(@PathVariable long no, @ModelAttribute CommentVO commentVO) {
		logger.info(no + "번 댓글 수정 처리");
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public void delete(@PathVariable long no) {
		logger.info(no + "번 댓글 삭제 처리");
	}
}
