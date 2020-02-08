/* 
User: Urmi
Date: 12/24/2019 
Time: 5:47 PM
*/

package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    //NOTE: Autowiring done on interface, which has 3 different implementations, but the property name matches with one
    //of the impl classes(GreetingServiceImpl). Here spring uses reflection to determine the actual object that needs to be
    //created and injected. Renaming the greetingServiceImpl to greetingService will throw below error:
    //Field greetingService in guru.springframework.didemo.controllers.PropertyInjectedController required a single bean, but 3 were found:
    //IMP: In case of a Primary bean, that will override this reflection and when spring creates this bean, the primary bean will be
    //inejcted instead of the GreetingServiceImpl that was used before using reflection
    @Autowired
    @Qualifier("greetingServiceImpl")
    public GreetingService greetingServiceImpl;

    public String sayHello(){
        return greetingServiceImpl.sayGreeting();
    }


}
