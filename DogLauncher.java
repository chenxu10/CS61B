<<<<<<< HEAD
/**The DogLauncher class will 'test drive' the Dog class**/
public class DogLauncher{
	public static void main(String[] args){
		Dog d=new Dog(15);
		
		Dog d2=new Dog(100);
		
		Dog bigger= Dog.maxDog(d,d2);
		bigger.makeNoise();
//		d.makeNoise();
	}
=======
/**The DogLauncher class will 'test drive' the Dog class**/
public class DogLauncher{
	public static void main(String[] args){
		Dog d=new Dog(51);
		d.makeNoise();
	}
>>>>>>> 68787466bce786818594a7ee537e07b70fdf4fdc
}