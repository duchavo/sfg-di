package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service("i18nService")
public class I18nSpanishService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}
