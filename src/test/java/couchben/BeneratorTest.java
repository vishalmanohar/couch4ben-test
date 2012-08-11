package couchben;

import org.databene.benerator.main.Benerator;
import org.junit.Test;

public class BeneratorTest {

    @Test
    public void testName() throws Exception {
        Benerator.main(new String[]{"src/main/benerator/myproject.ben.xml"});
    }
}
