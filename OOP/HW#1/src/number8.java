import java.util.Scanner;

public class number8 {
    public static boolean inRect(int x, int y){
        if((x>=100 && x<=200) && (y>=100 && y<=200))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("점 (x1, y1)의 좌표를 입력하시오>>");
        int x1=scanner.nextInt();
        int y1=scanner.nextInt();

        System.out.print("점 (x2, y2)의 좌표를 입력하시오>>");
        int x2=scanner.nextInt();
        int y2=scanner.nextInt();

        boolean z1=inRect(x1, y1);
        boolean z2=inRect(x2, y2);

        if(z1|| z2 || ((x1<=100 && y1<=100) && (x2>=200 && y2 >=200))){
            System.out.print("사각형이 (100, 100), (200, 200) 두 점으로 이루어진 직사각형과 충돌합니다.");
        }
        else{
            System.out.print("사각형이 (100, 100), (200, 200) 두 점으로 이루어진 직사각형과 충돌하지 않습니다.");
        }
        scanner.close();
    }
}

