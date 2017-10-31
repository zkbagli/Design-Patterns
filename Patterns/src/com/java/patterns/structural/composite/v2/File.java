package com.java.patterns.structural.composite.v2;

import java.util.ArrayList;

class IndentHelper {
    private String indent = " ";

    public String getIndent() {
        return this.indent;
    }

    public void setIndent(final String indent) {
        this.indent = indent;
    }
}

class File {
    private final String m_name;

    public File(final String name) {
        this.m_name = name;
    }

    public void ls(final IndentHelper indentHelper) {
        System.out.println(indentHelper.getIndent() + this.m_name);
    }

}

class Directory {
    private final String m_name;
    private final ArrayList m_files = new ArrayList();

    public Directory(final String name) {
        this.m_name = name;
    }

    public void add(final Object obj) {
        this.m_files.add(obj);
    }

    public void ls(final IndentHelper indentHelper) {
        System.out.println(indentHelper.getIndent() + this.m_name);
        indentHelper.setIndent("  " + indentHelper.getIndent());
        for (int i = 0; i < this.m_files.size(); ++i) {
            final Object obj = this.m_files.get(i);
            // Recover the type of this object
            if (obj instanceof Directory) {
                ((Directory) obj).ls(indentHelper);
            } else {
                ((File) obj).ls(indentHelper);
            }
        }
    }
}