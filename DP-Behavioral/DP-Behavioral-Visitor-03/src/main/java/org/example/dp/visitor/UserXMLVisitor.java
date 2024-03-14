package org.example.dp.visitor;

import org.example.dp.model.User;
import org.jsoup.nodes.Element;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserXMLVisitor implements XMLVisitor{
    List<User> users = new ArrayList<>();

    @Override
    public void visitElement(Element element) {
        if (element.tagName().equalsIgnoreCase("User")){
            String firstName = element.getElementsByTag("firstName").text();
            String lastName = element.getElementsByTag("lastName").text();
            String nationalCode = element.getElementsByTag("nationalCode").text();
            String birthDateStr = element.getElementsByTag("birthDate").text();
            SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
            Date birthDate;
            try {
                 birthDate = format.parse(birthDateStr);
            } catch (ParseException e) {
             birthDate = null;
             e.getStackTrace();
            }
            User user = new User(firstName,lastName,nationalCode,birthDate);
            users.add(user);
        }
    }

    public List<User> getUsers() {
        return users;
    }


}
