package exam.alibaba0415;

import java.util.Scanner;

/**
 * @author gaoyouxin
 * @date 2021/4/15 - 12:54
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] shudu = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                shudu[i][j] = in.nextInt();// 数独数字输入用空格隔开
            }
        }
        boolean[][] row = new boolean[9][9];// 分别用来记录行列子宫内1-9是否
        boolean[][] col = new boolean[9][9];
        boolean[][] area = new boolean[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int c = shudu[i][j] - 1;
                int areaIndex = i / 3 * 3 + j / 3;// 此数所在子宫内的编号
                if (!row[i][c] && !col[j][c] && !area[areaIndex][c]) {
                    row[i][c] = col[j][c] = area[areaIndex][c] = true;
                } else {
                    System.out.println(false);
                    return;
                }
            }
        }
        System.out.println(true);
    }
}
      /*4 5 7 2 8 9 1 3 6
        6 8 9 1 7 3 2 5 4
        2 1 4 5 6 7 3 9 8
        5 7 8 9 3 1 4 6 2
        3 9 6 8 2 4 5 1 7
        7 4 1 6 9 5 8 2 3
        9 3 2 7 1 8 6 4 5
        8 6 5 3 4 2 9 7 1*/

