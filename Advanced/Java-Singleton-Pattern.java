import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;


class Singleton{
    private static Singleton singleton = new Singleton();
    private Singleton(){}
    public static String str;
    public static Singleton getSingleInstance(){
        return singleton;
    }
}
