public class grading {
    public static void main(String[] args) {
        double subject1 = 51;
        double subject2 = 60;
        double subject3 = 75;
        double subject4 = 80;
        double total_mark;
        double percentage;
        String rank;
        total_mark = subject1 + subject2 + subject3 + subject4;
        System.out.println("Total Marks is :" + total_mark);
        percentage = total_mark / 4;
        System.out.println("Total Percentage is :" + percentage);
        rank = (percentage >= 70) ? "First Class" :
                (percentage > 59 && percentage < 70) ? "Upper Second Class" :
                        (percentage > 49 && percentage < 59) ? "Second Class" :
                                (percentage > 39 && percentage < 49) ? "Third Class" : "Failed";
        System.out.println("Your Grade is :" + rank);
    }
}
