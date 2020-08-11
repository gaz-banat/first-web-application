package net.gaz.j2ee;

public class UserValidationService {
	
	public boolean isUserValid(String user, String password) {
		
		if(user.equals("ghazanfar") && password.equals("rozeena")) {
			return true;
		}
		return false;
	}

}
