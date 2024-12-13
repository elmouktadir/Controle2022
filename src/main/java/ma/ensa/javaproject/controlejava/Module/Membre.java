package ma.ensa.javaproject.controlejava.Module;

import java.util.Objects;
import java.util.UUID;

public class Membre {
    private String id;
    private String nom;
    private String prenom;
    private String email;
    private String phone;

    public Membre(String id, String nom, String prenom, String email, String phone) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.phone = phone;
    }

    public Membre(String nom, String prenom, String email, String phone) {
        this.id = UUID.randomUUID().toString();
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Membre{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()){
            return false;
        }
        Membre membre = (Membre) o;
        return id.equals(membre.getId());
        //Objects.equals(id, membre.id) &&
    }

    @Override
    public int hashCode() {
        return Objects.hash( email,phone);
    }
}
