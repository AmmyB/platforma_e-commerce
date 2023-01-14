package projekt.platforma_ecommerce.model;


import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Pozycja_zamowienia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int ilosc;

    @ManyToOne
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Produkt produkt;


    @ManyToOne
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Zamowienie zamowienie;


}
