package org.jointheleague.people;

public abstract class Person
{
	private String DNA;
	private Object environmentalFactors;
	private double age;
	private ProcrastinationStrategy ps;

	public Person(String DNA, Object environmentalFactors, double age, ProcrastinationStrategy ps)
	{
		this.DNA = DNA;
		this.environmentalFactors = environmentalFactors;
		this.age = age;
		this.ps = ps;
	}

	public void procrastinate()
	{
		ps.doProcrastinate();
	}

	public void setProcrastinationStrategy(ProcrastinationStrategy ps)
	{
		this.ps = ps;
	}
}
