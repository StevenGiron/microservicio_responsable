package co.com.responsable.mongo.empresa;

import co.com.responsable.model.empresa.Empresa;
import co.com.responsable.model.empresa.gateways.EmpresaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
@AllArgsConstructor
public class EmpresaRepositoryImpl implements EmpresaRepository {
    private final MongoRepositoryEmpresaAdapter dao;
    @Override
    public Mono<Empresa> obtenerEmpresaPorid(String id) {
        return dao.findById(id);
    }
}
