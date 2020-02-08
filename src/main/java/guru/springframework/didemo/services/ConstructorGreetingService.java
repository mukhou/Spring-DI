/* 
User: Urmi
Date: 12/24/2019 
Time: 9:28 PM
*/

package guru.springframework.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Construction greeting service";
    }
}
