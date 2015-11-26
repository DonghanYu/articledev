package net.black.dev.article;

import java.util.List;

public interface ArticleService {


	List<ArticleVO> getArticleList(PageNation p) throws Exception;

	void insertArticle(ArticleVO articleVO) throws Exception;

	ArticleVO getArticleWithoutCount(int no) throws Exception;

	void updateArticle(ArticleVO articleVO) throws Exception;

	ArticleVO getArticle(int no) throws Exception;

	void deleteArticle(ArticleVO articleVO) throws Exception;

	SectionInfoVO getSectionInfo(int sno) throws Exception;

	CategoryInfoVO getCategoryInfo(int cno) throws Exception;

}
