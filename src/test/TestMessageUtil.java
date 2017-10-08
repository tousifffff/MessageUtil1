import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

public class TestMessageUtil
{

String message = "Tousif";
MessageUtil message = new MessageUtil(message);

@Test
public void testPrintMessage()
{
 System.out.println("Inside TestMessage()");
 assertEquals(message,messageUtil.printMessage());
}

@Test
public void testSalutationMessage()
{
 System.out.println("Inside TestSalutationMessage()");
 message = "Hi!" + "Tousif";
 assertEquals(message,messageUtil.salutationMessage());
}
}