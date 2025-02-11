class test{
    public int a;
}

public class Exo2 {
    public static void main(String[] args) throws Exception {
        test t = new test();
        t.a = 5;
        System.out.println(t.a);
        t.a = 10;
        System.out.println(t.a);
    }
}