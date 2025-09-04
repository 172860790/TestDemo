package org.test;


import org.test.factory.ProcessorFactory;

public class Main {

    public static void main(String[] args) {
        ProcessorFactory.getBasicProcessor().execute("aabcccbbad");
        ProcessorFactory.getAdvanceProcessor().execute("abcccbad");
    }

}