package model;

// TODO: Auto-generated Javadoc
/**
 * The Class JavaBeans.
 */
public class JavaBeans_cadastrocliente {

	/** The nome. */
	private String nome;

	/** The fone. */
	private String fone;

	/** The email. */
	private String email;

	/** The senha. */
	private String password;

	/** The confirmação de senha. */
	private String confirmpassword;
	/**
	 * Instantiates a new java beans.
	 */
	public JavaBeans_cadastrocliente() {
		super();
	}

	
	public JavaBeans_cadastrocliente(String nome, String fone, String email, String password, String confirmpassword) {
		super();
		this.nome = nome;
		this.fone = fone;
		this.email = email;
		this.password = password;
		this.confirmpassword = confirmpassword;
	}

//	public JavaBeans(String nome, String fone, String email) {
//		super();
//		this.nome = nome;
//		this.fone = fone;
//		this.email = email;
//	}

	
	public String getNome() {
		return nome;
	}

	
	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getFone() {
		return fone;
	}

	/**
	 * Sets the nome.
	 *
	 * @param nome the new nome
	 */
	public void setFone(String fone) {
		this.fone = fone;
	}

	/**

	/**
	 * Gets the email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the email.
	 *
	 * @param email the new email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * Gets the email.
	 *
	 * @return the email
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets the email.
	 *
	 * @param email the new email
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * Gets the email.
	 *
	 * @return the email
	 */
	public String getConfirmpassword() {
		return confirmpassword;
	}

	/**
	 * Sets the email.
	 *
	 * @param email the new email
	 */
	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}

	public String toString() {
		return "Nome " + getNome() + "Fone " + getFone() + "Email" + getEmail() + "Password" + getPassword() + "Confirmpassword" + getConfirmpassword();
		
		
	}
}