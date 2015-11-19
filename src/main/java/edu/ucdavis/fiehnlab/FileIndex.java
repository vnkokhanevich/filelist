package edu.ucdavis.fiehnlab;


import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@RestController
public class FileIndex {

    //Lists all files and directories in a specified path

    public List fileIndex(String path){
        File folderName = new File(path);
        File[] list = folderName.listFiles();
        List<String> fileList = new ArrayList<String>();

        if(list != null) {
            for (File counter: list) {
                if (counter.isDirectory()) {
                    if (counter.getName().toLowerCase().endsWith(".d")) {
                        fileList.add("File: " + counter.getAbsolutePath());
                        //System.out.println("File: " + counter.getAbsolutePath());
                        continue;
                    }
                    fileIndex(counter.getAbsolutePath());
                    fileList.add("Directory: " + counter.getAbsolutePath());
                    //System.out.println("Directory: " + counter.getAbsolutePath());
                } else {
                    fileList.add("File: " + counter.getAbsolutePath());
                    //System.out.println("File: " + counter.getAbsolutePath());
                }
            }
        }
        else {
            //System.out.println("Path doesn't exist");
        }
        return fileList;
    }
}
