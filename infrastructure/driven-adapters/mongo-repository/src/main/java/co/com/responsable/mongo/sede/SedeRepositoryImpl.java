package co.com.responsable.mongo.sede;

import co.com.responsable.model.sede.Sede;
import co.com.responsable.model.sede.gateways.SedeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

import java.util.Optional;

@Repository
@AllArgsConstructor
public class SedeRepositoryImpl implements SedeRepository {
    private final MongoRepositorySedeAdapter dao;

    @Override
    public Mono<Sede> obtenerSedePorId(String id) {
        return dao.findById(id);
    }
    @Override
    public Mono<Sede> guardarSede(Sede sede){
        return dao.save(sede);
    }

    @Override
    public Mono<Sede> actualizarSede(String id, Sede sede) {
        return dao.findById(id)
                .flatMap(sedeBd -> {
                    Optional.ofNullable(sede.getNombre()).ifPresent(sedeBd::setNombre);
                    Optional.ofNullable(sede.getCiudad()).ifPresent(sedeBd::setCiudad);
                    Optional.ofNullable(sede.getDireccion()).ifPresent(sedeBd::setDireccion);
                    return dao.save(sedeBd);
                });
    }

    @Override
    public Mono<Void> eliminarSede(String id) {
        return dao.deleteById(id);
    }
}
