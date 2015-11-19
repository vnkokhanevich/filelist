package edu.ucdavis.fiehnlab;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;

@RestController
public class FileSearch
{
public FileSearch(){}

    @RequestMapping("/find")
    public void findFile(String name, File file)
    {
        File[] list = file.listFiles();
        if(list!=null)
            for (File fil : list)
            {
                if (fil.isDirectory())
                    findFile(name, fil);
                else if (name.equalsIgnoreCase(fil.getName()))
                    System.out.println(fil.getParentFile());
                else {
                    System.out.println("The files in this directory are: ");

                }
            }
    }
}