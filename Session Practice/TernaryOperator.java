public class TernaryOperator {
    public static void main(String[] args) {
        int numOne = 10;
        int numTwo = 20;
        int numThree = 30;
        String checkGreaterNumber = (numOne < numTwo) ? ("Second interger is greater " + numTwo)
                : ("First integer is Greater " + numOne);
        System.out.println(checkGreaterNumber);

        String logicalGreatestNumCheck = (numOne>numTwo) && (numOne>numThree) ? ("NumOne is larger: " + numOne) : (numTwo>numOne) && (numTwo>numThree) ? ("NumTwo is larger: " + numTwo) : ("NumThree is larger: " + numThree);
        System.out.println(logicalGreatestNumCheck);
    }
}
