package model;

import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * The Class DAO.
 */
public class DAO_cadastrocliente {

	/** The driver. */
	private String driver = "org.postgresql.Driver";

	/** The url. */
	private String url = "jdbc:postgresql://localhost:5432/db.iservice";

	/** The user. */
	private String user = "postgres";

	/** The password. */
	private String password = "1234";

	/**
	 * Conectar.
	 *
	 * @return the connection
	 */
	private Connection conectar() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			return con;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	/**
	 * Inserir Cadastro.
	 
	 */
	public void inserirCadastroCliente(JavaBeans_cadastrocliente cadastrocliente) {
		String create = "insert into cadastrocliente (nome,fone,email, password,confirmpassword) values (?,?,?,?,?)";

//Criptografia de senha:
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			byte messageDigest[] = md.digest(cadastrocliente.getPassword().getBytes("UTF-8"));
			byte messageDigest1[] = md.digest(cadastrocliente.getConfirmpassword().getBytes("UTF-8"));
			StringBuilder sb = new StringBuilder();

			for (byte b : messageDigest) {
				sb.append(String.format("%02X", 0xFF & b));

			}
			String passwordCrip = sb.toString();
			String confirmcrip = sb.toString();

			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(create);
			pst.setString(1, cadastrocliente.getNome());
			pst.setString(2, cadastrocliente.getFone());
			pst.setString(3, cadastrocliente.getEmail());
			pst.setString(4, passwordCrip);
			pst.setString(5, confirmcrip);
			pst.executeUpdate();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

