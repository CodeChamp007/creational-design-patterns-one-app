package com.example.productCustomizer.ui.factory;

import com.example.productCustomizer.ui.components.Button;
import com.example.productCustomizer.ui.components.DarkButton;
import com.example.productCustomizer.ui.components.DarkInputBox;
import com.example.productCustomizer.ui.components.InputBox;

public class DarkThemeFactory implements UIComponentFactory{
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public InputBox createInputBox() {
        return new DarkInputBox();
    }
}
