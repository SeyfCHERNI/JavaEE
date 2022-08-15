package Models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Employee implements Serializable {
    @Id
    @Column(name = "CIN", nullable = false)
    private long cin;
    @Basic
    @Column(name = "NOM", nullable = false, length = 30)
    private String nom;
    @Basic
    @Column(name = "PRENOM", nullable = false, length = 30)
    private String prenom;
    public Employee() {
    }

    public Employee(long cin, String nom, String prenom) {
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
    }

    public Long getCin() {
        return cin;
    }

    public void setCin(long cin) {
        this.cin = cin;
    }

    public void setCin(Long cin) {
        this.cin = cin;
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

    @Override
    public String toString() {
        return "Employee{" +
                "cin=" + cin +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return cin == employee.cin && Objects.equals(nom, employee.nom) && Objects.equals(prenom, employee.prenom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cin, nom, prenom);
    }
}
