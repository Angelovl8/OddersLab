
    package tesla;

    import java.sql.Connection;
    import java.sql.PreparedStatement;
    import java.sql.ResultSet;
    import java.sql.SQLException;
    import java.util.ArrayList;
    import java.util.List;

    public class ClienteDAO {
        private Connection connection;

        // Constructor que recibe la conexión a la base de datos
        public ClienteDAO(Connection connection) {
            this.connection = connection;
        }

        // Método para agregar un cliente a la base de datos
        public void agregarCliente(int codCliente, String nif, String nombre, String apellidos, int telefono, String direccion, int cp) throws SQLException {
            String query = "INSERT INTO cliente (cod_cliente, nif, nombre, apellidos, telefono, direccion, cp) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, codCliente);
            statement.setString(2, nif);
            statement.setString(3, nombre);
            statement.setString(4, apellidos);
            statement.setInt(5, telefono);
            statement.setString(6, direccion);
            statement.setInt(7, cp);
            statement.executeUpdate();
            statement.close();
        }

        // Método para obtener todos los clientes de la base de datos
        public List<Cliente> obtenerTodosClientes() throws SQLException {
            List<Cliente> clientes = new ArrayList<>();
            String query = "SELECT * FROM cliente";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int codCliente = resultSet.getInt("cod_cliente");
                String nif = resultSet.getString("nif");
                String nombre = resultSet.getString("nombre");
                String apellidos = resultSet.getString("apellidos");
                int telefono = resultSet.getInt("telefono");
                String direccion = resultSet.getString("direccion");
                int cp = resultSet.getInt("cp");
                Cliente cliente = new Cliente(codCliente, nif, nombre, apellidos, telefono, direccion, cp);
                clientes.add(cliente);
            }
            resultSet.close();
            statement.close();
            return clientes;
        }
    }


