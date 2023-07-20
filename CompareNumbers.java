package PracticeTasks;

import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter value of a...");
        a=sc.nextInt();

        System.out.print("Enter value of b...");
        b=sc.nextInt();

        System.out.print("Enter value of c...");
        c=sc.nextInt();

        if(a>b && a>c){
            if(b>c){
                System.out.println("c<b<a");
            }
            else if(c>b){
                System.out.println("b<c<a");
            }
        }
        else if(b>a && b>c){
            if(a>c){
                System.out.println("c<a<b");
            }
            else if(c>a){
                System.out.println("a<c<b");
            }
        }
        else{
            if(a>b){
                System.out.println("b<a<c");
            }
            else if(b>a){
                System.out.println("a<b<c");
            }
        }
    }
}
