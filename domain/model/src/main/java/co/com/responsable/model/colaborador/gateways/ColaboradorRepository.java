package co.com.responsable.model.colaborador.gateways;

import co.com.responsable.model.colaborador.Colaborador;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ColaboradorRepository {
    public Flux<Colaborador> obtenerColaboradores();
    public Mono<Colaborador> obtenerColaboradorPorCorreo(String correo);

    public Mono<Colaborador> guardarColaborador(Colaborador colaborador);

    public Mono<Colaborador> actualizarColaborador(String id, Colaborador colaborador);

    public Mono<Void> eliminarColaborador(String id);

}
