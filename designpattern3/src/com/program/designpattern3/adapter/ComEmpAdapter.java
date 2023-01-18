package com.program.designpattern3.adapter;

public class ComEmpAdapter extends Employee implements CompanyEvent{
	public static void main(String[] args) {
		ComEmpAdapter adapter = new ComEmpAdapter();
		adapter.womensDay();
	}

	@Override
	public void womensDay() {
		ComEmpAdapter adapter = new ComEmpAdapter();
		adapter.setId(1);
		adapter.setName("Abc");
		adapter.setEmail("abc143@gmail.com");
		System.out.println("Manager of the event is "+adapter.getName());
		
		ComEmpAdapter adapter2 = new ComEmpAdapter();
		adapter2.setId(1);
		adapter2.setName("Xyz");
		adapter2.setEmail("xyz143@gmail.com");
		System.out.println("Chief guest of the event is "+adapter2.getName());
	}

}
