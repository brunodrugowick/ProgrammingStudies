package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("pt")
@Primary
public class PrimaryPortugueseGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Serviço de Boas-Vindas em pt_BR.";
    }
}
