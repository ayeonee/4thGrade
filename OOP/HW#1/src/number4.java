import java.util.Scanner;

public class number4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 3개 입력>>");
        int x=scanner.nextInt();
        int y=scanner.nextInt();
        int z=scanner.nextInt();
        int max;
        if(x>=y && x>=z){
            max=x;
        }
        else if(y>=z){
            max=y;
        }
        else{
            max=z;
        }

        if(x==max){
            if(y>=z){
                System.out.println("중간 값은 "+y);
            }
            else{
                System.out.println("중간 값은 "+z);
            }
        }
        else if(y==max){
            if(x>=z){
                System.out.println("중간 값은 "+x);
            }
            else{
                System.out.println("중간 값은 "+z);
            }
        }
        else{
            if(x>=y){
                System.out.println("중간 값은 "+x);
            }
            else{
                System.out.println("중간 값은 "+y);
            }
        }
        scanner.close();
    }
}
