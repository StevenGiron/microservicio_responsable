package co.com.responsable.mongo.empresa;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "empresa")
public class EmpresaData {
    @Id
    protected String id;
    protected String nombre;
    protected String nit;
    protected String ubicacion;
}
