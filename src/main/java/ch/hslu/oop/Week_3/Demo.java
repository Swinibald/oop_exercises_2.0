package ch.hslu.oop.Week_3;

public class Demo {
    private int value;

    public Demo(int value){
        this.value = value;

    }

    public int max(int a, int b){
        if(a < b){
            return b;
        }else{
            return a;
        }
    }

    public int min(int a, int b){
        if(a < b){
            return a;
        }else{
            return b;
        }
    }

    public int max2(int a, int b, int c){
        if(a>b && a>c){
            return a;
        }else if(b>a && b>c){
            return b;
        }else{
            return c;
        }
    }

    public int max3(int a, int b, int c){
        if(a>b && a>c){
            return a;
        }else if(b>c){
            return b;
        }else{
            return c;
        }
    }
    public int max4(int a, int b, int c){
        if(a>b && a>c){
            return a;
        }else if(b>c){
            return b;
        }else if (c>a){
            return c;
        }else if(a==b && a>c){
            return a;
        }else if (a==c && a>b){
            return a;
        }else if(b==c && b>a){
            return b;
        }else{
            return a;
        }
    }
}
