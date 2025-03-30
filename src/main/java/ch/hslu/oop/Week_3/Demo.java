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

    public void itFor(){
        for (int i = 0; i < 10 ; i++) {
            System.out.println(i+1);
        }
    }

    public void itDoWhile(){
        int i = 0;
        do {
            System.out.println(i+1);
            i++;
        } while (i<10);
    }

    public void itWhile(){
        int i = 0;
        while (i<10) {
            System.out.println(i+1);
            i++;
        }
    }

    public void whileLoop(){
        Float value = 0.9f;
        int i = 0;
        while (value <= 1.0) {
            System.out.println(value);
            value += 0.000025f;
            i++;
        }
        ;
    }

    public void forLoop(){
        int roundC = 0;
        Float value = 0.9f;
        for (int i = 0; i < 4000 ; i++) {
            System.out.println(value);
            value += 0.000025f; 
            roundC++;         
        }
        System.out.println(roundC);
    }

    public void printBox(final int width, final int height){
        String topBot = "";
        String middle = "# ";
        int middleRow = height - 2;
        for (int i = 0; i < width; i++) {
            topBot += "#";
        }
        System.out.println(topBot);
        for (int i = 0; i < middleRow; i++){
            middle += "  ";
        }
        middle += " #";
        for (int i = 0; i < height; i++){
            System.out.println(middle);
        }
        System.out.println(topBot);

    }
    public static void main(String[] args) {
        Demo demo = new Demo(0);
        //demo.itFor();
        //demo.itDoWhile();
        //demo.whileLoop();
        //demo.forLoop();
        demo.printBox(10, 5);

    }
}
