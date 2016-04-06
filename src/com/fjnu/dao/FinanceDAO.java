package com.fjnu.dao;

import com.fjnu.domain.ClassFire;
import com.fjnu.domain.DayIncome;

import java.util.List;

/**
 * Created by Luxiaobai on 2016/3/29.
 */
public interface FinanceDAO {
    public List<ClassFire> GetClassConsume();
    public List<DayIncome> GetDayIncomeInfo();
}
