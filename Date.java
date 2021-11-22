public class Date implements Comparable{
    private int day, month, year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getJour() {
        return day;
    }

    public int getMois() {
        return month;
    }

    public int getAnnee() {
        return year;
    }

    @Override
    public String toString() {
        return day + "/" + month + "/" + year;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Date other = (Date) obj;
        if (this.day != other.day) {
            return false;
        }
        if (this.month != other.month) {
            return false;
        }
        if (this.year != other.year) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Object o) {
        if (this == o) {
//            throw new NullPointerException();
return 0;
        }
         if (this == o) {
            return 0;
        }
          if (getClass() != o.getClass()) {
           throw new ClassCastException();
        }
        final Date other = (Date) o;
         if(year==other.year)
             if(month==other.month)
                 if(day==other.day)
                     return 0;
                 else return day-other.day;
         else
                 return month -other.month;
         else
             return year-other.year;
         }    
}