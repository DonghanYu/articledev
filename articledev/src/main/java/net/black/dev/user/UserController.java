package net.black.dev.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="user")
public class UserController {
	
	@Autowired
	private UserService userService;
	//Read
	@RequestMapping(value="login", method=RequestMethod.GET)
	public void login(){
	}
	//Create
	@RequestMapping(value="regist", method=RequestMethod.GET)
	public void regist(){
	}
	//Update
	@RequestMapping(value="update", method=RequestMethod.GET)
	public void update(){
	}
	//Delete
	@RequestMapping(value="delete", method=RequestMethod.GET)
	public void delete(){
	}
	//Read
	@RequestMapping(value="login", method=RequestMethod.POST)
			public ModelAndView login(
					@ModelAttribute UserVO userVO,
					HttpSession session) {
		
		ModelAndView mav = new ModelAndView("result");
		try {
			UserVO userInfo = userService.getUser(userVO);

			session.setAttribute("user_id", userVO.getUser_id());
			session.setAttribute("user_nick", userVO.getUser_nick());
			session.setAttribute("user_level", userVO.getUser_level());
			session.setAttribute("like_dislike", userVO.getLike_dislike());
						
			mav.addObject("msg", userVO.getUser_id() + "님 환영합니다.");
			mav.addObject("url", "../list/1/");
			return mav;
		} catch (Exception e) {
			e.printStackTrace();
			mav.addObject("msg", e.getMessage() + "로그인에 실패하셨습니다.");
			mav.addObject("url", "login");
			return mav;
		}
	}
	//Create
	@RequestMapping(value="regist", method=RequestMethod.POST)
		public ModelAndView regist(
				@ModelAttribute UserVO userVO,
				HttpServletRequest request) {
		
		ModelAndView mav = new ModelAndView("user/regist_result");
		try {
			userService.registUser(userVO);
			mav.addObject("userVO", userVO);
			return mav;
		} catch (Exception e) {
			e.printStackTrace();
			mav.addObject("msg", "가입에 실패하였습니다.");
			mav.addObject("url", "javascript:history.back();");
			return mav;
		}
	}
	//Update
	@RequestMapping(value="update", method=RequestMethod.POST)
	public ModelAndView update(
			@ModelAttribute UserVO userVO,
			HttpServletRequest request) {
		
		ModelAndView mav = new ModelAndView("user/update_result");
		try {
			userService.updateUser(userVO);
			mav.addObject("userVO", userVO);
			return mav;
		} catch (Exception e) {
			e.printStackTrace();
			mav.addObject("msg", "회원정보 변경에 실패하였습니다.");
			mav.addObject("url", "javascript:history.back();");
			return mav;
		}
	}
	//Delete
	@RequestMapping(value="delete", method=RequestMethod.POST)
	public ModelAndView delete(
			@ModelAttribute UserVO userVO,
			HttpServletRequest request) {
		
		ModelAndView mav = new ModelAndView("user/delete_result");
		try {
			userService.deleteUser(userVO);
			mav.addObject("userVO", userVO);
			return mav;
		} catch (Exception e) {
			e.printStackTrace();
			mav.addObject("msg", "회원탈퇴에 실패하였습니다.");
			mav.addObject("url", "javascript:history.back();");
			return mav;
		}
	}
}