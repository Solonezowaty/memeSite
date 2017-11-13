package model;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Gif implements GifDao {
    private String name;
    public String
    List<String> results = new ArrayList<String>();
    File[] files = new File("/path/to/the/directory").listFiles();
        for (File file : files) {
        if (file.isFile()) {
            results.add(file.getName());
        }
    }


    @Override
    public List<String> memeNames(String name) {
        return null;
    }
}
