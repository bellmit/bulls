package com.goochou.p2b.utils;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * RandomUtil
 * 随机数工具类
 * @author 刘源
 * @date 2016/4/22
 */
public class RandomUtil {

    private static final Random random = new Random();

    /**
     * 生成指定范围内的伪随机数
     * @param max
     * @param min
     * @return
     */
    public static int getRandomNumber(int max, int min){
        return random.nextInt(max)%(max-min+1) + min;
    }

    /**
     * 获取随机字母数字组合
     *
     * @param length
     *            字符串长度
     * @return
     */
    public static String getRandomCharAndNumr(Integer length) {
        String str = "";
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            boolean b = random.nextBoolean();
            if (b) { // 字符串
                 int choice = random.nextBoolean() ? 65 : 97; //取得65大写字母还是97小写字母
                str += (char) (choice + random.nextInt(26));// 取得大写字母
            } else { // 数字
                str += String.valueOf(random.nextInt(10));
            }
        }
        return str;
    }

    /**
     * 验证随机字母数字组合是否纯数字与纯字母
     *
     * @param str
     * @return true 是 ， false 否
     */
    public static boolean isRandomUsable(String str) {
        // String regExp =
        // "^[A-Za-z]+(([0-9]+[A-Za-z0-9]+)|([A-Za-z0-9]+[0-9]+))|[0-9]+(([A-Za-z]+[A-Za-z0-9]+)|([A-Za-z0-9]+[A-Za-z]+))$";
        String regExp = "^([0-9]+)|([A-Za-z]+)$";
        Pattern pat = Pattern.compile(regExp);
        Matcher mat = pat.matcher(str);
        return mat.matches();
    }

    public static void main(String[] args) {


        System.out.println(getRandomCharAndNumr(8));
        System.out.println(1+"l");
    }
}
