
package tesla;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class RevisionDAO {
    private Connection connection;

    // Constructor que recibe la conexión a la base de datos
    public RevisionDAO(Connection connection) {
        this.connection = connection;
    }

    // Método para agregar una revisión a la base de datos
    public void agregarRevision(int codInterno, String cambioFiltro, String cambioAceite, String cambioFrenos, String cambioOtros, LocalDate fechaRevision, String matricula) throws SQLException {
        String query = "INSERT INTO revision (cod_interno, cambio_filtro, cambio_aceite, cambio_frenos, cambio_otros, fecha_revision, matricula) VALUES (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, codInterno);
        statement.setString(2, cambioFiltro);
        statement.setString(3, cambioAceite);
        statement.setString(4, cambioFrenos);
        statement.setString(5, cambioOtros);
        statement.setDate(6, java.sql.Date.valueOf(fechaRevision));
        statement.setString(7, matricula);
        statement.executeUpdate();
        statement.close();
    }

    // Método para obtener todas las revisiones de la base de datos
    public List<Revision> obtenerTodasRevisiones() throws SQLException {
        List<Revision> revisiones = new ArrayList<>();
        String query = "SELECT * FROM revision";
        PreparedStatement statement = connection.prepareStatement(query);
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            int codInterno = resultSet.getInt("cod_interno");
            String cambioFiltro = resultSet.getString("cambio_filtro");
            String cambioAceite = resultSet.getString("cambio_aceite");
            String cambioFrenos = resultSet.getString("cambio_frenos");
            String cambioOtros = resultSet.getString("cambio_otros");
            LocalDate fechaRevision = resultSet.getDate("fecha_revision").toLocalDate();
            String matricula = resultSet.getString("matricula");
            Revision revision = new Revision(codInterno, cambioFiltro, cambioAceite, cambioFrenos, cambioOtros, fechaRevision, matricula);
            revisiones.add(revision);
        }
        resultSet.close();
        statement.close();
        return revisiones;
    }
}
