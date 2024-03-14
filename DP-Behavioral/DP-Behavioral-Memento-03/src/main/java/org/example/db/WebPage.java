package org.example.db;

public class WebPage {
    private String currentPageURL;

    public void setCurrentPageURL(String currentPageURL) {
        this.currentPageURL = currentPageURL;
        System.out.println("loading page " + currentPageURL);
    }
    public WebPageMemento save(){
      return new WebPageMemento(currentPageURL);
    }
    public void restore(WebPageMemento webPageMemento){
        currentPageURL = webPageMemento.getUrl();
        System.out.println("Restored Page :" + currentPageURL);
    }


}
