public class Program {
    public static void main(String[] args) {
        /*
        int a=2;
        int b=4;
        int c=a+10;
        int d=a+b+c;
        System.out.println(a +" "+b + " "+c +" " +d);//сложение
        *//*
        int a=4;
        int b=8;
        int c=b-a-2;
        int d=a+b+c-1;
        System.out.println(a+ " " +b+" "+ c+" "+d);//вычитание
        *//*
        int a=8;
        int b=3;
        int c=a*b;
        int d=c*b;
        System.out.print(a+" "+b+" "+c+" "+d);//умножение
        *//*
        int a=38;
        int b=4;
        System.out.println(a/b);//деленіе, вывод целого чісла, без остатка
*//*
        double a=38/4;
        System.out.println(a);
        double b=38.0/3;
        System.out.println(b);//если делимое число без точки, то выводит целое число, без остатка, если с точкой - то норм
*//*
int a=29;
int b=3;
int c=a %b;//вывод остатка от деленія 29/3=9+остаток 2
int d=a %c;//вывод остатка от деленія 29/2=14+остаток 1
        System.out.println(a+" "+b+" "+c+" "+d);//вывод остатка от деленія с=2, d=1
        *//*
        int a=3;
        int b=++a;
        System.out.println(a+" "+b);//выведет 4 4. ++ (префиксный инкремент) Предполагает увеличение переменной на единицу, например, z=++y (вначале значение переменной y увеличивается на 1, а затем ее значение присваивается переменной z)
    *//*
        int a=3;
        int b=a++;
        System.out.println(a+" "+b);//выведет 4 3. ++ (постфиксный инкремент)Также представляет увеличение переменной на единицу, например, z=y++ (вначале значение переменной y присваивается переменной z, а потом значение переменной y увеличивается на 1)
*//*
        int a=3;
        int b=--a;
        System.out.println(a+" "+b);//выведет 2 2. -- (префиксный декремент) уменьшение переменной на единицу, например, z=--y (вначале значение переменной y уменьшается на 1, а потом ее значение присваивается переменной z)
*//*
        int a=3;
        int b=a--;
        System.out.println(a+" "+b);//выведет 2 3. -- (постфиксный декремент) z=y-- (сначала значение переменной y присваивается переменной z, а затем значение переменной y уменьшается на 1)
*//*Приоритет арифметических операций
Одни операции имеют больший приоритет, чем другие, и поэтому выполняются вначале. Операции в порядке уменьшения приоритета:

++ (инкремент), -- (декремент)

* (умножение), / (деление), % (остаток от деления)

+ (сложение), - (вычитание)

Приоритет операций следует учитывать при выполнении набора арифметических выражений*/
        int a=34;
        int b=a + 3*++a;
        System.out.println(a+ " " +b);// 35  139
        int c=34;
        int d=(c + 3)*++c;
        System.out.println(c+ " " +d);// 35  1295

    }

}
