package co.com.responsable.mongo.empresa;

import co.com.responsable.model.empresa.Empresa;
import co.com.responsable.mongo.helper.AdapterOperations;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;

@Repository
public class MongoRepositoryEmpresaAdapter extends AdapterOperations<Empresa/* change for domain model */, EmpresaData/* change for adapter model */, String, MongoDBRepositoryEmpresa>
// implements ModelRepository from domain
{

    public MongoRepositoryEmpresaAdapter(MongoDBRepositoryEmpresa repository, ObjectMapper mapper) {
        /**
         *  Could be use mapper.mapBuilder if your domain model implement builder pattern
         *  super(repository, mapper, d -> mapper.mapBuilder(d,ObjectModel.ObjectModelBuilder.class).build());
         *  Or using mapper.map with the class of the object model
         */
        super(repository, mapper, d -> mapper.map(d, Empresa.class/* change for domain model */));
    }
}
