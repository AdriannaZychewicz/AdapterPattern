package com.company;

/**
 * Created by ada on 12.03.15.
 */
public class Logger {

    public LogWriter logWriter;

    public Logger(LogWriter logWriter) {
        this.logWriter = logWriter;
    }

    public void write(String text){

        logWriter.out(text);

    }
}
