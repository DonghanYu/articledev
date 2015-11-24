package net.black.dev.article;

import java.util.List;

public interface ArticleService {

	ArticleInfoVO getArticleInfo(int sno, int cno) throws Exception;

	List<ArticleVO> getArticleList(PageNation p) throws Exception;

	void insertArticle(ArticleVO articleVO) throws Exception;

	void deleteArticle(ArticleVO articleVO) throws Exception;

	ArticleVO getArticleWithoutCount(int no) throws Exception;

	void updateArticle(ArticleVO articleVO) throws Exception;

	ArticleVO getArticle(int no) throws Exception;

}
