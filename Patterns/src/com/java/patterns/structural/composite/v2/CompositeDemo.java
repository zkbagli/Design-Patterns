package com.java.patterns.structural.composite.v2;

public class CompositeDemo {

    public static StringBuffer g_indent = new StringBuffer();

    public static void main2(final String[] args) {
        final Directory one = new Directory("dir111"), two = new Directory("dir222"), thr = new Directory("dir333");
        final File a = new File("a"), b = new File("b"), c = new File("c"), d = new File("d"), e = new File("e");
        one.add(a);
        one.add(two);
        one.add(b);
        two.add(c);
        two.add(d);
        two.add(thr);
        thr.add(e);
        one.ls(new IndentHelper());
    }

    public static void main(final String[] args) {
        final DirectoryComposite one = new DirectoryComposite("dir111"), two = new DirectoryComposite("dir222"), thr = new DirectoryComposite("dir333");
        final FileComposite a = new FileComposite("a"), b = new FileComposite("b"), c = new FileComposite("c"), d = new FileComposite("d"), e = new FileComposite("e");
        one.add(a);
        one.add(two);
        one.add(b);
        two.add(c);
        two.add(d);
        two.add(thr);
        thr.add(e);
        one.ls(new IndentHelper());
    }

}