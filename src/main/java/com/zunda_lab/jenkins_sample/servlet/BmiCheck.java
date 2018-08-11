package com.zunda_lab.jenkins_sample.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zunda_lab.jenkins_sample.model.BmiBean;
import com.zunda_lab.jenkins_sample.model.HealthCheck;

/**
 * BMIサーブレットクラス.
 */
@WebServlet("/BmiCheck")
public class BmiCheck  extends HttpServlet {
    /**
     * シリアルバージョン番号.
     */
    private static final long serialVersionUID = 1L;

    /**
     * GETメソッドリクエストを処理する.
     * @param req リクエスト
     * @param res レスポンス
     * @throws ServletException サーブレット処理例外
     * @throws IOException IO処理例外
     * @see HttpServlet#doGet(
     *        HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(
            final HttpServletRequest req, final HttpServletResponse res)
            throws ServletException, IOException {

        RequestDispatcher dispatcher = req.getRequestDispatcher("/index.jsp");
        dispatcher.forward(req, res);
    }

    /**
     * POSTメソッドリクエストを処理する.
     * @param req リクエスト
     * @param res レスポンス
     * @throws ServletException サーブレット処理例外
     * @throws IOException IO処理例外
     * @see HttpServlet#doPost(
     *        HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(
            final HttpServletRequest req, final HttpServletResponse res)
            throws ServletException, IOException {

        String weight = req.getParameter("weight");
        String height = req.getParameter("height");

        BmiBean health = new BmiBean();
        health.setHeight(Double.parseDouble(height));
        health.setWeight(Double.parseDouble(weight));

        HealthCheck healthCheck = new HealthCheck();
        healthCheck.execute(health);

        req.setAttribute("health", health);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/result.jsp");
        dispatcher.forward(req, res);
    }

}
