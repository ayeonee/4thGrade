import java.util.Scanner;

public class number8_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("점 (x1, y1)의 좌표를 입력하시오>>");
        int x1=scanner.nextInt();
        int y1=scanner.nextInt();

        System.out.print("점 (x2, y2)의 좌표를 입력하시오>>");
        int x2=scanner.nextInt();
        int y2=scanner.nextInt();

        int[][] rect = new int[201][201];

        for(int i = 100; i <= 200; i++) {
            for(int j = 100; j <= 200; j++) {
                rect[i][j] = 1;
            }
        }

        int[][] my_rect = new int[x2+1][y2+1];

        for(int i = x1; i <= x2; i++) {
            for(int j = y1; j <= y2; j++) {
                my_rect[i][j] = 1;
            }
        }

        if((x2 < 100 && y2 < 100) || (x1 > 200 && y1 > 200)) {
            System.out.println("충돌하지 않습니다.");
            return;
        }
        else{
            int i1, j1, i2, j2;

            i1 = Math.min(100, x1);

            i2 = Math.min(200, x2);

            j1 = Math.min(100, y1);

            j2 = Math.min(200, y2);

            for(int a = i1; a <= i2; a++) {
                for(int b = j1; b <= j2; b++) {
                   rect[a][b] += my_rect[a][b];
                }
            }
        }

        for(int i = 100; i <= 200; i++) {
            for(int j = 100; j <= 200; j++) {
                if(rect[i][j] == 2) {
                    System.out.println("충돌합니다.");
                    return;
                }
            }
        }

        System.out.println("충돌하지 않습니다.");
        scanner.close();
    }
}
