import java.io.BufferedReader;
import java.io.File;
import java.util.*;
import java.io.FileReader;
import java.io.IOException;

public class KenKen {

    static Vector<Cage> kenkenPuzzle;
    private static int MAXPUZZLESIZE = 9;


    public static void main(String[] args) {
        // Get the name of the file as input
        Scanner fileNameScanner = new Scanner(System.in);
        System.out.println("Please enter the name of the file with data to test, with file extension (ex: dat.txt).");
        System.out.print("File Name: ");
        String fileName = fileNameScanner.next();
        int boardSize;

        if(fileName.length() !=0) {
            File file = new File(fileName);
            try {
                if (file.exists() && !file.isDirectory()) {
                    kenkenPuzzle = new Vector<Cage>();
                    //boardSize = input(kenkenPuzzle, file);
                }
            }catch (Exception e){
                System.out.print("Invalid file name entered. Please check that you spelled it correctly\nand that the file is in the src directory");
                System.exit(0);
            }
        }


        // collect data from file using a buffered reader
//
//        int lineCounter=0;
//        BufferedReader dataReader;
//        try {
//            dataReader = new BufferedReader(new FileReader(fileName));
//            String line = dataReader.readLine();
//            while (line != null) {
//                if (lineCounter != 0) {
//                    Character [] splitLine = line.split("");
//                } else {
//                    boardSize = Integer.parseInt(line);
//                    lineCounter++;
//                }
//                line = dataReader.readLine();
//            }
//            dataReader.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }



    }

    enum Op{ ADD, SUB, MUL, DIV, NOP}

    // object class for creating points for use in cages.
    static class Point {
        int x;
        int y;
        Point(int a, int b) {
            x = a; y = b;
        }
        void output(){
            System.out.println("Point("+x+","+y+")");
        }
    }

    // object class that contains our data on each cage.
    static class Cage {
        Op op;
        int  num;
        ArrayList<Point> points;
        Cage(Op o, int n, ArrayList<Point> p) {
            op = o; num = n; points = p;
        }
        void output(){
            System.out.println("Cage: "+op+","+num+",");
            for(Point p : points){
                p.output();
            }
        }
    }


}
