package mvcdemo.model;

public class Authenticator {
	public String authenticate(User u){
		if (("Saurabh".equals(u.getUsername()))&&("password".equals(u.getPassword()))){
			return "success";
		}
		else {
			return "failure";
		}
	}

}
