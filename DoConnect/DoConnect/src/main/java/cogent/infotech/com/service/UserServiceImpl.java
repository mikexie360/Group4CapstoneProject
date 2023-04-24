package cogent.infotech.com.service;

import java.util.List;
import java.util.*;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cogent.infotech.com.entity.User;
import cogent.infotech.com.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void home() {
		System.out.println("This is the Homepage!");
	}

	@Override
	public void addUser(User user) {
		userRepository.save(user);
	}

	@Override
	public void addNewUser(User user) {
		userRepository.save(user);
	}
	
	@Override
	public void updateUser(User user) {
		userRepository.save(user);
	}
	
	@Override
	public List<User> getAllUsers() {
		return (List)userRepository.findAll();
	}
	
	@Override
	public List<String> getLogin(User user) {
		List<String> credentials = new ArrayList<String>();
		credentials.add(user.getUsername());
		credentials.add(user.getPassword());
		return credentials;
	}
	
//	@Override
//	public boolean userLoginVerify(User user) {
//		return userRepository.verifyLogin(user);
//	}
//	
//	@Override
//	public Optional<User> getAllUsersById(int id) {
//		return (Optional)userRepository.findById(id);
//	}
//	
//	@Override
//	public List<User> getAllUsersByName(String name) {
//		return (List)userRepository.findByName(name);
//	}
//	
//	@Override
//	public List<User> getAllUsersByUserType(String userType) {
//		return (List)userRepository.findByName(userType);
//	}

}