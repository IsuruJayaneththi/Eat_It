package com.example.issa.project_eat_it.Common;
import com.example.issa.project_eat_it.Model.User;

/**
 * Created by IssA on 4/18/2018.
 */

public class Common {
    public static User currentUser;

    public static final String DELETE = "Delete";



    public static String convertCodeToStatus(String status) {
        if(status.equals("0"))
            return "Placed";
        else if (status.equals("1"))
            return "On my way";
        else
            return "Shipped";
    }
}
