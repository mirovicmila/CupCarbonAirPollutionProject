loop
atget id mojID
getinfo q
cprint "getinfo: " $q

print "Senzor broj " mojID " salje vrednost " q 
radio radio2
send q 1

delay 1000
