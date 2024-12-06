package tratamento.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import tratamento.Pedido;

public class Dao {

	private Connection openConnection() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://127.0.0.1:3306/aula2410";
			String user = "root";
			String pass = "admin";

			return DriverManager.getConnection(url, user, pass);

		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	public Pedido insert(Pedido pedido) {

		Connection conn = null;

		PreparedStatement stmt = null;

		try {
			conn = openConnection();
			System.out.println("Conectou");

			stmt = conn.prepareStatement(
					"INSERT INTO pedidos (CLIENTE, ENDERECO, ESTADO, ITENS, TOTAL) VALUES (?, ?, ?, ?, ?)", //
					Statement.RETURN_GENERATED_KEYS);

			stmt.setString(1, pedido.getCliente());
			stmt.setString(2, pedido.getEndereco());
			stmt.setString(3, pedido.getEstado());
			stmt.setInt(4, pedido.getQtdTotal());
			stmt.setDouble(5, pedido.getTotal());

			if (stmt.executeUpdate() == 1) {

				// Obtendo o id incremental...
				try (ResultSet rs = stmt.getGeneratedKeys()) {
					if (rs.next()) {
						pedido.setCodigo(rs.getInt(1));
					}
				}

				return pedido;
			} else {
				return null;
			}

		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} finally {
			if (stmt != null)
				try {
					stmt.close();
				} catch (SQLException e) {
				}

			if (conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
				}
		}

	}
}
