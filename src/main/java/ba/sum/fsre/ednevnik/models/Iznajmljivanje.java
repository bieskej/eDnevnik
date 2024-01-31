package ba.sum.fsre.ednevnik.models;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "iznajmljivanje")
public class Iznajmljivanje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iznajmljivanje_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "korisnik_id")
    private Korisnik korisnik;

    @ManyToOne
    @JoinColumn(name = "knjiga_id")
    private Knjiga knjiga;

    @Temporal(TemporalType.DATE)
    @Column(name = "datum_iznajmljivanja")
    private Date datumIznajmljivanja;

    // Dodatni atributi za iznajmljivanje, npr. datum vraćanja, status iznajmljivanja, itd.

    // Getters and setters...
}

