package co.com.responsable.mongo.colaborador;

import co.com.responsable.mongo.empleado.EmpleadoData;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;
import reactor.core.publisher.Mono;

public interface
MongoDBRepositoryColaborador extends ReactiveMongoRepository<ColaboradorData/* change for adapter model */, String>, ReactiveQueryByExampleExecutor<ColaboradorData/* change for adapter model */> {
    Mono<ColaboradorData> findByCorreoPersonal(String correo);
}
