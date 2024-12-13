package ma.ensa.javaproject.controlejava.DAO;

import java.sql.Connection; // Import correct pour la connexion JDBC
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import ma.ensa.javaproject.controlejava.Module.Incident;
import ma.ensa.javaproject.controlejava.Module.Membre;

public class MembreDaoImpl implements MembreDAO {

    @Override
    public void inserer(Membre membre) {
        Connection conn =  DBConnection.getConnection();
        if (conn == null) {
            return;
        }

        String query = "INSERT INTO membre(id,nom,prenom,email,phone) VALUES (?,?,?,?,?);";
        try (PreparedStatement preparedStatement = conn.prepareStatement(query)) {
            preparedStatement.setString(1, membre.getId());
            preparedStatement.setString(2, membre.getNom());
            preparedStatement.setString(3, membre.getPrenom());
            preparedStatement.setString(4, membre.getEmail());
            preparedStatement.setString(5, membre.getPhone());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBConnection.close();
        }
    }

    @Override
    public List<Incident> chargerListIncidant() {
        Connection conn = (Connection) DBConnection.getConnection();
        if (conn == null) {
            return null;
        }
        List<Incident> incidents = new ArrayList<>();
        String query = "SELECT * FROM incident;";
        try (PreparedStatement preparedStatement = conn.prepareStatement(query)) {
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                // Création de l'objet Incident avec les bonnes valeurs
                Incident incident = new Incident(
                        rs.getString("reference"),
                        rs.getDate("time"),
                        rs.getString("status"),
                        rs.getInt("membreId")
                );
                incidents.add(incident);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return incidents;
    }
}
