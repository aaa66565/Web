/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 对数据库中的表 进行增删改查
 *
 * @author Administrator
 */
public class UserBeanAction {

    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;//结构体,存放从数据库中哦查到的数据,类似于数组

    public boolean regUser(String userName, String pasw, String sex, String email) {
        boolean flag = false;
        try {

            conn = zhuce.getConnection();
            String sql = "insert into users(userName,password,sex,email) values(?,?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, userName);
            ps.setString(2, pasw);
            ps.setString(3, sex);
            ps.setString(4, email);
            ps.executeUpdate();
            flag = true;
        } catch (SQLException ex) {
            Logger.getLogger(UserBeanAction.class.getName()).log(Level.SEVERE, null, ex);
        }
        closeConnection();
        return flag;
    }

    public boolean login(String userName, String pasw) {
        boolean flag = false;
        try {
            conn = zhuce.getConnection();
            String sql = "select * from users where userName ='" + userName + "' and password = '" + pasw + "'";
            System.out.println(sql);
            rs = conn.createStatement().executeQuery(sql);
            if (rs.next()) {
                flag = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserBeanAction.class.getName()).log(Level.SEVERE, null, ex);
        }
        closeConnection();
        return flag;
    }

    public void closeConnection() {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(UserBeanAction.class.getName()).log(Level.SEVERE, null, ex);
            }
            rs = null;
        }
        if (ps != null) {
            try {
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(UserBeanAction.class.getName()).log(Level.SEVERE, null, ex);
            }
            ps = null;
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(UserBeanAction.class.getName()).log(Level.SEVERE, null, ex);
            }
            conn = null;
        }
    }
}
