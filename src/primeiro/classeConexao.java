package primeiro;
import java.sql.*;

public class classeConexao {
	//par�metros para conex�o
	private Connection conexao;
	private String URLBD = 
	"jdbc:mysql://localhost:3306/cadastro?useSSL=false&serverTimezone=UTC";
	private String usuario="root";
	private String senha="root";
	//criando a conex�o no construtor
	public classeConexao() {
	try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	conexao = DriverManager.getConnection(URLBD,usuario,senha);
	}catch(Exception ex) {
	ex.printStackTrace();
	}
	}
	//criando um m�todo para acessar a conex�o
	public Connection getConexao() {
	return conexao;
	}

}
