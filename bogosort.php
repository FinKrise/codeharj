<?php
$pituus = 10; //Määritetään array listan arvojen määrä
$i = 1; //alustetaan $i arvo foreach looppia varten
$arvot = range(1, $pituus); //Määritetään itse ArrayList

shuffle($arvot); //sekoittaa arrayn sisäiset arvot

foreach ($arvot as $num) { //Foreach looppi käy array listan jokaisen arvon läpi, jossa $num vastaa yhtä arvoa listassa
	echo "<!-- arvottu arvo $num-->"; //Jättää HTML koodiin kommentin, joka kertoo kyseisen arvon alkuperäisen luvun
	
	if ($num = $i) {
		echo "$num "; //tulostaa kyseisen luvun jos se täsmää $i arvoa. $i arvo nousee.
		$i++;
	} 
	else { 
		$num = rand(1, $pituus); //sekoittaa kyseisen numeron listassa uudelleen
	}
}
?>
