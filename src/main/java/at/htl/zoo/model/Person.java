package at.htl.zoo.model;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public String Vorname;
    public String Nachname;
    public Integer Gehalt;

    public Person() {
    }

    public Person(String Vorname, String Nachname, Integer Gehalt) {
        this.Vorname = Vorname;
        this.Nachname = Nachname;
        this.Gehalt = Gehalt;
    }

    public String getVorname() {
        return Vorname;
    }

    public void setVorname(String vorname) {
        Vorname = vorname;
    }

    public String getNachname() {
        return Nachname;
    }

    public void setNachname(String nachname) {
        Nachname = nachname;
    }

    public Integer getGehalt() {
        return Gehalt;
    }

    public void setGehalt(Integer gehalt) {
        Gehalt = gehalt;
    }

    public abstract Long getId();
}
