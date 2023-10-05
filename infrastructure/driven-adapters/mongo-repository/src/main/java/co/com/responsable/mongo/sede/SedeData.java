package co.com.responsable.mongo.sede;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "sede")
public class SedeData {
    @Id
    protected String id;
    protected String nombre;
    protected String ciudad;
    protected String direccion;
}
