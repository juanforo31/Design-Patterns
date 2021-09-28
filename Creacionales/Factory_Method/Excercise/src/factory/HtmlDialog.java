package factory;

import buttons.HtmlButton;
import buttons.IButton;

public class HtmlDialog extends Dialog {

    @Override
    public IButton createButton() {
        return new HtmlButton();
    }

}
