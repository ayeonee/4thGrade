public class number10 {
    public static void main(String[] args) {
        int [][] array=new int[4][4];
        int x, y;

        for(int i=0; i< 10; i++){
            x=(int)(Math.random()*4);
            y=(int)(Math.random()*4);

            if(array[x][y] ==0)
                array[x][y]=(int)(Math.random()*10+1);
            else
                i--;
        }

        for(int i=0; i< array.length; i++){
            for(int j=0; j<array[i].length; j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
