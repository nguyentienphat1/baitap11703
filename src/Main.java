public class Main {
    public static void main(String[] args) {
        int dem=1;
        for (int i=1;i<=100;i++) {
            if (i % 10 == 0 && i != 100) {
                dem++;
            }
            if (i == 100) {
                dem=dem+2;
            }
        }
        System.out.println("tu 1 den 100  co "+dem+" so 0");
    }
}