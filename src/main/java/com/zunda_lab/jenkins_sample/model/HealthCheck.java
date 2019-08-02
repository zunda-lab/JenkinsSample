package com.zunda_lab.jenkins_sample.model;

/**
 * BMIによる健康チェッククラス.
 */
public class HealthCheck {

    /** メートルからセンチメートルへの換算. */
    private static final double TO_METER = 100.0;
    /** BMI標準の下限値. */
    private static final double BMI_NORMAL_LOWER_LIMIT = 18.5;
    /** BMI標準の上限値. */
    private static final double BMI_NORMAL_UPPER_LIMIT = 25.0;
    /** BMI肥満（4度）の下限値. */
//    private static final double BMI_OBESE_LOWER_LIMIT = 40.0;

    /**
     * BMIを算出する.
     * @param bmiBean BmiBean
     */
    public void execute(final BmiBean bmiBean) {
        double weight = bmiBean.getWeight();
        double height = bmiBean.getHeight();
        double bmi = weight / (height / TO_METER * height / TO_METER);
        bmiBean.setBmi(bmi);

        String bodyType;
        if (bmi < BMI_NORMAL_LOWER_LIMIT) {
            bodyType = "低体重";
            // FindBugsにわざと検知させるための行
            bodyType.replace("低体重", "痩せ型");
            // String.replace()は置換した文字列を返却するため、使用する場合は以下が正解
            // bodyType = bodyType.replace("低体重", "痩せ型");
        } else if (bmi < BMI_NORMAL_UPPER_LIMIT) {
            bodyType = "普通体重";
//        } else if (bmi >= BMI_OBESE_LOWER_LIMIT) {
//            bodyType = "肥満（4度）";
        } else {
            bodyType = "肥満";
        }
        bmiBean.setBodyType(bodyType);
    }

}
