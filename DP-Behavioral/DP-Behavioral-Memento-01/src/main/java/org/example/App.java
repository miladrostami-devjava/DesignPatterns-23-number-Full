package org.example;

import org.example.dp.SourceCodeFile;
import org.example.dp.VersionControlSystem;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
String code1 = " public static void main( String[] args ){}";
        SourceCodeFile sourceCodeFile = new SourceCodeFile(code1);
        VersionControlSystem vcs = new VersionControlSystem();
        vcs.push(sourceCodeFile.add());
        String code2 =
                " public static void main( String[] args ){String a = }";
sourceCodeFile.setContent(code2);
vcs.push(sourceCodeFile.add());
sourceCodeFile.rollBack(vcs.pull(0));
        System.out.println(sourceCodeFile.getContent());

    }
}
