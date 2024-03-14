package org.example.dp;

public abstract class DocumentTemplate {



    public final void generateTemplate(){
      String header = createHeader();
   String content =   createContent();
  String footer =     createFooter();
        System.out.println(header);
        System.out.println(content);
        System.out.println(footer);
    }
    protected abstract String createHeader();
    protected abstract String createContent();
    protected abstract String createFooter();

}



