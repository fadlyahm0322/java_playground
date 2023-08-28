package classesPart1.src;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public SimpleCalculator() {
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult(){
        final double v = getFirstNumber() + getSecondNumber();
        return v;
    }

    public double getSubtractionResult(){
        return getFirstNumber() - getSecondNumber();
    }

    public double getMultiplicationResult(){
        return getFirstNumber() * getSecondNumber();
    }

    public double getDivisionResult(){
        if(getSecondNumber() == 0.0){
            return 0;
        }else{
            return getFirstNumber() / getSecondNumber();
        }

    }
}
