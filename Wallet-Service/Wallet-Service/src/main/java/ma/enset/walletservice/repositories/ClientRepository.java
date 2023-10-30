package ma.enset.walletservice.repositories;

import ma.enset.walletservice.entities.Client;
import ma.enset.walletservice.entities.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ClientRepository extends JpaRepository<Client,Long> {

}
