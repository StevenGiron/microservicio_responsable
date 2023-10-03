package co.com.responsable.model.empleado;

import co.com.responsable.model.empresa.Empresa;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(toBuilder = true)
public class Empleado {
    protected String id;
    protected String nombreCompleto;
    protected String correoPersonal;
    protected String tipoDeDocumento;
    protected String numeroDeDocumento;
    protected Empresa empresa;
    private String tipoDeContrato;
    private String cargo;
    private String correoEmpresarial;
    private BigDecimal salario;
}
