import java.util.Scanner;

class Dictionary{
    private static String[] kor={"사랑", "아기", "돈", "미래", "희망"};
    private static String[] eng={"love", "baby", "money", "future", "hope"};
    public static String kor2Eng(String word){
        String result = null;
        for(int i=0; i<kor.length; i++){
            if(word.equals(kor[i])){
                result = word + "은(는) "+eng[i];
                break;
            }
            else{
                if(i==kor.length-1) result=word+"은(는) 저의 사전에 없습니다.";
            }
        }
        return result;
    }
}

class DicApp{
    DicApp(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("한영 단어 검색 프로그램입니다.");
        while(true){
            System.out.print("한글 단어?");
            String name = scanner.next();

            if(name.equals("그만")) break;
            else System.out.println(Dictionary.kor2Eng(name));
        }

        scanner.close();
    }

}
public class number10 {
    public static void main(String[] args) {
        DicApp dic = new DicApp();
    }
}
