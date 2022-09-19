import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.Exception;


public class StringCalculator {

    private final List<Integer> negative = new ArrayList<>();
    private final ArrayList<String> delims = new ArrayList<>();
    private String userNum;
    private String [] splnum;
    public int add(String numbers) {
        int sum = 0;


        if ((numbers.isEmpty()) || (numbers.equals(" "))) {
            return sum;
        }


         splnum = numbers.split(",|\\\\n");


        try {
            for (String s : splnum) {
                int nums = Integer.parseInt(s);
                if (nums < 0) {
                    negative.add(nums);
                    continue;
                }

                if (nums > 1000) {
                    continue;
                }
                sum += nums;
            }
        } catch (NumberFormatException ex) {
            System.out.println("Не числа рахувати складно...)");
            sum = 0;
        }
        if (negative.size() != 0) {
            System.out.println(negative.toString());
        }


        if (starts(numbers)) {
            afterdell(numbers);
            String begining = numbers.split("\\\\n")[0];
            delims(begining);
            userNum = numbers.substring(begining.length() + 2) + ",0";

        }
        else {
            userNum = numbers + ",0";
        }


        sort();

        splitNum();


        return sum;
    }


    private void afterdell(String numbers) throws Exception {
            if (!numbers.contains("\\n")) {
                throw new Exception("Відсутнє завершення рядка");
            }
    }

    private boolean starts(String numbers) {
        return numbers.length() > 2 && numbers.startsWith("//");
    }


    private void delims(String starts) {
        delims.add(",");
        delims.add("\\\\n");


        Matcher m = Pattern.compile("\\[(.*?)\\]").matcher(starts);

        while (m.find()) {

            String dell = m.group(1);

            dell = dell.replace("*", "\\*");
            dell = dell.replace("+", "\\+");
            dell = dell.replace("^", "\\^");
            dell = dell.replace(".", "\\.");
            dell = dell.replace("(", "\\(");
            dell = dell.replace(")", "\\)");

            delims.add(dell);
        }
    }

   private void sort() {
       for (int i = 0; i < delims.size(); i++) {
            for (int j = i + 1; j < delims.size(); j++) {

                if (delims.get(j).length() > delims.get(i).length()) {
                    String tmp = delims.get(i);
                    delims.set(i, delims.get(j));
                    delims.set(j, tmp);
                }
            }
        }
    }

    private String reg() {
        StringBuilder regex = new StringBuilder();
        for (String delimiter : delims) {
            regex.append(delimiter);
            regex.append("|");
        }
        regex.deleteCharAt(regex.length() - 1);
        return regex.toString();
    }

    private void splitNum() {
        String regex = reg();
        splnum = userNum.split(regex);
    }
}