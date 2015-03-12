package com.company;

/**
 * Created by ada on 12.03.15.
 */
public class ConsoleLogWriter2 extends ConsoleWriter implements  LogWriter{
    @Override
    public void out(String text) {
        writeConsole(text);
    }
}
