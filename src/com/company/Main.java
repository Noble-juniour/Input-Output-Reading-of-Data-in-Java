package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
      File outFile = new File("outputFile");
      File inFile = new File("inputFile");
     //File inFile = new File("InputFile.txt");

        //FileWriter and FileReader objects
        FileWriter out = new FileWriter(outFile);
        FileReader in = new FileReader(inFile);

        String input;
        String newInput;

           // while (newInput = in.readline() )
            //{

         //   }

        out.write(in.read());

        out.close();
        in.close();
    }
}
