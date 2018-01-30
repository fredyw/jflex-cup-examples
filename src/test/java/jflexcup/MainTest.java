package jflexcup;

import org.junit.Test;

import java.io.Reader;
import java.io.StringReader;
import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class MainTest {
    @Test
    public void testParse() throws Exception {
        assertEquals(new BigDecimal("123"), Main.parse(reader("NUMBER 123")));
        assertEquals("hello_world", Main.parse(reader("NAME hello_world")));
        assertEquals(new BigDecimal("123.45"), Main.parse(reader("NUMBER 123.45")));
        assertEquals("hello.world", Main.parse(reader("NAME hello.world")));
        assertEquals("hello.world", Main.parse(reader("NAME hello . world")));
        assertEquals(new BigDecimal(".45"), Main.parse(reader("NUMBER .45")));
        assertEquals(new BigDecimal(".45e1"), Main.parse(reader("NUMBER .45e1")));
        assertEquals(new BigDecimal(".45e-1"), Main.parse(reader("NUMBER .45e-1")));
        assertEquals("hello.123_world", Main.parse(reader("NAME hello.`123_world`")));
        assertEquals("123_world", Main.parse(reader("NAME 123_world")));
        assertEquals("hello.123_world", Main.parse(reader("NAME hello. 123_world")));
        assertEquals("hello.123_world", Main.parse(reader("NAME hello.`123_world`")));
//        assertEquals("hello.123_world", Main.parse(reader("NAME hello.123_world")));
    }

    private static Reader reader(String str) {
        return new StringReader(str);
    }
}