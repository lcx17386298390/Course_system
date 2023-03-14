package com.evan.demo.Test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int maxNum = 0;
        int[] temp = new int[30];
        for(int i = 0;i<str.length();i++){
            temp[str.charAt(i)-'A']++;
//            System.out.println(str.in dexOf(i));
        }
        for(int i = 0;i<26;i++){
            maxNum = Math.max(maxNum,temp[i]);
        }
        for(int i = 0;i<26;i++){
            if(temp[i]==maxNum){
                System.out.printf("%c",i+'A');
            }
        }
    }
}
