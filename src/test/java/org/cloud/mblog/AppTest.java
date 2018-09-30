package org.cloud.mblog;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    /**
     * Rigourous Test :-)
     * @throws JsonProcessingException 
     */
    public void testApp() throws JsonProcessingException {
        ObjectMapper m = new ObjectMapper();
        Map<String, String> map = new HashMap<>();
        map.put("adsf", "ddd");
        map.put("ad3", "rd");
        
        String dsf = m.writeValueAsString(map);
        System.out.println(dsf);
    }
}
