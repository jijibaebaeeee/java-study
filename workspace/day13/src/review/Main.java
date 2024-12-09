package review;

public class Main {
	public static void main(String[] args) {
	      Employee e = new Employee("짱구", 8000);
	      Manager m = new Manager("철수", 6000);
	      Developer d = new Developer("유리", 5500);

	      Employee[] emp = { e, m, d };

	      for (Employee em : emp) {
	         System.out.println(em.name + "의 보너스는 " + em.calculateBonus(0));
	      }

	}

}
