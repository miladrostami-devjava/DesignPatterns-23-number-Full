package abstractFactory;

import GUI.button.interfaceButton.Button;
import GUI.checkbox.interfaceCheckbox.CheckBox;

public interface GUIFactory {
Button createButton();
CheckBox createCheckBox();


}
