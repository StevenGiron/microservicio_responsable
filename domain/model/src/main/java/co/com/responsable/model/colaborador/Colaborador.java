package co.com.responsable.model.colaborador;

import co.com.responsable.model.empleado.Empleado;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(toBuilder = true)
public class Colaborador extends Empleado {
    private String descripcionDelServicio;
    private LocalDateTime fechaDeFinDelServicio;
    private BigDecimal pagoTotalDelServicio;
    private String moneda;
}
