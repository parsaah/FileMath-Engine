public class Division extends Calculator {
    @Override
    public String operator() {
        String result = getFirstNumber() + " " + "/" + " " + getSecondNumber() + " " + "=" + " " + (getFirstNumber() / getSecondNumber());
        return result;
    }
}