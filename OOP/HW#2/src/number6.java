import java.util.Scanner;

public class number6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("금액을 입력하시오>>");
        int n=scanner.nextInt();
        int [] unit={50000,10000,1000,500,100,50,10,1};
        int [] number={0,0,0,0,0,0,0,0};
        for(int i=0; i< unit.length; i++){
            number[i]=n/unit[i];
            n=n%unit[i];
            if(number[i]!=0)
                System.out.println(unit[i]+"원 짜리 : "+number[i]+"개");
        }
    }
}
