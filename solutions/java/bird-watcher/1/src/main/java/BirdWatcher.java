
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        int[] lastWeek = {0,2,5,3,7,8,4};
        return lastWeek;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length-1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length-1]++;
    }

    public boolean hasDayWithoutBirds() {
        for(int birdPerDay: birdsPerDay){
            if(birdPerDay==0)
                 return true;
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int numberOfBirds = 0;
        int limit = Math.min(numberOfDays, 7);
        for(int i = 0; i < limit; i++)
            numberOfBirds += birdsPerDay[i];
        return numberOfBirds;
    }

    public int getBusyDays() {
        int busyDays = 0;
        for(int birdPerDay: birdsPerDay){
            if(birdPerDay>=5)
                busyDays++;
        }
        return busyDays;    
    }
}
