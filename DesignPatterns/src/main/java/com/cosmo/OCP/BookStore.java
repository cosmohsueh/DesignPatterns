package com.cosmo.OCP;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class BookStore {

	private final static List<IBook> bookList = new ArrayList<IBook>();

	static {
		bookList.add(new NovelBook("天龍八部", 3200, "金庸"));
		bookList.add(new NovelBook("巴黎聖母院", 5600, "雨果"));
		bookList.add(new NovelBook("悲慘世界", 3500, "雨果"));
		bookList.add(new NovelBook("金瓶梅", 4300, "藍陵笑笑生"));
		bookList.add(new ComputerBook("Think in Java", 4300, "Bruce Eckel", "編程語言"));
	}

	public static void main(String[] args) {
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		formatter.setMaximumFractionDigits(2);
		System.out.println("---書店賣出訊息如下---");
		for (IBook book : bookList) {
			System.out.println("書籍名稱: " + book.getName() + "\t 書籍作者: " + book.getAuthor() + "\t書籍價格: "
					+ formatter.format(book.getPrice() / 100) + "元");
		}
	}
}
