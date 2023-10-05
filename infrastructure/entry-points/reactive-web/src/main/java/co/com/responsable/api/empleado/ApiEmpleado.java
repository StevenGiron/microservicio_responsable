package co.com.responsable.api.empleado;

import co.com.responsable.api.empleado.dto.EmpleadoDto;
import co.com.responsable.model.empleado.Empleado;
import co.com.responsable.usecase.empleado.EmpleadoUseCase;
import co.com.responsable.usecase.empresa.EmpresaUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class ApiEmpleado {
    private final EmpleadoUseCase empleadoUseCase;
    private final EmpresaUseCase empresaUseCase;

    @GetMapping(value = "/obtenerEmpleados", produces = MediaType.APPLICATION_JSON_VALUE)
    public Flux<Empleado> obtenerEmpleados() {
        return empleadoUseCase.obtenerEmpleados();
    }

    @GetMapping(value = "/obtenerEmpleado/{correo}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<Empleado> obtenerEmpledoPorCorreoPersonal(@PathVariable("correo") String correo) {
        return empleadoUseCase.obtenerEmpleadoPorCorreo(correo);
    }

    @PostMapping(value = "/guardarEmpleado/{idEmpresa}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<Empleado> guardarEmpleado(@RequestBody EmpleadoDto data, @PathVariable("idEmpresa") String idEmpresa) {
        return empresaUseCase.obtenerEmpresaPorid(idEmpresa).flatMap(empresa -> {
            data.setEmpresa(empresa);
            return empleadoUseCase.guardarEmpleado(data.toEntity());
        });
    }

    @PatchMapping(value = "/actualizarEmpleado/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<Empleado> actualizarEmpleado(@RequestBody EmpleadoDto data, @PathVariable("id") String id) {
        return empleadoUseCase.actualizarEmpleado(id, data.toEntity());
    }

    @DeleteMapping(value = "/eliminarEmpleado/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<Void> eliminarEmpleado(@PathVariable("id") String id) {
        return empleadoUseCase.eliminarEmpleado(id);
    }
}
