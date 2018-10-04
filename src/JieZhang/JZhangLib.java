package JieZhang;

public class JZhangLib {
    public static String dateStr(String input)
    {
        int i = 0;
        String output = "";
        String date = "";

        while( i < input.length() )

        {
            if (!(input.substring(i,i+1).equals("/")))
            {
                output = output + input.substring(i,i+1);
                i++;
            }
            else
            {
                i++;
            }


        }
        date = output.substring(2,4) + "-" + output.substring(0,2) + "-" + output.substring(4);

        return date;
    }
}
