package lab3.task2;

import java.io.IOException;

public class Example implements AutoCloseable {
    public void read() throws IOException{
        if(true){
            throw new IOException();
        }
    }

    @Override
    public void close()  {
        System.out.println("closed");
    }
}