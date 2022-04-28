package com.corejava;

public class Link {
static int k =0;
    public static void main(String args[]){
    //    Link link =  new Link();
      //  link.test();

        while(k<6){
            k=k+1;
            System.out.println("in Hello "+k);
            main(null);
        }

        System.out.println("Hello "+k);
    }
     public void test(){
         String aa ="AA";
         String name = aa.getClass().getCanonicalName();
         String name1 = aa.getClass().getTypeName();
         String name2 = aa.getClass().getName();
         String name3 = aa.getClass().getSimpleName();
         System.out.println("CanonicalName  "+ name);
         System.out.println("TypeName "+ name1);
         System.out.println(" Name "+ name2);
         System.out.println("Simple Name "+ name3);
     }


}
