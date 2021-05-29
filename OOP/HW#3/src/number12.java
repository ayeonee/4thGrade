import java.util.Scanner;

class Seat{
    String []seat = new String[10];
    Seat(){
        for(int i=0; i<seat.length; i++){
            seat[i]="---";
        }
    }

    public void show(){
        for (String s : seat) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public void reservation(String name, int num){
        seat[num-1]=name;
    }

    public boolean cancel(String name){
        boolean check=false;
        for(int i=0; i<seat.length; i++){
            if(seat[i].equals(name)){
                seat[i]="---";
                check=true;
                break;
            }
            else{
                if(i==seat.length-1){
                    System.out.println("예약된 이름이 없습니다. 다시 시도해주세요.");
                    check=false;
                }
            }
        }
        return check;
    }

}

class SeatArray{
    Seat[] seats = new Seat[3];
    Scanner scanner = new Scanner(System.in);

    SeatArray(){
        seats[0]=new Seat();    //S
        seats[1]=new Seat();    //A
        seats[2]=new Seat();    //B
    }

    public void reservation(){
        int n;
        while(true){
            System.out.print("좌석구분 S(1), A(2), B(3)>> ");
            n=scanner.nextInt();
            if(n>=1 && n<=3) break;
            else System.out.println("올바른 번호를 다시 입력해주세요.");
        }
        loop : while(true) {
            switch (n) {
                case 1:
                    System.out.print("S>> ");
                    seats[0].show();
                    break loop;
                case 2:
                    System.out.println("A>> ");
                    seats[1].show();
                    break loop;
                case 3:
                    System.out.println("B>> ");
                    seats[2].show();
                    break loop;
                default:
                    System.out.println("올바른 번호를 다시 입력해주세요.");
                    break;
            }
        }

        System.out.print("이름>>");
        String name = scanner.next();

        int num;
        while(true){
            System.out.print("번호>>");
            num = scanner.nextInt();
            if(num>=1 && num<=10) break;
            else System.out.println("올바른 번호를 다시 입력해주세요.");
        }

        seats[n-1].reservation(name, num);


    }
    public void retrieve(){
        System.out.print("S>> ");
        seats[0].show();
        System.out.print("A>> ");
        seats[1].show();
        System.out.print("B>> ");
        seats[2].show();
        System.out.println("조회를 완료하였습니다.");

    }
    public void cancel(){
        int num;
        while(true){
            System.out.print("좌석 S:1, A:2, B:3 >> ");
            num=scanner.nextInt();
            if(num>=1 && num<=3) break;
            else System.out.println("올바른 번호를 다시 입력해주세요.");
        }
        seats[num-1].show();

        while(true){
            System.out.print("이름 >> ");
            String name = scanner.next();
            if(seats[num-1].cancel(name)){
                break;
            };
        }
    }
}

public class number12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SeatArray mainSeat = new SeatArray();

        System.out.println("명품콘서트홀 예약 시스템입니다.");
        loop : while(true){
            System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4 >>");
            int n=scanner.nextInt();

            switch (n){
                case 1 :
                    mainSeat.reservation();
                    break;
                case 2 :
                    mainSeat.retrieve();
                    break;
                case 3 :
                    mainSeat.cancel();
                    break;
                case 4:
                    break loop;
                default :
                    System.out.println("올바른 번호를 다시 입력해주세요.");
                    break;
            }
        }
    }
}
