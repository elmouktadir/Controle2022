package ma.ensa.javaproject.controlejava.DAO;

import ma.ensa.javaproject.controlejava.Module.Incident;

import java.util.Set;

public interface IncidentDAO {
    public void inserer(Incident incident);
    public void inser(Set<Incident> set);
}
