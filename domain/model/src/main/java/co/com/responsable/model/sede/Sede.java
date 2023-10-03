package co.com.responsable.model.sede;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class Sede {
    private String id;
    private String nombre;
    private String ciudad;
    private String direccion;
}
