with open("numbers.html", "w") as f:
    #writes to the f file
    f.write("<html>\n<head>\n<title>List of Numbers</title>\n</head>\n<body>\n")
    #writes to the f file
    f.write("<table>\n<tr><th>Even Numbers</th><th>Odd Numbers</th></tr>\n")
    #formats writing even and odd integers into the file g
    for i in range(1, 50):
        #evens
        if i % 2 == 0:
            g.write("<tr><td>{}</td><td></td></tr>\n".format(i))
        #multiples of 3    
        if i % 3 == 0:
            g.write("<tr><td></td><td>{}</td></tr>\n".format(i))
    #write to f file again
    f.write("</table>\n</body>\n</html>")

with open("numbers.html"") as f:
    #print to f file      
    print(f.read())
    
