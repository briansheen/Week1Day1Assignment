package com.company;

import java.util.Random;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        System.out.println("begin");

        for (int i = 0; i < args.length; ++i) {
            System.out.println(args[i]);
        }
        int num1 = Integer.parseInt(args[0]);
        if (num1 > 2) {
            System.out.println("num1 is greater than 2");
        } else {
            System.out.println("num1 is not greater than 2");
        }
        int num2 = Integer.parseInt(args[1]);

        switch (num2) {
            case 2300:
                System.out.println("num2 amount is 2300");
                break;
            case 2230:
                System.out.println("num2 amount is 2230");
                break;
            default:
                System.out.println("The num2 is neither 2300 or 2230");
        }

        int num3 = Integer.parseInt(args[2]);
        do {
            System.out.print(".");
            num3 -= 1;
        }
        while (num3 > 0);

        System.out.println();

        int num4 = Integer.parseInt(args[3]);
        num4 = num4 - num2;
        System.out.println("num4 = args[3] - num2 --> " + num4);

        int x = Integer.parseInt(args[3]);
        int num5 = Integer.parseInt(args[4]);
        num5 = x % num5;
        System.out.println("num5 = args[3] % args[4] --> " + num5);

        if (num4 > num5) {
            System.out.println("num4 is greater than num5");
        } else if (num4 < num5) {
            System.out.println("num4 is less than num5");
        } else {
            System.out.println("num4 is equal to num5");
        }

        Random random = new Random();

        while(true){
            int index = random.nextInt(args.length);
            if(args[index].equals("quit")){
                System.out.println("quit has been found..." + index);
                break;
            } else {
                System.out.println("did not find quit..." + index);
            }
        }


    }
}
