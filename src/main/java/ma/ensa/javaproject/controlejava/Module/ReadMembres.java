package ma.ensa.javaproject.controlejava.Module;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class ReadMembres {

    public static Set<Membre>  chargerListeMembre(String nomFichier) throws IOException {
        Set<Membre> membres = new HashSet<>();
        BufferedReader br = new BufferedReader(new FileReader(nomFichier));
        String data;
        int i=0;
        while ((data = br.readLine()) != null){
            //System.out.println(data);
            String[] list = data.split(",");
            if (list.length == 4) {
                Membre membre = new Membre(list[0].trim(), list[1].trim(), list[2].trim(), list[3].trim());
                membres.add(membre);
            }else {
                System.err.println("Ligne invalide : " + data);
            }
        }
        return membres;
    }
}
