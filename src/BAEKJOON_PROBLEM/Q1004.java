package BAEKJOON_PROBLEM;
import java.util.ArrayList;
import java.util.Scanner;

public class Q1004 {
    int count;
    ArrayList<Integer> countList= new ArrayList<>();


    public boolean inCircle(int x, int y, int cx, int cy, int r) {
        double distance = Math.sqrt(Math.pow(x - cx, 2) + Math.pow(y - cy, 2));

        if (distance < r) {
            return true;
        }
        else
            return false;

    }

    public void Calculate() {

        Scanner keyboard = new Scanner(System.in);
        int T = keyboard.nextInt();

        while (T-- > 0) {
            count=0;
            int x1 = keyboard.nextInt();
            int y1 = keyboard.nextInt();
            int x2 = keyboard.nextInt();
            int y2 = keyboard.nextInt();


            int n = keyboard.nextInt();


            while (n-- > 0) {
                int cx = keyboard.nextInt();
                int cy = keyboard.nextInt();
                int r = keyboard.nextInt();

                boolean a=inCircle(x1, y1, cx, cy, r);
                boolean b=inCircle(x2, y2, cx, cy, r);

                if (a==true && b==true) {
                    continue;
                }
                if (a==true){
                    count++;
                }
                if (b==true){
                    count++;
                }

            }
            System.out.println(count);


        }


    }



    public static void main(String[] args) {
        Q1004 start = new Q1004();
        start.Calculate();
        int length = start.countList.size();


    }
}

