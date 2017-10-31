package com.java.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class CompositeDocumentElement extends AbstractDocumentElement {

    private final List<IDocumentElement> children = new ArrayList<IDocumentElement>();

    @SuppressWarnings("unused")
    private int cachedCharLength = -1;

    public IDocumentElement getChild(final int index) {
        return this.children.get(index);
    }

    public synchronized void addChild(final IDocumentElement child) {
        synchronized (child) {
            this.children.add(child);
            ((AbstractDocumentElement) child).setParent(this);
            this.changeNotification();
        }
    }

    public synchronized void removeChild(final AbstractDocumentElement child) {
        synchronized (child) {
            if (this == child.getParent()) {
                child.setParent(null);
            }
            this.children.remove(child);
            this.changeNotification();
        }
    }

    public void changeNotification() {
        this.cachedCharLength = -1;
        if (this.getParent() != null) {
            this.getParent().changeNotification();
        }
    }

    @Override
    public int getCharLength() {
        int len = 0;
        for (int i = 0; i < this.children.size(); i++) {
            final AbstractDocumentElement thisChild = (AbstractDocumentElement) this.children.get(i);
            len += thisChild.getCharLength();
        }
        this.cachedCharLength = len;
        return len;
    }
}
