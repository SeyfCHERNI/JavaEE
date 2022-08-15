package Models;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Patient {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID", nullable = false)
    private long id;
    @Basic
    @Column(name = "NOM", nullable = false, length = 30)
    private String nom;
    @Basic
    @Column(name = "PRENOM", nullable = false, length = 30)
    private String prenom;
    @Basic
    @Column(name = "EMAIL", nullable = false, length = 30)
    private String email;
    @Basic
    @Column(name = "TELEPHONE", nullable = false, length = 30)
    private String telephone;

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return id == patient.id && Objects.equals(nom, patient.nom) && Objects.equals(prenom, patient.prenom) && Objects.equals(email, patient.email) && Objects.equals(telephone, patient.telephone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom, prenom, email, telephone);
    }
}
