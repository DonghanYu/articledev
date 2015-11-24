package net.black.dev.article;

import java.util.List;

public interface ArticleDAO {

	ArticleInfoVO getArticleInfo(int sno, int cno) throws Exception;

	List<ArticleVO> getArticleList(PageNation p) throws Exception;

	void insertArticle(ArticleVO articleVO) throws Exception;
	
}
