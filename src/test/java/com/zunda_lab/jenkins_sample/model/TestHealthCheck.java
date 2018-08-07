/**
 *
 */
package com.zunda_lab.jenkins_sample.model;

import org.junit.Test;

import junit.framework.TestCase;

/**
 * @author ono
 *
 */
public class TestHealthCheck extends TestCase {

    /**
     * BMI判定結果「標準（低体重ギリギリ）」のテストケース.
     * 53.465/(1.7*1.7) = 18.5
     */
    @Test
    public void testExecuteNormalLower() {
        final double height = 170.0;
        final double weight = 53.465;
        HealthCheck healthCheck = new HealthCheck();
        BmiBean bmiBean = new BmiBean();
        bmiBean.setHeight(height);
        bmiBean.setWeight(weight);
        healthCheck.execute(bmiBean);
        final String expected = "普通体重";
        final String actual = bmiBean.getBodyType();
        assertEquals(expected, actual);
    }

    /**
     * BMI判定結果「標準（肥満ギリギリ）」のテストケース.
     * 71.961/(1.7*1.7) = 18.5
     */
    @Test
    public void testExecuteNormalUpper() {
        final double height = 170.0;
        final double weight = 71.961;
        HealthCheck healthCheck = new HealthCheck();
        BmiBean bmiBean = new BmiBean();
        bmiBean.setHeight(height);
        bmiBean.setWeight(weight);
        healthCheck.execute(bmiBean);
        final String expected = "普通体重";
        final String actual = bmiBean.getBodyType();
        assertEquals(expected, actual);
    }

    /**
     * BMI判定結果「低体重」のテストケース.
     * 53.176/(1.7*1.7) = 18.5
     */
    @Test
    public void testExecuteLower() {
        final double height = 170.0;
        final double weight = 53.176;
        HealthCheck healthCheck = new HealthCheck();
        BmiBean bmiBean = new BmiBean();
        bmiBean.setHeight(height);
        bmiBean.setWeight(weight);
        healthCheck.execute(bmiBean);
        final String expected = "低体重";
        final String actual = bmiBean.getBodyType();
        assertEquals(expected, actual);
    }

    /**
     * BMI判定結果「肥満」のテストケース.
     * 72.25/(1.7*1.7) = 18.5
     */
    @Test
    public void testExecuteUpper() {
        final double height = 170.0;
        final double weight = 72.25;
        HealthCheck healthCheck = new HealthCheck();
        BmiBean bmiBean = new BmiBean();
        bmiBean.setHeight(height);
        bmiBean.setWeight(weight);
        healthCheck.execute(bmiBean);
        final String expected = "肥満";
        final String actual = bmiBean.getBodyType();
        assertEquals(expected, actual);
    }
}
