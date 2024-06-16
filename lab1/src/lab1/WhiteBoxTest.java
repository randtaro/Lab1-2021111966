package lab1;
import org.junit.BeforeClass;
import org.junit.Test;
import lab1.*;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;



public class WhiteBoxTest {

    private static Map<String, Map<String, Integer>> graph;

    @BeforeClass
    public static void set_graph() {
        String fileName = "C:\\Users\\64126\\Desktop\\软件工程\\newinput.txt";
        graph = TextDigraph.buildDirectedGraph(fileName);
    }

    @Test
    public void calcShortestPath1() {
        String word1 = "I";
        String word2 = "am";
        String test = TextDigraph.calcShortestPath(word1,word2,graph);
        assertEquals("No \"i\" and \"am\" in the graph!",test);
    }



    @Test
    public void calcShortestPath2() {
        String word1 = "I";
        String word2 = "to";
        String words = TextDigraph.calcShortestPath(word1,word2,graph);
        assertEquals("No \"i\" in the graph!",words);
    }

    @Test
    public void calcShortestPath3() {
        String word1 = "to";
        String word2 = "I";
        String words = TextDigraph.calcShortestPath(word1,word2,graph);
        assertEquals("No \"i\" in the graph!",words);
    }

    @Test
    public void calcShortestPath4() {
        String word1 = "to";
        String word2 = "seek";
        String words = TextDigraph.calcShortestPath(word1,word2,graph);
        assertEquals("The shortest path from to to seek is: to -> seek. Distance: 1.",words);
    }

    @Test
    public void calcShortestPath5() {
        String word1 = "to";
        String word2 = "new";
        String words = TextDigraph.calcShortestPath(word1,word2,graph);
        assertEquals("The shortest path from to to new is: to -> explore -> strange -> new. Distance: 3.",words);
    }


}