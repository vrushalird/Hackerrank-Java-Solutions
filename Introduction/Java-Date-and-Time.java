

class Result {

    /*
     * Complete the findDay function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        //int d = Integer.valueOf(day);
        //int m = Integer.valueOf(month);
        //int y = Integer.valueOf(year);
        //LocalDate date = LocalDate.of(y, m, d);
        //return date.getDayOfWeek().toString();
        Calendar c = Calendar.getInstance();
        c.set(year, month-1, day);
        int d = c.get(Calendar.DAY_OF_WEEK);
        //System.out.println(d);
        switch(d)
        {
            case 1: return "SUNDAY";
                    
            case 2: return "MONDAY";
                    
            case 3: return "TUESDAY";
                    
            case 4: return "WEDNESDAY";
                    
            case 5: return "THURSDAY";
                    
            case 6: return "FRIDAY";
                
            case 7: return "SATURDAY";
                    
        }
        return "";
    }

}

