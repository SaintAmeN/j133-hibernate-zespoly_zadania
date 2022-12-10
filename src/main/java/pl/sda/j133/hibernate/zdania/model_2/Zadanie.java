package pl.sda.j133.hibernate.zdania.model_2;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.Set;

/**
 * @author Paweł Recław, AmeN
 * @project j133-hibernate-zadania
 * @created 10.12.2022
 */
@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Zadanie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tytul;
    private String opis;
    @CreationTimestamp
    private LocalDateTime czasDodania;

    private int priorytet;

    @ManyToMany
    @EqualsAndHashCode.Exclude
    private Set<CzlonekZespolu> wykonawcy;

    @OneToMany(mappedBy = "zadanie")
    @EqualsAndHashCode.Exclude
    private Set<Komentarz> komentarze;
}
