package co.com.responsable.usecase.sede;

import co.com.responsable.model.sede.Sede;
import co.com.responsable.model.sede.gateways.SedeRepository;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class SedeUseCase {
    private final SedeRepository sedeRepository;

    public Mono<Sede> obtenerSedePorId(String id) {
        return sedeRepository.obtenerSedePorId(id);
    }
    public Mono<Sede> guadarSede(Sede sede){
        return sedeRepository.guardarSede(sede);
    }
    public Mono<Sede> actualizarSede (String id, Sede sede){
        return sedeRepository.actualizarSede(id, sede);
    }
    public Mono<Void> eliminarSede(String id){
        return sedeRepository.eliminarSede(id);
    }
}
