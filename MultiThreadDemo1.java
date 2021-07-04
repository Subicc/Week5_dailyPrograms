package week5;

public class MultiThreadDemo1 {

	public static void main(String[] args)throws Exception {
		Thread t=Thread.currentThread();
		t.setName("This is my name main thread");
		t.setPriority(5);
		System.out.println("Now thread will sleep  for 5 seconds");
VaccinationCenter v=new VaccinationCenter();
v.gotVaccine();

		System.out.println("Start the class::");
		for(int i=0;i<5;i++)
		{
			System.out.println(i);
		Thread.sleep(2000);
		}
		
	}
	static class VaccinationCenter{
		void gotVaccine()throws Exception
		{
			System.out.println("Vaccinate plsss::");
			Thread.sleep(5000);
		}
	}

}
