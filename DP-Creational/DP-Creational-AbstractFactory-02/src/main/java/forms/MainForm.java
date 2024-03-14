package forms;

import GUI.button.interfaceButton.Button;
import GUI.checkbox.interfaceCheckbox.CheckBox;
import abstractFactory.GUIFactory;
import forms.interfaceForm.Form;

public class MainForm implements Form {
    private final GUIFactory factory;


    public MainForm(GUIFactory factory)  {
        this.factory = factory;
    }
    @Override
    public void createFactory(){
        CheckBox checkBox = factory.createCheckBox();
        Button button = factory.createButton();
        checkBox.createCheckBox();
        button.createButton();
    }
}
