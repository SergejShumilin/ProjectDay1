package by.javatr.shumilin.scanner;

import java.util.Scanner;

public abstract class AbstractConsoleService {
    protected static final Scanner SCANNER = new Scanner(System.in);

    private void write(String message){
        System.out.println(message);
    }

    private int read(){
        return SCANNER.nextInt();
    }

    private void skip(){
        SCANNER.next();
    }

    public abstract boolean isValid();

    public int getValue(String askMessage, String errorMessage){
        write(askMessage);
        while (!isValid()){
            write(errorMessage);
            write(askMessage);
            skip();
        }
        return read();
    }
}
