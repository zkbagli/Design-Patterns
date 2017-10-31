package com.java.patterns.structural.composite.v2;

import java.util.ArrayList;
import java.util.List;

interface AbstractFile {
    public void ls(IndentHelper indentHelper);
}

class FileComposite implements AbstractFile {
    private final String m_name;

    public FileComposite(final String name) {
        this.m_name = name;
    }

    @Override
    public void ls(final IndentHelper indentHelper) {
        System.out.println(indentHelper.getIndent() + this.m_name);
    }
}

// Directory implements the "lowest common denominator"
class DirectoryComposite implements AbstractFile {
    private final String m_name;
    private final List<AbstractFile> m_files = new ArrayList<>();

    public DirectoryComposite(final String name) {
        this.m_name = name;
    }

    public void add(final AbstractFile obj) {
        this.m_files.add(obj);
    }

    @Override
    public void ls(final IndentHelper indentHelper) {
        System.out.println(indentHelper.getIndent() + this.m_name);
        indentHelper.setIndent("  " + indentHelper.getIndent());
        for (int i = 0; i < this.m_files.size(); ++i) {
            // Leverage the "lowest common denominator"
            final AbstractFile obj = this.m_files.get(i);
            obj.ls(indentHelper);
        }
    }
}
