package co.com.responsable.mongo.sede;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;

public interface
MongoDBRepositorySede extends ReactiveMongoRepository<SedeData/* change for adapter model */, String>, ReactiveQueryByExampleExecutor<SedeData/* change for adapter model */> {

}
