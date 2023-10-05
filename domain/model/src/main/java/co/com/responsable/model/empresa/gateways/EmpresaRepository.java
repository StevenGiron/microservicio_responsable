package co.com.responsable.model.empresa.gateways;

import co.com.responsable.model.empresa.Empresa;
import reactor.core.publisher.Mono;

public interface EmpresaRepository {
    public Mono<Empresa> obtenerEmpresaPorid(String id);
}
