package mooc.vandy.java4android.buildings.logic;

import java.io.FileNotFoundException;
import java.util.Arrays;

import mooc.vandy.java4android.buildings.ui.OutputInterface;

/**
 * This Neighborhood utility class provides static helper methods the
 * print a Building List and calculate the area of a Building list.
 * A utility class in Java should always be final and have a private
 * constructor.
 */
public final class Neighborhood {
    private Neighborhood() {
    }

    public static void print(Building[] buildings, String header, OutputInterface out){
        boolean isHouse = true;
        out.print(header +"\n" + "----------\n");
        if(!header.equals("Houses")){
            isHouse = false;
        }
        for(int i = 0; i < buildings.length; ++i){
            if(isHouse){
                out.println("Owner: " + buildings[i].toString());
            }
            else{
                out.println("Business: " + buildings[i].toString());
            }
        }

    }

    public static int calcArea(Building[] buildings){
        int sum = 0;
        for(int i = 0; i < buildings.length; ++i){
            sum+=buildings[i].calcLotArea();
        }
        return sum;
    }

    // TODO - Put your code here.
    
}
