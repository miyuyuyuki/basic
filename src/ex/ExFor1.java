package ex;

public class ExFor1 {
    public static void main(String[] args) {
        int[] array = {20,30,10,50,40};
        int sum = 0;//合計の初期化

        //拡張for文
        for (int num:array){
            sum += num;
        }

        System.out.println(sum);
        System.out.println((double) sum / array.length);
    }


}
