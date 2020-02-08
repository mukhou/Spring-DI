/* 
User: Urmi
Date: 12/25/2019 
Time: 10:26 PM
*/

package guru.springframework.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingRepositoryImpl implements GreetingRepository {

    @Override
    public String getEnglishGreeting() {
        return "Hello from primary";
    }

    @Override
    public String getSpanishGreeting() {
        return "hola desde primaria";
    }

    @Override
    public String getGermanGreeting() {
        return "Hallo von der Grundschule";
    }
}
