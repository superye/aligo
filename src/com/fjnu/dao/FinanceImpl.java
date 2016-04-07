package com.fjnu.dao;

import com.fjnu.domain.ClassFire;
import com.fjnu.domain.DayIncome;
import com.fjnu.domain.IdleTime;
import com.fjnu.domain.station_day_output;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Luxiaobai on 2016/3/29.
 */
public class FinanceImpl implements FinanceDAO {
    @Override
    public List<ClassFire> GetClassConsume() {
        DBAccess dbAccess = new DBAccess();
        List<ClassFire> list = new ArrayList<ClassFire>();
        SqlSession sqlSession = null;
        try {
            sqlSession = dbAccess.getSqlSession();
            list = sqlSession.selectList("ClassFire.SelectClassFireInfo");
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
        return list;
    }

    @Override
    public List<DayIncome> GetDayIncomeInfo() {
        DBAccess dbAccess = new DBAccess();
        List<DayIncome> list = new ArrayList<DayIncome>();
        SqlSession sqlSession = null;
        try {
            sqlSession = dbAccess.getSqlSession();
            list = sqlSession.selectList("DayIncome.SelectDayIncomeInfo");
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
        return list;
    }

    @Override
    public List<station_day_output> GetDayOutputInfo() {
        DBAccess dbAccess = new DBAccess();
        List<station_day_output> list = new ArrayList<station_day_output>();
        SqlSession sqlSession = null;
        try {
            sqlSession = dbAccess.getSqlSession();
            list = sqlSession.selectList("DayOutput.SelectDayOutputInfo");
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
        return list;
    }
}
