package ma.ensa.javaproject.controlejava;

import java.io.IOException;
import java.sql.Connection;
import ma.ensa.javaproject.controlejava.DAO.DBConnection;
import ma.ensa.javaproject.controlejava.DAO.MembreDaoImpl;
import ma.ensa.javaproject.controlejava.Module.Membre;
import ma.ensa.javaproject.controlejava.Module.ReadMembres;

import static ma.ensa.javaproject.controlejava.Module.ReadMembres.chargerListeMembre;

public class Main {

    public static void main(String[] args) throws IOException {

          ReadMembres.chargerListeMembre("fileTest.txt").forEach(System.out::println);

    }
}
