package projetPoec;

import java.util.ArrayList;

public class RepositoryUsers {
	
	public RepositoryUsers(ArrayList<User> userList) {
		this.userList = userList;
		
	}
	ArrayList<User> userList = new ArrayList<>();
	
	
	User user1 = new User(963, "name1", "mail1");
	//User user2 = new User(874, "name2", "mail2");
	//User user3 = new User(4693, "name3", "mail3");
	//User user4 = new User(998765, "name4", "mail4");
	userList.add(user1);
	
	

		
}
