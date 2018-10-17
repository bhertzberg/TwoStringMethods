import org.junit.Test;

import static org.junit.Assert.*;

public class TwoStringMethodsTest {

    @Test
    public void abcTest1() {
        boolean result = TwoStringMethods.abcTest("abc123");
        assertEquals(true, result);
    }

    @Test
    public void abcTest2() {
        boolean result = TwoStringMethods.abcTest(".abc123");
        assertEquals(false, result);
    }

    @Test
    public void abcTest3() {
        boolean result = TwoStringMethods.abcTest("abc.123");
        assertEquals(true, result);
    }

    @Test
    public void abcTest4() {
        boolean result = TwoStringMethods.abcTest("");
        assertEquals(false, result);
    }


    @Test
    public void alternateStringsTest1() {
        String result = TwoStringMethods.alternateStrings("abc", "xyz");
        assertEquals("axbycz", result);
    }

    @Test
    public void alternateStringsTest2() {
        String result = TwoStringMethods.alternateStrings("Hi", "There");
        assertEquals("HTihere", result);
    }

    @Test
    public void alternateStringsTest3() {
        String result = TwoStringMethods.alternateStrings("xxxx", "Thereee");
        assertEquals("xTxhxexreee", result);
    }

    @Test
    public void alternateStringsTest4() {
        String result = TwoStringMethods.alternateStrings("Thereee", "xxxx");
        assertEquals("Txhxexrxeee", result);
    }

    @Test
    public void alternateStringsTest5() {
        String result = TwoStringMethods.alternateStrings("", "");
        assertEquals("", result);
    }
}