package ma.ensa.javaproject.controlejava.DAO;

import java.sql.Connection;
import ma.ensa.javaproject.controlejava.Module.Incident;


import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class IncidentDaoImpl implements IncidentDAO{
    @Override
    public void inserer(Incident incident) {
        Connection conn = DBConnection.getConnection();
        if (conn == null) {
            return;
        }
        String query = "INSERT INTO incident(reference,time,status,membreId) VALUES (?,?,?,?);";
        try (PreparedStatement preparedStatement =  conn.prepareStatement(query)){

            preparedStatement.setString(1,incident.getReference());
            preparedStatement.setDate(2,incident.getTime());
            preparedStatement.setString(3,incident.getStatus());
            preparedStatement.setInt(4,incident.getMembreId());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBConnection.close();
        }
    }

    @Override
    public void inser(Set<Incident> set) {
        Connection conn = DBConnection.getConnection();
        if (conn == null) {
            return;
        }
        set = new HashSet<>();
            String query = "INSERT INTO incident(reference,time,status,membreId) VALUES (?,?,?,?);";
            try (PreparedStatement preparedStatement =  conn.prepareStatement(query)){
                for (Incident incident : set) {
                    preparedStatement.setString(1, incident.getReference());
                    preparedStatement.setDate(2, incident.getTime());
                    preparedStatement.setString(3, incident.getStatus());
                    preparedStatement.setInt(4, incident.getMembreId());
                    preparedStatement.executeUpdate();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }finally {
                DBConnection.close();
            }
    }
}
