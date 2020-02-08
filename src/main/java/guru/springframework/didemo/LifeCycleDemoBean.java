/* 
User: Urmi
Date: 12/26/2019 
Time: 2:16 PM
*/

package guru.springframework.didemo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {

    public LifeCycleDemoBean() {
        System.out.println("In Lifecycle demo bean");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Lifecycle demo bean bean factory is set");

    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Lifecycle demo bean name is: " + s);

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Lifecycle demo bean terminated");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Lifecycle demo bean has its properties set");

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Lifecycle demo bean Application Context is set");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("PostConstruct annotated method is called ");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("PreDestroy method is called");
    }

    public void beforeInit(){
        System.out.println("Before Init - called by Bean Post Processor");
    }

    public void afterInit(){
        System.out.println("After Init - called by Bean Post Processor");
    }
}
