package projekt.platforma_ecommerce.model;


import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Klient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String imie;
    private String nazwisko;
    private String adres;
    private String telefon;
    private String email;
    private String haslo;

    @OneToMany(mappedBy = "klient")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Set<Zamowienie> zamowienia;
}
