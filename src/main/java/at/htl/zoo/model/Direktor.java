package at.htl.zoo.model;

import javax.persistence.*;

@Entity
@NamedQueries({
        @NamedQuery(name = "Direktor.findByVorname", query = "select c from Direktor c where c.vorname = :vorname"),
        @NamedQuery(name = "Direktor.findByNachname", query = "select c from Direktor c where c.nachname = :nachname"),
        @NamedQuery(name = "Direktor.findByArbeitsstelle", query = "select c from Direktor c where c.zoo = :zoo"),
        @NamedQuery(name = "Direktor.findByGehalt", query = "select c from Direktor c where c.gehalt = :gehalt")
})

public class Direktor extends Person{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Direktor(String Vorname, String Nachname, Integer Gehalt){super(Vorname,Nachname,Gehalt);}

    public Direktor(){
    }

    @Override
    public Long getId() {
        return id;
    }
}
