
package mylogger1;

import java.io.*;
import java.util.logging.*;

public class Mylogger1 {
    public static void main(String[] args) {
        Logger l=Logger.getLogger(Mylogger1.class.getName());
        FileHandler fh;
        try
        {
            fh=new FileHandler("c:/mylogfile.log",true);
            l.addHandler(fh);
            l.setLevel(Level.ALL);
            SimpleFormatter sf=new SimpleFormatter();
            fh.setFormatter(sf);
            l.info("My first log");
        }
        catch(SecurityException | IOException e){
        }
        l.info("Hi How r u?");
    }
}
