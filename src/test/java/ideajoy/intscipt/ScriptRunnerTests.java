package ideajoy.intscipt;

import ideajoy.intscript.ScriptRunner;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertEquals;


public class ScriptRunnerTests {

    private ScriptRunner runner;

    @Before
    public void init(){
        runner = new ScriptRunner(null); //this will lead to NPEs
    }

    @Test
    public void addOne(){
        String line = "Add 1";
        assertEquals(1,runner.runLine(line));
    }

    @Test
    public void addOneSubTwo(){
        String line = "Add 1";
        assertEquals(1,runner.runLine(line));
        line = "Sub 2";
        assertEquals(-1,runner.runLine(line));
    }

    @Test
    public void script(){
        File f = new File("test.is.txt");
        assertEquals(-3,runner.run(f));
    }



}
