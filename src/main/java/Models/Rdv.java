package Models;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Rdv {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID", nullable = false)
    private long id;
    @Basic
    @Column(name = "JOUR", nullable = false, length = 30)
    private String jour;
    @Basic
    @Column(name = "ID_PATIENT", nullable = false)
    private long idPatient;
    @Basic
    @Column(name = "ID_MEDECIN", nullable = false)
    private long idMedecin;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getJour() {
        return jour;
    }

    public void setJour(String jour) {
        this.jour = jour;
    }

    public long getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(long idPatient) {
        this.idPatient = idPatient;
    }

    public long getIdMedecin() {
        return idMedecin;
    }

    public void setIdMedecin(long idMedecin) {
        this.idMedecin = idMedecin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rdv rdv = (Rdv) o;
        return id == rdv.id && idPatient == rdv.idPatient && idMedecin == rdv.idMedecin && Objects.equals(jour, rdv.jour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, jour, idPatient, idMedecin);
    }
}
