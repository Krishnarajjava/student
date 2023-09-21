package prepertion5;

public class Login {
	public void chackPassword(String pass) throws PasswordException {
		try {
		if(pass.length()>8) {
			System.out.println("Successfully Logined");
		}
	
		else {
			throw new PasswordException("Invalid Password");
		}
		}
		catch(PasswordException p) {
			System.err.println("Invalid Password");
			p.printStackTrace();
		}
		
	}

}
