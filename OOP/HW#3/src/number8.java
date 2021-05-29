import java.util.Scanner;

class Phone{
    String name, tel;

    Phone(String name, String tel){
        this.name = name;
        this.tel = tel;
    }
}

class PhoneBook {
    Scanner scanner = new Scanner(System.in);
    Phone[] book;

    PhoneBook() {
        System.out.print("인원수>>");
        int n = scanner.nextInt();
        this.book = new Phone[n];

        for (int i = 0; i < n; i++) {
            System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
            String name = scanner.next();
            String tel = scanner.next();
            book[i]= new Phone(name, tel);
        }
        System.out.println("저장되었습니다...");
    }

    void search(){
        while(true){
            System.out.print("검색할 이름 >>");
            String name = scanner.next();

            if(name.equals("그만")) break;
            else{
                for(int i=0; i< book.length; i++){
                    if(name.equals(book[i].name)){
                        System.out.println(name+"의 번호는 "+book[i].tel+" 입니다.");
                        break;
                    }
                    else{
                        if(i==book.length-1){
                            System.out.println(name+"이(가) 없습니다.");
                        }
                    }
                }
            }
        }
    }
}

public class number8 {
    public static void main(String[] args) {
        PhoneBook pb = new PhoneBook();
        pb.search();
    }
}
