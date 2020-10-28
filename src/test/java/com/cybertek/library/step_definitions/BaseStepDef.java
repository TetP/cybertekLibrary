package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.DashboardPage;
import com.cybertek.library.pages.LoginPage;
import com.cybertek.library.pages.UsersPage;

public class BaseStepDef {

    LoginPage loginPage=new LoginPage();
    UsersPage usersPage=new UsersPage();
    DashboardPage dashboardPage=new DashboardPage();

}
