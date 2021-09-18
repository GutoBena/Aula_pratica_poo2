package primeiro;
import java.sql.*;

public class classeConexao {
	//parâmetros para conexão
	private Connection conexao;
	private String URLBD = 
	"jdbc:mysql://localhost:3306/cadastro?useSSL=false&serverTimezone=UTC";
	private String usuario="root";
	private String senha="root";
	//criando a conexão no construtor
	public classeConexao() {
	try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	conexao = DriverManager.getConnection(URLBD,usuario,senha);
	}catch(Exception ex) {
	ex.printStackTrace();
	}
	}
	//criando um método para acessar a conexão
	public Connection getConexao() {
	return conexao;
	}

}
