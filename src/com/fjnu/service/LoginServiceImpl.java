package com.fjnu.service;

import com.fjnu.dao.UserImpl;
import com.fjnu.domain.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yehao on 16/1/10.
 */
public class LoginServiceImpl implements LoginService {

    @Override
    public boolean check(User user) {
        /**
         * 获取user列表,判空
         */
        UserImpl userimpl = new UserImpl();
        List<User> list = new ArrayList<User>();
        list = userimpl.GetUser(user);
        if (list.size() == 0) {
            return false;
        } else {
            return true;
        }
    }
}
