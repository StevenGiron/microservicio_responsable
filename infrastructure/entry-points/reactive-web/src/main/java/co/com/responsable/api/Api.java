package co.com.responsable.api;

import co.com.responsable.model.empleado.Empleado;
import co.com.responsable.usecase.empleado.EmpleadoUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class Api {
    private final EmpleadoUseCase empleadoUseCase;

    @PostMapping(value = "/obtenerEmpleado/{correo}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<Empleado> obtenerEmpledoPorCorreoPersonal(@PathVariable("correo") String correo) {
        return empleadoUseCase.findEmpleadoByCorreoPersonal(correo);
    }


}
