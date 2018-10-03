package com.company;

public class KindTriangle {

    public static void Triangle(int a, int b, int c) {
        if(((a+b)>c) && ((b+c)>a) && ((a+c)>b)){
            if((a==b) && (b==c)){
                return "3 cạnh vừa nhập là tam giác đều";
            }
            if(((a==b) && b != c) || ((c==b) && b != a) || ((a==c) && c != b)){
                return "Tam giác cân";
            }

            return "Tam giác thường";
        }
        else {
            return "Không phải tam giác";
        }
    }
}
