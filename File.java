public class File{
	private int [] tab;
	private int first, firstFree;
	public File(int taille){
		tab = new int [taille+1];
		first=firstFree=0;
	}
	public int incrementeIndice(int i){
		i++;
		if(i==tab.length)
			i = 0;
		return i;
	}
	public boolean estPleine(){
		return first==firstFree+1;
	}
	public boolean estVide(){
		return first==incrementeIndice(firstFree);
	}
	public void enfiler(int n){
		if(!estPleine()){
			tab[firstFree]=n;
			firstFree=incrementeIndice(firstFree);
		}
	}
	public void defiler(){
		if(!estVide())
			first=incrementeIndice(first);
	}
	public int premier(){
		if(!estVide())
			return tab[first];
		return 0;
	}
	public static void main(String[] args){
		File t = new File(20);
		for(int i = 0; i<30; i+=2){
			t.enfiler(i);
			t.enfiler(i+1);
			System.out.println(t.premier());
			t.defiler();
		}
		while (!t.estVide()){
			System.out.println(t.premier());
			t.defiler();
		}
	}
}
	
