package co.com.responsable.mongo.colaborador;

import co.com.responsable.model.colaborador.Colaborador;
import co.com.responsable.model.empleado.Empleado;
import co.com.responsable.mongo.empleado.EmpleadoData;
import co.com.responsable.mongo.helper.AdapterOperations;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;

@Repository
public class MongoRepositoryColaboradorAdapter extends AdapterOperations<Colaborador/* change for domain model */, ColaboradorData/* change for adapter model */, String, MongoDBRepositoryColaborador>
// implements ModelRepository from domain
{

    public MongoRepositoryColaboradorAdapter(MongoDBRepositoryColaborador repository, ObjectMapper mapper) {
        /**
         *  Could be use mapper.mapBuilder if your domain model implement builder pattern
         *  super(repository, mapper, d -> mapper.mapBuilder(d,ObjectModel.ObjectModelBuilder.class).build());
         *  Or using mapper.map with the class of the object model
         */
        super(repository, mapper, d -> mapper.map(d, Colaborador.class/* change for domain model */));
    }
}
