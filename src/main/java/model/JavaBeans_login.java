package model;

// TODO: Auto-generated Javadoc
/**
 * The Class JavaBeans.
 */
public class JavaBeans_login {

	/** The nome. */
	private String nome_login;

	/** The senha. */
	private String password_login;

	
	public JavaBeans_login() {
		super();
	}

	
	public JavaBeans_login(String nome_login, String password_login) {
		super();
		this.nome_login = nome_login;
		this.password_login = password_login;
	}

//	public JavaBeans(String nome, String fone, String email) {
//		super();
//		this.nome = nome;
//		this.fone = fone;
//		this.email = email;
//	}

	
	public String getNomeLogin() {
		return nome_login;
	}

	
	public void setNomeLogin(String nome_login) {
		this.nome_login = nome_login;
	}


	
	public String getPasswordLogin() {
		return password_login;
	}

	/**
	 * Sets the email.
	 *
	 * @param email the new email
	 */
	public void setPasswordLogin(String password_login) {
		this.password_login = password_login;
	}
	/**
	 * Gets the email.
	 *
	 * @return the email
	 */
	

	public String toString() {
		return "Nome " + getNomeLogin() + "Password" + getPasswordLogin();
		
		
	}
}