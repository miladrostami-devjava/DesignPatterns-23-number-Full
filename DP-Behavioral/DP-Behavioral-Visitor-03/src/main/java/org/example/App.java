package org.example;

import org.example.dp.model.User;
import org.example.dp.utils.UtilsFile;
import org.example.dp.visitor.UserXMLVisitor;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      String stringXml = UtilsFile.readFile("data.xml");
        Document document = Jsoup.parse(stringXml);
        UserXMLVisitor visitor = new UserXMLVisitor();
        Elements elements = document.getAllElements();
        for (Element element: elements) {
         visitor.visitElement(element);
        }
        List<User> users = visitor.getUsers();
        for (User user:users) {
            System.out.println(user);
        }



    }
}
