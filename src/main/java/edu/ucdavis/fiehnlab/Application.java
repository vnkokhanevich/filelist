package edu.ucdavis.fiehnlab;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
@EnableAutoConfiguration

public class Application {
    public static void main(String[] args){
        FileIndex fileIndex = new FileIndex();
        List<String> fileList = fileIndex.fileIndex("/Users/vlad/Documents/Projects/demo/src/test/resources/spectra-hash");

        System.out.println(fileList);
    }



}

