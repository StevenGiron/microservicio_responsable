package co.com.responsable.api.colaborador.dto;

import co.com.responsable.api.empleado.dto.EmpleadoDto;
import co.com.responsable.model.colaborador.Colaborador;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Data
public class ColaboradorDto extends EmpleadoDto {
    private String descripcionDelServicio;
    private LocalDateTime fechaDeFinDelServicio;
    private BigDecimal pagoTotalDelServicio;
    private String moneda;

    public Colaborador toEntity(){
        return Colaborador.builder()
                .nombreCompleto(nombreCompleto)
                .correoPersonal(correoPersonal)
                .tipoDeDocumento(tipoDeDocumento)
                .numeroDeDocumento(numeroDeDocumento)
                .empresa(empresa)
                .tipoDeContrato(tipoDeContrato)
                .cargo(cargo)
                .correoEmpresarial(correoEmpresarial)
                .salario(salario)
                .descripcionDelServicio(descripcionDelServicio)
                .fechaDeFinDelServicio(fechaDeFinDelServicio)
                .pagoTotalDelServicio(pagoTotalDelServicio)
                .moneda(moneda)
                .build();
    }
}
