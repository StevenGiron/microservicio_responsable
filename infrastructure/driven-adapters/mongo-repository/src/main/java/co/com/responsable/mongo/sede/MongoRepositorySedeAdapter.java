package co.com.responsable.mongo.sede;

import co.com.responsable.model.sede.Sede;
import co.com.responsable.mongo.helper.AdapterOperations;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;

@Repository
public class MongoRepositorySedeAdapter extends AdapterOperations<Sede/* change for domain model */, SedeData/* change for adapter model */, String, MongoDBRepositorySede>
// implements ModelRepository from domain
{

    public MongoRepositorySedeAdapter(MongoDBRepositorySede repository, ObjectMapper mapper) {
        /**
         *  Could be use mapper.mapBuilder if your domain model implement builder pattern
         *  super(repository, mapper, d -> mapper.mapBuilder(d,ObjectModel.ObjectModelBuilder.class).build());
         *  Or using mapper.map with the class of the object model
         */
        super(repository, mapper, d -> mapper.map(d, Sede.class/* change for domain model */));
    }
}
