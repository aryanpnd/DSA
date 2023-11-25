public class program1 {
public static void main(String[] args) {
    String str = "chandler.bing@xyz.com\u201D,\u201Cross.geller@xyz.com\u201D, \u201Crachel.greene@xyz.com\u201D, \u201Cjoey.tribbiani@xyz.com\u201D, \u201Cmonica.geller@xyz.com\u201D, \u201Cphoebe.buffay@xyz.com\u201D, \u201Csheldon.copper@xyz.com\u201D, \u201Cmarie.george@xyz.com";
    System.out.println(str.split(",").length);
}    
}
