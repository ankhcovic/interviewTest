package leetcode;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author gaoyouxin
 * @date 2021/6/9 - 16:28
 */
class BinarySearchJunitTest {
    int[] nums = new int[]{1,2,3,4,5};
    int target = 3;
    BinarySearchJunit bsj = new BinarySearchJunit(nums, target);
    @BeforeAll
    static void beforeAll() {
        System.out.println("开始计算...");
    }

    @Test
    public void binarySearchTest() {
        int res = bsj.binarySearch();
        System.out.println("计算中...");
        System.out.println(res);
        assertEquals(res, 2);
    }

    @AfterAll
    static void afterAll() {
        System.out.println("计算结束...");
    }
}