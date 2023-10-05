package co.com.responsable.mongo.colaborador;

import co.com.responsable.model.colaborador.Colaborador;
import co.com.responsable.model.colaborador.gateways.ColaboradorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Optional;

@Repository
@AllArgsConstructor
public class ColaboradorRepositoryImpl implements ColaboradorRepository{
    private final MongoRepositoryColaboradorAdapter dao;
    private final MongoDBRepositoryColaborador repository;

    @Override
    public Flux<Colaborador> obtenerColaboradores() {
        return dao.findAll();
    }

    @Override
    public Mono<Colaborador> obtenerColaboradorPorCorreo(String correo) {
        return dao.doQuery(repository.findByCorreoPersonal(correo));
    }

    @Override
    public Mono<Colaborador> guardarColaborador(Colaborador colaborador) {
        return dao.save(colaborador);
    }

    @Override
    public Mono<Colaborador> actualizarColaborador(String id, Colaborador colaborador) {
        return dao.findById(id)
                .flatMap(colaboradorDb -> {
                    Optional.ofNullable(colaborador.getNombreCompleto()).ifPresent(colaboradorDb::setNombreCompleto);
                    Optional.ofNullable(colaborador.getCorreoPersonal()).ifPresent(colaboradorDb::setCorreoPersonal);
                    Optional.ofNullable(colaborador.getTipoDeDocumento()).ifPresent(colaboradorDb::setTipoDeDocumento);
                    Optional.ofNullable(colaborador.getNumeroDeDocumento()).ifPresent(colaboradorDb::setNumeroDeDocumento);
                    Optional.ofNullable(colaborador.getTipoDeContrato()).ifPresent(colaboradorDb::setTipoDeContrato);
                    Optional.ofNullable(colaborador.getCargo()).ifPresent(colaboradorDb::setCargo);
                    Optional.ofNullable(colaborador.getCorreoEmpresarial()).ifPresent(colaboradorDb::setCorreoEmpresarial);
                    Optional.ofNullable(colaborador.getSalario()).ifPresent(colaboradorDb::setSalario);
                    Optional.ofNullable(colaborador.getDescripcionDelServicio()).ifPresent(colaboradorDb::setDescripcionDelServicio);
                    Optional.ofNullable(colaborador.getFechaDeFinDelServicio()).ifPresent(colaboradorDb::setFechaDeFinDelServicio);
                    Optional.ofNullable(colaborador.getPagoTotalDelServicio()).ifPresent(colaboradorDb::setPagoTotalDelServicio);
                    Optional.ofNullable(colaborador.getMoneda()).ifPresent(colaboradorDb::setMoneda);
                    return dao.save(colaboradorDb);
                });
    }

    @Override
    public Mono<Void> eliminarColaborador(String id) {
        return dao.deleteById(id);
    }
}
