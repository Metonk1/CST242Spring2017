
public class BodyBag {
	private Person[] a;
	private int nElems;
	
	public BodyBag(int maxSize) {
		a = new Person[maxSize];
		nElems = 0;
	}
	
	public void add(Person p) {
		a[nElems] = p; // place the person into the bag
		nElems++; // to indicate a new person object stored in bag
	}
	
	public void display() {
		for(int i = 0; i < nElems; i++) {
			System.out.println(a[i]);
		}
		System.out.println();
	}
	
	public int getDataItems() {
		return nElems;
	}
	
	public Person[] getPersonArray() {
		return a;
	}
	
	public Person findById(String id) {
		for(int i = 0; i < nElems; i++) {
			if(a[i].getId().equals(id)) {
				return a[i];
			} 
		}
		return null;
	}
	
	public Person deleteById(String id){
		int i;
		for(i = 0; i < nElems; i++) {
			if(a[i].getId().equals(id)) {
				break;
			}
		}
		if (i == nElems) {
			return null;
		} else {
			Person p= a[i];
			for(int j = i; j < nElems-1; j++) {
				
				a[j] = a[j+1];
			}
			nElems--;
			return p;
		}
	}
	
}
