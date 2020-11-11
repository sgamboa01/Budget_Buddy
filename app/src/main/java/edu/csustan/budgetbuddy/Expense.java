package edu.csustan.budgetbuddy;

import com.parse.ParseClassName;
import com.parse.ParseObject;
import com.parse.ParseUser;

@ParseClassName("Expense")
public class Expense extends ParseObject {
    public static final String KEY_LOCATION = "location";
    public static final String KEY_ITEMTYPE ="itemType";
    public static final String KEY_AMOUNT = "amount";
    public static final String KEY_USER = "user";

    public String getLocation() {
        return getString(KEY_LOCATION);
    }

    public void setLocation(String location) {
        put(KEY_LOCATION, location);

    }

    public String getItemType(){
        return getString(KEY_ITEMTYPE);
    }

    public void setItemType(String itemType) {
        put(KEY_ITEMTYPE, itemType);

    }
    public Integer getAmount() {
        return getInt(KEY_AMOUNT);
    }
    public void setAmount(String amount) {
        put(KEY_AMOUNT, amount);
    }

    public ParseUser getUser() {
        return getParseUser(KEY_USER);
    }

    public void setUser(ParseUser user) {
        put(KEY_USER, user);
    }


}