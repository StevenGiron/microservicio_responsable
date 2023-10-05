package co.com.responsable.mongo.empleado;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;
import reactor.core.publisher.Mono;

public interface
MongoDBRepositoryEmpleado extends ReactiveMongoRepository<EmpleadoData/* change for adapter model */, String>, ReactiveQueryByExampleExecutor<EmpleadoData/* change for adapter model */> {
    Mono<EmpleadoData> findByCorreoPersonal(String correo);
}
