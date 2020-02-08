/* 
User: Urmi
Date: 1/23/2020 
Time: 9:34 AM
*/

package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.ConstructorGreetingService;
import guru.springframework.didemo.services.PrimaryGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class TestController {

    private ConstructorGreetingService constructorGreetingService;

    private PrimaryGreetingService primaryGreetingService;

    @Autowired
    public TestController(ConstructorGreetingService constructorGreetingService) {
        this.constructorGreetingService = constructorGreetingService;
    }

    //############THIS CAUSES FAILURE IN STARTING SPRING##############
    @Autowired(required = false)
    public TestController(PrimaryGreetingService primaryGreetingService) {
        this.primaryGreetingService = primaryGreetingService;
    }
}
