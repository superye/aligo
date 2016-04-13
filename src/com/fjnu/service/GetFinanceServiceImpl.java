package com.fjnu.service;

import com.fjnu.dao.FinanceDAO;
import com.fjnu.dao.FinanceImpl;
import com.fjnu.domain.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Luxiaobai on 2016/3/29.
 */
public class GetFinanceServiceImpl implements GetFinanceService {
    @Override
    public List<ClassFire> GetClassConsumeInfo() {
        FinanceDAO financeDAO = new FinanceImpl();
        return financeDAO.GetClassConsume();
    }

    @Override
    public List<station_day_input> GetDayIncomeInfo() {
        FinanceDAO financeDAO = new FinanceImpl();
        return financeDAO.GetDayIncomeInfo();
    }

    @Override
    public List<Salary> GetSalaryInfo() {
        FinanceDAO financeDAO = new FinanceImpl();
        return financeDAO.GetSalaryInfo();
    }

    @Override
    public List<station_month_input> GetMonthIncomeInfo() {
        FinanceDAO financeDAO = new FinanceImpl();
        List<station_day_input> list = financeDAO.GetDayIncomeInfo();
        List<station_month_input> month_list = new ArrayList<>();

        return month_list;
    }

    @Override
    public List<station_day_output> GetDayOutputInfo() {
        FinanceDAO financeDAO = new FinanceImpl();
        return financeDAO.GetDayOutputInfo();
    }
}
