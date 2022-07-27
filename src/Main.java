import java.util.Scanner;

public class Main {

    //B1: Viết phương thức check
    public static int check (String array, char x){
        int count = 0;
        // Thực hiện đổi string sang mảng kí tự
        char[] ch = array.toCharArray();
        //Chạy vòng lặp for
        for(int i = 0; i < array.length(); i++){
            if (ch[i]==x){
                count++;
            }
        }
        return count;
    }
    //B2: VIết hàm main, cho user nhập vào kí tự cần tìm và gọi lại phương thức check
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = new String();
        System.out.println("enter string: ");
        str= scanner.nextLine();
        System.out.println("Enter character: ");
        char ch = scanner.next().charAt(0);
        // Gọi method to Lowercase
        char c = Character.toLowerCase(ch);
        System.out.println("Số lần xuất hiện của kí tự " + c + " trong mảng là: " + check(str.toLowerCase(),c));
    }
}