package KLEF.spring_DI;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world! 
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext factory=new AnnotationConfigApplicationContext(AnnotationConfig.class);
        Engine engine=factory.getBean(Engine.class);
        engine.model();
    }
}