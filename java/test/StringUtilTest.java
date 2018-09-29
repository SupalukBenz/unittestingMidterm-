import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilTest {

    @Test(expected = NullPointerException.class)
    public void testNullString(){
        String a = null;
        assertEquals(0, StringUtil.find(a, 'a'));
    }


    @Test
    public void testConcat(){
        assertEquals("HelloWorld", StringUtil.concat("Hello", "World"));
        assertEquals("aaabbb", StringUtil.concat("aaa", "bbb"));
    }

    @Test
    public void testConcatInteger(){
        assertEquals("12345", StringUtil.concat("12", "345"));
    }

    @Test
    public void testRemoveDuplicate(){
        String a = "engineer";
        assertEquals("enginer", StringUtil.remove_duplicate(a));
        String b = "ssssss";
        assertEquals("s", StringUtil.remove_duplicate(b));
        String c = "abc";
        assertEquals("abc", StringUtil.remove_duplicate(c));
    }

    @Test
    public void testDuplicate(){
        assertEquals("hellohellohello" , StringUtil.duplicate("hello", 3));
        assertEquals("AppleApple" , StringUtil.duplicate("Apple", 2));
    }

    @Test
    public void testDuplicateZero(){
        assertEquals("" , StringUtil.duplicate("zero", 0));
        assertEquals("" , StringUtil.duplicate("a", 0));
    }

    @Test
    public void testDuplicateMinusNumber() {
        assertEquals("", StringUtil.duplicate("error", -1));
    }

    @Test
    public void testBorderlineCase(){
        assertEquals("ab" , StringUtil.concat("a" , "b"));
        assertEquals("a" , StringUtil.remove_duplicate("a"));
    }


    @Test
    public void testFind(){
        assertEquals(7, StringUtil.find("kasetsart", 'r'));
        assertEquals(1, StringUtil.find("University", 'n'));
        assertEquals(0, StringUtil.find("a", 'a'));
    }

    @Test(expected = AssertionError.class)
    public void testFindReturnMinusOne(){
        String a = "testing";
        assertEquals(-1, StringUtil.find(a, 'z'));
    }

}