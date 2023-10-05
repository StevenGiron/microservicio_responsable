package co.com.responsable.model.sede.gateways;

import co.com.responsable.model.sede.Sede;
import reactor.core.publisher.Mono;

public interface SedeRepository {
    public Mono<Sede> obtenerSedePorId(String id);

    public Mono<Sede> guardarSede(Sede sede);

    public Mono<Sede> actualizarSede(String id, Sede sede);

    public Mono<Void> eliminarSede(String id);
}
