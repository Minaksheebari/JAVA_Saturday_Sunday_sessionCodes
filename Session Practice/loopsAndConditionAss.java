import java.text.DecimalFormat;

public class loopsAndConditionAss {
    public static void main(String[] args) {
        //Question 1: Print the Multiplication Table

        int num = 5;
        int i=1;
        do{
            int result = num*i;
            System.out.println(num + " * " + i + " = " + result);
            i++;
        }while(i<=10);
        System.out.println("====================================");

        //Calculate percentage and display the GPA.

        double totalMarks = 600;
        double marksGained = 550;
        double gpa = marksGained / totalMarks;
        double percentage = (marksGained / totalMarks) * 100;

         DecimalFormat decimalFormat = new DecimalFormat("#.#");
       // String formattedPercentage = decimalFormat.format(percentage);
        String formattedGpa = decimalFormat.format(gpa);
        
        System.out.println("Total Marks= " + totalMarks + " Gained Marks: " + marksGained + " percentage: " + percentage);
        if (percentage>=90){
            System.out.println("Grade A and GPA: " + formattedGpa );
        }else if (percentage>=80){
            System.out.println("Grade B and GPA: " + formattedGpa);
        }else if (percentage>=70){
            System.out.println("Grade C and GPA: " + formattedGpa);
        }else if (percentage>=60){
            System.out.println("Grade D and GPA: " + formattedGpa);
        }else{
            System.out.println("You are Fail");
        }
        System.out.println("====================================");

        // Find Smallest, Largest and Average from given three integers
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        //Largest number
        if(num1>num2 && num1>num3){
            System.out.println("Largest number is: " + num1);
        }else if(num2>num1 && num2>num3){
            System.out.println("Largest number is: " + num2);
        }else{
            System.out.println("Largest number is: " + num3);
        }

        //Smallest number
        if(num1<num2 && num1<num3){
            System.out.println("Smallest number is: " + num1);
        }else if(num2<num1 && num2<num3){
            System.out.println("Smallest number is: " + num2);
        }else{
            System.out.println("Smallest number is: " + num3);
        }

        int average = (num1+num2+num3)/3;
        System.out.println("The average of " + num1 + " " + num2 + " " + num3 + " is: " + average);
        System.out.println("====================================");

        //Swap two integer numbers
        int a = 15;
        int b = 63;
        System.out.println("Before swapping: A= " + a + " B= " + b);

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping A= " + a + " B= " + b);
        System.out.println("====================================");

        //Even/Odd Checker

        int checkNum = 96;
        if(checkNum%2==0){
            System.out.println(checkNum + " is EVEN number.");
        }else{
            System.out.println(checkNum + " is ODD number.");
        }
        System.out.println("====================================");

        //Unit conversion for Distance
        float km = 15;
        float cm,m,ft;

        m = km*1000;
		cm = m*100;
		i = (int) (cm/2.54f);
		ft = i/12;

        System.out.println("15 KM is: " + m + " Meters");
        System.out.println("15 KM is: " + cm + " Centimeters");
        System.out.println("15 KM is: " + i + " Inches");
        System.out.println("15 KM is: " + ft + " Feet");
        System.out.println("====================================");

        //Return a substring

        String splitName = "Dinosaur";
        int startInd = 4;
        int endInd = 7;

        if (startInd >= 0 && endInd < splitName.length() && startInd <= endInd) {
            String substring = splitName.substring(startInd, endInd + 1); //excluding endInd so + 1
            System.out.println("Substring: " + substring);
        } else {
            System.out.println("Invalid indices.");
        }       
    }
}
