public class Typecasting {
    public static void main(String[] args) {
        int i = 10;
        long l = i; //implicit type conversion
        System.out.println(l + " " + i);

        long l1 = 1000;
        int i1 = (int)l1;
        System.err.println(l1 + " " + i1);
    }
}
