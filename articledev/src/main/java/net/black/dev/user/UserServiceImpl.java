package net.black.dev.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;
	//Read
	@Override
	public UserVO getUser(UserVO userVO) throws Exception {
		UserVO userInfo = userDAO.getUser(userVO);
		if (userInfo == null) {
			throw new RuntimeException("/??/");
		}
		return userInfo;
	}
	//Create
	@Override
	public void registUser(UserVO userVO) throws Exception {
		userDAO.registUser(userVO);
	}
	//update
	@Override
	public UserVO updateUser(UserVO userVO) throws Exception {
		UserVO userInfo = userDAO.updateUser(userVO);
		if (userInfo == null) {
			throw new RuntimeException("/?/");
		}
		return userInfo;
	}
	//delete
	@Override
	public void deleteUser(UserVO userVO) throws Exception {
		userDAO.deleteUser(userVO);
	}
	
}
