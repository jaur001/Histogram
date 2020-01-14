
package kata4;

import java.util.List;

public class Kata4 {

    
    public static void main(String[] args) {
        String fileName = "C:/Users/USUARIO/Documents/NetBeansProjects/Kata4/src/kata4/mail.txt";
        /* I */List<Mail> mailList = MailListReader.read(fileName);
        /* P */Histogram<String> histogram = MailHistogramBuilder.build(mailList);
        /* O */HistogramDisplay hist = new HistogramDisplay(histogram);
        hist.execute();
    }
    
}
