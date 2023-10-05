package co.com.responsable.mongo.empleado;

import co.com.responsable.model.empresa.Empresa;
import co.com.responsable.mongo.empresa.EmpresaData;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

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
    protected EmpresaData empresa;
    protected String tipoDeContrato;
    protected String cargo;
    protected String correoEmpresarial;
    protected BigDecimal salario;
}
