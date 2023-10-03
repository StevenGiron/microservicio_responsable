package co.com.responsable.model.empresa;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class Empresa {
    private String id;
    private String nombre;
    private String nit;
    private String ubicacion;

}
