package at.htl.zoo.model;

import javax.persistence.*;
import java.util.List;

@Entity
@NamedQueries({
        @NamedQuery(name = "Tierpfleger.findByVorname", query = "select c from Tierpfleger c where c.vorname = :vorname"),
        @NamedQuery(name = "Tierpfleger.findByNachname", query = "select c from Tierpfleger c where c.nachname = :nachname"),
        @NamedQuery(name = "Tierpfleger.findByArbeitsstelle", query = "select c from Tierpfleger c where c.zoo = :zoo"),
        @NamedQuery(name = "Tierpfleger.findByGehalt", query = "select c from Tierpfleger c where c.gehalt = :gehalt")
})
public class Tierpfleger extends Person{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Zoo Arbeitsstelle;
    public List<Gehege> gehegeList;

    public Tierpfleger(String Vorname, String Nachname, Integer Gehalt, Zoo Arbeitsstelle, List<Gehege> gehegeList){
        this.gehegeList = gehegeList;
        this.Vorname = Vorname;
        this.Nachname = Nachname;
        this.Gehalt = Gehalt;
        this.Arbeitsstelle = Arbeitsstelle;
    }

    public Tierpfleger(){
    }

    @Override
    public Long getId() {
        return id;
    }

    public Zoo getArbeitsstelle() {
        return Arbeitsstelle;
    }

    public void setArbeitsstelle(Zoo arbeitsstelle) {
        Arbeitsstelle = arbeitsstelle;
    }

    public List<Gehege> getGehegeList() {
        return gehegeList;
    }

    public void setGehegeList(List<Gehege> gehegeList) {
        this.gehegeList = gehegeList;
    }
}
