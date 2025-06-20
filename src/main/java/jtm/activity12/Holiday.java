package jtm.activity12;

/**
 * This enum represents holidays, displayed as month + day value. This enum can
 * give nearest holiday.
 */
public enum Holiday {
    NEW_YEAR(1, 1), WOMAN_DAY(3, 8), CHUCK_NORRIS_BIRTHSDAY(3, 10), FOOLS_DAY9(4, 1), WORLD_END(12, 21);
    // TODO #1 make these fields final
    int month = 0;
    int day = 0;

    Holiday(int month, int day) {
        // TODO #2 implement class variables for month and day of the holiday
    }

    public static Holiday getNearest(int currentMonth, int currentDay) {
        Holiday returnHoliday = null;
        // TODO #3 implement method which will return the nearest holiday.
        // HINT: note, that holidays is arranged by date ascending, so if there
        // are
        // no more holidays this year, first holiday in the list will be the
        // next.
        return returnHoliday;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }
}
