package mvclogin.model;

public class Authenticator {

	public String authenticate(String username, String password) {
		if (("Andriy".equalsIgnoreCase(username))
				&& ("password".equals(password))) {
			return "success";
		} else {
			return "failure";
		}
	}
}