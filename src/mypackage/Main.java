package mypackage;

import arrayaccess.ArrayFileWriter;
import arrayaccess.Fill;
import arrayaccess.Model;
import arrayaccess.Sort;

import static arrayaccess.InputConfig.RANDOM;
import static arrayaccess.InputConfig.KEYBOARD;
import static arrayaccess.InputConfig.FILE;

public class Main {

    public static void main(String[] args) {
        Model array = new Model(10, 10);
        Fill.fill(array, RANDOM);
        ArrayFileWriter.write(array);
    }
}
