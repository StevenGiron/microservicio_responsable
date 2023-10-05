package co.com.responsable.mongo.colaborador;

import co.com.responsable.mongo.empleado.EmpleadoData;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "colaborador")
public class ColaboradorData extends EmpleadoData {
    private String descripcionDelServicio;
    private LocalDateTime fechaDeFinDelServicio;
    private String pagoTotalDelServicio;
    private String moneda;
}
