/* 
User: Urmi
Date: 12/24/2019 
Time: 5:55 PM
*/

package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private GreetingService greetingService;

    //NOTE: Starting spring 4, if a bean has only ONE Constructor, the @Autowired annotation is NOT NEEDED
    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }


}
