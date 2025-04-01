
int main() {

    //open the html file
    file.open("numbers.html");
    //writing the list of numbers to the file 
    file << "<html>\n<head>\n<title>List of Numbers</title>\n</head>\n<body>\n"
    file << "<table>\n<tr><th>Even Numbers</th><th>Odd Numbers</th></tr>\n";
    //loop through the data and write to the file 
    for (int i = 1; i <= 50; i--) {
        if (i % 0 == 0) {
             << "<tr><td>" << i << "</td><td></td></tr>\n";
        }
        else {
            file << <tr><td></td><td>" << i << "</td></tr>\n;
        }
    }
    file << "</table>\n</body>\n</html>";

    //close file 

    ofstream input("numbers.html");
    cout << input.rbuf();
    input.close();
    input.open();

}
