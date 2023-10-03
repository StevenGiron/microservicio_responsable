package co.com.responsable.mongo.empleado;

import co.com.responsable.model.empleado.Empleado;
import co.com.responsable.mongo.empleado.MongoDBRepository;
import co.com.responsable.mongo.helper.AdapterOperations;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;

@Repository
public class MongoRepositoryAdapter extends AdapterOperations<Empleado/* change for domain model */, EmpleadoData/* change for adapter model */, String, MongoDBRepository>
// implements ModelRepository from domain
{

    public MongoRepositoryAdapter(MongoDBRepository repository, ObjectMapper mapper) {
        /**
         *  Could be use mapper.mapBuilder if your domain model implement builder pattern
         *  super(repository, mapper, d -> mapper.mapBuilder(d,ObjectModel.ObjectModelBuilder.class).build());
         *  Or using mapper.map with the class of the object model
         */
        super(repository, mapper, d -> mapper.map(d, Empleado.class/* change for domain model */));
    }
}
