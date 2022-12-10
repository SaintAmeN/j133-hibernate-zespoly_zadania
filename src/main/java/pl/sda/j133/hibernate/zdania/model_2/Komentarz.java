package pl.sda.j133.hibernate.zdania.model_2;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

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
public class Komentarz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tresc;
    @CreationTimestamp
    private String czasDodania;

    @ManyToOne
    @EqualsAndHashCode.Exclude
    private CzlonekZespolu tworca;

    @ManyToOne()
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Zadanie zadanie;
}
