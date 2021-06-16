loop
receive v
time t
cprint "vrednost ocitavanja " v
if(v>40)
	mark 1
	cprint "Povisena vrednost ocitavanja"
	print "Povisena vrednost ocitavanja " v  " > 40"
	delay 250
else
	mark 0
	print "Vrednosti su u granicama normale " v " < 40"
	delay 250
end
