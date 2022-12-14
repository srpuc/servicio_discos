package tienda.discos.fachada;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tienda.discos.modelo.Disco;
import tienda.discos.repositorio.DiscoRepositorio;
import java.util.Optional;

@Service
public class DiscoFachada {

    private final DiscoRepositorio discos;

    @Autowired
    public DiscoFachada(DiscoRepositorio discos) { this.discos = discos; }

    public Optional<Disco> get(String titulo) {return discos.getDiscoTitulo(titulo);}

}
