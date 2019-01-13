package at.htl.zoo.model;

import javax.persistence.*;
import java.util.List;

@Entity
@NamedQueries({
        @NamedQuery(name = "Gehege.findByOrt", query = "select c from Gehege c where c.zoo = :zoo"),
        @NamedQuery(name = "Gehege.findByTier", query = "select c from Gehege c where c.tier = :tier"),
})
public class Gehege {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Zoo zoo;
    public List<Tier> tiere;

    public Gehege(Zoo zoo) {
        this.zoo = zoo;
    }

    public Gehege(Zoo zoo,List<Tier> tiere) {
        this.zoo = zoo;
        this.tiere = tiere;
    }

    public Long getId() { return id; }

    public Zoo getZoo() {
        return zoo;
    }

    public void setZoo(Zoo zoo) {
        this.zoo = zoo;
    }

    public List<Tier> getTiere() {
        return tiere;
    }

    public void setTiere(List<Tier> tiere) {
        this.tiere = tiere;
    }

}
