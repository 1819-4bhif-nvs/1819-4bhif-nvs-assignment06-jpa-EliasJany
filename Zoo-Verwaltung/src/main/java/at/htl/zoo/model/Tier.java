package at.htl.zoo.model;

import javax.persistence.*;

@Entity
@NamedQueries({
        @NamedQuery(name = "Tier.findByName", query = "select c from Tier c where c.name = :name"),
        @NamedQuery(name = "Tier.findByRasse", query = "select c from Tier c where c.rasse = :rasse"),
        @NamedQuery(name = "Tier.findByAlter", query = "select c from Tier c where c.alter = :alter"),
})
public class Tier {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public String Name;
    public String Rasse;
    public Integer Groesse;
    public Integer Gewicht;
    public Integer Alter;

    public Tier(String name, String rasse, Integer alter) {
        Name = name;
        Rasse = rasse;
        Alter = alter;
    }

    public Tier(String name, String rasse, Integer groesse, Integer gewicht, Integer alter) {
        Name = name;
        Rasse = rasse;
        Groesse = groesse;
        Gewicht = gewicht;
        Alter = alter;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getRasse() {
        return Rasse;
    }

    public void setRasse(String rasse) {
        Rasse = rasse;
    }

    public Integer getGroesse() {
        return Groesse;
    }

    public void setGroesse(Integer groesse) {
        Groesse = groesse;
    }

    public Integer getGewicht() {
        return Gewicht;
    }

    public void setGewicht(Integer gewicht) {
        Gewicht = gewicht;
    }

    public Integer getAlter() {
        return Alter;
    }

    public void setAlter(Integer alter) {
        Alter = alter;
    }

    public Long getId() { return id; }
}
