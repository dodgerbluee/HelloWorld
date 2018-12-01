import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class HelloWorldTest {

    HelloWorld helloWorld = new HelloWorld();

    @org.junit.Test
    public void getGreeting() {
        assertThat(helloWorld.getGreeting("Greg"), equalTo("Hello Greg, Hello World!"));
    }
}