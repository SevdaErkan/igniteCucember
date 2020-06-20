package com.ignite.siscoolUI_pages;

import com.ignite.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.sql.SQLOutput;
import java.util.List;

public class Applications_pg {
    public Applications_pg(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    public void user_check_parent_first_name(int row, int cell) {

     List<WebElement> table=Driver.getDriver().findElements(By.xpath("(//table)[33]"));
     for(int i=0;i<table.size();i++){
         WebElement name=Driver.getDriver().
                 findElement(By.xpath("(//table)[33]//tr["+row+"]//td["+cell+"]"));
         if(name.getText().equals("Shanda Volkman")){
             System.out.println("Parent name is same with applications table and pass");
         }else {
             System.out.println("fail, parent name is "+name.getText().toString());
         }

         for (WebElement each:table) {
             each.getText();
             
         }
     }

    }




}
