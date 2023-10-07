package co.com.responsable.model.empleado.gateways;

import co.com.responsable.model.empleado.Empleado;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface EmpleadoRepository {

    public Flux<Empleado> obtenerEmpleados();

    public Mono<Empleado> obtenerEmpleadoPorCorreo(String correo);

    public Mono<Empleado> obtenerEmpleadoPorId(String id);

    public Mono<Empleado> guardarEmpleado(Empleado empleado);

    public Mono<Empleado> actualizarEmpleado(String id, Empleado empleado);

    public Mono<Void> eliminarEmpleado(String id);

}
