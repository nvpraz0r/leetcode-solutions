import arrays_and_hashing.ValidAnagram;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramTest {

    @Test
    void validAnagramTest(){
        var anagram = new ValidAnagram();
        assertTrue(anagram.isAnagram("anagram", "nagaram"));
        assertFalse(anagram.isAnagram("rat", "car"));
    }
}