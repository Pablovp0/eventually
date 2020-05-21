package Eventually;

public class Usuario {
	
	String user;
	String mail;
	String password;
	
	public Usuario() {
		user = null;
		mail = null;
		password = null;
	}
	
	public Usuario(String u, String m, String p) {
		user = u;
		mail = m;
		password = p;
	}
	
	public String getUser() {
		return user;
	}
	
	public String getMail() {
		return mail;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setUser(String s) {
		user = s;
	}
	
	public void setPassword(String p) {
		password = p;
	}
	
}
