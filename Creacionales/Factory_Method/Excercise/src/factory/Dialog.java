package factory;

import buttons.IButton;

public abstract class Dialog {

    public void renderWindow() {

        IButton okButton = createButton();
        okButton.render();
    }

    public abstract IButton createButton();

}
