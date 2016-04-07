package com.fjnu.service;

import com.fjnu.domain.ClassFire;
import com.fjnu.domain.station_day_input;

import java.util.List;

/**
 * Created by Luxiaobai on 2016/3/29.
 */
public interface GetFinanceService {
    public List<ClassFire> GetClassConsumeInfo();
    public List<station_day_input> GetDayIncomeInfo();
}
