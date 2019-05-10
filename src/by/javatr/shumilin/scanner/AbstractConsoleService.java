package by.javatr.shumilin.scanner;

import java.util.Scanner;

public abstract class AbstractConsoleService {
    public static final Scanner SCANNER = new Scanner(System.in);

    public void write(String message){
        System.out.println(message);
    }

    public int read(){
        return SCANNER.nextInt();
    }

    public void skip(){
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
