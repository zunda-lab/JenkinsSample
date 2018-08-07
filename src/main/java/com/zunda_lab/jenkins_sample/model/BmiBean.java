package com.zunda_lab.jenkins_sample.model;

import java.io.Serializable;

/**
 * BMIビーンクラス.
 */
public class BmiBean implements Serializable {

    /** 身長. */
    private double height;

    /** 体重. */
    private double weight;

    /** BMI. */
    private double bmi;

    /** BMI判定. */
    private String bodyType;

    /**
     * 身長を返却する.
     * @return height 身長
     */
    public double getHeight() {
        return height;
    }

    /**
     * 身長を設定する.
     * @param height 身長
     */
    public void setHeight(final double height) {
        this.height = height;
    }

    /**
     * 体重を返却する.
     * @return weight 体重
     */
    public double getWeight() {
        return weight;
    }

    /**
     * 体重を設定する.
     * @param weight 体重
     */
    public void setWeight(final double weight) {
        this.weight = weight;
    }

    /**
     * BMIを返却する.
     * @return bmi BMI
     */
    public double getBmi() {
        return bmi;
    }

    /**
     * BMIを設定する.
     * @param bmi BMI
     */
    public void setBmi(final double bmi) {
        this.bmi = bmi;
    }

    /**
     * BMI判定結果を返却する.
     * @return bodyType BMI判定結果
     */
    public String getBodyType() {
        return bodyType;
    }

    /**
     * BMI判定結果を設定する.
     * @param bodyType BMI判定結果
     */
    public void setBodyType(final String bodyType) {
        this.bodyType = bodyType;
    }
}
