package com.fjnu.service;

import com.fjnu.dao.FinanceDAO;
import com.fjnu.dao.FinanceImpl;
import com.fjnu.domain.ClassFire;
import com.fjnu.domain.DayIncome;
import com.fjnu.domain.station_day_output;

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
    public List<DayIncome> GetDayIncomeInfo() {
        FinanceDAO financeDAO = new FinanceImpl();
        return financeDAO.GetDayIncomeInfo();
    }

    @Override
    public List<station_day_output> GetDayOutputInfo() {
        FinanceDAO financeDAO = new FinanceImpl();
        return financeDAO.GetDayOutputInfo();
    }
}
