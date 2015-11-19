package edu.ucdavis.fiehnlab;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Testing if fileIndex lists all files and directories
 */
public class FileIndexTest {
    FileIndex fileIndex;

    @Before
    public void setUp() throws Exception {
        fileIndex = new FileIndex();
    }

    @Test
    public void testFileIndex() throws Exception {
        String path = "/Users/vlad/Documents/Projects/demo/src/test/resources/spectra-hash";
        List<String> fileList = fileIndex.fileIndex(path);

    }

    @Test
    public void testReturnType() throws Exception{
        assert(FileIndex.class == fileIndex.getClass());
    }
    @Test
    public void testReturnDirectory() throws Exception {
        String path = "/Users/vlad/Documents/Projects/demo/src/test/resources/spectra-hash";
        List<String> fileList = fileIndex.fileIndex(path);
    }
}