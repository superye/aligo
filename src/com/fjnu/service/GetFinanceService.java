package com.fjnu.service;

import com.fjnu.domain.*;

import java.util.List;

/**
 * Created by Luxiaobai on 2016/3/29.
 */
public interface GetFinanceService {
    public List<ClassFire> GetClassConsumeInfo();
    public List<station_day_output> GetDayOutputInfo();
    public List<station_day_input> GetDayIncomeInfo();
    public List<Salary> GetSalaryInfo();
    public List<station_month_input> GetMonthIncomeInfo();
}
