package hostelmanagementsystem.util;

import com.jfoenix.controls.JFXTextField;
import javafx.scene.paint.Paint;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static boolean isTextFieldValid(TextFields textField,String text){
        String field="";
        switch (textField){
            case ID:
                field="^([A-Z0-9])$";
                break;
            case LANKAN_ID:
                field="^([0-9]){5,10}([V|v]){0,1}$";
                 break;
            case NAME:
                field="^[A-z|\\s]{3,}$";
                break;
            case EMAIL:
                field="^([A-z])([A-z0-9.]){1,}[@]([A-z0-9]){1,10}[.]([A-z]){2,5}$";
                break;
            case ADDRESS:
                field="^([A-z0-9]|[-/,.@+]|\\s){4,}$";
                break;
            case PHONE:
                field="^([+]94{1,3}|[0])([1-9]{2})([0-9]){7}$";
                break;
            case DOUBLE:
                field="^([0-9]){1,}[.]([0-9]){1,}$";
                break;
            case INTEGER:
                field="^([0-9]){1,}$";
                break;
            case NONE_CHARACTER:
                field="^[\\W]{1,}$";
                break;
            case INVOICE:
                field="^([A-z 0-9]){1,5}([0-9/_@$+,-]){1,}$";
                break;
        }

        Pattern pattern=Pattern.compile(field);
        if(text !=null){
        if(text.trim().isEmpty()){
            return false;
        }
        }else{
            return false;
        }
        Matcher matcher= pattern.matcher(text);

        if(matcher.matches()){
            return true;
        }
       return false;
    }
    public static boolean setTextColor(TextFields location, JFXTextField fields){

        if(Regex.isTextFieldValid(location,fields.getText())){
            fields.setFocusColor(Paint.valueOf("Green"));
            fields.setUnFocusColor(Paint.valueOf("Green"));
                return true;
        }else {
            fields.setFocusColor(Paint.valueOf("Red"));
            fields.setUnFocusColor(Paint.valueOf("Red"));
                return false;
        }
    }
}
