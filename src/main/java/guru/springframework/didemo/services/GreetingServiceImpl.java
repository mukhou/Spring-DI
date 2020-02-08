/* 
User: Urmi
Date: 12/24/2019 
Time: 5:47 PM
*/

package guru.springframework.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService{

    public static final String HELLO = "Hello Gurus!! - Original";

    @Override
    public String sayGreeting() {
        return HELLO;
    }
}
