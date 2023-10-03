package co.com.responsable;

import co.com.responsable.model.colaborador.Colaborador;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
//        Colaborador colaborador = Colaborador.builder()
//                .id("1")
//                .nombreCompleto("Juan")
//                .correoPersonal("juan@gmail.com")
//                .tipoDeDocumento("CC")
//                .numeroDeDocumento("123456789")
//                .descripcionDelServicio("Servicio de prueba")
//                .tipoDeContrato("Contrato de prueba")
//                .cargo("Cargo de prueba")
//                .correoEmpresarial("juan@empresa.com")
//                .salario(new BigDecimal(1000000))
//                .fechaDeFinDelServicio(LocalDateTime.now())
//                .pagoTotalDelServicio(new BigDecimal(1000000))
//                .moneda("COP")
//                .build();
//
//    System.out.println(colaborador);
    }


}
