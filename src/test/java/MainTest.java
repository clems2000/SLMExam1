import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void testHelloWorld () {
        //arrange
        //act
        String actual = Main.GetMessage();
        //assert
        Assertions.assertEquals("Hello World", actual);
    }
}

//import org.junit.jupiter.api.Assersions;
//import org.junit.jupiter.api.Test;

//public class MainTest {
 //   @Test
    ///public void
//}

