package task5;

public class Phone {
    private String countryCode;
    private String firstTrio;
    private String secondTrio;
    private String lastNumbers;

    public Phone(String str) {
        countryCode = str.substring(0, str.length()-10);
        firstTrio = str.substring(str.length()-10, str.length()-7);
        secondTrio = str.substring(str.length()-7, str.length()-4);
        lastNumbers = str.substring(str.length()-4);
    }

    public String toString() {
        return String.format("<%s><%s><%s><%s>", countryCode, firstTrio, secondTrio, lastNumbers);
    }
}