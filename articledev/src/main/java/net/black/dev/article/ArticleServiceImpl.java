package net.black.dev.article;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl implements ArticleService{

	@Autowired
	@Qualifier("articleDAO")
	private ArticleDAO articleDAO;
	
	@Override
	public ArticleInfoVO getArticleInfo(int sno, int cno) throws Exception {
		
		return articleDAO.getArticleInfo(sno, cno);
	}

	@Override
	public List<ArticleVO> getArticleList(PageNation p) throws Exception {
		
		return articleDAO.getArticleList(p) ;
	}

	@Override
	public void insertArticle(ArticleVO articleVO) throws Exception {
		articleDAO.insertArticle(articleVO);
		
	}

}
