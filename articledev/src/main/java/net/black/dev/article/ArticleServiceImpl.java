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

	@Override
	public void deleteArticle(ArticleVO articleVO) throws Exception {
		 articleDAO.deleteArticle(articleVO);
		
		
	}
	 @Override
	   public void updateArticle(ArticleVO articleVO) throws Exception {
	      int result = articleDAO.updateArticle(articleVO);
	      
	   }

	   @Override
	   public ArticleVO getArticle(int no) throws Exception {
	      int result = articleDAO.updateCount(no);

	      /*      
	       if (result != 1) {
	            throw new RuntimeException(no + "번 글이 존재하지 않습니다.");
	        }
	        */
	      return articleDAO.getArticle(no);
	   }
	   
	   @Override
	   public ArticleVO getArticleWithoutCount(int no) throws Exception {

	      return articleDAO.getArticle(no);
	   }
	
	

}
