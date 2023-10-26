import java.io.*;
import java.util.Scanner;

public class aoc012021{
    public int inccounter(int[] arr){
        int inccount = 0;
        for(int i = 1; i < arr.length; i++){
            if (arr[i] > arr[i-1]){
                inccount++;
            }
        }
        return inccount;
    }

    public static int[] inputarr(){
        int [] inp = new int[2000];
        Scanner scanner = null;

        try{
            scanner = new Scanner(new File("01aoc2021.txt"));
        }
        catch(IOException FileNotFoundException){
            System.out.println("File failed to be read");
        }
        int i = 0;
        while (scanner.hasNextInt()){
            inp[i++] = scanner.nextInt();
        }
        return inp;
    }
    public static void main(String args[]) {
        aoc012021 test = new aoc012021();
        int ans = test.inccounter(inputarr());
        System.out.println(ans);
    }
}
