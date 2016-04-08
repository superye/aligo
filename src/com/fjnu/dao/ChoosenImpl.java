package com.fjnu.dao;

import com.fjnu.domain.Choosen;
import com.fjnu.domain.CoachStudent;
import com.fjnu.domain.User;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by yehao on 16/1/10.
 */
public class ChoosenImpl implements ChoosenDAO{
    @Override
    public boolean InsertMessage(CoachStudent coachStudent) {
        DBAccess dbAccess = new DBAccess();
        SqlSession sqlSession = null;
        int flag = 0;
        try {
            sqlSession = dbAccess.getSqlSession();
            flag = sqlSession.update("Choosen.InsertMessage", coachStudent);
            sqlSession.commit();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
        if (flag != 0) return true;
        else return false;
    }

    @Override
    public List<Choosen> GetChoosen(User user) {
        DBAccess dbAccess = new DBAccess();
        List<Choosen> list = new ArrayList<Choosen>();
        SqlSession sqlSession = null;
        try {
            sqlSession = dbAccess.getSqlSession();
            list = sqlSession.selectList("Choosen.GetChoosen", user);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null)
                sqlSession.close();
        }
        return list;
    }

    @Override
    public List<CoachStudent> GetUserChoosen(CoachStudent coachStudent) {
        DBAccess dbAccess = new DBAccess();
        List<CoachStudent> list = new ArrayList<CoachStudent>();
        SqlSession sqlSession = null;
        dbAccess.GetLog();
        try {
            sqlSession = dbAccess.getSqlSession();
            if (coachStudent.getCoa_id() != null && coachStudent.getCoa_id() != "") {
                list = sqlSession.selectList("Choosen.GetCoaChoosen", coachStudent);
            } else {
                list = sqlSession.selectList("Choosen.GetStuChoosen", coachStudent);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null)
                sqlSession.close();
        }
        return list;
    }
    @Override
    public boolean DeleteChoosen(CoachStudent coachStudent) {
        DBAccess dbAccess = new DBAccess();
        SqlSession sqlSession = null;
        int flag = 0;
        try {
            sqlSession = dbAccess.getSqlSession();
            flag = sqlSession.update("Choosen.DeleteChoosen", coachStudent);
            sqlSession.commit();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null)
                sqlSession.close();
        }
        if (flag != 0) return true;
        return false;
    }

    @Override
    public List<Integer> GetClassroomInfo(CoachStudent coachStudent) {
        DBAccess dbAccess = new DBAccess();
        List<Integer> list = new ArrayList<Integer>();
        SqlSession sqlSession = null;
        try {
            sqlSession = dbAccess.getSqlSession();
            list = sqlSession.selectList("Choosen.GetClassroomInfo", coachStudent);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null)
                sqlSession.close();
        }
        return list;
    }

    @Override
    public List<CoachStudent> GetAllChoosen(CoachStudent coachStudent) {
        DBAccess dbAccess = new DBAccess();
        List<CoachStudent> list = new ArrayList<>();
        SqlSession sqlSession = null;
        try {
            sqlSession = dbAccess.getSqlSession();
            list = sqlSession.selectList("Choosen.GetAllChoosen", coachStudent);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null)
                sqlSession.close();
        }
        return list;
    }

    @Override
    public boolean ChangePayment(CoachStudent coachStudent) {
        DBAccess dbAccess = new DBAccess();
        SqlSession sqlSession = null;
        try {
            sqlSession = dbAccess.getSqlSession();
            sqlSession.update("Choosen.ChangePayment", coachStudent);
            for (int i = 0 ;i < 20; i++)
                sqlSession.update("Choosen.InsertDetail", coachStudent.getId());
            sqlSession.commit();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null)
                sqlSession.close();
        }
        return true;
    }

    @Override
    public List<CoachStudent> GetNopayOrder() {
        DBAccess dbAccess = new DBAccess();
        List<CoachStudent> list = new ArrayList<>();
        SqlSession sqlSession = null;
        try {
            sqlSession = dbAccess.getSqlSession();
            list = sqlSession.selectList("Choosen.GetNopayOrder");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null)
                sqlSession.close();
        }
        return list;
    }

    @Override
    public boolean DeleteOrder(int id) {
        DBAccess dbAccess = new DBAccess();
        SqlSession sqlSession = null;
        try {
            sqlSession = dbAccess.getSqlSession();
            sqlSession.update("Choosen.DeleteOrder", id);
            sqlSession.commit();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null)
                sqlSession.close();
        }
        return true;
    }
}
