package com.java.patterns.behavioral.interpreter.v3;

import java.util.ArrayList;
import java.util.Iterator;

public class MainInterpreter {

    public static void main(final String[] args) {

        final String roman = "MCMXXVIII";
        final Context context = new Context(roman);

        // Build the 'parse tree'
        final ArrayList<Expression> tree = new ArrayList<Expression>();
        tree.add(new ThousandExpression());
        tree.add(new HundredExpression());
        tree.add(new TenExpression());
        tree.add(new OneExpression());

        // Interpret
        for (final Iterator<Expression> it = tree.iterator(); it.hasNext();) {
            final Expression exp = it.next();
            exp.interpret(context);
        }

        System.out.println(roman + " = " + Integer.toString(context.getOutput()));
    }
}