import org.junit.*;
import static org.junit.Assert.*;

public class UserTest {
    User u1, u2, u3;

    @Before
    public void setup(){
         u1 = new User(0,"u1", "ADMIN");
         u2 = new User(1,"u2", "ADMIN");
         u3 = new User(10,"u3", "BUYER");
    }

    //!!@!@!@!@!@!@!@!@!@!@!@@@@!@
    //1. Without overriding
    //Checking links of objects

    @Test
    public void testReflexsive(){
        assertEquals(u1,u1);
        // if "adress of link u1" == "adress of link u1"
        // then "true"
        // running correct, because both link are identical
    }

    @Test
    public void testSymmetrical(){
        u2 = new User(0,"u1", "ADMIN");//like u1
        assertEquals(u1,u2);
        // if "adress of link u1" == "adress of link u2"
        // then "true"
        // running incorrect, because u1 and u2 are different objects
        // and they have different links
        assertEquals(u2,u1);
    }

    @Test
    public void testTransitive(){
        u2 = new User(0,"u1", "ADMIN");//like u1
        u3 = new User(0,"u1", "ADMIN");//like u1
        assertEquals(u1,u2);
        assertEquals(u2,u3);
        assertEquals(u1,u3);
        // running incorrect
        // same problem as in testSymmetrical
    }
    
    @Test
    public void testConstancy(){
        u2 = new User(0,"u1", "ADMIN");//like u1
        for (int i = 0; i < 100; i++) {
            assertEquals(u1,u2);
        }
        // running incorrect
        // same problem as in testSymmetrica
    }
    
    

}