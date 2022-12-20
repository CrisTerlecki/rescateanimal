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
@Table(name = "especie")
public class Especie {

    @Column
    private String tipo;

}
