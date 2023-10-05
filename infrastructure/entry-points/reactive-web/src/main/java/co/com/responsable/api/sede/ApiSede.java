package co.com.responsable.api.sede;

import co.com.responsable.model.sede.Sede;
import co.com.responsable.usecase.sede.SedeUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class ApiSede {
    private final SedeUseCase sedeUseCase;

    @GetMapping(value = "/obtenerSede/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<Sede> obtenerSedePorId(@PathVariable("id") String id) {
        return sedeUseCase.obtenerSedePorId(id);
    }

    @PostMapping(value = "/guardarSede", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<Sede> guadarSede(@RequestBody Sede sede) {
        return sedeUseCase.guadarSede(sede);
    }

    @PatchMapping(value = "/actualizarSede/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<Sede> actualizarSede(@PathVariable("id") String id, @RequestBody Sede sede){
        return sedeUseCase.actualizarSede(id, sede);
    }

    @DeleteMapping(value="/eliminarSede/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<Void> eliminarSede(@PathVariable("id") String id){
        return sedeUseCase.eliminarSede(id);
    }
}
