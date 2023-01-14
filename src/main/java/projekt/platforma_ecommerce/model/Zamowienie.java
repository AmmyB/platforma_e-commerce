package projekt.platforma_ecommerce.model;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.Set;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Zamowienie {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CreationTimestamp
    private LocalDateTime dataZamowienia;
    private String statusZamowienia;

    @ManyToOne
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Klient klient;

    @OneToOne(mappedBy = "zamowienie")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Zwrot zwrot;

    @OneToMany(mappedBy = "zamowienie")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Set<Pozycja_zamowienia> pozycjeZamowienia;


}
