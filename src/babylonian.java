import java.util.*;

public class babylonian {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++) {
            String str = in.next();
            int sum = 0;
            List<String> babylonianNums = Arrays.asList(str.split(","));
            String convert = "";
            for(int index = 0; index < babylonianNums.size(); index++) {
                convert += babylonianNums.get(index);
            }
                System.out.println(Integer.parseInt(convertBase(convert, 60, 10)));
        }
    }
    public static String convertBase(String str, int fromBase, int toBase) {
        return Integer.toString(Integer.parseInt(str, fromBase), toBase);
    }
}