package co.com.responsable.mongo.empleado;

import co.com.responsable.model.empresa.Empresa;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "empleado")
public class EmpleadoData {
    @Id
    protected String id;
    protected String nombreCompleto;
    protected String correoPersonal;
    protected String tipoDeDocumento;
    protected String numeroDeDocumento;

    protected String empresa;
    private String tipoDeContrato;
    private String cargo;
    private String correoEmpresarial;
    private BigDecimal salario;
}
