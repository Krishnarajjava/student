package prepertion5;

public class PasswordException extends Exception{
	public PasswordException(String a) {
		super(a);
	}
	//Override the printStacktrace
	public void printStackTrace() {
		System.out.println("Wrong Password");
	}

}
