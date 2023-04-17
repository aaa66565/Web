/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class TopicBeanAction {

    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;//结构体,存放从数据库中哦查到的数据,类似于数组

    public boolean addTopic(String userName, String title, String content) {
        boolean flag = false;
        try {

            String sql = "insert into tapics(user,title,content) values(?,?,?)";
            //conn = DriverManager.getConnection(sql);
            conn = zhuce.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, userName);
            ps.setString(2, title);
            ps.setString(3, content);
            ps.executeUpdate();
            flag = true;
        } catch (SQLException ex) {
            Logger.getLogger(TopicBeanAction.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag;
    }

    public ArrayList getTopicByPage(int pageSize, int currentPage) {
        ArrayList al = new ArrayList();
        try {
            String sql = "select * from tapics limit " + pageSize * (currentPage - 1) + "," + pageSize;
            System.out.println(sql);
            conn = zhuce.getConnection();
            rs = conn.createStatement().executeQuery(sql);
            while (rs.next()) {
                TobliceBean tb = new TobliceBean();
                tb.setID(rs.getInt(1));
                tb.setUser(rs.getString(2));
                tb.setTitle(rs.getString(3));
                tb.setCotent(rs.getString(4));
                tb.setTopicDat(rs.getString(5));
                tb.setReplyNumber(rs.getInt(6));
                al.add(tb);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TopicBeanAction.class.getName()).log(Level.SEVERE, null, ex);
        }
        return al;
    }

    public int getRowCount() {
        int rowCount = 0;
        try {
            String sql = "select count(*) from tapics";
            conn = zhuce.getConnection();
            rs = conn.createStatement().executeQuery(sql);
            if (rs.next()) {
                rowCount = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TopicBeanAction.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rowCount;
    }

    public TobliceBean getTopicById(String id) {
         TobliceBean tb = new TobliceBean();
        try {        
            String sql = "select * from  tapics where id=" + id;
            conn = zhuce.getConnection();
            rs = conn.createStatement().executeQuery(sql);
            if (rs.next()) {
                tb.setID(rs.getInt(1));
                tb.setUser(rs.getString(2));
                tb.setTitle(rs.getString(3));
                tb.setCotent(rs.getString(4));
                tb.setTopicDat(rs.getString(5));
                tb.setReplyNumber(rs.getInt(6));
            }
        } catch (SQLException ex) {
            Logger.getLogger(TopicBeanAction.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tb;
    }
}