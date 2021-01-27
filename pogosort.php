
<?php
$pituus = 10;
$i = 1; //alustetaan $i arvo foreach looppia varten
$arvot = range(1, $pituus); //Määritetään arrayn pituus

shuffle($arvot); //sekoittaa arrayn sisäiset arvot

foreach ($arvot as $num) {
	echo "<!-- arvottu arvo $num-->";
	
	if ($num = $i) {
		echo "$num "; //tulostaa kyseisen numeron jos se täsmää $i arvoa
		$i++;
	} 
	else { 
		$num = rand(1, $pituus); //sekoittaa kyseisen numeron arraystä uudelleen
	}
}
?>