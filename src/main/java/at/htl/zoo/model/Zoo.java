package at.htl.zoo.model;

import javax.persistence.*;

@Entity
@NamedQueries({
        @NamedQuery(name = "Zoo.findByName", query = "select c from ZOO c where c.name = :name"),
        @NamedQuery(name = "Zoo.findByOrt", query = "select c from ZOO c where c.ort = :ort"),
        @NamedQuery(name = "Zoo.findByDirektor", query = "select c from ZOO c join direktor d on d.id = c.direktor.id where d.id = :id")
})
public class Zoo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public String Name;
    public String Ort;
    public Direktor direktor;

    public Zoo(String name, String ort, Direktor direktor) {
        Name = name;
        Ort = ort;
        this.direktor = direktor;
    }

    public Long getId() { return id; }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getOrt() {
        return Ort;
    }

    public void setOrt(String ort) {
        Ort = ort;
    }

    public Direktor getDirektor() {
        return direktor;
    }

    public void setDirektor(Direktor direktor) {
        this.direktor = direktor;
    }
}
