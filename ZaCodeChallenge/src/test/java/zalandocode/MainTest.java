package zalandocode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class MainTest {

    @Test
    void testCorpMessageWithKLimiAndSpaces1(){
        String result = Main.corpMessagewithKLimit("Codility we test coders",14);
        Assertions.assertEquals(result,"Codility we");
    }

    @Test
    void testCorpMessageWithKLimitAndSpaces2(){
        String result = Main.corpMessagewithKLimit("why not",100);
        Assertions.assertEquals(result,"why not");
    }
    @Test
    void testCorpMessageWithKLimitAndSpaces3(){
        String result = Main.corpMessagewithKLimit("The quick brown fox jumps over the lazy dog",39);
        Assertions.assertEquals(result,"The quick brown fox jumps over the lazy");
    }
    @Test
    void testCorpMessageWithKLimitWithoutSpaces(){
        String result = Main.corpMessagewithKLimit("Codilitywetestcoders",17);
        Assertions.assertEquals(result,"");
    }
}