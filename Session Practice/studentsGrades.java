public class studentsGrades {
    public static void main(String[] args) {
        int percent = 81;

        if (percent <= 35) {
            System.out.println("You are Fail");
        }else if(percent <= 60){
            System.out.println("Passed with grade C");
        }else if(percent <= 80){
            System.out.println("Passed with B grade");
        }else if(percent > 80 ){
            System.out.println("Passed with Distinction grade A");
        }else{
            System.out.println("Something went wrong..!!");
        }
    }
}
