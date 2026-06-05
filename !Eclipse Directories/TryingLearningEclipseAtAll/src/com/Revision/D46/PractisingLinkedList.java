package com.Revision.D46;

import java.util.LinkedList;

public class PractisingLinkedList {

	public static void main(String[] args) {
		LinkedList<String> aiEarnings = new LinkedList<String>();
		aiEarnings.add("AI Website Develoment");
		aiEarnings.add("AI Mobile APP Development");
		aiEarnings.add("AI UGC Add Creation");
		aiEarnings.add("AI Content Creation");

		System.out.println(aiEarnings);

		System.out.println(aiEarnings.get(2));
		System.out.println("------------");
		System.out.println(aiEarnings.getFirst());
		System.out.println(aiEarnings.getLast());
		System.out.println("------------");
		aiEarnings.add(2, "Thumbnail Designer");

		System.out.println(aiEarnings);

		aiEarnings.remove(1);

		System.out.println(aiEarnings);

	}

}
