package lab1;
import org.junit.BeforeClass;
import org.junit.Test;
import lab1.*;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;



public class BlackBoxTest {

    private static Map<String, Map<String, Integer>> graph;

    @BeforeClass
    public static void set_graph() {
        String fileName = "C:\\Users\\64126\\Desktop\\软件工程\\newinput.txt";
        graph = TextDigraph.buildDirectedGraph(fileName);
    }

    @Test
    public void queryBridgeWords1() {
        String word1 = "new";
        String word2 = "and";
        String words = TextDigraph.queryBridgeWords(word1,word2,graph);
        assertEquals("The bridge word from new to and is: life.",words);
    }

    @Test
    public void queryBridgeWords2() {
        String word1 = "New";
        String word2 = "And";
        String words = TextDigraph.queryBridgeWords(word1,word2,graph);
        assertEquals("The bridge word from New to And is: life.",words);
    }

    @Test
    public void queryBridgeWords3() {
        String word1 = "new";
        String word2 = "aaaa";
        String words = TextDigraph.queryBridgeWords(word1,word2,graph);
        assertEquals("No \"aaaa\" in the graph!",words);
    }



    @Test
    public void queryBridgeWords4() {
        String word1 = "nnnn";
        String word2 = "aAaa";
        String words = TextDigraph.queryBridgeWords(word1,word2,graph);
        assertEquals("No \"nnnn\" and \"aAaa\" in the graph!",words);
    }



    @Test
    public void queryBridgeWords5() {
        String word1 = "a234";
        String word2 = "b678";
        String words = TextDigraph.queryBridgeWords(word1,word2,graph);
        assertEquals("No \"a234\" and \"b678\" in the graph!",words);
    }

}