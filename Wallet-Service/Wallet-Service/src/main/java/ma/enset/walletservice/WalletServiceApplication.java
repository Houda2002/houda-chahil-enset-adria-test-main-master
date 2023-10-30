package ma.enset.walletservice;

import ma.enset.walletservice.entities.Client;
import ma.enset.walletservice.entities.Wallet;
import ma.enset.walletservice.repositories.ClientRepository;
import ma.enset.walletservice.repositories.WalletRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class WalletServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(WalletServiceApplication.class, args);
    }


    CommandLineRunner start(ClientRepository clientRepository, WalletRepository walletRepository){
        return args -> {

            clientRepository.save(new Client(null,"CHAHIL","CHHAIL@gmail.com"));
            clientRepository.save(new Client(null,"CHAHAIL","CHAHAIL@gmail.com"));
            clientRepository.save(new Client(null,"CHAHIL","CHHAIL@gmail.com"));

            walletRepository.save(new Wallet((Long) null, 122.0,new Date(),"currency"));
            walletRepository.save(new Wallet((Long) null, 122.0,new Date(),"currency"));
            walletRepository.save(new Wallet((Long) null, 122.0,new Date(),"currency"));
        };
    }


