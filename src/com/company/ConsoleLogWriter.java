package com.company;

/**
 * Created by ada on 12.03.15.
 */
public class ConsoleLogWriter implements LogWriter {

    private ConsoleWriter consoleWriter = new ConsoleWriter();

    @Override
    public void out(String text) {

        consoleWriter.writeConsole(text);
    }
}
