package rescate.rescateDeMascota.entidades;

import javax.persistence.*;
import javax.validation.constraints.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
@Builder
@Table(name = "persona")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_persona;

    @Column
    @Size(max = 80, message = "Nombre demasiado largo")
    private String nombre;

    @Column
    private String telefono;

    @Column
    private String mail;

}
