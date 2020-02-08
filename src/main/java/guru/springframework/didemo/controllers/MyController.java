/* 
User: Urmi
Date: 12/24/2019 
Time: 5:23 PM
*/

package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
       System.out.println("hello!!");
       return greetingService.sayGreeting();
    }
}
