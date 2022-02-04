import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTester {
    @Test
    public void isPrime(){

        //now we change the tester so it passes
        assertTrue("17  is Prime",SkillDemo.isPrime(17));
    }
}
