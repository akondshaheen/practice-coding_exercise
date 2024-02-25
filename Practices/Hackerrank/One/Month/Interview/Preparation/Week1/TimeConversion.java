package Practices.Hackerrank.One.Month.Interview.Preparation.Week1;

public class TimeConversion {
    public String getConvertedTime(String givenTime) {
        int getHour = Integer.parseInt(givenTime.substring(0,2));
        String getTimeConstant= givenTime.substring(8,10);
        int midHour=12;
        if(getTimeConstant.equals("PM")&&getHour<midHour){
            getHour+=midHour;
        }

        if(getTimeConstant.equals("AM")&&getHour==midHour){
            getHour=0;
        }
        String finalResult=String.format("%02d",getHour)+givenTime.substring(2,8);
        System.out.println(finalResult);
        return finalResult;
    }
}
