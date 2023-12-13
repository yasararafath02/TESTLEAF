package week1.day1;
public class Car {
	public static void main(String[] args) {
		Car obj= new Car();
	
		obj.applyBreak();
		obj.applyGear();
		obj.switchOnAc();
		obj.applyAcclerate();
	}
		public void applyBreak() {
			System.out.println("Break is applied");
		}
			public void applyGear() {
				System.out.println("Gear is applied");
			}		
				public void switchOnAc() {
					System.out.println("Ac is on");
				}
					public void applyAcclerate() {
						System.out.println("Acclerate is applied");
					}
	}
	