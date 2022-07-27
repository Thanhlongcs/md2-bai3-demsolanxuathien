import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String str = new String();
        System.out.println("enter string: ");
        str= scanner.nextLine();
        System.out.println("enter character: ");
        char ch= scanner.next().charAt(0); //cách khai báo kiểu char
        char c= Character.toLowerCase(ch);
        System.out.println("so lan xuat hien cua" + c + "la: "+ check(str.toLowerCase(),c));
    }
    public static int check ( String array, char x){ // dùng hàm check để gọi lại vào dòng 12
        int count = 0;
        char[]ch = array.toCharArray();// lấy ra giá trị của chuỗi để chuyển sang ký tự
        for(int i = 0; i<array.length();i++){
            if(ch[i]==x){
              count++;
            }
        }return count;
    }
}
