package co.com.responsable.usecase.empleado;

import co.com.responsable.model.empleado.Empleado;
import co.com.responsable.model.empleado.gateways.EmpleadoRepository;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class EmpleadoUseCase {
    private final EmpleadoRepository empleadoRepository;

    public Mono<Empleado> findEmpleadoByCorreoPersonal(String correo) {
        return empleadoRepository.findByCorreoPersonal(correo);
    }

    public Mono<Empleado> findEmpleadoById(String id) {
        return empleadoRepository.findById(id);
    }
}
