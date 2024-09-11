package BAEKJOON_PROBLEM;

import java.util.Scanner;

public class Q1003{

    int x1;
    int y1;
    int r1;
    int x2;
    int y2;
    int r2;

    public void calPossible(int x1, int y1, int r1, int x2, int y2, int r2){

        double squareddistance=Math.pow(x1 -  x2,2)+ Math.pow(y1 - y2, 2);
        double distance=Math.sqrt(squareddistance);

        double rsum=r1+r2;
        double rdiff=Math.abs(r1-r2);


        if (x1==x2&&y1==y2&&r1==r2) {
            System.out.println(-1);
        }
        else if (distance>rsum||distance<rdiff) {
            System.out.println(0);
        }
        else if (distance==rsum|| distance==rdiff) {
            System.out.println(1);


        }

        else{
            System.out.println(2);
        }

    }



    public void inputValue(){
        Scanner keyboard=new Scanner(System.in);
        int T;

        T=keyboard.nextInt();
        while(T>0){
            x1=keyboard.nextInt();
            y1=keyboard.nextInt();
            r1=keyboard.nextInt();
            x2=keyboard.nextInt();
            y2=keyboard.nextInt();
            r2=keyboard.nextInt();
            calPossible(x1,y1,r1,x2,y2,r2);
            T-=1;
        }


    }
    public static void main(String[] args) {
        Q1003 start=new Q1003();
        start.inputValue();

    }
}
