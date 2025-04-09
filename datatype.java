package java;

public class datatype {
    public static void main(String[] args){
        int a = 10;
        byte b = 5;
        short c = 2;
        long d = 100;
        double e = 0.04;
        float f = 0.10f;
        char g = 'a';
        boolean y = true;
        String z = "hello";
        int arr[] = {1,2,3,4};
        System.out.println("Array elements:");
        for(int i=0;i<arr.length;i++){
            System.out.println("Element at index" +i+ "is:" +arr[i]);
        }

        System.out.println("int: "+a);
        System.out.println("byte: "+b);
        System.out.println("short: "+c);
        System.out.println("long: "+d);
        System.out.println("double: "+e);
        System.out.println("float: "+f);
        System.out.println("char: "+g);
        System.out.println("boolean: "+y);
        System.out.println("String: "+z);
        

    }}
