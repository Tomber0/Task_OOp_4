package bntu.task.g1072117.t4;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.Rule;
import org.junit.rules.TestRule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
	


class JuTest {
	
	
 
	@Rule
	public Timeout timeout = new Timeout(1);
	
	
    @Test
    public void testSlowMethod1() throws InterruptedException {
        //...
        TimeUnit.SECONDS.sleep(5);
        Thread.sleep(50);
    }
    @Test
    public void testSlowMethod2() {
        //...
    }

    
  //  public void test() { 
    ///    System.out.println("test");
    

	

}
