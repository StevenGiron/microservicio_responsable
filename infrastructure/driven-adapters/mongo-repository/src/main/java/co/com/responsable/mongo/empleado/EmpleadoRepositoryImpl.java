package co.com.responsable.mongo.empleado;


import co.com.responsable.model.empleado.Empleado;
import co.com.responsable.model.empleado.gateways.EmpleadoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
@AllArgsConstructor
public class EmpleadoRepositoryImpl implements EmpleadoRepository {
    private final MongoRepositoryAdapter dao;
    private final MongoDBRepository repository;
    @Override
    public Mono<Empleado> findByCorreoPersonal(String correo) {
        return dao.doQuery(repository.findByCorreoPersonal(correo));
    }

    @Override
    public Mono<Empleado> findById(String id) {
        return dao.findById(id);
    }
}
