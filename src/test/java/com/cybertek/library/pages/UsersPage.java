package com.cybertek.library.pages;

import io.cucumber.java.an.E;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UsersPage extends BasePage{

    @FindBy(xpath = "//select[@name='tbl_users_length']")
    private WebElement showRecords;

    @FindBy(xpath = "//*[@id=\"tbl_users\"]/thead/tr")
    private WebElement searchRow;

    public Integer getDefaultValue(){
        Select select=new Select(showRecords);
        return Integer.parseInt(select.getFirstSelectedOption().getText());
    }
/*
    public List<Integer> getOptions(){
        ArrayList<Integer> arrayList=new ArrayList();
        List<WebElement> options=showRecords.findElements(By.tagName("option"));
        Iterator<WebElement> it=options.iterator();
        for (int i = 0; i < options.size(); i++) {
            arrayList.add(Integer.parseInt(it.next().getText()));
        }
        return arrayList;
    }
 */

    public List<Integer> getOptions(){
        ArrayList<Integer> arrayList=new ArrayList();
        Select select=new Select(showRecords);
        List<WebElement> options=select.getOptions();
        Iterator<WebElement> it=options.iterator();
        for (int i = 0; i <options.size() ; i++) {
            arrayList.add(Integer.parseInt(it.next().getText()));
        }
        return arrayList;
    }

    public List<String> getSearchRow(){
        ArrayList<String> arrayList=new ArrayList<>();
        List<WebElement> list=searchRow.findElements(By.tagName("th"));
        Iterator<WebElement> iterator=list.iterator();

        for (int i = 0; i <list.size() ; i++) {
            arrayList.add(iterator.next().getText());
        }
        return arrayList;
    }




}
