package factory;

import buttons.IButton;
import buttons.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    public IButton createButton() {

        return new WindowsButton();

    }

}
