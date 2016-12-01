package com.maskibth.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
public class FileLoaderUtilTest {

    @Test
    public void shouldListFileNames() {
        List<String> files = FileLoaderUtil.loadFileNamesInAscendingOrder("src/test/resources/deploy");

        assertNotNull(files);
    }

    @Test
    public void shouldListFileNamesInAscOrder() {
        List<String> files = FileLoaderUtil.loadFileNamesInAscendingOrder("src/test/resources/deploy");

        assertNotNull(files);
        assertEquals("v3-anotherRelease.cypher", files.get(2));
        assertEquals("v2-Release.cypher", files.get(1));
    }

}
