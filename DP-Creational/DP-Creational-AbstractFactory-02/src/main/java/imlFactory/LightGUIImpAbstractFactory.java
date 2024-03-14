package imlFactory;

import GUI.button.buttonmodel.LightButton;
import GUI.button.interfaceButton.Button;
import GUI.checkbox.checkboxmodel.LightCheckBox;
import GUI.checkbox.interfaceCheckbox.CheckBox;
import abstractFactory.GUIFactory;

public class LightGUIImpAbstractFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new LightCheckBox();
    }
}
