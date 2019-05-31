
package testJUnit;

import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith (Parameterized.class)
public class GrafoDirigidoTestJUnit {
    private int ordenMatriz;
    
    private static Iterable<Object[][]> getData(){
        Object[][] matrizEntera = {{1,2,3},{4,5,6},{7,8,9}};
        return Arrays.asList(new Object[][] {matrizEntera});
    }
    public GrafoDirigidoTestJUnit() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
