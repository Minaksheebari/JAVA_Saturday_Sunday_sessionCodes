public class switchCase {
    public static void main(String[] args) {
        
        int age = 18;
        switch (age) {
            case 1:
                System.out.println("You are NOT adult.");
                break;
            case 2:
                System.out.println("You are 18..! Congrats..!!");
                break;
            case 3:
                System.out.println("You are an adult");
        
            default:
                System.out.println("Invalid Data..!!");
                break;
        }
    }
}
