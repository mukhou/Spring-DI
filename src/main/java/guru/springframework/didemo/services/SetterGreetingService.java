/* 
User: Urmi
Date: 12/24/2019 
Time: 9:29 PM
*/

package guru.springframework.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Setter greeting service";
    }
}
