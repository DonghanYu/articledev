package net.black.dev.article;

import java.util.List;

public interface ArticleDAO {

	List<ArticleVO> getArticleList(PageNation p) throws Exception;

	void insertArticle(ArticleVO articleVO) throws Exception;

	void deleteArticle(ArticleVO articleVO) throws Exception;

	int updateCount(int no) throws Exception;

	ArticleVO getArticle(int no) throws Exception;

	int updateArticle(ArticleVO articleVO) throws Exception;

	SectionInfoVO getSectionInfo(int sno) throws Exception;

	CategoryInfoVO getCategoryInfo(int cno) throws Exception;

}
