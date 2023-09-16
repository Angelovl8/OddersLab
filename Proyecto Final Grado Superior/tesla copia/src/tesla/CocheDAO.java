
package tesla;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CocheDAO {
    private Connection connection;
    
    // Constructor que recibe la conexión a la base de datos
    public CocheDAO(Connection connection) {
        this.connection = connection;
    }
    
    // Método para agregar un coche a la base de datos
    public void agregarCoche(String matricula, String color, String modelo, String marca, double precio, int codCliente) throws SQLException {
        String query = "INSERT INTO coche (matricula, color, modelo, marca, precio, cod_cliente) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, matricula);
        statement.setString(2, color);
        statement.setString(3, modelo);
        statement.setString(4, marca);
        statement.setDouble(5, precio);
        statement.setInt(6, codCliente);
        statement.executeUpdate();
        statement.close();
    }
    
    // Método para obtener todos los coches de la base de datos
    public List<Coche> obtenerTodosCoches() throws SQLException {
        List<Coche> coches = new ArrayList<>();
        String query = "SELECT * FROM coche";
        PreparedStatement statement = connection.prepareStatement(query);
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            String matricula = resultSet.getString("matricula");
            String color = resultSet.getString("color");
            String modelo = resultSet.getString("modelo");
            String marca = resultSet.getString("marca");
            double precio = resultSet.getDouble("precio");
            int codCliente = resultSet.getInt("cod_cliente");
            Coche coche = new Coche(matricula, color, modelo, marca, precio, codCliente);
            coches.add(coche);
        }
        resultSet.close();
        statement.close();
        return coches;
    }
}

