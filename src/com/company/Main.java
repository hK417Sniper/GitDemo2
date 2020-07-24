package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        getHelp helpDev1ce = new getHelp();
        helpDev1ce.getNumber();
        System.out.println("王德法 + 添加内容");
        int i = 0;
        int j = 0;
        int k;
        do{
            k = j;
            while(k < 15){
                System.out.print("Beta ");
                k++;
            }
            System.out.println();
            i++;
            j++;
        }while(i < 15);
    }
}
