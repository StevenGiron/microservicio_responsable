package co.com.responsable.usecase.empresa;

import co.com.responsable.model.empresa.Empresa;
import co.com.responsable.model.empresa.gateways.EmpresaRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class EmpresaUseCase {
    private final EmpresaRepository empresaRepository;

    public Mono<Empresa> obtenerEmpresaPorid(String id) {
        return empresaRepository.obtenerEmpresaPorid(id);
    }
}
