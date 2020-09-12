package com.example.javaadvanced.multithreading.rw;

/**
 * 商品实体类
 */
public class GoodsInfo {

    private final String name;
    private double totalMoney; // 总销售额
    private int storeNumber; // 库存

    public GoodsInfo(String name, double totalMoney, int storeNumber) {
        this.name = name;
        this.totalMoney = totalMoney;
        this.storeNumber = storeNumber;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public int getStoreNumber() {
        return storeNumber;
    }

    public void changeNumber(int sellNumber) {
        this.totalMoney += sellNumber * 25;
        this.storeNumber -= sellNumber;
    }
}
