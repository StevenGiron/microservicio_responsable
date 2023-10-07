package co.com.responsable.mongo.empleado;


import co.com.responsable.model.empleado.Empleado;
import co.com.responsable.model.empleado.gateways.EmpleadoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Optional;

@Repository
@AllArgsConstructor
public class EmpleadoRepositoryImpl implements EmpleadoRepository {
    private final MongoRepositoryEmpleadoAdapter dao;
    private final MongoDBRepositoryEmpleado repository;

    @Override
    public Flux<Empleado> obtenerEmpleados() {
        return dao.findAll();
    }

    @Override
    public Mono<Empleado> obtenerEmpleadoPorCorreo(String correo) {
        return dao.doQuery(repository.findByCorreoPersonal(correo));
    }

    @Override
    public Mono<Empleado> obtenerEmpleadoPorId(String id) {
        return dao.findById(id);
    }

    @Override
    public Mono<Empleado> guardarEmpleado(Empleado empleado) {
        return dao.save(empleado);
    }

    @Override
    public Mono<Empleado> actualizarEmpleado(String id, Empleado empleado) {
        return dao.findById(id)
                .flatMap(empleadoDb -> {
                    Optional.ofNullable(empleado.getNombreCompleto()).ifPresent(empleadoDb::setNombreCompleto);
                    Optional.ofNullable(empleado.getCorreoPersonal()).ifPresent(empleadoDb::setCorreoPersonal);
                    Optional.ofNullable(empleado.getTipoDeDocumento()).ifPresent(empleadoDb::setTipoDeDocumento);
                    Optional.ofNullable(empleado.getNumeroDeDocumento()).ifPresent(empleadoDb::setNumeroDeDocumento);
                    Optional.ofNullable(empleado.getTipoDeContrato()).ifPresent(empleadoDb::setTipoDeContrato);
                    Optional.ofNullable(empleado.getCargo()).ifPresent(empleadoDb::setCargo);
                    Optional.ofNullable(empleado.getCorreoEmpresarial()).ifPresent(empleadoDb::setCorreoEmpresarial);
                    Optional.ofNullable(empleado.getSalario()).ifPresent(empleadoDb::setSalario);
                    return dao.save(empleadoDb);
                });
    }

    @Override
    public Mono<Void> eliminarEmpleado(String id) {
        return dao.deleteById(id);
    }

}
