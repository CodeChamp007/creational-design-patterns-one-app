package com.example.productCustomizer.ui.factory;

import com.example.productCustomizer.ui.components.Button;
import com.example.productCustomizer.ui.components.InputBox;
import com.example.productCustomizer.ui.components.LightButton;
import com.example.productCustomizer.ui.components.LightInputBox;

public class LightThemeFactory implements UIComponentFactory{
    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public InputBox createInputBox() {
        return new LightInputBox();
    }
}
