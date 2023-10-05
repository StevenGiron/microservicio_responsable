package co.com.responsable.usecase.colaborador;

import co.com.responsable.model.colaborador.Colaborador;
import co.com.responsable.model.colaborador.gateways.ColaboradorRepository;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class ColaboradorUseCase {
    private final ColaboradorRepository colaboradorRepository;

    public Flux<Colaborador> obtenerColaboradores() {
        return colaboradorRepository.obtenerColaboradores();
    }

    public Mono<Colaborador> obtenerColaboradorPorCorreo(String correo) {
        return colaboradorRepository.obtenerColaboradorPorCorreo(correo);
    }

    public Mono<Colaborador> guardarColaborador(Colaborador colaborador) {
        return colaboradorRepository.guardarColaborador(colaborador);
    }

    public Mono<Colaborador> actualizarColaborador(String id, Colaborador colaborador) {
        return colaboradorRepository.actualizarColaborador(id, colaborador);
    }

    public Mono<Void> elminarColaborador(String id) {
        return colaboradorRepository.eliminarColaborador(id);
    }
}
