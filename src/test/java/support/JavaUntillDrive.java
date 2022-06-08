package support;

import com.github.javafaker.Faker;
import org.intellij.lang.annotations.Language;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class JavaUntillDrive {

    public static String gerenateCurrentdate(){
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MMMM/yyyy");
        return simpleDateFormat.format(calendar.getTime());

    }

}
