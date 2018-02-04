import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomSimpleCanalClientTest {

    @Test
    public void testStartClient() throws Exception {
        String xml = "classpath:applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { xml });
        System.out.println(context.getBean("singleTestCanalClient"));
        System.in.read();
    }
}