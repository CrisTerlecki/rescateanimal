package rescate.rescateDeMascota.entidades;

import javax.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
@Builder
@Table(name = "animal")
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_animal;

    @Column
    private String estado;

    @Column
    private String edad;

    @Column
    private String tamanio;

    @Column
    private String ubicacion;

}
