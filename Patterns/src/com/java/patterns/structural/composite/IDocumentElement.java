package com.java.patterns.structural.composite;

import java.awt.Font;

public interface IDocumentElement {

    public CompositeDocumentElement getParent();

    public Font getFont();

    public void setFont(Font font);

    public int getCharLength();
}
