package net.black.dev.user;

public interface UserService {
	
	UserVO getUser(UserVO userVO) throws Exception;
	void registUser(UserVO userVO) throws Exception;
	UserVO updateUser(UserVO userVO) throws Exception;
	void deleteUser(UserVO userVO) throws Exception;
}
