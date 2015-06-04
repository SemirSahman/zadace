class Zivotinja {

private String name;
private String family;
private String color;
private int lifeTime;
private String nativeTo;
private boolean carnivore;
private String zvuk;

public Zivotinja (String n, String f, String c, int lt, String nt, boolean cr, String z){
	name = n;
	family = f;
	color = c;
	lifeTime = lt;
	nativeTo = nt;
	carnivore = cr;
	zvuk = z;
}
public String toString(){

    String a = "" ;
    a = a + "Name: " + name + "\n";
    a = a + "Family: " + family + "\n";
    a = a + "Color: " + color + "\n";
    a = a + "Life time: " + lifeTime + "\n";
    a = a + "Lives in: " + nativeTo + "\n";
    a = a + "Is carnivore: " + carnivore + "\n";
    a = a + "Sound: " + zvuk + "\n";

    return a;

}

}
