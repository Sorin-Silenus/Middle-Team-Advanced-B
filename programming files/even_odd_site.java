
//imports
import java.io.*;

public class even_odd_site {
    public static void main(String[] args) throws IOException {
        //opens file
        BufferedWriter file = new BufferedWriter(new FileWriter("numbers.html"));
        //adds title to file
        file.write("<html>\n<head>\n<title>List of Numbers</title>\n</head>\n<body>\n");
        //creates table with headers Even Numbers and Odd numbers
        file.write("<table>\n<tr><th>Even Numbers</th><th>Odd Numbers</th></tr>\n");
        //loops from 1 - 50
        for (int i = 1; i <= 50; i++) {
            //checks if i is even
            if (i % 2 == 0) {
                //adds i to event section table
                file.write("<tr><td>" + i + "</td><td></td></tr>\n");
            }
            else {
                //adds i to odd section
                file.write("<tr><td></td><td>" + i + "</td></tr>\n");
            }
        }
        file.write("</table>\n</body>\n</html>");
        //close file
        file.close();
        //creates file reader
        BufferedReader reader = new BufferedReader(new FileReader("numbers.html"));
        String line;
        //reads and prints each line from file
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        //closing
        reader.close();
    }
}
