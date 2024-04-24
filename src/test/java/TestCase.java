
import com.myprograming.myprograming.HelloWorld;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class TestCase {
    @Test
    public void Test(){
        String src = HelloWorld.HelloWorldMessage();
        String ref = "Hello World";
        Assertions.assertEquals(src, ref);
    }
    
}
