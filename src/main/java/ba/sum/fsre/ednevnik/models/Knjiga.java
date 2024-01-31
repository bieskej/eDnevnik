package ba.sum.fsre.ednevnik.models;
import jakarta.persistence.*;

@Entity
@Table(name = "knjiga")
public class Knjiga {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "knjiga_id")
    private Long id;

    @Column(name = "autor")
    private String autor;

    @Column(name = "naziv")
    private String naziv;

    // Getters and setters...
}

