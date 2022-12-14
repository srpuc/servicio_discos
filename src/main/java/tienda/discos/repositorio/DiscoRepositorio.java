package tienda.discos.repositorio;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import tienda.discos.modelo.Disco;

import java.util.Optional;

public interface DiscoRepositorio extends MongoRepository<Disco, String> {

    @Query( value = "{'titulo': '?0'}")
    public Optional<Disco> getDiscoTitulo(String titulo);

}
