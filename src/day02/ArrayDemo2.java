package day02;

import java.util.Arrays;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] scores = {100, 75, 53, 98, 41};
		
		// 印出每一個陣列元素
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		System.out.println(scores[3]);
		System.out.println(scores[4]);
		System.out.println("-----"); // 分隔線

        System.out.println("陣列裡面有: " + scores.length + "個元素");

        // 寫一個 for-loop 印出每一個陣列元素
        for(int i=0; i<=4; i++){
            System.out.println(scores[i]); //跑陣列每一個元素出來
        }
        System.out.println("-----"); // 分隔線

        for(int i=0, lens=scores.length;i<lens;i++){
            System.out.println(scores[i]);
        }
        System.out.println("-----"); // 分隔線

        //增強型for迴圈，在scores陣列裡，遍歷每一個score
        for(int score:scores){
            System.out.println(score);
        }
		System.out.println("-----"); // 分隔線

        // 利用 Arrays.toString(scores) 將 scores 陣列單純以字串方式輸出
		// 一般用於觀察陣列元素時使用
		System.out.println(Arrays.toString(scores));
		
		scores[3] = 89;
		scores[4] = 65;
		System.out.println(Arrays.toString(scores));

    }
}