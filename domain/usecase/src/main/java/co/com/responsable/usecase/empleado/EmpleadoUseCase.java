package co.com.responsable.usecase.empleado;

import co.com.responsable.model.empleado.Empleado;
import co.com.responsable.model.empleado.gateways.EmpleadoRepository;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class EmpleadoUseCase {
    private final EmpleadoRepository empleadoRepository;

    public Flux<Empleado> obtenerEmpleados() {
        return empleadoRepository.obtenerEmpleados();
    }

    public Mono<Empleado> obtenerEmpleadoPorCorreo(String correo) {
        return empleadoRepository.obtenerEmpleadoPorCorreo(correo);
    }

    public Mono<Empleado> obtenerEmpleadoPorId(String id) {
        return empleadoRepository.obtenerEmpleadoPorId(id);
    }

    public Mono<Empleado> guardarEmpleado(Empleado empleado) {
        return empleadoRepository.guardarEmpleado(empleado);
    }

    public Mono<Empleado> actualizarEmpleado(String id, Empleado empleado) {
        return empleadoRepository.actualizarEmpleado(id, empleado);
    }
    public Mono<Void> eliminarEmpleado(String id) {
        return empleadoRepository.eliminarEmpleado(id);
    }
}
