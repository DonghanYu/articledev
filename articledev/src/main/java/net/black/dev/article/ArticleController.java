package net.black.dev.article;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/article/{sno}/{cno}/{pg}")
public class ArticleController {
   private static final Logger logger = LoggerFactory.getLogger(ArticleController.class);
   
   @Autowired
   private ArticleService articleService;
   
   @RequestMapping(value ="/")
   public String list(
         @PathVariable int sno,
         @PathVariable int cno,
         @PathVariable int pg,
         Model model) throws Exception {
      
         PageNation p = new PageNation();
         p.setSno(sno);
         p.setCno(cno);
         p.setPg(pg);
         
         ArticleInfoVO articleInfo = articleService.getArticleInfo(sno, cno);
         List<ArticleVO> list = articleService.getArticleList(p);
      
         model.addAttribute("list", list);
         model.addAttribute("sno", sno);
         model.addAttribute("cno", cno);
         model.addAttribute("articleInfo", articleInfo);
         return "article/list";
                  
   }
   
   @RequestMapping(value="insert", method=RequestMethod.GET)
   public String insert() {
	   return "article/insert";
   }
   
   @RequestMapping(value="insert", method=RequestMethod.POST)
   public ModelAndView insert(
		   @ModelAttribute ArticleVO articleVO, 
		   @PathVariable int sno,
		   @PathVariable int cno,
		   HttpSession session) {
			
	   logger.info(articleVO.toString());
	   
	   try {
		articleService.insertArticle(articleVO);
		return new ModelAndView("redirect:");
	} catch (Exception e) {
		
		e.printStackTrace();
		ModelAndView mav = new ModelAndView("result");
		mav.addObject("msg", "입력 실패");
		mav.addObject("url", "javascript:history.back();");
		return mav;
	}
   }
   
   @RequestMapping(value="update", method=RequestMethod.GET)
   public ModelAndView update(int no){
	   
		try {
			ArticleVO articleVO = articleService.getArticleWithoutCount(no);
			ModelAndView mav = new ModelAndView("article/update");
			mav.addObject("articleVO", articleVO);
			return mav;
			
		} catch (Exception e) {
			e.printStackTrace();
			ModelAndView mav = new ModelAndView();
			mav.setViewName("result");
			mav.addObject("msg", e.getMessage());
			mav.addObject("url","list");
			return mav;
		}
	   
   }
   
   @RequestMapping(value="update", method=RequestMethod.POST)
   public ModelAndView update(ArticleVO articleVO) {
	   
	   
	   
	   return null;
   }
   
   
}

















