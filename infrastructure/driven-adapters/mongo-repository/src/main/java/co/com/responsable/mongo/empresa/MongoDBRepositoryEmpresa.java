package co.com.responsable.mongo.empresa;

import co.com.responsable.mongo.empleado.EmpleadoData;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;
import reactor.core.publisher.Mono;

public interface
MongoDBRepositoryEmpresa extends ReactiveMongoRepository<EmpresaData/* change for adapter model */, String>, ReactiveQueryByExampleExecutor<EmpresaData/* change for adapter model */> {

}
