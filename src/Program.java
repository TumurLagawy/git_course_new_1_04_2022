public class Program {
    public static void main(String[] args) {
       /* int a = 10;
        int b = 4;
        boolean c = a == b;         // false
        boolean d = a == 10;       // true
        System.out.println(a+" "+b+" "+c+" "+d);//10 4 false true == сравнивает два операнда на равенство и возвращает true (если операнды равны) и false (если операнды не равны)
   *//*
        int a = 10;
        int b = 4;
        boolean c = a != b;         // true
        boolean d = a != 10;       // false
        System.out.println(a+" "+b+" "+c+" "+d);//10 4 true false    !=  сравнивает два операнда и возвращает true, если операнды НЕ равны, и false, если операнды равны
   *//*
        int a = 9;
        int b = 5;
        boolean c = a < b;   // false
        boolean d=b<a; // true
        System.out.println(a+" "+b+" "+c+" "+d);// 9 5 false true   < (меньше чем)     Возвращает true, если первый операнд меньше второго, иначе возвращает false
   *//* int a = 9;
        int b = 5;
        boolean c = a > b;   // true
        boolean d=b>a; // false
        System.out.println(a+" "+b+" "+c+" "+d);// 9 5 true false  > (больше чем)  Возвращает true, если первый операнд больше второго, иначе возвращает false
*//*
        boolean c = 10 >= 10;    // true
        boolean b = 10 >= 4;     // true
        boolean d = 10 >= 20;    // false
        System.out.println(b+" "+c+" "+d);//true true false  >= (больше или равно)     Возвращает true, если первый операнд больше второго или равен второму, иначе возвращает false
*//*
        boolean b = 10 <= 4;     // false
        boolean c = 10 <= 10;    // true
        boolean d = 10 <= 20;    // true
        System.out.println(b+" "+c+" "+d);//false true true  <= (меньше или равно) Возвращает true, если первый операнд меньше второго или равен второму, иначе возвращает false
    *//*Логические операции
Также в Java есть логические операции, которые также представляют условие и возвращают true или false и обычно объединяют несколько операций сравнения. К логическим операциям относят следующие:
|
c=a|b; (c равно true, если либо a, либо b (либо и a, и b) равны true, иначе c будет равно false)
&
c=a&b; (c равно true, если и a, и b равны true, иначе c будет равно false)
!
c=!b; (c равно true, если b равно false, иначе c будет равно false)
^
c=a^b; (c равно true, если либо a, либо b (но не одновременно) равны true, иначе c будет равно false)
||
c=a||b; (c равно true, если либо a, либо b (либо и a, и b) равны true, иначе c будет равно false)
&&
c=a&&b; (c равно true, если и a, и b равны true, иначе c будет равно false)
Здесь у нас две пары операций | и || (а также & и &&) выполняют похожие действия, однако же они не равнозначны.
Выражение c=a|b; будет вычислять сначала оба значения - a и b и на их основе выводить результат.
В выражении же c=a||b; вначале будет вычисляться значение a, и если оно равно true, то вычисление значения b уже смысла не имеет, так как у нас в любом случае уже c будет равно true. Значение b будет вычисляться только в том случае, если a равно false
То же самое касается пары операций &/&&. В выражении c=a&b; будут вычисляться оба значения - a и b.
В выражении же c=a&&b; сначала будет вычисляться значение a, и если оно равно false, то вычисление значения b уже не имеет смысла, так как значение c в любом случае равно false. Значение b будет вычисляться только в том случае, если a равно true
Таким образом, операции || и && более удобны в вычислениях, позволяя сократить время на вычисление значения выражения и тем самым повышая производительность. А операции | и & больше подходят для выполнения поразрядных операций над числами.
*//*
        boolean a1 = (5 > 6) || (4 < 6); // 5 > 6 - false, 4 < 6 - true, поэтому возвращается true
        boolean a2 = (5 > 6) || (4 > 6); // 5 > 6 - false, 4 > 6 - false, поэтому возвращается false
        boolean a3 = (5 > 6) && (4 < 6); // 5 > 6 - false, поэтому возвращается false (4 < 6 - true, но не вычисляется)
        boolean a4 = (50 > 6) && (4 / 2 < 3); // 50 > 6 - true, 4/2 < 3 - true, поэтому возвращается true
        boolean a5 = (5 < 6) ^ (4 > 6); // 5 < 6 - true, поэтому возвращается true (4 > 6 - false)
        boolean a6 = (50 > 6) ^ (4 / 2 < 3); // 50 > 6 - true, 4/2 < 3 - true, поэтому возвращается false
        System.out.println(a1+" "+a2+" "+a3+" "+a4+" "+a5+" "+a6);
*//* Операции присваивания
        =
        просто приравнивает одно значение другому: c=b;
+=
        c+=b; (переменной c присваивается результат сложения c и b)
-=
        c-=b; (переменной c присваивается результат вычитания b из c)
*=
        c*=b; (переменной c присваивается результат произведения c и b)
/=
        c/=b; (переменной c присваивается результат деления c на b)
%=
        c%=b; (переменной c присваивается остаток от деления c на b)
&=
        c&=b; (переменной c присваивается значение c&b)
|=
        c|=b; (переменной c присваивается значение c|b)
^=
        c^=b; (переменной c присваивается значение c^b)
<<=
        c<<=b; (переменной c присваивается значение c<<b)
>>=
        c>>=b; (переменной c присваивается значение c>>b)
>>>=
        c>>>=b; (переменной c присваивается значение c>>>b)
*/
        int a = 5;
        System.out.println(a);
        a += 10;        // 15
        System.out.println(a);
        a -= 3;         // 12
        System.out.println(a);
        a *= 2;         // 24
        System.out.println(a);
        a /= 6;         // 4
        System.out.println(a);
        a <<= 4;      // 64 Это побитовые сдвиги. В первом примере число 4 компьютер представляет в двоичном виде (100) и далее сдвигает биты в право. Сдвинув 4 на 4 бита в право мы получаем 64. В двоичной системе 64 это 1000000
        System.out.println(a);
        a >>= 2;      // 16
        System.out.println(a);  // 16
    }
}
