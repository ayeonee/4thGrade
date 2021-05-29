import java.util.Scanner;

public class number6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1~99 사이의 정수를 입력하시오>>");
        int number=scanner.nextInt();

        int tens=number/10;
        int units=number-tens*10;

        if(tens==3 || tens==6 || tens==9){
            if(units==3 || units==6 || units==9){
                System.out.println("박수짝짝");
            }
            else{
                System.out.println("박수짝");
            }
        }
        else{
            if(units==3 || units==6 || units==9){
                System.out.println("박수짝");
            }
        }

        scanner.close();
    }
}
