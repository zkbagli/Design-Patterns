package com.java.patterns.structural.composite;

import java.awt.Font;

public abstract class AbstractDocumentElement implements IDocumentElement {

    private Font font;
    private CompositeDocumentElement parent;

    @Override
    public CompositeDocumentElement getParent() {
        return this.parent;
    }

    protected void setParent(final CompositeDocumentElement parent) {
        this.parent = parent;
    }

    @Override
    public Font getFont() {
        if (this.font != null) {
            return this.font;
        } else if (this.parent != null) {
            return this.parent.getFont();
        } else {
            return null;
        }
    }

    @Override
    public void setFont(final Font font) {
        this.font = font;
    }

    @Override
    public abstract int getCharLength();

}
