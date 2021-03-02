package Wrapper;

public class Age {
    private int value;

    public Age(int value) {
        try {
            ValidateValue(value);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void ValidateValue(int value) {
        if (value >= 0 && value < 140) {
            this.value = value;
        } else {
            throw new IllegalArgumentException("Value not allowed " + value);
        }
    }

    public int getValue() {
        return value;
    }

    public int YearBorn() {
        return 2021 - value;
    }

    public boolean CanVote() {
        if (value >= 18) {
            return true;
        }
        return false;
    }

    public String StageLife() {
        if (value >= 0 && value <= 1) {
            return "Infant";
        }
        if (value >= 2 && value <= 4) {
            return "Toddler";
        }
        if (value >= 5 && value <= 12) {
            return "Child";
        }
        if (value >= 13 && value <= 19) {
            return "Teen";
        }
        if (value >= 20 && value <= 39) {
            return "Adult";
        }
        if (value >= 40 && value <= 59) {
            return "Middle Age Adult";
        }
        if (value >= 60) {
            return "Senior Adult";
        }
        return "";
    }
}
