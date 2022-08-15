package Models;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Medecin {
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
    @Column(name = "SPECIALITE", nullable = false, length = 30)
    private String specialite;
    @Basic
    @Column(name = "ADRESSE", nullable = false, length = 30)
    private String adresse;
    @Basic
    @Column(name = "PHONE", nullable = false, length = 30)
    private String phone;

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

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Medecin medecin = (Medecin) o;
        return id == medecin.id && Objects.equals(nom, medecin.nom) && Objects.equals(prenom, medecin.prenom) && Objects.equals(specialite, medecin.specialite) && Objects.equals(adresse, medecin.adresse) && Objects.equals(phone, medecin.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom, prenom, specialite, adresse, phone);
    }
}
