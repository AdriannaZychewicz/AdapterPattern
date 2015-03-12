package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

//      Composition
        ConsoleLogWriter logWriter = new ConsoleLogWriter();
        Logger  logger = new Logger(logWriter);
        logger.write("Write!");


//Inheritance
        ConsoleLogWriter2 logWriter2 = new ConsoleLogWriter2();
        Logger  logger2 = new Logger(logWriter);
        logger.write("Write!");


    }
}
