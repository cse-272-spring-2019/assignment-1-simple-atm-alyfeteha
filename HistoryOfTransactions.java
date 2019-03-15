package ATM;
import java.util.ArrayList;
import java.util.List;
public class HistoryOfTransactions {
    int j;
    int i;
  public static List<String>array= new ArrayList<>();
  public static List<Double>array1=new ArrayList<>();
    public void ArrayModification() {
        i = array.size();
        if (i > 5) {
            while (j < i - 5) {
                array.remove(j);
                array1.remove(j);
                j++;
            }
        }
    }
}
