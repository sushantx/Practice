public class RecursionBaseCondition {
    public static void main(String[] args) {
        int cnt = 0;
        printName(cnt);
    }

    private static void printName(int cnt) {
        if(cnt==3) return;
        System.out.println("Sushant");
        cnt++;
        printName(cnt);
    }
}
