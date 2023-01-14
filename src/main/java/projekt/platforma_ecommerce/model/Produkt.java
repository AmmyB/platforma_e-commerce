package projekt.platforma_ecommerce.model;


import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Produkt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nazwa;
    private String cena;
    private int stanMagazynowy;

    @OneToMany(mappedBy = "produkt")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Set<Pozycja_zamowienia> pozycjeZamowienia;

}
