/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
public class Main
{
abstract class AnonymousInner {
    abstract void sum();
}

class AnonymousInnerMain {
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter two vlaues");
            int a= Integer.parseInt(sn.nextLine());
            int b= Integer.parseInt(sn.nextLine()); 
            int c= Integer.parseInt(sn.nextLine()); 
        AnonymousInner am = new AnonymousInner(){
            void sum(){
                int m= a+b+c;
                System.out.println("Sum of three number is: "+m);
            }
         };
        am.sum();
        }
abstract void product();
}

class AnonymousInnerMain {
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter two vlaues");
            int a= Integer.parseInt(sn.nextLine());
            int b= Integer.parseInt(sn.nextLine()); 
            int c= Integer.parseInt(sn.nextLine()); 
        AnonymousInner an = new AnonymousInner(){
            void product(){
                int n= a*b*c;
                System.out.println("product of three number is: "+m);
            }
         };
        an.product();
        }

}
