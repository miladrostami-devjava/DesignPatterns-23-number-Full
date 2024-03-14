package imlFactory;

import GUI.button.buttonmodel.DarkButton;
import GUI.button.interfaceButton.Button;
import GUI.checkbox.checkboxmodel.DarkCheckBox;
import GUI.checkbox.interfaceCheckbox.CheckBox;
import abstractFactory.GUIFactory;

public class DarkGUIImpAbstractFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new DarkCheckBox();
    }
}
