package ma.ensa.javaproject.controlejava.DAO;

import ma.ensa.javaproject.controlejava.Module.Incident;
import ma.ensa.javaproject.controlejava.Module.Membre;

import java.util.List;

public interface MembreDAO {
    public void inserer(Membre membre);
    public List<Incident> chargerListIncidant();
}
