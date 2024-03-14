package org.example.dp.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class UtilsFile {
    public static String readFile(String path){
        StringBuilder result = new StringBuilder();
        Path rootDir = Paths.get(".").normalize().toAbsolutePath();
        File myFile = new File(rootDir.toString() + "src/main/resources/" + path);
        Scanner reader = null;

        try {
            reader = new Scanner(myFile);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        while (reader.hasNextLine()){
            result.append(reader.hasNextLine());
        }
        reader.close();

        return result.toString();
    }
}
