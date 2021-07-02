package com.sxh.utils;
/**
 * 创建C3P0Util类
 */
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class C3P0Util {
	
	private static Connection conn;
	
	// 使用 ComboPooledDataSource 来生成 dataSource的实例
	/*
	 * ComboPooledDataSource存储数据源接口池。
	 * DataSource 是javax.sql.DataSource是sun公司为java和数据库连接提供的一种接口规范，比如原生的jdbc连接。
	 * BasicDataSource是dbcp封装了jdbc对dataSource接口的实现。
	 * ComboPooledDataSource 是c3p0封装了jdbc 对DataSource接口的实现。
	 */
	private static ComboPooledDataSource dataSource = new ComboPooledDataSource();
	
	// 从连接池中获取连接
	public static Connection getConnection() {
		try {
			conn = dataSource.getConnection(); 
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return conn;
	}
	
	// 释放连接回连接池
	public static void release( Statement stmt, Connection conn) {
		if (stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
				// TODO: handle exception
			}
			stmt = null;
		}
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
				// TODO: handle exception
			}
			conn = null;
		}
	}
	// 释放连接回连接池
	public static void release(ResultSet rs, Statement stmt, Connection conn) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
				// TODO: handle exception
			}
			rs = null;
		}
		release (stmt, conn);
	}
	
}
