package co.com.responsable.api.empleado.dto;

import co.com.responsable.model.empleado.Empleado;
import co.com.responsable.model.empresa.Empresa;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class EmpleadoDto {

    protected String nombreCompleto;
    protected String correoPersonal;
    protected String tipoDeDocumento;
    protected String numeroDeDocumento;
    protected Empresa empresa;
    protected String tipoDeContrato;
    protected String cargo;
    protected String correoEmpresarial;
    protected BigDecimal salario;

    public Empleado toEntity(){
        return Empleado.builder()
                .nombreCompleto(nombreCompleto)
                .correoPersonal(correoPersonal)
                .tipoDeDocumento(tipoDeDocumento)
                .numeroDeDocumento(numeroDeDocumento)
                .empresa(empresa)
                .tipoDeContrato(tipoDeContrato)
                .cargo(cargo)
                .correoEmpresarial(correoEmpresarial)
                .salario(salario)
                .build();
    }
}
