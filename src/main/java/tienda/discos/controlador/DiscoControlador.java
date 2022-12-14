package tienda.discos.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tienda.discos.fachada.DiscoFachada;
import tienda.discos.modelo.Disco;

@RestController
@RequestMapping("/discos")
public class DiscoControlador {

    private final DiscoFachada discos;

    @Autowired
    public DiscoControlador(DiscoFachada discos) { this.discos = discos; }

    @GetMapping(
            path = "{titulo}",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    ResponseEntity<Disco> get(@PathVariable("titulo") String titulo) {
        return ResponseEntity.of(discos.get(titulo));
    }

}
