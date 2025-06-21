package com.example.productCustomizer.ui.factory;

import com.example.productCustomizer.ui.components.Button;
import com.example.productCustomizer.ui.components.InputBox;

public interface UIComponentFactory {
    Button createButton();

    InputBox createInputBox();
}
