package BAEKJOON_PROBLEM;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;


public class Q1002{
    int count0=0;
    int count1=0;
    int count;

    void calFibonacci(int n) {
        Queue<Integer> numbers = new LinkedList<>();
        numbers.add(n);


        while(!numbers.isEmpty()){
            Queue<Integer> dept = new LinkedList<>();
            count= numbers.size();


            while (count>0){
                int current= numbers.poll();
                if (current>=4){
                    dept.add(current-2);
                    dept.add(current-1);}
                else if (current==3){
                    count0++;
                    count1+=2;
                }
                else if (current==2){
                    count1++;
                    count0++;
                }
                else if(current==1){
                    count1++;
                }

                else{
                    count0++;
                }

                count--;
            }

            numbers=dept;

        }

        System.out.println(count0);
        System.out.println(count1);
    }

    public static void main(String[] args) {
        Q1002 start=new Q1002();

        Scanner keyboard=new Scanner(System.in);
        int N=keyboard.nextInt();
        start.calFibonacci(N);
    }
}


