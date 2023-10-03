package co.com.responsable.model.empleado.gateways;

import co.com.responsable.model.empleado.Empleado;
import reactor.core.publisher.Mono;

public interface EmpleadoRepository {
    public Mono<Empleado> findByCorreoPersonal(String correo);
    public Mono<Empleado> findById(String id);
}
