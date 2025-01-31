package syntaxdemo;

public class StringFormatDemo {

    public static void main(String[] args) {
        double pi = 3.14159265358979323846;
        String separator = ":";
        String result = String.format("pi %s %.2f", separator, pi);
        System.out.println(result);
    }
}
