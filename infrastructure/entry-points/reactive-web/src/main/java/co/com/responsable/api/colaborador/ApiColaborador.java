package co.com.responsable.api.colaborador;

import co.com.responsable.api.colaborador.dto.ColaboradorDto;
import co.com.responsable.model.colaborador.Colaborador;
import co.com.responsable.usecase.colaborador.ColaboradorUseCase;
import co.com.responsable.usecase.empresa.EmpresaUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class ApiColaborador {
    private final ColaboradorUseCase colaboradorUseCase;
    private final EmpresaUseCase empresaUseCase;

    @GetMapping(value = "/obtenerColaboradores", produces = MediaType.APPLICATION_JSON_VALUE)
    public Flux<Colaborador> obtenerColaboradores(){
        return colaboradorUseCase.obtenerColaboradores();
    }

    @GetMapping(value = "/obtenerColaborador/{correo}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<Colaborador> obtenerColaboradorPorCorreo(@PathVariable("correo") String correo) {
        return colaboradorUseCase.obtenerColaboradorPorCorreo(correo);
    }

    @PostMapping(value = "/guardarColaborador/{idEmpresa}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<Colaborador> guardarColaborador(@RequestBody Colaborador data, @PathVariable("idEmpresa") String idEmpresa) {
        return empresaUseCase.obtenerEmpresaPorid(idEmpresa)
                .flatMap(empresa -> {
                    data.setEmpresa(empresa);
                    return colaboradorUseCase.guardarColaborador(data);
                });
    }

    @PatchMapping(value = "/actualizarColaborador/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<Colaborador> actualizarColaborador(@PathVariable("id") String id, @RequestBody ColaboradorDto data) {
        return colaboradorUseCase.actualizarColaborador(id, data.toEntity());
    }

    @DeleteMapping(value = "/eliminarColaborador/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<Void> eliminarColaborador(@PathVariable("id") String id) {
        return colaboradorUseCase.elminarColaborador(id);
    }

}
