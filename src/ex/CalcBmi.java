package ex;

import java.util.Scanner;

public class CalcBmi {
    /**
     * 実数の入力メソッド
     * @param message String 表示メッセージ
     * @return double 入力された値
     */
    static double inputDouble(String message) {
        Scanner scanner = new Scanner(System.in);//キーボード入力をするインスタンスを作成
        System.out.println(message);
        return scanner.nextDouble();//入力された値をdouble型で返す
    }
    public static void main(String[] args) {
        //身長・体重の入力
        double height = inputDouble("身長を入力してくださ（単位 m）");
        double weight = inputDouble("体重を入力してくださ（単位 kg）");

        //BMI
        double bmi = weight/Math.pow(height,2);
        //double bmi = weight/ (height*height);
        bmi = Math.round(bmi * 10.0) /10.0;

        //適正体重
        double appWeight = height*height * 22;
        appWeight = Math.round(appWeight * 10.0) /10.0;

        System.out.println("身長：" + height + "m");
        System.out.println("体重：" + weight + "kg");
        System.out.println("BMI：" + bmi);
        System.out.println("適正体重：" + appWeight + "kg");

        //BMI判定
        if (bmi < 18.5){
            System.out.println("低体重(痩せ型)");
        } else if (bmi< 25){
            System.out.println("普通体重");
        } else if (bmi < 30){
            System.out.println("肥満(1度)");
        } else if (bmi < 35){
            System.out.println("肥満(2度)");
        } else if (bmi < 40) {
            System.out.println("肥満(3度)");
        }else
            System.out.println("肥満(4度)");

    }
}
