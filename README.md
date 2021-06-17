# CupCarbonAirPollutionProject
Simulacja WSN sistema za monitoring zagađenja vazduha u urbanoj sredini pomoću CupCarbon okruženja.

## Instalacija i pokretanje

* Na početku, potrebno je preuzeti i instalirati CupCarbon okruženje sa [sledećeg linka](http://cupcarbon.com/)
* Zatim treba preuzeti [izmenjen source code](https://github.com/mirovicmila/CupCarbonAirPollutionProject/tree/main/CupCarbon-master) CupCarbon-a prateći [ uputstvo ](http://cupcarbon.com/src_download.html).
* Da bi se aplikacija uspešno pokrenula potrebno je imati instalirano [Eclipse](https://www.eclipse.org/) okruženje, kao i [Java JDK 8](https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html).
* Kada se projekat uspešno otvori u Eclipse-u, može se pokrenuti desnim klikom na projekat u Package Explorer-u i odabirom opcije _Run As -> Java Application_. Sada je CupCarbon okruženje pokrenuto. 
* Sada je potrebno preuzeti CupCarbon projekat sa [linka](https://github.com/mirovicmila/CupCarbonAirPollutionProject) klikom na dugme Code i download zip. Otpakovati zip na željenu lokaciju i odabirom _File -> Open project_ i navigiranjem do te lokacije odabrati fajl _hello.cup_. Sada je projekat uspešno učitan u CupCarbon okruženje. 
* Startovanje projekta se vrši klikom na dugme _Run Simulation_

## Uputstvo za korišćenje

* Zvanično uputstvo za korišćenje CupCarbon okruženja verzije 5.1 dato je na [linku](http://freenwork.com/cupcarbon/cupcarbon_user_guide.pdf). 

* Pored osnovnih funkcija koje su date u ovom uputstvu, radi izrade ovog projekta, bile su potrebne i određene modifikacije postojećih funkcija. Izmenjena je funkcija **getinfo** koja je prethodno detektovala mobilne senzore. U našem konkretnom slučaju mobilni senzori nisu bili od interesa već analogni gas senzori koji su simulirali izvore zagađenja (podaci za navedene senzore su dobijeni korišćenjem _Natural Event Generator-a_). Pored navedenih izmena uvedeno je i računanje distance izvora zagađenja od senzora. Funkcija se u CapCarbonu poziva na standardan način **getinfo p**, gde je p ukupna vrednost zagađenja koju senzor šalje centralnoj stanici. 
* Nove funkcije se mogu dodati modifikovanjem fajlova [Functions.java](https://github.com/mirovicmila/CupCarbonAirPollutionProject/blob/main/CupCarbon-master/src/senscript_functions/Functions.java) i [ScriptFunctions](https://github.com/mirovicmila/CupCarbonAirPollutionProject/blob/main/CupCarbon-master/src/senscript_functions/ScriptFunctions.java), prema opštim uputstvima CupCarbon V5.1.
* U fajlu [S1](https://github.com/mirovicmila/CupCarbonAirPollutionProject/blob/main/results/S1) nalaze se očitane vrednosti merenja koje prima centralni senzor u nekom od test pokretanja. Funkcija koja se koristi za upis u fajl je **printfile t v** gde je **t** vremenski trenutak, a **v** ukupna vrednost zagađenja očitana u tom trenutku. Trenutna verzija skripte za receiver nema u sebi printfile funkciju budući da se pre svakog pokretanja mora obrisati prethodni fajl da bi se upisali novi podaci.


## Autori

* **Mina Nikolić** - [link](https://github.com/MinaNikolic98)
* **Tamara Mihajlović** - [link](https://github.com/tamaramihajlovic)
* **Mila Mirović** - [link](https://github.com/mirovicmila)

