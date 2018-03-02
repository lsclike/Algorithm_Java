package com.Al.questions.chapter1;

import com.Al.StdOut;

public class smart_date {
    private final int year;
    private final int month;
    private final int day;
    private final int DAYOFAWEEK = 7;
    private final int centry = 20;

    public smart_date(int d,int m,int y) throws Exception {
        if (d < 0 || m < 0 || y < 0) {
            Exception except = new Exception("date can't be negative");
            throw except;
        }
        if (m > 12) {
            Exception except = new Exception("the number of month can't large than 12");
            throw except;
        }
        switch (m) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: {
                if (d > 31) {
                    Exception except = new Exception("the number of day can't large than 31");
                    throw except;
                }
            }
            break;
            case 2: {
                boolean leapyear = (y % 4 == 0 && y % 100 != 0);
                if (leapyear && d > 29) {
                    Exception except = new Exception("the number of day can't large than 29");
                    throw except;
                }
                else if (!leapyear && d > 28) {
                    Exception except = new Exception("the number of day can't large than 28");
                    throw except;
                }
            }
            break;
            case 4:
            case 6:
            case 9:
            case 11:{
                if(d > 30){
                    Exception except = new Exception("the number of day can't large than 30");
                    throw except;
                }
            }
            break;
        }
        this.day = d;
        this.month = m;
        this.year = y;
    }
    public String toString(){
        return "year: " + year + "month: " + month + "day" + day;
    }

    public String dayofweek() {
        String resultweek = "";
        int tempday = this.day;
        int tempmonth = this.month;
        int tempyear = this.year;
        int yearincenty = tempyear%100;
        int zeroyear = tempyear/100;
        if (tempmonth == 1 || tempmonth == 2) {
            tempmonth += 12;
            tempyear--;
        }

        int week = tempday + ((13*(tempmonth+1))/5) + yearincenty + yearincenty/4 + zeroyear/ 4 + 5*zeroyear;
        int d = week % DAYOFAWEEK;
        switch (d) {
            case 0: {
                resultweek = "saturday";
                break;
            }
            case 1: {
                resultweek = "sunday";
                break;
            }
            case 2: {
                resultweek = "monday";
                break;
            }
            case 3: {
                resultweek = "tuesday";
                break;
            }
            case 4: {
                resultweek = "wed";
                break;
            }
            case 5: {
                resultweek = "thur";
                break;
            }
            case 6: {
                resultweek = "fri";
                break;
            }
        }
        return resultweek;
    }


    public static void main(String[] args) throws Exception {
        smart_date day = new smart_date(11,2,2018);
        String test=day.dayofweek();
        StdOut.println(test);
    }

}



