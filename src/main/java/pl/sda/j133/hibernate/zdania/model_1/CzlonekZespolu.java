package pl.sda.j133.hibernate.zdania.model_1;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

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
public class CzlonekZespolu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String imie;
    private String nazwisko;

    @CreationTimestamp
    private String czasDodania;

    private Boolean aktywny;

    @ManyToOne
    @EqualsAndHashCode.Exclude
    private Zespol przypisanyZespol;

    @OneToMany(mappedBy = "przypisanyWykonawca")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Set<Zadanie> przypisaneZdania;

    @OneToMany(mappedBy = "tworca")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Set<Komentarz> komentarze;
}
