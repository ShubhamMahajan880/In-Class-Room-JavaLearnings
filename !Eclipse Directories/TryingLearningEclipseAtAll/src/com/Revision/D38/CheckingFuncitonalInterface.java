package com.Revision.D38;

public interface CheckingFuncitonalInterface {
//		public abstract int numerology();
}
@FunctionalInterface
interface ChildInterface extends CheckingFuncitonalInterface
{
	public abstract String astrology(); // in the functional Interface only one interface is possible at a time.
}
