package day03;

public class ArrayDemo4 {
    public static void main(String[] args) {
        // 分數陣列
        int[] scores = { 70, 80, 100, 90, 40, 61 };

        // 找最高分
        int highScore = scores[0]; // 假設最高分是 scores[0]
        for (int i = 1, lens = scores.length; i < lens; i++) {
            if (scores[i] > highScore) {
                highScore = scores[i]; // 檢查每個元素是否大於當前的 highScore。如果某個元素大於 highScore，就將 highScore 更新為該元素的值
            }
        }
        System.out.printf("最高分: %d%n", highScore);

        // 總分 = ?
        int sum = 0;
        for (int i = 0, lens = scores.length; i < lens; i++) {
            sum += scores[i];
        }
        System.out.printf("總分: %d%n", sum);

        // 平均 = ?
        double avg=(double)sum/scores.length;
        System.out.printf("平均: %.1f%n", avg);
        //System.out.println("平均: " + avg);

    }
}
