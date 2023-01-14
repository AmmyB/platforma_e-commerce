package projekt.platforma_ecommerce.model;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Zwrot {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CreationTimestamp
    private LocalDateTime dataZwrotu;
    private String statusZwrotu;
    private String komentarz;

    @ManyToOne
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Zamowienie zamowienie;




}
